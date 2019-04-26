package src.com.piggyBank;

public class Dime extends Coin
{
    private double value = 0.10;
    
    public Dime()
    {
        super();
    }
    
    public Dime(int quantity)
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
            return this.getQuantity() + " Dime";
        }
        else
        {
            return this.getQuantity() + " Dimes";
        }
    }
}
