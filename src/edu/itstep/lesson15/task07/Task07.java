package edu.itstep.lesson15.task07;

public class Task07 {

    public static void main(String[] args) {
        System.out.println("Task 07");
        // ---
        String[] data = {
                "movie", "game", "vIrUs", "porn", "foto", "VIRus"
        };
        Hdd hdd = new Hdd(1000.0);
        hdd.setData(data);
        Fdd fdd = new Fdd();
        Ram ram = new Ram(16000.0, 1600);
        Cpu cpu = new Cpu(16.0, 3500);
//        Computer computer = new Computer(hdd, fdd, ram, cpu);
//        computer.checkHdd();
//        computer.power();
//        computer.checkHdd();
//        System.out.println(computer.getHdd().getVolume());

        Computer2 computer2 = new Computer2(
                new Component[]{
                        hdd, fdd, cpu, ram
                }
        );
        computer2.power();
        computer2.hddVolume();
        computer2.hddCheck();
    }
}
