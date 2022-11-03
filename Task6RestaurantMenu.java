import java.util.*;
class Task6RestaurantMenu{
    public static void main(String[] args) {
        int n,a;

        Scanner sc=new Scanner(System.in);
        System.out.println("\n\n******************Welcome to Apna Dhaba******************\n\n");
while(true){
        System.out.println("\nMENU:\n");
        System.out.println("1.Zinger Burger");
        System.out.println("2.Large Pizza");
        System.out.println("3.Chicken Tikka");
        System.out.println("4.Seekh Kabab");
        System.out.print("\nEnter the item no: to know the price : ");

        n = sc.nextInt();

        switch(n)
        {
            case 1:
            System.out.println("\nThe Price of Zinger Burger is: 290/-");
            break;

            case 2:
            System.out.println("\nThe Price of Large Pizza is: 900/-");
            break;

            case 3:
            System.out.println("\nThe Price of Chicken Tikka is: 400/-");
            break;

            case 4:
            System.out.println("\nThe Price of Seekh Kabab is: 200/-");
            break;

            default:
            System.out.println("\nPlease Enter a valid number");
        }
           System.out.println("\nPREES 1 IF YOU WANT TO GO BACK TO MENU OR PRESS ANY OTHER NUMBER TO EXIT"); 
                a = sc.nextInt();
            if(a!=1)
             System.exit(0);              
        }
    }
}
