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
        return this.getQuantity() + " Quarter";
    }
}
