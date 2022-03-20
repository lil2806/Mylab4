package com;

 class cars {

    //fields needed..attributes of the container or object
    String model,brand,color;
    int year,quantity;
    double price;

    //constructor
    cars(String model,String brand,String color,double price,int quantity,int year){
        this.model=model;
        this.brand=brand;
        this.color=color;
        this.price=price;
        this.quantity=quantity;
        this.year=year;
    }
    //this part is helpful when u wanna get certain fields from the class/object
    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    //this part is usefull when u wanna set  or change some stuff on the fields
    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //methods that affect the quantity of the cars available
    void sell(int decrease){
        quantity = this.quantity -= decrease;
    }

    void delivery(int increment){
        quantity=quantity += increment;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}

 class Car {

    public static void main(String[] args){
//
        cars car1=new cars("Fiesta","Ford","white",5000.00,500,2014);
        cars car2=new cars("Mark x","Nissan","Gun Metal",4000.00,10000,2015);

        System.out.println(car1.toString());
        System.out.println(car2.toString());

        car1.sell(650);
        car1.setColor("blue");
        car2.delivery(1050);

        System.out.println("");
        System.out.println(car1.toString());
        car2.delivery(10);
        car2.setColor("black");
        System.out.println(car2.toString());
        //System.out.println();

    }
}

