package BookInventory;

public interface Catalogue {

    default boolean checkAvailability(String name) {
        return true;
    }

    default boolean checkAvailability(ISBN isbn) {
        return true;
    }

    default boolean addBook(Copy copy) {
        return true;
    }

    default boolean createBook(Book book) {
        return true;
    }

    default boolean checkISBN(ISBN isbn) {
        return true;
    }

    default boolean generateBibTeX(Book book) {
        return true;
    }

}