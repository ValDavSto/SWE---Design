package bookInventory;

import java.time.LocalDate;
import java.util.ArrayList;

public class Title {
    private String title;
    private int page_number;
    private String publisher;
    private LocalDate year_of_publication;
    private ArrayList<Author> author_list = new ArrayList<>();

    public Title(String title, int page_number, String publisher, LocalDate year_of_publication, ArrayList<Author> author_list) {
        this.title = title;
        this.page_number = page_number;
        this.publisher = publisher;
        this.year_of_publication = year_of_publication;
        this.author_list = author_list;
    }

    public String getTitle() { return title;}
    public int getPage_number() { return page_number;}
    public String getPublisher() { return publisher;}
    public LocalDate getYear_of_publication() { return year_of_publication;}
    public ArrayList<Author> getAuthor_list() { return author_list;}

    public void setTitle(String title) { this.title = title;}
    public void setPage_number(int page_number) { this.page_number = page_number;}
    public void setPublisher(String publisher) { this.publisher = publisher;}
    public void setYear_of_publication(LocalDate year_of_publication) { this.year_of_publication = year_of_publication;}
    public void setAuthor_list(ArrayList<Author> author_list) { this.author_list = author_list;}
}
