package DicerRoll;
import java.util.Random;

import java.sql.Array;
import java.util.Arrays;


public class DiceRollerM {
	
	
	private Double sum;
	
	public void DicerRollerM() 
	{
		
		
	}
	
public double RollD() {
	
		Double dice1=(Double)(Math.random()*6+1);//Calculation
	    Double dice2=(Double)(Math.random()*6+1);//Calculation
	    Double dice3=(Double)(Math.random()*6+1);//Calculation
	    sum= dice1 + dice2 + dice3;
	    
	    return sum;
}

public double RollD2() { //Rolling Three Dice Twice.

	Double dice1=(Double)(Math.random()*6+1);
    Double dice2=(Double)(Math.random()*6+1);
    Double dice3=(Double)(Math.random()*6+1);
	Double dice4=(Double)(Math.random()*6+1);
    Double dice5=(Double)(Math.random()*6+1);
    Double dice6=(Double)(Math.random()*6+1);
    sum= dice1 + dice2 + dice3 + dice4 + dice5 + dice6;
    
    return sum;
	
}
public double RollD3() { //Rolling Three Dice Thrice.

	Double dice1=(Double)(Math.random()*6+1);
    Double dice2=(Double)(Math.random()*6+1);
    Double dice3=(Double)(Math.random()*6+1);
    Double dice4=(Double)(Math.random()*6+1);
    Double dice5=(Double)(Math.random()*6+1);
    Double dice6=(Double)(Math.random()*6+1);
    Double dice7=(Double)(Math.random()*6+1);
    Double dice8=(Double)(Math.random()*6+1);
    Double dice9=(Double)(Math.random()*6+1);
    sum= dice1 + dice2 + dice3 + dice4 + dice5 + dice6+ dice7 + dice8 + dice9;
    return sum;
}

public double RollD4() { //Rolling Three Dice Four times.

	Double dice1=(Double)(Math.random()*6+1);
    Double dice2=(Double)(Math.random()*6+1);
    Double dice3=(Double)(Math.random()*6+1);
    Double dice4=(Double)(Math.random()*6+1);
    Double dice5=(Double)(Math.random()*6+1);
    Double dice6=(Double)(Math.random()*6+1);
    Double dice7=(Double)(Math.random()*6+1);
    Double dice8=(Double)(Math.random()*6+1);
    Double dice9=(Double)(Math.random()*6+1);
    Double dice10=(Double)(Math.random()*6+1);
    Double dice11=(Double)(Math.random()*6+1);
    Double dice12=(Double)(Math.random()*6+1);
    sum= dice1 + dice2 + dice3 + dice4 + dice5 + dice6+ dice7 + dice8 + dice9+ dice10 + dice11 + dice12;
    return sum;
}


}

