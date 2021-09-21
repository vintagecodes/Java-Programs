import java.util.Scanner;
class student{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int roll,s1,s2,s3,total;
        double perct;
        System.out.println("Enter the roll no of the student");
        roll=sc.nextInt();
        System.out.println("Enter the subject1 marks");
        s1=sc.nextInt();
        System.out.println("Enter the subject2 marks");
        s2=sc.nextInt();
        System.out.println("Enter the subject3 marks");
        s3=sc.nextInt();
        total = s1+s2+s3;
        perct = total/3;
        System.out.println("Total :"+total);
        System.out.println("Percentage :"+perct);
        if(perct > 70)
        {
            System.out.println("Distinction");
        }
        else if(perct<70 && perct>60)
        {
            System.out.println("1st Division");
        }
        else if(perct>60 && perct<50)
        {
            System.out.println("2nd Divison");
        }
        else
        {
            System.out.println("Improvement");
        }
        
        
        
        
        
        
        
        
    }
}