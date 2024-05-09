package service;

import java.util.List;
import model.Book;
import DAO.BookDAO;

public class BookService {
    private BookDAO bookDAO;

    public BookService() {
        bookDAO = new BookDAO();
    }

    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }

}
