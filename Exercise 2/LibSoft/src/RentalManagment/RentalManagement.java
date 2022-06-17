package RentalManagment;
import Lender.*;

public interface RentalManagement{
  default boolean rentBook(int copyID) {
    return true;
  }

  default boolean returnBook(int copyID) {
    return true;
  }

  default boolean reservateCopy(int copyID, Lender lender) {
    return true;
  }
}




