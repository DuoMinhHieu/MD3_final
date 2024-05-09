<%@ page import="model.Book" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 09/05/2024
  Time: 10:09 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Library - Books</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <h2>Books</h2>
    <table class="table">
        <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Description</th>
            <th>Quantity</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${books}" var="book">
            <tr>
                <td>${book.bookId}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.description}</td>
                <td>${book.quantity}</td>
                <td><a  class="btn btn-warning" href="/book?action=edit&id=${book.bookId}" role="button">Edit</a></td>
                <td><a  class="btn btn-danger" href="/book?action=delete&id=${book.bookId}" role="button">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>