package edu.itstep.lesson15.task07;

public class Cpu extends Frequency {

    public Cpu(Double volume, int frequency) {
        super("CPU", volume, frequency);
    }

    public double getFrequencyDoubleValue() {
        return (double) getFrequency() / 1000;
    }
}
