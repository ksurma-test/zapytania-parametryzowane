<html>
<head>
    <title>Product explorer</title>
</head>
<body>
<a href="static">Get products ordered by price</a>

<h1>Product manager</h1>

<h2>Add product</h2>
<form action="products?add=true" method="post">
    <input type="text" name="productName" placeholder="Product name" />
    <input type="number" name="productPrice" step="0.1" placeholder="Product price" />
    <input type="text" name="productCategory" placeholder="Product category" />
    <input type="submit" value="Add" />
</form>

<h2>Get Products by category</h2>
<form action="category">
    <input type="text" name="category" placeholder="Product category" />
    <input type="submit" value="Get" />
</form>
</body>
</html>
