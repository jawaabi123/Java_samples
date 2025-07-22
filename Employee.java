import java.util.*;
public class Employee 
{
    private int salary;
    public String name;

    public Employee(int salary,String name)
    {
        this.salary=salary;
        this.name=name;
    }
    public static void variable(int ...a)
    {
        for (int j : a) 
        {
            System.out.println(j);
        }
    }
    public static void alphabet(Scanner input)
    {
        System.out.println("Enter alphabet");
        char check=input.next().trim().charAt(0);
        if(check>='a' && check<='z')
        {
            System.out.println("lowercase letter");
        }
        else{System.out.println("uppercase letter");}
        input.close();
    }
    
    public static void main(String args[])
    {
        //Employee e=new Employee(23400,"ljj");
        Scanner input=new Scanner(System.in);
        //alphabet(input);
        String a="A man, a plan, a canal: Panama";
        int[] newf=new int[5];
        variable(1,2,3);
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};//2d array
        for(int[] row:arr)
        {
            for(int i:row)
            {
                System.out.println(i);
            }
        }
        
        input.close();
    }
}

















