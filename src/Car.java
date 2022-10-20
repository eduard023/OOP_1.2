public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    void print(){
        System.out.println(getBrand() + getModel() + getProductionYear() + " года выпуска. Сборка " + getProductionCountry() +", "+ getColor() + "цвет кузова. Обьем двигателя - " + getEngineVolume());
    }

    public String getBrand() {
        if (brand == null){
            brand = "default ";
        }
        return brand;
    }

    public String getModel() {
        if (model == null){
            model = "default ";
        }
        return model;
    }

    public double getEngineVolume() {
        if (engineVolume == 0){
            engineVolume = 1.5;
        }
        return engineVolume;
    }

    public String getColor() {
        if (color == null){
            color = "белый ";
        }
        return color;
    }

    public int getProductionYear() {
        if (productionYear == 0){
            productionYear = 2000;
        }
        return productionYear;
    }

    public String getProductionCountry() {
        if (productionCountry == null){
            productionCountry = "default";
        }
        return productionCountry;
    }
}
