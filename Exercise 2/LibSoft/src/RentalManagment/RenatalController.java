package RentalManagment;

import Lender.Lender;

public class RenatalController implements RentalManagement{

    @Override
    public boolean rentBook(int copyID) {
        return true;
    }

    @Override
    public boolean returnBook(int copyID) {
        return true;
    }

    @Override
    public boolean reservateCopy(int copyID, Lender lender) {
        return true;
    }
}
