<%@page import="java.util.Arrays"%>
<%@page import="com.tmf.sample.entities.Product"%>
<%@page import="java.util.List"%>
<html>
<body>
<%!
    Product p1 = new Product(101,"Soap");
	Product p2 = new Product(102,"Paste");
	Product p3 = new Product(103,"Shampoo");
	Product p4 = new Product(104,"Brush");
	Product p5 = new Product(105,"Facewash");
	List<Product> products = Arrays.asList(p1,p2,p3,p4,p5);
	
%>
<table border="5" cellpadding="15">
	<thead>
		<tr>
			<th>Product Id</th>
			<th>Product Name</th>
		</tr>
	</thead>
	<tbody>
		<%
			for(Product p : products){
				out.println("<tr>");
				out.println("<td>"+p.getProductId()+"</td>");
				out.println("<td>"+p.getProductName()+"</td>");
				out.println("</tr>");
			}
		%>
	</tbody>
</table>
</body>
</html>
