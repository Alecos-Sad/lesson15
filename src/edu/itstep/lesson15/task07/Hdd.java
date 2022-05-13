package edu.itstep.lesson15.task07;

public class Hdd extends Component {

    private String[] data;

    public Hdd(Double volume) {
        this("HDD", volume);
    }

    private Hdd(String name, Double volume) {
        super(name, volume);
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }
}
