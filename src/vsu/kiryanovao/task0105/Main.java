package vsu.kiryanovao.task0105;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int w = readOddValueFromConsole("w");
        int h = readOddValueFromConsole("h");
        paintWithSimbols(w, h);
    }

    public static void paintWithSimbols(int w, int h){
        w = (w-3)/2;
        h = (h-3)/2;

        System.out.print('*');
        for (int i = 0; i<w; i++){
            System.out.print('-');
        }
        System.out.println('*');

        for (int i = 0; i<h; i++){
            System.out.print('|');
            for (int j = 0; j<w; j++){
                System.out.print(' ');
            }
            System.out.println('|');
        }

        System.out.print('*');
        for (int i = 0; i<w; i++){
            System.out.print('-');
        }
        System.out.print('*');
        for (int i = 0; i<w; i++){
            System.out.print('-');
        }
        System.out.println('*');

        for (int i = 0; i<h; i++){
            for (int j = 0; j<(w+1); j++){
                System.out.print(' ');
            }
            System.out.print('|');
            for (int j = 0; j<w; j++){
                System.out.print(' ');
            }
            System.out.println('|');
        }

        for (int i = 0; i<(w+1); i++){
            System.out.print(' ');
        }
        System.out.print('*');
        for (int i = 0; i<w; i++){
            System.out.print('-');
        }
        System.out.println('+');
    }

    public static int readOddValueFromConsole(String varName) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while (true) {
            System.out.printf("Введите нечетное значение %s, не меньшее 5. %s = ", varName, varName);
            try {
                String line = scanner.nextLine();
                a = Integer.parseInt(line);
                if ((a % 2 == 1) && (a >= 5)) {
                    return a;
                } else {
                    System.out.println("Введено некореектное значение.");
                }
            } catch (Exception e) {
                System.out.println("Введено некореектное значение.");
            }
        }
    }
}
