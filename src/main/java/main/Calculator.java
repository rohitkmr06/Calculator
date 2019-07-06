package main;
import java.util.*; 

public class Calculator 
{
    public static void main(String[] args)
    {
        System.out.println("Enter first and second number:");
        Scanner s= new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = s.nextInt();
        switch (choose)
        {
        case 1:
            System.out.println(add( num1,num2));
            break;
        case 2:
            System.out.println(sub( num1,num2));
            break;      
        case 3:
            System.out.println(mult( num1,num2));
            break;
        case 4:
            System.out.println(div( num1,num2));
            break;
        default:
            System.out.println("Illigal Operation");
        }
    }
    public static int add(int x, int y)
    {
    	int result=0; 
    	result=x+y;
        return result;
    }
    public static int sub(int x, int y)
    {
    	int result=0;
    	result=x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
    	int result=0;
    	result=x*y;
    	return result;
    }
    public static int div(int x, int y)
    {
    	int result=0;
    	result=x/y;
    	return result;
    }

}