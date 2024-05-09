<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 09/05/2024
  Time: 9:31 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Danh sách sách</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<h1>Danh sách sách</h1>
<table>
    <tr>
        <th>Mã sách</th>
        <th>Tên sách</th>
        <th>Tác giả</th>
        <th>Số lượng</th>
        <th>Mô tả</th>
        <th></th>
    </tr>
    <tr>
        <td>S-0001</td>
        <td>Sổ đỏ</td>
        <td>Võ Trung Phụng</td>
        <td>10</td>
        <td>Nhân vật chính là Xuân Tóc Đỏ và...</td>
        <td><button>Mượn</button></td>
    </tr>
    <tr>
        <td>S-0002</td>
        <td>Truyện Kiều</td>
        <td>Nguyễn Du</td>
        <td>15</td>
        <td>Cuộc đời Thúy Kiều...</td>
        <td><button>Mượn</button></td>
    </tr>
    <!-- Thêm các dòng sách khác tương tự -->
</table>
</body>
</html>
