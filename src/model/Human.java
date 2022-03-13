package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Human implements Serializable {
    private String id;
    private String fullName;
    private Double height;
    private Double weight;
    private int age;
    private Double price;
    private ArrayList<LocalDate> dates;

    public Human() {
    }

    public Human(String id, String fullName, Double height, Double weight, int age, Double price,ArrayList<LocalDate> dates) {
        this.id = id;
        this.fullName = fullName;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.price = price;
        this.dates = dates;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ArrayList<LocalDate> getDates() {
        return dates;
    }

    public void setDates(ArrayList<LocalDate> dates) {
        this.dates = dates;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                ", price=" + price +
                ", dates=" + dates +
                '}';
    }
}
