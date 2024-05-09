package service;

import java.util.List;
import model.BorrowCard;
import DAO.BorrowCardDAO;

public class BorrowCardService {
    private BorrowCardDAO borrowCardDAO;

    public BorrowCardService() {
        borrowCardDAO = new BorrowCardDAO();
    }

    public List<BorrowCard> getAllBorrowCards() {
        return borrowCardDAO.getAllBorrowCards();
    }

}
