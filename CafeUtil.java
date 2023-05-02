
//Worked with harman and tuan
import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal() {

        int sum = 0;

        for (int i = 0; i < 11; i++) {

            sum += i;

        }
        return sum;

    }

    public double getOrderTotal(double[] prices) {
        double total = 0.0;
        for (double price : prices) {
            total += price;
        }

        return total;
    }

    public void displayMenu(ArrayList<String> menuItems) {

        for (String item : menuItems) {
            
            System.out.println(menuItems.indexOf(item)+ " "+ item);
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        customers.add(userName);
        System.out.printf("There are %d people in front of you",customers.indexOf(userName));
        System.out.println("\n"+ customers);
        
    }
}