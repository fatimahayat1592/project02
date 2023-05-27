package project02;

public class Car {
    /* Create a Class Car that would have the following fields: carPrice and
    color and method calculateSalePrice() which should be returning a
    price of the car.
    Create 2 sub classes: Sedan and Truck. The Truck class has a field
            as weight and has its own implementation of calculateSalePrice()
    method in which returned price is calculated as following: if
    weight>2000 then returned price car should include 10% discount,
    otherwise 20% discount.
    The Sedan class has field as length and also does it is own
            implementation of calculateSalePrice(): if length of sedan is >20 feet
    then returned car price should include 5% discount, otherwise 10%
    discount*/
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }
    Double calculateSalePrice(){
        return carPrice;
    }
}
class Truck extends Car{
    double weight;

    public Truck(double carPrice, String color,double weight) {
        super(carPrice, color);
        this.weight=weight;
    }
    Double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice*10/100;
        }else {
            return carPrice*20/100;
        }
    }

    }
    class Sedan extends Car{
        double length;
        public Sedan(double carPrice, String color,double length) {
            super(carPrice, color);
            this.length=length;
        }
        Double calculateSalePrice(){
            if(length>20){
                return carPrice*5/100;
            }else {
                return carPrice*10/100;
            }
        }
    }
    class CarTester {
        public static void main(String[] args) {


            Car[] cars1 = {new Truck(56434, "Red", 2500), new Sedan(34562, "Black", 15)};
            for (Car c : cars1) {
                System.out.println(c.calculateSalePrice());
            }
        }
    }

