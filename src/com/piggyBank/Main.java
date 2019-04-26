package src.com.piggyBank;

import java.lang.reflect.Array;
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
        
        for(Coin c : piggyBank)
        {
            System.out.printf(c.toString() + "\n");
        }
    }
}
