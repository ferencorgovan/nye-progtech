package hu.nye.progtech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] split = line.split(" ");

        String name, lang;
        if (split.length == 2) {
            name = split[0];
            lang = split[1];
            Greeting(name, lang);
        }
    }
    private static void Greeting(String name, String lang){
        switch (lang) {
            case "eng":
                System.out.println("Hello " + name);
                break;
            case "ita":
                System.out.printf("Ciao " + name);
                break;
            default:
                System.out.printf("Szia " + name);
        }
    }
}
