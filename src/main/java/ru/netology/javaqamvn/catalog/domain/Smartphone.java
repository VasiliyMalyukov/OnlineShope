package ru.netology.javaqamvn.catalog.domain;

public class Smartphone extends Product {
    private String manufacturer;
    private String name;

    public Smartphone(int id, String name, String manufacturer, int price) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
