package Lender;

public interface UserManagement {

    default boolean deactiveUser(int matrikelNumber) {
        return true;
    }

    default boolean registerUser(int matrikelNumber, String firstName, String lastName) {
        return true;
    }
    
}