package src.com.piggyBank;

public class Penny extends Coin
{
    private double value = 0.01;
    
    public Penny()
    {
        super();
    }
    
    public Penny(int quantity)
    {
        super(quantity);
    }
    
    public double getTotalValue()
    {
        return this.getQuantity() * value;
    }
    
    @Override
    public String toString()
    {
        if (this.getQuantity() == 1)
        {
            return this.getQuantity() + " Penny";
        }
        else
        {
            return this.getQuantity() + " Pennies";
        }
    }
}
