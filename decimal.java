import java.io.*;
public class decimal{
    public static void main(String args[]){
        int arr[] = {1,0,1,0,1,0,1,0};
        int i,b;
        int c = 0;
        int a = arr.length;
        for(i = 0;i<a;i++){
            c = c + arr[i]* (int)(Math.pow(2,((a - i) - 1)));
    }
    System.out.println("Decimal is: "+c);
}
}
