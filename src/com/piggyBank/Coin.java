package src.com.piggyBank;

public abstract class Coin
{
    private int quantity;
    
    public Coin(int quantity)
    {
        this.quantity = quantity;
    }
    
    public Coin()
    {
        this.quantity = 1;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public abstract double getTotalValue();
}
