import java.util.ArrayList;
public class CafeUtil{

    public int getSteakGoal(int runWeeks){
        int i = 0;
        int sum = 0;
        while (i<=runWeeks){
            sum +=i;
            i++;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double sum = 0;
        for (int i = 0; i<prices.length;i++){
        // System.out.println(prices[i]);
        sum += prices[i];
    }
    return sum;
    }

    public void displayMenu(ArrayList<String> menu){
        for (int i =0; i <= menu.size()-1; i++){
            System.out.println(menu.get(i));
            }
        }

    public void addCustomer(ArrayList<String>customers){
        String username = System.console().readLine();
        customers.add(username);
        System.out.println(username+", there are "+ customers.size()+" people ahead of you," );
        System.out.println(customers);
        }

        //Ninja Bonus

    public void printPriceChart(String product, double price, int maxQuantity){
        int quantity = 1;// start at 1 because if we start at 0 thats like saying we are not purchasing anything so we don't need to display this information.
        while(quantity <= maxQuantity){
            if (quantity > 1){
                double discount = .50*(quantity-1);
                double sum = (price*quantity)-discount;
                System.out.printf("%s : Quantity: %d Price: $%.2f \n", product, quantity, sum );//Adds a incrementing $0.50 discount after each additional purchase starting at the quantity of 2.
            }
            else{
                double sum = price*quantity;
                System.out.printf("%s : Quantity: %d Price: $%.2f \n", product, quantity, sum );// gves you the full price without a discount of a single purchase i.e quantity of 1.
            }
            quantity++;
        }
    }
}
