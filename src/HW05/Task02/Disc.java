package HW05.Task02;

public class Disc {

    private String manufacturer;
    private long memory;
    private DiscType discType;
    private double ffDisc;

    public Disc() {
          this.manufacturer="China";
          this.memory=123;
          this.discType=DiscType.HDD;
          this.ffDisc=3.5;
    }

    public Disc(String manufacturer, long memory, DiscType discType, double ffDisc) {
        this.manufacturer = manufacturer;
        this.memory = memory;
        this.discType = discType;
        this.ffDisc = ffDisc;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public long getMemory() {
        return memory;
    }

    public DiscType getdiscType() {
        return discType;
    }

    public double getFfDisc() {
        return ffDisc;
    }

    public Disc getResult() {
        return new Disc (manufacturer,memory, discType, ffDisc);
    }

    public String getAllInf() {
        return "manufacturer = " + this.getManufacturer() +
                "; memory = " + this.getMemory() +
                "; discType = " + this.getdiscType() +
                "; ffDisc = " + this.getFfDisc();
    }
}
