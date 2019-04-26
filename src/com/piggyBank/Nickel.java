package src.com.piggyBank;

public class Nickel extends Coin
{
    private double value = 0.05;
    
    public Nickel()
    {
        super();
    }
    
    public Nickel(int quantity)
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
        return this.getQuantity() + " Nickel";
    }
}
