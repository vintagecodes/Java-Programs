import java.util.Scanner;
class oddeven{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 5 number");
        int a[]=new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();}
        int n,c,k;n=0;c=0;k=0;
       for(int i=0;i<5;i++){
           
        if(a[i]%2==0)
            n++;
        
        else
        c++;
        if(a[i]%4==0)
        k++;   }
            System.out.println("even="+n+"odd"+c+"dby4:"+k);
        
    
}
}

        