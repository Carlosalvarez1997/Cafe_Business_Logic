import java.util.ArrayList;
public class TestCafe {
    public static void main(String[] args){

    CafeUtil rewards = new CafeUtil();
    System.out.println("\n----- Streak Goal Test -----");
    System.out.printf("Purchases needed by week 10: %s \n\n", rewards.getSteakGoal(10));


    System.out.println("----- Order Total Test-----");
    double[] prices = {3.5, 1.5, 4.0, 4.5};
    System.out.printf("Order total: %s \n\n",rewards.getOrderTotal(prices));


    System.out.println("----- Display Menu Test-----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        rewards.displayMenu(menu);


        // System.out.println("\n----- Add Customer Test-----");

        // ArrayList<String> customers = new ArrayList<String>();
        // // --- Test 4 times ---
        // for (int i = 0; i < 4; i++) {
        //     System.out.println("Please Enter Your Name");
        //     rewards.addCustomer(customers);
        //     System.out.println("\n");
        // }
        System.out.println("------------Ninja Bonus--------");

        rewards.printPriceChart("Columbian Coffee Grounds", 2.00, 4);
    }


}
