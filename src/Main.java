public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada ", "Granta ", 1.7, "желтый ", 2015, "в России");
//        lada.brand = "Lada ";
//        lada.model = "Granta ";
//        lada.engineVolume = 1.7;
//        lada.color = "желтый ";
//        lada.productionYear = 2015;
//        lada.productionCountry = "в России";
        lada.print();

        Car audi = new Car("Audi ", "A8 50 L TDI quattro ", 3.0, "черный ", 2020, "в Германии");
//        audi.brand = "Audi ";
//        audi.model = "A8 50 L TDI quattro ";
//        audi.engineVolume = 3.0;
//        audi.color = "черный ";
//        audi.productionYear = 2020;
//        audi.productionCountry = "в Германии";
        audi.print();

        Car bmw = new Car("BMW ", "Z8 ", 3.0, "черный ", 2021, "в Германии");
//        bmw.brand = "BMW ";
//        bmw.model = "Z8 ";
//        bmw.engineVolume = 3.0;
//        bmw.color = "черный ";
//        bmw.productionYear = 2021;
//        bmw.productionCountry = "в Германии";
        bmw.print();

        Car kia = new Car("KIA ", "Sportage 4-го поколения ", 2.4, "красный ", 2018, "в Южной Корее");
//        kia.brand = "KIA ";
//        kia.model = "Sportage 4-го поколения ";
//        kia.engineVolume = 2.4;
//        kia.color = "красный ";
//        kia.productionYear = 2018;
//        kia.productionCountry = "в Южной Корее";
        kia.print();

        Car hyundai = new Car("Hyundai ", "Avante ", 1.6, "оранжевый ", 2016, "в Южной Корее");
//        hyundai.brand = "Hyundai ";
//        hyundai.model = "Avante ";
//        hyundai.engineVolume = 1.6;
//        hyundai.color = "оранжевый ";
//        hyundai.productionYear = 2016;
//        hyundai.productionCountry = "в Южной Корее";
        hyundai.print();


    }
}