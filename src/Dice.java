import java.util.Random;

public class Dice {
	//identify our fields
	//often called instance variables
	//fields get private access and is located everywhere in the class
	//Every object gets its own copy
	
	private int numRolls = 0;
	
	//create our methods
	//gives us our capabilities
	//"static" means calls method through the class in class header
	// we call these methods through created objects
	
	public int Roll()
	{
		Random rand = new Random();
		int num = rand.nextInt(6) + 1;
		numRolls ++;        //has to be before return b/c return terminates or ends the method
		return num;
	}
	public int getNumRolls()
	{
		return numRolls;
	}
	public void reset()
	{
		numRolls = 0;
	}
}
