package edu.itstep.lesson15.task07;

public abstract class Component {

    private final String name;
    private final Double volume;

    public Component(String name, Double volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public int getVolumeIntValue() {
        return volume.intValue();
    }

    @Override
    public String toString() {
        return name + ": " + "volume=" + volume;
    }
}
