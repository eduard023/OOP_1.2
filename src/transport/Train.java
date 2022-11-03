package transport;

public class Train extends Transport{
    private int tripPrice;
    private int tripTime;
    private String departureStation;
    private String finalStop;
    private int wagonNumber;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, int tripPrice, int tripTime, String departureStation, String finalStop, int wagonNumber) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        if (tripPrice <= 0) {
            this.tripPrice = 500;
        } else {
            this.tripPrice = tripPrice;
        }
        if (tripTime <= 0) {
            this.tripTime = 1;
        } else {
            this.tripTime = tripTime;
        }
        this.departureStation = validOrDefault(departureStation);
        this.finalStop = validOrDefault(finalStop);
        if (wagonNumber <= 0) {
            this.wagonNumber = 1;
        } else {
            this.wagonNumber = wagonNumber;
        }
    }


    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        if (tripPrice <= 0) {
            this.tripPrice = 500;
        } else {
            this.tripPrice = tripPrice;
        }
    }

    public int getTripTime() {
        return tripTime;
    }

    public void setTripTime(int tripTime) {
        if (tripTime <= 0) {
            this.tripTime = 1;
        } else {
            this.tripTime = tripTime;
        }
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        if (departureStation == null || departureStation.isBlank()) {
            this.departureStation = "default";
        } else {
            this.departureStation = departureStation;
        }
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        if (finalStop == null || finalStop.isBlank()) {
            this.finalStop = "default";
        } else {
            this.finalStop = finalStop;
        }
    }

    public int getWagonNumber() {
        return wagonNumber;
    }

    public void setWagonNumber(int wagonNumber) {
        if (wagonNumber <= 0) {
            this.wagonNumber = 1;
        } else {
            this.wagonNumber = wagonNumber;
        }
    }

    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем.");

    }
}