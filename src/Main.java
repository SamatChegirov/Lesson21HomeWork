import jdk.jshell.ImportSnippet;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Параллелепипедтин жана цилиндрдин площадь жана объёмун эсептеген бир программа жазабыз.
        Фигуралардын параметрлерин(длина, ширина, высота,радиус) берип жатканда туура эмес маалымат
        берилсе Exception ыргытып, аны оброботка кылып кандай ошибка чыкканын корсотуп берсин.
        Мумкун болгон каталар:
        1) берилген маалымат терс сан болсо
        2) берилген маалымат сан эмес тамга болсо
        3) жана озунуздор берген кошумча каталар болсо да болот

        Параллелепипед:
        - Фигуранын аянтын эсептеген формула: 2*((height * length) + (length * width) + (height * width));
        - Фигуранын коломун эсептеген формула: (length*width*height);
        -Формулалар Parallelepiped классында жазылуусу керек

        Цилиндр:
        - Фигуранын аянтын эсептеген формула: 2*PI * radius*( height + radius);
        - Фигуранын коломун эсептеген формула: (PI*radius*radius*height);
        -Формулалар Cylinder классында жазылуусу керек

        Бардык Exception дор логикасы main класста жазылcын
        Бардык маалмыттар консоль аркылуу берилсин
        Программа кайсыл фигуранын аянтын жана коломун эсептегибиз келгенин сурап, тандаган фигураны эсептеп бериши керек.*/
public class Main {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder();
        Parallelepiped parallel = new Parallelepiped();
        Scanner scan = new Scanner(System.in);
        System.out.println("1-Цилиндрдин коломун табабыз.\n2-Цилиндрдин аянтын табабыз.\n3-Параллелепипеддин аянтын табабыз.\n4-Параллелепиддин коломун табабыз.");
        while (true) {
            switch (scan.nextInt()) {
                case 1: {
                    System.out.println("Радисун жана бийиктигин ыйгарыныз.");
                    try {
                        cylinder.setHeight(scan.nextInt());
                        cylinder.setRadius(scan.nextInt());
                        if (cylinder.getHeight() < 0 || cylinder.getRadius() < 0) {
                            throw new RuntimeException();
                        }
                        cylinder.searchSize();
                    } catch (InputMismatchException e) {
                        System.out.println("A number cannot be multiplied by zero!");
                    } catch (RuntimeException e) {
                        System.out.println("Can't use a negative number");
                    }
                }
                break;
                case 2: {
                    System.out.println("Радисун жана бийиктигин ыйгарыныз.");
                    try {
                        cylinder.setHeight(scan.nextInt());
                        cylinder.setRadius(scan.nextInt());
                        if (cylinder.getHeight() < 0 || cylinder.getRadius() < 0) {
                            throw new RuntimeException();
                        }
                        cylinder.searchSquare();
                    } catch (InputMismatchException e) {
                        System.out.println("Can't use a negative number");
                    } catch (RuntimeException e) {
                        System.out.println("A number cannot be multiplied by zero!");
                    }
                }
                break;
                case 3: {
                    System.out.println("Узунун, туурасын жана бийиктигин ыйгарыныз.");
                    try {
                        parallel.setHeight(scan.nextInt());
                        parallel.setLength(scan.nextInt());
                        parallel.setWidth(scan.nextInt());
                        if (parallel.getHeight() < 0 || parallel.getLength() < 0 || parallel.getWidth() < 0) {
                            throw new RuntimeException();
                        }
                        parallel.searchSquarePar();
                    } catch (RuntimeException e) {
                        System.out.println("Can't use a negative number");
                    }
                }
                break;
                case 4: {
                    System.out.println("Узунун, туурасын жана бийиктигин ыйгарыныз.");
                    try {
                        parallel.setHeight(scan.nextInt());
                        parallel.setLength(scan.nextInt());
                        parallel.setWidth(scan.nextInt());
                        if (parallel.getHeight() < 0 || parallel.getLength() < 0 || parallel.getWidth() < 0) {
                            throw new RuntimeException();
                        }
                        parallel.searchSizePar();
                    } catch (RuntimeException e) {
                        System.out.println("A number cannot be multiplied by zero!");
                    }
                }
                break;
            }
        }
    }
}