package HW05.Task02;

public class Director {

    public void makeEconomyPc(Assembler assembler) {
        assembler.setType(Type.ECONOM);
        assembler.setCPU(new Amd());
        assembler.setRAM(new Ram());
        assembler.setVideo(new Video());
        assembler.setDisc(new Disc());
        assembler.setDisplay(new Display());
    }

    public void makeStandartPc(Assembler assembler) {
        assembler.setType(Type.STANDART);
        assembler.setCPU(new Intel("USA", "MK2", 24, 10, 6.2, 5));
        assembler.setRAM(new Ram("USA", 30, 7, MemoryType.DDR3));
        assembler.setVideo(new Video("USA", MemoryType.DDR3, 2, Coolling.PASSIVE));
        assembler.setDisc(new Disc("USA", 123123, DiscType.HDD, 3.5));
        assembler.setDisplay(new Display("USA", 48, true));
    }

    public void makeLuxuryPc(Assembler assembler) {
        assembler.setType(Type.LUXURY);
        assembler.setCPU(new Intel("SKOLKOVO", "MK99", 48, 20, 9.2, 9));
        assembler.setRAM(new Ram("SKOLKOVO", 99, 9, MemoryType.DDR4));
        assembler.setVideo(new Video("SKOLKOVO", MemoryType.DDR4, 4, Coolling.ACTIVE));
        assembler.setDisc(new Disc("SKOLKOVO", 123123123, DiscType.SSD, 2.5));
        assembler.setDisplay(new Display("SKOLKOVO", 99.9, true));
    }
}
