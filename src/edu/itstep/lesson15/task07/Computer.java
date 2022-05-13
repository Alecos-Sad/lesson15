package edu.itstep.lesson15.task07;

public class Computer {

    private boolean status;

    private final Hdd hdd;
    private final Fdd fdd;
    private final Ram ram;
    private final Cpu cpu;

    public Computer(Hdd hdd, Fdd fdd, Ram ram, Cpu cpu) {
        this.status = false;
        this.hdd = hdd;
        this.fdd = fdd;
        this.ram = ram;
        this.cpu = cpu;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public Fdd getFdd() {
        return fdd;
    }

    public Ram getRam() {
        return ram;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void power() {
        this.status = !status;
        System.out.println(status ? "Комьютер включен" :  "комьютер выключен");
    }

    public void checkHdd() {
        if (status) {

            System.out.println("До проверки:");
            for (String d : hdd.getData()) {
                System.out.println(d);
            }

            String[] data = hdd.getData();
            int idx = 0;
            for (int i = 0; i < data.length; i++) {
                if (data[i].equalsIgnoreCase("virus")) {
                    data[i] = null;
                } else {
                    idx++;
                }
            }
            String[] newData = new String[idx];
            idx = 0;
            for (String dat : data) {
                if (dat != null) {
                    newData[idx] = dat;
                    idx++;
                }
            }
            hdd.setData(newData);

            System.out.println("После проверки:");
            for (String d : hdd.getData()) {
                System.out.println(d);
            }
        } else {
            System.out.println("Компьютер выключен");
        }
    }
}
