package RentalManagment;

import Lender.Lender;
import BookInventory.Book;
import BookInventory.Copy;

import java.time.LocalDate;

public class Rental {
    private LocalDate date_lent;
    private LocalDate return_date;
    private Lender lender;
    private Book book;

    public Rental(LocalDate date_lent, LocalDate return_date, Lender lender, Book book) {
        this.date_lent = date_lent;
        this.return_date = return_date;
        this.lender = lender;
        this.book = book;
    }

    public LocalDate getDate_lent() { return date_lent;}
    public LocalDate getReturn_date() { return return_date;}
    public Lender getLender() { return lender;}
    public Book getBook() { return book;}

    public void setDate_lent(LocalDate date_lent) { this.date_lent = date_lent;}
    public void setReturn_date(LocalDate return_date) { this.return_date = return_date;}
    public void setLender(Lender lender) { this.lender = lender;}
    public void setBook(Book book) { this.book = book;}

    public void lend_copy(Book book, Copy copy, Lender lender, int days){}
}
