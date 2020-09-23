package HW05.Task02;

public class Amd extends Cpu {

    private final String cpuName = "Amd";
    private String cpuGenerationName;

    public Amd() {
        this.cpuGenerationName = "ryzen";
    }

    public Amd(String manufacturer, String model, int cache, int cores, double clockRate, String cpuGenerationName) {
        super(manufacturer, model, cache, cores, clockRate);
        this.cpuGenerationName = cpuGenerationName;
    }

    public String getCpuName() {
        return cpuName;
    }

    public String getCpuGenerationName() {
        return cpuGenerationName;
    }

    @Override
    public double getClockRate() {
        return super.getClockRate();
    }

    @Override
    public int getCores() {
        return super.getCores();
    }

    @Override
    public int getCache() {
        return super.getCache();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public String getManufacturer() {
        return super.getManufacturer();
    }

    @Override
    public String getAllInf() {
        return "manufacturer = " + super.getManufacturer() +
                "; model = " + super.getModel() +
                "; cache = " + super.getCache() +
                "; cores = " + super.getCores() +
                "; clockRate = " + super.getClockRate() +
                "; cpuName = " + this.cpuName +
                "; cpuGenerationName = " + this.cpuGenerationName;
    }
}
