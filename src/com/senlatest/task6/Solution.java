package com.example.senlatest.task6;
/*
Создайте программу, которая будет получать число и печатать его в следующем формате (формы цифр можно придумать свою,
главное чтобы она читалась на экране):
 41072819
(*) Дополнительно: сделайте так, чтобы «большая цифра» состояла не из ‘*’, а из соответствующих маленьких(обычных) цифр.
 */
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Scanner;

public class Solution {

    private static final String BACKGROUND = " ";
    private static final String PRINT_SYMBOL = "*";
    private static final int WIDTH = 140;
    private static final int HEIGHT = 30;
    private static final int SIZE = 15;
    private static final int START_PRINT_X = 0;
    private static final int START_PRINT_Y = 20;
    private static final int COLOR_MODEL = -16777216;

    private static Solution solution;

    private Solution() {
    }

    public static Solution getInstance() {
        if (Solution == null) {
            solution = new Solution();
        }
        return solution;
    }

    public void draw(Scanner scanner) {
        int number = 0;
        System.out.println("Введите целое число");
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Введено не целое число");
        }

        BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

        Graphics2D graphics = (Graphics2D) image.getGraphics();
        graphics.setFont(new Font("TimesRoman", Font.BOLD, SIZE));
        graphics.drawString(String.valueOf(number), START_PRINT_X, START_PRINT_Y);

        for (int y = 0; y < HEIGHT; y++) {

            StringBuilder string = new StringBuilder();

            for (int x = 0; x < WIDTH; x++) {
                string.append(image.getRGB(x, y) == COLOR_MODEL ? BACKGROUND : PRINT_SYMBOL);
            }

            if (string.toString().trim().isEmpty()) {
                continue;
            }

            System.out.println(string);

        }
    }
}