package HW05.Task02;

public class Intel extends Cpu {

    private final String cpuName = "Core i";
    private int generation;

    public Intel() {
        this.generation = 7;
    }

    public Intel(String manufacturer, String model, int cache, int cores, double clockRate, int generation) {
        super(manufacturer, model, cache, cores, clockRate);
        this.generation = generation;
    }

    public String getCpuName() {
        return cpuName;
    }

    public int getGeneration() {
        return generation;
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
                "; generation = " + this.generation;
    }
}
