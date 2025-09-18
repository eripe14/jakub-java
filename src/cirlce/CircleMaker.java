package cirlce;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Random;

public class CircleMaker {

    private static final int SECONDS = 5000;

    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();

        int centerX = 1280; // Assuming a screen width of 1920
        int centerY = 720;  // Assuming a screen height of 1440
        int radius = 300;

        int steps = 720;
        int delay = 5;

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

        Thread.sleep(500);
        for (int i = 0; i < steps; i++) {
            double angle = Math.toRadians(i);
            int x = centerX + (int) (radius * Math.cos(angle));
            int y = centerY + (int) (radius * Math.sin(angle));

            robot.mouseMove(x, y);
            Thread.sleep(delay);
        }

        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

}