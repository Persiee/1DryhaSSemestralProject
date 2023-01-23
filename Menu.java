package Ulohy.dryha.serhii;

import java.util.Scanner;
/** 
 * This is a menu for semestral work
 * @author Serhii Dryha
 */  
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        while(end==false){
            System.out.println("Vybrat ukol:\n1 Semestralni Prace\n2 Vanocni Uloha\n0 vyhod");
            int a=scanner.nextInt();
            switch(a){
                case 1:
                    Uloha1DryhaSerhii.main(args);
                    break;
                case 2:
                    VanocniUlohyDryhaSerhii.main(args);
                    break;
                default:
                    end=true;
                    break;
            }
        }
    }
}
