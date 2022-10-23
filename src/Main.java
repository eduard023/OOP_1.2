import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        lada.setRegNumber("м675мр196");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        audi.setGears("автомат");
        audi.setInsurance(new Car.Insurance(LocalDate.now(), 20000, "98765432"));
        audi.getInsurance().checkExpireDate();
        audi.getInsurance().checkNumber();
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        bmw.setSummerTyres(false);
        Car kia = new Car("KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        kia.setColor("синий");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        hyundai.setEngineVolume(0);
        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);
        System.out.println(lada.inCorrectRegNumber());

    }
    public static void printInfo(Car car){
        System.out.println(car.getBrand() + " " + car.getModel() +
                ", год выпуска: "+ car.getProductionYear()+
                ", страна сборки: "+ car.getProductionCountry()+
                ", цвет кузова: "+ car.getColor()+
                ", обьём двигателя: " + car.getEngineVolume()+
                ", коробка передач: "+ car.getGears()+
                ", тип кузова: "+ car.getTypeOfBody()+
                ", рег.номер: "+ car.getRegNumber()+
                ", колличество мест: " + car.getSeatsCounts()+
                ", " + (car.isSummerTyres()?"летняя ":"зимняя ")+"резина"+
                (car.getKey().isWithoutKeyAccess() ? ", безключевой доступ" : ", ключевой доступ")+
                (car.getKey().isRemoteRunEngine() ? ", удаленный запуск" : ", обычный запуск")+
                ", номер страховки: "+car.getInsurance().getNumbers()+
                ", стоимость страховки: " + car.getInsurance().getCoast()+
                ", срок действия страховки: " + car.getInsurance().getExpireDate());
    }
}