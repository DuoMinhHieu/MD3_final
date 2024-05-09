package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.SQLException;
import java.util.*;
import DAO.BookDAO;
import model.Book;

public class BookServlet extends HttpServlet {
    private BookDAO bookDAO;
    public void init() {
        bookDAO = new BookDAO();
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
//                case "create":
//                    insertStudent(req, resp);
//                    break;
//                case "edit":
//                    updateStudent(req, resp);
//                    break;
//                case "delete":
//                    deleteStudent(req,resp);
//                    break;
                default:
                    listBook(req,resp);
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
//                case "create":
//                    showInsertForm(req, resp);
//                    break;
//                case "edit":
//                    showEditForm(req, resp);
//                    break;
//                case "delete":
//                    showFormDelete(req, resp);
//                    break;
                default:
                    listBook(req, resp);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void listBook(HttpServletRequest req, HttpServletResponse resp)
            throws SQLException, IOException, ServletException {
        List<Book> listBook = bookDAO.showAllBooks();
        req.setAttribute("listBook", listBook);
        RequestDispatcher dispatcher= req.getRequestDispatcher("/view/list.jsp");
        dispatcher.forward(req, resp);
    }
}