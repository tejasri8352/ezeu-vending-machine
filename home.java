import java.util.Scanner;

public class home
 {
    private static Scanner sc = new Scanner(System.in);

    public static void choice() 
    {
        System.out.println("please slecet if you are a owner or a customer: ");
        System.out.println("1\t\towner");
        System.out.println("2\t\tcustomer");
        int person = sc.nextInt();
        if (person == 1)
         {
            owner o = new owner();
            o.login();

         }
        else if(person==2)
         {
          customer c = new customer();
          c.snack_items();
         }
        else 
        {
            System.out.println("please enter the correct choice");
        }
    }
}
