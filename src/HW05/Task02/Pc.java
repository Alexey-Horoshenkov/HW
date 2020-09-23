package HW05.Task02;

public class Pc {

    private final Type type;
    private final Cpu cpu;
    private final Ram ram;
    private final Video video;
    private final Disc disc;
    private final Display display;

    public Pc(Type type, Cpu cpu, Ram ram, Video video, Disc disc, Display display) {
        this.type = type;
        this.cpu = cpu;
        this.ram = ram;
        this.video = video;
        this.disc = disc;
        this.display = display;
    }

    public Type getType() {
        return type;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public Video getVideo() {
        return video;
    }

    public Disc getDisc() {
        return disc;
    }

    public Display getDisplay() {
        return display;
    }
}
