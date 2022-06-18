package RentalManagment;
import BookInventory.Book;
import Lender.*;

public class RentalManagement {

  public boolean rentBook(int copyID) {
    return true;
  }
  public boolean returnBook(int copyID) {
    return true;
  }
  public boolean reservateCopy(int copyID, Lender lender) {
    return true;
  }

  public boolean extendRental(int copyID, Lender lender) {
    return true;
  }

  public boolean reportBookRentalHistory(Book book) {
    return true;
  }

  public boolean reportLenderRentalHistory(Lender lender) {
    return true;
  }

  public boolean reserveBook(Lender lender, Book book) {
    return true;
  }

  public boolean remindUser(Lender lender, Book book) { return true; }

}




