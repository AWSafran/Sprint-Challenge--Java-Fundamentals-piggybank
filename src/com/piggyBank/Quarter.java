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
    
    @Override
    public String toString()
    {
        return this.getQuantity() + " Quarter";
    }
}
