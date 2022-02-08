import java.util.ArrayList;

public class CustomerCheck
{
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check)
    {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices()
    {
        double total = 0;
        for (int i = 0; i < check.size(); i ++) {
            total += check.get(i).getPrice();
        }
        return total;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies()
    {
        for (int i = 0; i < check.size(); i ++) {
            if (check.get(i).isDailySpecial()) {
                return false;
            }
        }
        if (totalPrices() < 40) {
            return false;
        }
        return true;
    }

    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck()
    {
        int customers = 0;
        double totalCost;
        for (int i = 0; i < check.size(); i ++) {
            if (check.get(i).isEntree()) {
                customers++;
            }
        }
        if (couponApplies()) {
            if (customers >= 6) {
                totalCost = totalPrices() * (0.75) + (totalPrices() * 0.2);
            } else {
                totalCost = totalPrices() * 0.75;
            }
        } else {
            if (customers >= 6) {
                totalCost = (totalPrices() * 1.2);
            } else {
                totalCost = totalPrices();
            }
        }
        return totalCost;
    }
}