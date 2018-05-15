package domains;


public class Car {

    String brand = "Volvo";
    Integer tires = 4;

    public Car(String brand, Integer tires) {
        this.brand = brand;
        this.tires = tires;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getTires() {
        return tires;
    }

    public void setTires(Integer tires) {
        this.tires = tires;
    }

}
