package edu.itstep.lesson15.task07;

public abstract class Frequency extends Component {

    private final int frequency;

    public Frequency(String name, Double volume, int frequency) {
        super(name, volume);
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return ", frequency=" + frequency;
    }
}
