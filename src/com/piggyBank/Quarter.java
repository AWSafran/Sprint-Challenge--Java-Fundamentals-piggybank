package src.com.piggyBank;

public class Quarter extends Coin
{
    private double value = 0.25;
    
    public Quarter()
    {
        super();
    }
    
    public Quarter(int quantity)
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
            return this.getQuantity() + " Quarter";
        }
        else
        {
            return this.getQuantity() + " Quarters";
        }
    }
}
