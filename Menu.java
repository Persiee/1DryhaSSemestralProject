package Ulohy.dryha.serhii;

import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vybrat ukol:\n1 Semestralni Prace\n2 Vanocni Uloha\n0 vyhod");
        int a=scanner.nextInt();
        switch(a){
            case 1:
                Uloha1DryhaSerhii.main(args);
                break;
            case 2:
                VanocniUlohyDryhaSerhii.main(args);
                break;
            default:
                break;
        }
    }
}
