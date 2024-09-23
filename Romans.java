//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Michael Zhang

import java.util.*;

public class Romans
{
	private Map<String, Integer> m;
	
	public Romans() {
        m = new TreeMap<String, Integer>();

        m.put("I", 1);
        m.put("V", 5);
        m.put("X", 10);
        m.put("L", 50);
        m.put("C", 100);
        m.put("D", 500);
        m.put("M", 1000);
    }
	
	 public int getNumber(String s) {
        int total = 0;
        int prevValue = 0;

       
        for (int i = s.length() - 1; i >= 0; i--) {
            String currentSymbol = s.substring(i, i + 1);
            int currentValue = m.get(currentSymbol);

           
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }

        return total;
    }


}
