import java.util.Random;

/*
* Scott Jenks
* 1/9/2023
* Module 2 - Fan Assignment Cont.
*/

public class UseFans {

    final int STOPPED = 0;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int fanSpeed;
    private boolean fanOn;
    private double fanRadius;
    private String fanColor;

    public UseFans() {
        fanSpeed = STOPPED;
        fanOn = false;
        fanRadius = 6;
        fanColor = "white";
    }

    public UseFans(int speed, boolean on, double radius, String color) {
        this.fanSpeed = speed;
        this.fanOn = on;
        this.fanRadius = radius;
        this.fanColor = color;
    }

    public UseFans(int i, Object object, double d, String string) {
    }

    public void setSpeed(int speed) {
        this.fanSpeed = speed;
    }

    public int getSpeed() {
        return fanSpeed;
    }

    public void setOn(boolean on) {
        this.fanOn = on;
    }

    public boolean isOn() {
        return fanOn;
    }

    public void setRadius(double radius) {
        this.fanRadius = radius;
    }

    public double getRadius() {
        return fanRadius;
    }

    public void setColor(String color) {
        this.fanColor = color;
    }

    public String getColor() {
        return fanColor;
    }

    public String toString() {
        if (fanOn == false) {
            return "The " + fanColor + " fan is turned off. It has a radius of " + fanRadius + ".";
        } else {
            return "The " + fanColor + " fan has a speed of " + fanSpeed + ", is turned on, and has a radius of "
                    + fanRadius + ".";
        }
    }

    public static void listFans(UseFans fans) {

        System.out.println("The computer will pick a random fan: ");

        System.out.println("Speed - " + fans.getSpeed() + " Is it on? - " + fans.isOn() + " Radius - "
                + fans.getRadius() + " Color - " + fans.getColor());
    }

    public static void listFans(UseFans[] fans) {

        System.out.println("A list of the fans: ");

        for (int i = 0; i < fans.length; i++) {
            System.out.println("Speed - " + fans[i].getSpeed() + " Is it on? - " + fans[i].isOn()
                    + " Radius - " + fans[i].getRadius() + " Color - " + fans[i].getColor());
        }
    }

    public static void main(String[] args) {

        UseFans[] fanList = new UseFans[3];
        fanList[0] = new UseFans(4, true, 5.25, "Yellow");
        fanList[1] = new UseFans(0, false, 8, "Black");
        fanList[2] = new UseFans(2, true, 6, "Red");
        UseFans.listFans(fanList);

        UseFans randomFan = fanList[new Random().nextInt(fanList.length)];
        UseFans.listFans(randomFan);
    }

}
