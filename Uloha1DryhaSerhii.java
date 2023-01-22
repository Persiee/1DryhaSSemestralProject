package Ulohy.dryha.serhii;
import java.util.Scanner;
/** 
 * 1. Program searches for the longest sorted subsequence in a given sequence and the sequence start index
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
            int MaxLenght=0;
            int StartIndex=1;
            int tempML=0;
            int tempSI=0;
            for (int i = 0; i < size; i++) {
                //checking every number if it bigger than previous number
                sequence[i]=sc.nextInt();
                if (sequence[i]>LastNum) {
                    if(MaxLenght==0){
                        StartIndex=i+1;
                    }
                    MaxLenght++;
                }else{
                    MaxLenght=1;
                    StartIndex=i+1;
                }
                if(tempML<MaxLenght){
                        tempML=MaxLenght;
                        tempSI=StartIndex;
                    }
                LastNum=sequence[i];
            }
        System.out.println("Nejdelší posloupnost: "+ tempML);
        System.out.println("Začátek posloupnosti: "+tempSI);
        }
    }
}