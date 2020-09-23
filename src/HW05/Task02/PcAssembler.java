package HW05.Task02;

public class PcAssembler implements Assembler {

    private Type type;
    private Cpu cpu;
    private Ram ram;
    private Video video;
    private Disc disc;
    private Display display;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setCPU(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setRAM(Ram ram) {
        this.ram = ram;
    }

    @Override
    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public void setDisc(Disc disc) {
        this.disc = disc;
    }

    @Override
    public void setDisplay(Display display) {
        this.display = display;
    }

    public Pc getResult() {
        return new Pc(type, cpu, ram, video, disc, display);
    }

}
