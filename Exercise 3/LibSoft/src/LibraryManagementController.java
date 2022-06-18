import BookInventory.Book;
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
    public void onBtnClickedRemoveBook() {
        Catalogue catalogue = new Catalogue();
        catalogue.removeBook(null);
    }

    @Override
    public void onBtnClickedCheckBookAvailability() {
        Catalogue catalogue = new Catalogue();
        catalogue.checkBookAvailability(null);
    }

    @Override
    public void onBtnClickedFindBookLocation() {
        Catalogue catalogue = new Catalogue();
        catalogue.findBookLocation(null);
    }

    @Override
    public void onBtnClickedOpenOnlineLocation() {
        Catalogue catalogue = new Catalogue();
        catalogue.openOnlineLocation(null);
    }

    @Override
    public void onBtnClickedRentBook() {
        RentalManagement rentalManagement = new RentalManagement();
        rentalManagement.rentBook(0);
    }

    @Override
    public void onBtnClickedReturnBook() {
        RentalManagement rentalManagement = new RentalManagement();
        rentalManagement.returnBook(0);
    }

    @Override
    public void onBtnClickedReservateCopy() {
        RentalManagement rentalManagement = new RentalManagement();
        rentalManagement.reservateCopy(0, null);
    }

    @Override
    public void onBtnClickedExtendRental() {
        RentalManagement rentalManagement = new RentalManagement();
        rentalManagement.extendRental(0, null);
    }

    @Override
    public void onBtnClickedReportBookRentalHistory() {
        RentalManagement rentalManagement = new RentalManagement();
        rentalManagement.reportBookRentalHistory(null);
    }

    @Override
    public void onBtnClickedReportLenderRentalHistory() {
        RentalManagement rentalManagement = new RentalManagement();
        rentalManagement.reportLenderRentalHistory(null);
    }

    @Override
    public void onBtnClickedReserveBook() {
        RentalManagement rentalManagement = new RentalManagement();
        rentalManagement.reserveBook(null, null);
    }

    @Override
    public void onBtnClickedRemindUser() {
        RentalManagement rentalManagement = new RentalManagement();
        rentalManagement.reserveBook(null, null);
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

    @Override
    public void onBtnClickedAuthenticateUser() {
        UserManagement userManagement = new UserManagement();
        userManagement.authenticateUser(0);
    }
}
