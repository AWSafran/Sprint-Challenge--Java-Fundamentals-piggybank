package src.com.piggyBank;

public class Dollar extends Coin
{
    private int value = 1;
    
    public Dollar(int quantity)
    {
        super(quantity);
    }
    
    public Dollar()
    {
        super();
    }
    
    public int getTotalValue()
    {
        return this.getQuantity() * value;
    }
    
    @Override
    public String toString()
    {
        return "$" + this.getQuantity()*value;
    }
}
