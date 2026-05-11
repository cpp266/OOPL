import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int choice;
        double num1, num2, result;

        do
        {
            System.out.println("\n===== JAVA CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");

            System.out.print("\nWhich operation do you want to perform? ");
            choice = sc.nextInt();

            if(choice == 6)
            {
                System.out.println("\nCalculator Closed");
                break;
            }

            System.out.print("\nEnter First Number : ");
            num1 = sc.nextDouble();

            System.out.print("Enter Second Number : ");
            num2 = sc.nextDouble();

            switch(choice)
            {
                case 1:
                    result = num1 + num2;
                    System.out.println("\nAddition = " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("\nSubtraction = " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("\nMultiplication = " + result);
                    break;

                case 4:
                    if(num2 != 0)
                    {
                        result = num1 / num2;
                        System.out.println("\nDivision = " + result);
                    }
                    else
                    {
                        System.out.println("\nCannot divide by zero");
                    }
                    break;

                case 5:
                    result = num1 % num2;
                    System.out.println("\nModulus = " + result);
                    break;

                default:
                    System.out.println("\nInvalid Choice");
            }

        } while(choice != 6);

        sc.close();
    }
}
