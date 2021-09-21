import java.util.Scanner;
class while1{
    public static void main(String args[])
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        while(n>0){
            sum = sum+n;
            n--;
        }
        System.out.println("Sum :"+sum);
    }
}