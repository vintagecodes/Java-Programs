import java.util.Scanner;
public class return_function{
    public static void main(String args[]){
        return_function obj = new return_function();
        int x = 10;
        int y = 20;
        int get_result = obj.ritik(x,y);
        System.out.println("The sum of two numbers is : " + get_result);
    }
    
    public int ritik(int a, int b){
        int result = a + b;
        return result;
    }
}
