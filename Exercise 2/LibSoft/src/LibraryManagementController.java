import BookInventory.Catalogue;
import Lender.UserManagement;
import RentalManagment.RentalManagement;

public class LibraryManagementController implements LibraryManagementControllerInterface {

    @Override
    public void onBtnClickedSearchBook() {
        Catalogue catalogue = new Catalogue();
        catalogue.searchBook(null);
        catalogue.checkAvailability(null);
    }

    @Override
    public void onBtnClickedAddBook() {
        Catalogue catalogue = new Catalogue();
        catalogue.addBook(null);
    }

    @Override
    public void onBtnClickedCreateBook() {
        Catalogue catalogue = new Catalogue();
        catalogue.createBook(null);
    }

    @Override
    public void onBtnClickedCheckISBN() {
        Catalogue catalogue = new Catalogue();
        catalogue.checkISBN(null);
    }

    @Override
    public void onBtnClickedGenerateBibTex() {
        Catalogue catalogue = new Catalogue();
        catalogue.generateBibTeX(null);
    }

    @Override
    public void onBtnClickedRentBook() {
        RentalManagement rentalManagement = new RentalManagement();
        rentalManagement.rentBook(0);
    }

    @Override
    public void onBtnClickedReturnBook() {
        RentalManagement rentalManagement = new RentalManagement();
        rentalManagement.rentBook(0);
    }

    @Override
    public void onBtnClickedReservateCopy() {
        RentalManagement rentalManagement = new RentalManagement();
        rentalManagement.reservateCopy(0, null);
    }

    @Override
    public void onBtnClickedDeactivateUser() {
        UserManagement userManagement = new UserManagement();
        userManagement.deactiveUser(0);
    }

    @Override
    public void onBtnClickedRegisterUser() {
        UserManagement userManagement = new UserManagement();
        userManagement.registerUser(0, null, null);
    }
}
