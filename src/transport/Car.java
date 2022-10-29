package transport;

import java.security.Key;
import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String gears;
    private final String typeOfBody;
    private String regNumber;
    private final int seatsCounts ;
    private boolean summerTyres;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model,
               double engineVolume, String color,
               int productionYear, String productionCountry,
               String gears, String typeOfBody,
               String regNumber, int seatsCounts,
               boolean summerTyres, Key key,
               Insurance insurance) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (regNumber == null) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
        if (gears == null) {
            this.gears = "МКПП";
        } else {
            this.gears = gears;
        }
        if (key == null){
            this.key = new Key();
        }else {
            this.key = key;
        }
        if (typeOfBody == null){
            this.typeOfBody = "седан";
        }else {
            this.typeOfBody = typeOfBody;
        }    if (insurance == null){
            this.insurance = new Insurance();
        }else {
            this.insurance = insurance;
        }
        this.seatsCounts = 5;
        this.summerTyres = true;
    }
    public Car(String brand, String model,
               double engineVolume, String color,
               int productionYear, String productionCountry){
        this(brand, model,
                engineVolume, color,
                productionYear, productionCountry,
                "МКПП", "седан",
                "х000хх000", 5,
                true, new Key(),
                new Insurance());
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

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getSeatsCounts() {
        return seatsCounts;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }
    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        if (gears == null) {
            this.gears = "МКПП";
        } else {
            this.gears = gears;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public void chanceTyres() {
        summerTyres = !summerTyres;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public boolean inCorrectRegNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char chars[] = regNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) && Character.isDigit(chars[6])
                && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }
    public static class Key{
        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEngine, boolean withoutKeyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }
        public Key(){
            this(false,false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }

    public static class Insurance{
        private final LocalDate expireDate;
        private final double coast;
        private final String numbers;

        public Insurance(LocalDate expireDate, double coast, String numbers) {
            if (expireDate == null){
                this.expireDate = LocalDate.now().plusDays(365);
            }else {
                this.expireDate = expireDate;
            }
            this.coast = coast;
            if (numbers == null){
                this.numbers = "123456789";
            }else {
                this.numbers = numbers;
            }
        }
        public Insurance(){
            this(null, 10000, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCoast() {
            return coast;
        }

        public String getNumbers() {
            return numbers;
        }

        public void checkExpireDate(){
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())){
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }

        public void checkNumber(){
            if (numbers.length() != 9){
                System.out.println("Номер страховки некорректный!");
            }
        }
    }
}
