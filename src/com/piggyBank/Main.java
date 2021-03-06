package src.com.piggyBank;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    

    public static void main(String[] args) {
    
        ArrayList<Coin> piggyBank = new ArrayList<Coin>();
        
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));
        
        double totalValue = 0;
        
        for(Coin c : piggyBank)
        {
            System.out.println(c.toString());
            totalValue += c.getTotalValue();
        }
        
        DecimalFormat fp = new DecimalFormat("$###,###.00");
    
        System.out.println("The piggy bank holds " + fp.format(totalValue));
        
        piggyBank.get(2).removeCoins(4);
        
        totalValue = 0;
        
        for(Coin c : piggyBank)
        {
            System.out.println(c.toString());
            totalValue += c.getTotalValue();
        }
    
        System.out.println("The piggy bank holds " + fp.format(totalValue));
        
        piggyBank.get(2).removeCoins(2);
        
    }
}
