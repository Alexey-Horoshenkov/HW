package HW05.Task02.Strategy;

import HW05.Task02.*;

public class IhaveNoMoney implements MoneyStrategy {

    @Override
    public void makeOrderPc() {

        Director direcor = new Director();
        PcAssembler pcAssembler = new PcAssembler();

        direcor.makeEconomyPc(pcAssembler);

        Pc pc = pcAssembler.getResult();
        Cpu cpu = pc.getCpu();
        Ram ram = pc.getRam();
        Video video = pc.getVideo();
        Disc disc = pc.getDisc();
        Display display = pc.getDisplay();

        System.out.println("Собран вариант: " + pc.getType());
        System.out.println("Процессор: " + cpu.getAllInf());
        System.out.println("ОЗУ: " + ram.getAllInf());
        System.out.println("Видеокарта: " + video.getAllInf());
        System.out.println("Жесткий диск: " + disc.getAllInf());
        System.out.println("Монитор: " + display.getAllInf());
    }
}
