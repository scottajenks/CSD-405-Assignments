import java.util.Scanner;

/*
* Scott Jenks
* 1/7/2023
* Module 1 - Fan Assignment
*/

public class Fan {

    final int STOPPED = 0;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int fanSpeed;
    private boolean fanOn;
    private double fanRadius;
    private String fanColor;

    public Fan() {
        fanSpeed = STOPPED;
        fanOn = false;
        fanRadius = 6;
        fanColor = "white";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        fanSpeed = speed;
        fanOn = on;
        fanRadius = radius;
        fanColor = color;
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What speed is your fan running at?\n0 - It's stopped\n1 - Slow\n2 - Medium\n3 - Fast");
        int speed = input.nextInt();
        System.out.println("\nIs your fan on?\nTrue - Yes\nFalse - No");
        boolean fanOn = input.nextBoolean();
        System.out.println("\nWhat is the radius of your fan?");
        double radius = input.nextDouble();
        System.out.println("\nWhat is the color of your fan?");
        String color = input.next();

        Fan yourFan = new Fan(speed, fanOn, radius, color);
        System.out.println(yourFan.toString());

        Fan defaultFan = new Fan();
        System.out.println(defaultFan.toString());

        input.close();

    }

}
