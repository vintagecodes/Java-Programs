import java.io.*;
import java.util.Scanner;
class hey{
    static void replaceNumber(String s){
        char[]ch = s.toCharArray();
        for(char c: ch){
            int temp = (int)c;
            int temp_integer = 96;
            if(temp<=122 & temp>=97){
                System.out.print(temp-temp_integer);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        replaceNumber(x);
    }
}
