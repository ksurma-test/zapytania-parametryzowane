package pl.javastart.servlet;

import pl.javastart.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;


@WebServlet("/category")
public class ProductsServletParameters extends HttpServlet {
    private static final long serialVersionUID = 1L;


        @PersistenceUnit(name = "myPersistenceUnit")
        private EntityManagerFactory emf;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String category = request.getParameter("category");
        EntityManager em = emf.createEntityManager();
        TypedQuery<Product> query = em.createNamedQuery("Product.findByCategory", Product.class);
        query.setParameter("category", category);
        List<Product> resultList = query.getResultList();
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        request.setAttribute("products", resultList);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }





}
