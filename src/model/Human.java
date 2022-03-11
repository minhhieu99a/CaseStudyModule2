package model;

import java.io.Serializable;

public class Human implements Serializable {
    private String id;
    private String fullName;
    private Double height;
    private Double weight;
    private int age;
    private Double price;
    private String status;

    public Human() {
    }

    public Human(String id, String fullname, Double height, Double weight, int age, Double price, String status) {
        this.id = id;
        fullName = fullname;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.price = price;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Id='" + id + '\'' +
                ", Fullname='" + fullName + '\'' +
                ", Height=" + height +
                ", Weight=" + weight +
                ", Age=" + age +
                ", Price=" + price +
                ", Status='" + status + '\'' +
                '}';
    }
}
