package HW05.Task02;

public class Display {

    private String manufacturer;
    private double displaySize;
    private boolean color;

    public Display() {
        this.manufacturer = "China";
        this.displaySize = 18;
        this.color = false;
    }

    public Display(String manufacturer, double displaySize, boolean color) {
        this.manufacturer = manufacturer;
        this.displaySize = displaySize;
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public boolean isColor() {
        return color;
    }

    public Display getResult() {
        return new Display(manufacturer, displaySize, color);
    }

    public String getAllInf() {
        return "manufacturer = " + this.getManufacturer() +
                "; displaySize = " + this.getDisplaySize() +
                "; color = " + this.isColor();
    }
}
