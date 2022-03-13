package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SugarBaby extends Human{
    public double bust;
    public double waist;
    public double hip;
    public SugarBaby() {
    }

    public SugarBaby(String id, String fullName, Double height, Double weight, int age, Double price, ArrayList<LocalDate> dates, double bust, double waist, double hip) {
        super(id, fullName, height, weight, age, price, dates);
        this.bust = bust;
        this.waist = waist;
        this.hip = hip;
    }

    public double getBust() {
        return bust;
    }

    public void setBust(double bust) {
        this.bust = bust;
    }

    public double getWaist() {
        return waist;
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }

    public double getHip() {
        return hip;
    }

    public void setHip(double hip) {
        this.hip = hip;
    }

    @Override
    public String toString() {
        return "SugarBaby{" +
                "Id='" + getId() + '\'' +
                ", Fullname='" + getFullName() + '\'' +
                ", Height=" + getHeight() +
                ", Weight=" + getWeight() +
                ", Age=" + getAge() +
                ", Price=" + getPrice() +
                ", Bust=" + bust +
                ", Waist=" + waist +
                ", Hip=" + hip +
                '}';
    }
}
