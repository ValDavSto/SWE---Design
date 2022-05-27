package Lender;

public class Lender {
    private int matrikel_number;
    private String first_name;
    private String last_name;

    public Lender(int matrikel_number, String first_name, String last_name) {
        this.matrikel_number = matrikel_number;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public int getMatrikel_number() { return matrikel_number;}
    public String getFirst_name() { return first_name;}
    public String getLast_name() { return last_name;}

    public void setMatrikel_number(int matrikel_number) { this.matrikel_number = matrikel_number;}
    public void setFirst_name(String first_name) { this.first_name = first_name;}
    public void setLast_name(String last_name) { this.last_name = last_name;}
}
