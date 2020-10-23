public class Main {


    public static void main(String[] args) {


        Car car1 = new Car();

        Car car2 = new Car();

        car1.märke = "volvo";
        car1.årsmodell = 2010;
        car1.price = 350000;

        car2.märke = "Saab";
        car2.årsmodell = 1999;
        car2.price = 10000;

        System.out.println("märket är " + car1.märke + "\nÅrmodellen är " + car1.årsmodell + "\npriset är " + car1.price );
        System.out.println("--------------");
        System.out.println("märket är " + car2.märke + "\nÅrmodellen är " + car2.årsmodell + "\npriset är " + car2.price );



    }
}
