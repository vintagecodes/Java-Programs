import java.io.*;
public class reverse_array{
    public static void main(String args[]){
        int i;
        int j = 0;
        int a[]={1,2,3,4,5,6};
        int c = a.length;
        int b[]=new int[c];
        for(i = c - 1;i>=0;i--){
            b[j]=a[i];
            j = j + 1;
        }
        for (int k = 0; k < c; k++) {
            System.out.println(b[k]);
        }
    }
}
