import java.util.Scanner;
public class calculator {
    public static void main(String[]args)
    {
        
        int ans = 0;
        while(true)
        {
            System.out.println(("Enter operator :"));
            Scanner in = new Scanner(System.in);
            char op = in.next().trim().charAt(0);
            if(op == '+' ||op == '-' ||op == '*' ||op == '/' || op == '%')
            {
                System.out.println("Enter two numbers ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op == '+')
                {
                    ans = num1+num2;
                }
                if(op == '-')
                {
                    ans = num1-num2;
                }
                if(op == '*')
                {
                    ans = num1*num2;
                }
                if(op == '/')
                {
                    if(num1 == 0)
                    {
                        System.out.println("Can't devide by zero");
                    }
                    else if(num2 == 0)
                    {
                        System.out.println("infinity");
                    }
                    else 
                    {
                        ans = num1 / num2;
                    }
                }
                if(op == '%')
                {
                    ans = num1%num2;
                }
                System.out.println(ans);
            }
            else if(op == 'x' || op == 'X')
            {
                break;
            }
            else
            {
                System.out.println("Invalid Input");
                
            }
            in.close();
        }
    }
}
