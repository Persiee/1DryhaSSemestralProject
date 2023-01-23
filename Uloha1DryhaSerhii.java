package Ulohy.dryha.serhii;
import java.util.Scanner;
/** 
 * 1. Method searches for the longest sorted subsequence in a given sequence and the sequence start index
 * @author Serhii Dryha
 * @version 1 21/12/22 
 */  
public class Uloha1DryhaSerhii {

    
    public static void main(String[] args) {
        int size;
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Zadejte velikost posloupnosti:");
            size = sc.nextInt();
            if (size<1) break;
            System.out.println("Zadejte posloupnost:");
            int sequence[]=new int[size];
            int LastNum=Integer.MIN_VALUE;
            int MaxLenght=0,tempML=0,tempSI=0,StartIndex=1;
            for (int i = 0; i < size; i++) {
                //checking every number if it bigger than previous number
                sequence[i]=sc.nextInt();
                if (sequence[i]>LastNum) {
                    MaxLenght++;
                }else{
                    MaxLenght=1;
                    StartIndex=i+1;
                    //saving MaxLenght and StartIndex
                    if(tempML<MaxLenght){
                        tempML=MaxLenght;
                        tempSI=StartIndex;
                    }
                }
                LastNum=sequence[i];
            }
            if (tempML < MaxLenght) {
                tempML = MaxLenght;
                tempSI = StartIndex;
            }
        System.out.println("Nejdelsi posloupnost: "+ tempML);
        System.out.println("Zacatek posloupnosti: "+tempSI);
        }
    }
}