package BookInventory;

class Catalogue {

    public Catalogue() {

    }

    public boolean checkAvailability(String name) {
        return true;
    }

    public boolean checkAvailability(ISBN isbn) {
        return true;
    }

    public boolean addBook(Copy copy) {
        return true;
    }

    public boolean createBook(Book book) {
        return true;
    }

    public boolean checkISBN(ISBN isbn) {
        return true;
    }

    public boolean generateBibTeX(Book book) {
        return true;
    }

}