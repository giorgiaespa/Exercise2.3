public class Car {
    private String brand;
    private String model;
    private String plate;
    private int displacement;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getDisplacement() {
        return displacement;
    }
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }


    public Car(String brand, String model, String plate, int displacement) {
        this.brand = brand;
        this.model = model;
        this.plate = plate;
        this.displacement = displacement;
    }

    @Override
    public String toString() {
         return "Car => " +
                 "brand:'" + brand + '\'' +
                 ", model:'" + model + '\'' +
                 ", plate:'" + plate + '\'' +
                 ", displacement:" + displacement;
    }



}





