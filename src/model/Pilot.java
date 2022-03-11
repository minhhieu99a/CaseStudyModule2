package model;

public class Pilot extends Human{
    public String nationnality;


    public Pilot() {
    }

    public Pilot(String id, String fullname, Double height, Double weight, int age, Double price, String status, String nationnality) {
        super(id, fullname, height, weight, age, price, status);
        this.nationnality = nationnality;
    }

    public String getNationnality() {
        return nationnality;
    }

    public void setNationnality(String nationnality) {
        this.nationnality = nationnality;
    }


    @Override
    public String toString() {
        return "Pilot{" +
                "Id='" + getId() + '\'' +
                ", Fullname='" + getFullName() + '\'' +
                ", Height=" + getHeight() +
                ", Weight=" + getWeight() +
                ", Age=" + getAge() +
                ", Price=" + getPrice() +
                ", Status='" + getStatus() +
                "Nationnality='" + nationnality + '\'' +
                '}';
    }
}
