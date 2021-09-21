import java.io.*;
import java.util.Random;
import java.util.Scanner;
class stringss{
    static void generatorFrequency(String s, String n){
        int count= 0;
        String sr[] = {"!","@","#","$","%","^","&","(",")",",",".","?"};
        Random r = new Random();
        int randomCharacters = r.nextInt(sr.length);
        String a = sr[randomCharacters];
        for(int i = 0;i<s.length();i++){
            if(n.charAt(0) == s.charAt(i)){
                count++;
            }
        }
        System.out.println("The Frequency is"+count);
        
        
        System.out.println(s.concat(a)); 
        
        
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The String");
    String x = sc.nextLine();
    System.out.println("Enter The Character");
    String y = sc.nextLine();
    generatorFrequency(x,y);
}
}