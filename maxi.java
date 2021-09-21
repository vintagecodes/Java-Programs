import java.util.Scanner;
class maxi
{
    public static void main(String args[])
    {
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        n1 = sc.nextInt();
        System.out.println("Enter the Second number");
        n2 = sc.nextInt();
        System.out.println("Enter the third number");
        n3 = sc.nextInt();
        if(n1>n2 && n1>n3)
        {
            System.out.println("The Maximum number is :"+n1);
        }
        else if(n2>n1 && n2>n3)
        {
            System.out.println("The Maximum number is :"+n2);
        }
        else
        {
            System.out.println("The Maximum number is :"+n3);
        }
    }
}
