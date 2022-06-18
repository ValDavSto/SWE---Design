package BookInventory;

public class Copy {
    private int copy_id;
    private String place;
    private boolean is_lent;
    private boolean is_reserved;

    public Copy(int copy_id, String place, boolean is_lent, boolean is_reserved) {
        this.copy_id = copy_id;
        this.place = place;
        this.is_lent = is_lent;
        this.is_reserved = is_reserved;
    }

    public int getCopy_id() { return copy_id;}
    public String getPlace() { return place;}
    public boolean getIs_lent() { return is_lent;}
    public boolean getIs_reserved() { return is_reserved;}

    public void setCopy_id(int copy_id) { this.copy_id = copy_id;}
    public void setPlace(String place) { this.place = place;}
    public void setIs_lent(boolean is_lent) { this.is_lent = is_lent;}
    public void setIs_reserved(boolean is_reserved) { this.is_reserved = is_reserved;}
}
