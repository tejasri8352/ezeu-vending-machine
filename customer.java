import java.util.Scanner;

public class customer
{
    static void snack_items() 
    {
        add_item l = new add_item();
        l.display_item();
        System.out.println("enter the index of the item what you want:");
        Scanner sc = new Scanner(System.in); 
        int item = sc.nextInt(); 
        while(true)
        {
            System.out.println("enter how much you want:");
            int w_quantity = sc.nextInt();
            int cost=w_quantity*add_item.price;
            System.out.println("cost is "+cost+ " please enter the amount:");
            int amount = sc.nextInt();
            if(amount>cost)
             {
               int balance=amount-cost;
               System.out.println("please take the item");
               System.out.println("the remaining balance is "+balance);
               break;
             } 
             else if(amount<cost)
             {
               System.out.println("insufficent balance.......");
               break;
             }
            else
             {
                System.out.println("please take the item.........");
             }
             break;
         }
    }
}
