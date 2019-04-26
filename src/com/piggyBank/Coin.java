package src.com.piggyBank;

public abstract class Coin
{
    private int quantity;
    private double value;
    
    public Coin(int quantity)
    {
        this.quantity = quantity;
    }
    
    public Coin()
    {
        this.quantity = 1;
    }
}
