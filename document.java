import java.util.Scanner;
class document{
    public static void main(String args[]){
        String name,gender;
        int salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        name = sc.nextLine();
        System.out.println("Enter the gender");
        gender = sc.nextLine();
        System.out.println("Enter the Salary");
        salary = sc.nextInt();
        System.out.println("The name is :"+name);
        System.out.println("The Gender is :"+gender);
        System.out.println("The Salary is :"+salary);
    }
}
