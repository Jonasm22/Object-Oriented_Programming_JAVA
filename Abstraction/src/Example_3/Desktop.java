package Example_3;

public class Desktop  extends  Computer {
    public boolean hasRGB;

    public Desktop(String brand, String model, boolean hasRGB) {
        super(brand, model);
        this.hasRGB = hasRGB;
    }

    public boolean isHasRGB() {
        return hasRGB;
    }

    public void setHasRGB(boolean hasRGB) {
        this.hasRGB = hasRGB;

    }

    public void SetOperatingSystem(String os) {
        System.out.println("Desktop operating system set to: " + os);
    }

    public void installSoftware(String software) {
        System.out.println("Installing " + software + " on the desktop.");
    }

    public void connectToInternet() {
        System.out.println("Desktop connecting via Ethernet.");

    }


}

