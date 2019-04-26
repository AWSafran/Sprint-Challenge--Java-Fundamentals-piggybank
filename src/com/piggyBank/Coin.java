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
    
    public void removeCoins(int remove)
    {
        if (remove > quantity)
        {
            System.out.println("You can not remove this many coins");
        }
        else
        {
            quantity -= remove;
        }
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public abstract double getTotalValue();
}
