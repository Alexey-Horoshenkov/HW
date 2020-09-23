package HW05.Task02;

public class Video {

    private String manufacturer;
    private MemoryType memoryType;
    private int videoMemory;
    private Coolling cooling;

    public Video() {
        this.manufacturer = "China";
        this.memoryType = MemoryType.DDR2;
        this.videoMemory = 1;
        this.cooling = Coolling.PASSIVE;
    }

    public Video(String manufacturer, MemoryType memoryType, int videoMemory, Coolling cooling) {
        this.manufacturer = manufacturer;
        this.memoryType = memoryType;
        this.videoMemory = videoMemory;
        this.cooling = cooling;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public MemoryType getmemoryType() {
        return memoryType;
    }

    public int getVideoMemory() {
        return videoMemory;
    }

    public Coolling getcooling() {
        return cooling;
    }

    public Video getResult() {
        return new Video(manufacturer, memoryType, videoMemory, cooling);
    }

    public String getAllInf() {
        return "manufacturer = " + this.getManufacturer() +
                "; memoryType = " + this.getmemoryType() +
                "; videoMemory = " + this.getVideoMemory() +
                "; cooling = " + this.getcooling();
    }
}
