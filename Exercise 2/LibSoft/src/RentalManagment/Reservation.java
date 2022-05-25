package RentalManagment;

import LenderModule.Lender;
import bookInventory.Book;
import bookInventory.Copy;

import java.time.LocalDate;

public class Reservation {
    private LocalDate available;
    private LocalDate expired;
    private Lender lender;
    private Book book;

    public Reservation(LocalDate available, LocalDate expired, Lender lender, Book book) {
        this.available = available;
        this.expired = expired;
        this.lender = lender;
        this.book = book;
    }

    public LocalDate getAvailable() { return available;}
    public LocalDate getExpired() { return expired;}
    public Lender getLender() { return lender;}
    public Book getBook() { return book;}

    public void setAvailable(LocalDate available) { this.available = available;}
    public void setExpired(LocalDate expired) { this.expired = expired;}
    public void setLender(Lender lender) { this.lender = lender;}
    public void setBook(Book book) { this.book = book;}

    public void reserved_copy(Book book, Copy copy){}
}
