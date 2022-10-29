import transport.Bus;
import transport.Car;
import transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        lada.setRegNumber("м675мр196");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        audi.setGears("автомат");
        audi.setInsurance(new Car.Insurance(LocalDate.now(), 20000, "987654321"));
        audi.getInsurance().checkExpireDate();
        audi.getInsurance().checkNumber();
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        bmw.setSummerTyres(false);
        Car kia = new Car("KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        kia.setColor("синий");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);
        hyundai.refill();

        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", " ", 301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", " ", 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        printTrainInfo(lastochka);
        printTrainInfo(leningrad);
        leningrad.refill();

        Bus scania = new Bus("Скания", "Авено", 2015, "Щвецария", "синий", 150);
        Bus isuzu = new Bus("Исузу", "Богдан", 2011, "Россия", "желтый", 130);
        Bus ford = new Bus("Форд", "Транзит", 2019, "США", "черный", 190);
        printBusInfo(scania);
        printBusInfo(isuzu);
        printBusInfo(ford);
        ford.refill();
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
    public static void printTrainInfo(Train train){
        System.out.println(train.getBrand() + " " + train.getModel() +
                ", год выпуска: " + train.getProductionYear() +
                ", страна сборки: " + train.getProductionCountry() +
                ", максимальная скорость: " + train.getMaxSpeed() +
                ", цена билета: " + train.getTripPrice() +
                ", станция отправления: " + train.getDepartureStation() +
                ", конечная остановка: " + train.getFinalStop() +
                ", вагонов в поезде: " + train.getWagonNumber());
    }

    public static void printBusInfo(Bus bus){
        System.out.println(bus.getBrand() + " " + bus.getModel() +
                ", год выпуска: " + bus.getProductionYear() +
                ", страна сборки: " + bus.getProductionCountry() +
                ", максимальная скорость: " + bus.getMaxSpeed() +
                ", цвет кузова: " + bus.getColor());
    }
}