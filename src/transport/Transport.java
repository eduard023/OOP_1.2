package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        this.brand = validOrDefault(brand);
        this.model = validOrDefault(model);
        this.productionCountry = validOrDefault(productionCountry);
        this.color = validOrDefault(color);
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (maxSpeed < 0){
            this.maxSpeed = 60;
        }else {
            this.maxSpeed = maxSpeed;
        }
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() ||color.isBlank()){
            this.color = "default";
        }else {
        this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0){
            this.maxSpeed = 60;
        }else {
        this.maxSpeed = maxSpeed;
    }
    }
    public abstract void refill();

    public String validOrDefault(String value){
        if (value == null || value.isBlank()) {
            return "default";
        } else {
            return value;
        }
    }
}
