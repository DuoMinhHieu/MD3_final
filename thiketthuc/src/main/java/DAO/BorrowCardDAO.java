package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.BorrowCard;

public class BorrowCardDAO {
    private final String URL = "jdbc:mysql://localhost:3306/library";
    private final String USER = "root";
    private final String PASSWORD = "Minhhieu@123";

    public boolean borrowBook(BorrowCard borrowCard) {
        Connection connection = null;
        PreparedStatement statement = null;
        boolean success = false;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.prepareStatement("INSERT INTO borrow_cards (book_id, student_id, status, borrow_date) VALUES (?, ?, ?, ?)");
            statement.setInt(1, borrowCard.getBookId());
            statement.setInt(2, borrowCard.getStudentId());
            statement.setBoolean(3, true);
            statement.setDate(4, new java.sql.Date(System.currentTimeMillis()));

            int rowsAffected = statement.executeUpdate();
            success = rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return success;
    }
    public List<Book> getBorrowedBooks() {
        List<Book> borrowedBooks = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
            String query = "SELECT b.id, b.title, b.author, b.description, b.quantity " +
                    "FROM books b " +
                    "INNER JOIN borrow_cards bc ON b.id = bc.book_id " +
                    "WHERE bc.status = TRUE";
            rs = statement.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String description = rs.getString("description");
                int quantity = rs.getInt("quantity");

                Book book = new Book(id, title, author, description, quantity);
                borrowedBooks.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return borrowedBooks;
    }
}
