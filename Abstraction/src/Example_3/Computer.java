package Example_3;
import java.security.PrivateKey;

abstract class Computer
{
    //Properties
    private String Brand;
    private String Model;

    public Computer(String brand, String model) {
        Brand = brand;
        Model = model;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void powerOn(){
        System.out.println("Powering on the computer.");
    }

    //Abstract Methods
    public abstract void SetOperatingSystem(String os);
    public abstract void installSoftware(String software);
    public abstract void connectToInternet();

}
