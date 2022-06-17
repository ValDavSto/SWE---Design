package Lender;

public class UserController implements UserManagement {

    @Override
    public boolean deactiveUser(int matrikelNumber) {
        return true;
    }


    @Override
    public boolean registerUser(int matrikelNumber, String firstName, String lastName) {
        return true;
    }
}
