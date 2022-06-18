package BookInventory;

import java.util.ArrayList;

public class Book {
    private ArrayList<Copy> copy_list = new ArrayList<>();
    private ArrayList<ISBN> isbn_list = new ArrayList<>();
    private Title title;

    public Book(ArrayList<Copy> copy_list, ArrayList<ISBN> isbn_list, Title title) {
        this.copy_list = copy_list;
        this.isbn_list = isbn_list;
        this.title = title;
    }

    public ArrayList<Copy> getCopy_list() { return copy_list;}
    public ArrayList<ISBN> getIsbn_list() { return isbn_list;}
    public Title getTitle() { return title;}

    public void setCopy_list(ArrayList<Copy> copy_list) { this.copy_list = copy_list;}
    public void setIsbn_list(ArrayList<ISBN> isbn_list) { this.isbn_list = isbn_list;}
    public void setTitle(Title title) { this.title = title;}
}
