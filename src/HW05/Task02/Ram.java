package HW05.Task02;

public class Ram {

    private String manufacturer;
    private int memory;
    private double memoryRate;
    private MemoryType memoryType;

    public Ram() {
        this.manufacturer = "China";
        this.memory = 15;
        this.memoryRate = 3.5;
        this.memoryType = MemoryType.DDR2;
    }

    public Ram(String manufacturer, int memory, double memoryRate, MemoryType memoryType) {
        this.manufacturer = manufacturer;
        this.memory = memory;
        this.memoryRate = memoryRate;
        this.memoryType = memoryType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getMemory() {
        return memory;
    }

    public double getMemoryRate() {
        return memoryRate;
    }

    public MemoryType getmemoryType() {
        return memoryType;
    }

    public Ram getResult() {
        return new Ram(manufacturer, memory, memoryRate, memoryType);
    }

    public String getAllInf() {
        return "manufacturer = " + this.getManufacturer() +
                "; memory = " + this.getMemory() +
                "; memoryRate = " + this.getMemoryRate() +
                "; memoryType = " + this.getmemoryType();
    }
}
