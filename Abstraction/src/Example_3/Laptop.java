package Example_3;


public class Laptop extends Computer {

    private double weight;

    public Laptop(String brand, String model, double weight) {
        super(brand, model);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void SetOperatingSystem(String os){
        System.out.println("Laptop operating system set to: " + os);
    }

   public void installSoftware(String software) {
        System.out.println("Installing " + software + " on the laptop.");
    }

     public void connectToInternet() {
        System.out.println("Laptop connecting to Wi-Fi.");
    }


}
