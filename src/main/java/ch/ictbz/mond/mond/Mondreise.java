package ch.ictbz.mond.mond;

public class Mondreise {
    private int speed;
    private int distance = 384400;

    public Mondreise(int speed) {
        this.speed = speed;
    }

    public double getTravelDurationDays() {
        return (double)distance / (double)speed/24;
    }
    public double getTravelDurationHours() {
        return (double)distance / (double)speed;
    }
}
