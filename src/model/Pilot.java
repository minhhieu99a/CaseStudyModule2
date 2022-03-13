package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pilot extends Human{
    public String nationnality;


    public Pilot() {
    }

    public Pilot(String id, String fullName, Double height, Double weight, int age, Double price, ArrayList<LocalDate> dates, String nationnality) {
        super(id, fullName, height, weight, age, price, dates);
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
                ", Nationnality='" + nationnality + '\'' +
                '}';
    }
}
