package Example_3;

public class Main {

    public static void main(String[] args) {

    Laptop myLaptop = new Laptop("Dell", "XS-23", 30.4);

        System.out.println("Brand: " + myLaptop.getBrand());
        System.out.println("Model: " + myLaptop.getModel());
        System.out.println("Weight: " + myLaptop.getWeight() + " kg");
        myLaptop.powerOn();

        myLaptop.SetOperatingSystem("Windows 11");
        myLaptop.installSoftware("Microsoft Office");
        myLaptop.connectToInternet();


    }


}
