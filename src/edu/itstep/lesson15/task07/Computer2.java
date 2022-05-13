package edu.itstep.lesson15.task07;

public class Computer2 {

    private boolean status;
    private final Component[] components;

    public Computer2(Component[] components) {
        this.status = false;
        this.components = components;
    }
    
    public void power() {
        this.status = !status;
        System.out.println(status ? "Комьютер включен" :  "комьютер выключен");
    }

    public void hddVolume() {
        for (Component component : components) {
            if (component instanceof Hdd) {
                System.out.println("HDD volume: " + component.getVolume());
            }
        }
    }

    public void hddCheck() {
        for (Component component : components) {
            if (component instanceof Hdd) {
                hddCheck(component);
            }
        }
    }

    private void hddCheck(Component component) {
        if (status) {

            Hdd hdd = (Hdd) component;

            System.out.println("-------------------");
            System.out.println("--- До проверки:");
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


            System.out.println("--- После проверки:");
            for (String d : hdd.getData()) {
                System.out.println(d);
            }
            System.out.println("-------------------");
        } else {
            System.out.println("Компьютер выключен");
        }
    }
}
