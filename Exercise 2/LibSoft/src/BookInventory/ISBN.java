package BookInventory;

public class ISBN {
    private int prefix;
    private int group;
    private int publisher;
    private int title;
    private int check_digit;

    public ISBN(int prefix, int group, int publisher, int title, int check_digit) {
        this.prefix = prefix;
        this.group = group;
        this.publisher = publisher;
        this.title = title;
        this.check_digit = check_digit;
    }

    public int getPrefix() { return prefix;}
    public int getGroup() { return group;}
    public int getPublisher() { return publisher;}
    public int getTitle() { return title;}
    public int getCheck_digit() { return check_digit;}

    public void setPrefix(int prefix) { this.prefix = prefix;}
    public void setGroup(int group) { this.group = group;}
    public void setPublisher(int publisher) { this.publisher = publisher;}
    public void setTitle(int title) { this.title = title;}
    public void setCheck_digit(int check_digit) { this.check_digit = check_digit;}
}
