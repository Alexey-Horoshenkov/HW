package HW05.Task02;

public class Cpu {

    private double clockRate;
    private int cores;
    private int cache;
    private String model;
    private String manufacturer;

    public Cpu() {
        this.manufacturer = "China";
        this.model = "MK1";
        this.cache = 12;
        this.cores = 8;
        this.clockRate = 5.1;
    }

    public Cpu(String manufacturer, String model, int cache, int cores, double clockRate) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.cache = cache;
        this.cores = cores;
        this.clockRate = clockRate;
    }

    public double getClockRate() {
        return clockRate;
    }

    public int getCores() {
        return cores;
    }

    public int getCache() {
        return cache;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Cpu getResult() {
        return new Cpu(manufacturer, model, cache, cores, clockRate);
    }

    public String getAllInf() {
        return "manufacturer = " + this.getManufacturer() +
                "; model = " + this.getModel() +
                "; cache = " + this.getCache() +
                "; cores = " + this.getCores() +
                "; clockRate = " + this.getClockRate();
    }
}
