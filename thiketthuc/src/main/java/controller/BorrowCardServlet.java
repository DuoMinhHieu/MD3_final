package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import DAO.BorrowCardDAO;
import model.BorrowCard;

public class BorrowCardServlet extends HttpServlet {
    private BorrowCardDAO borrowCardDAO;

    @Override
    public void init() {
        borrowCardDAO = new BorrowCardDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int bookId = Integer.parseInt(request.getParameter("bookId"));
        int studentId = Integer.parseInt(request.getParameter("studentId"));

        BorrowCard borrowCard = new BorrowCard();
        borrowCard.setBookId(bookId);
        borrowCard.setStudentId(studentId);

        boolean success = borrowCardDAO.borrowBook(borrowCard);
        if (success) {
            response.sendRedirect("borrow_success.jsp");
        } else {
            response.sendRedirect("borrow_error.jsp");
        }
    }
}
