
public class DiceArray {

	public static void main(String[] args) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int [] count = new int[11];
		
		for (int i = 0; i < 1000; i++)
		{
			int totalRoll = dice1.Roll() + dice2.Roll();
			if (totalRoll == 2)
			{
				count[0] += 1;
			}
			else if (totalRoll == 3) 
			{
				count[1] += 1;
			}
			else if (totalRoll == 4)
			{
				count[2] += 1;
			}
			else if (totalRoll == 5)
			{
				count[3] += 1;
			}
			else if (totalRoll == 6)
			{
				count[4] += 1;
			}
			else if (totalRoll == 7)
			{
				count[5] += 1;
			}
			else if (totalRoll == 8)
			{
				count[6] += 1;
			}
			else if (totalRoll == 9)
			{
				count[7] += 1;
			}
			else if (totalRoll == 10)
			{
				count[8] += 1;
			}
			else if (totalRoll == 11)
			{
				count[9] += 1;
			}
			else 
			{
				count[10] += 1;
			}
		}
		System.out.println("Two was rolled " + count[0] + " times");
		System.out.println("Three was rolled " + count[1] + " times");
		System.out.println("Four was rolled " + count[2] + " times");
		System.out.println("Five was rolled " + count[3] + " times");
		System.out.println("Six was rolled " + count[4] + " times");
		System.out.println("Seven was rolled " + count[5] + " times");
		System.out.println("Eight was rolled " + count[6] + " times");
		System.out.println("Nine was rolled " + count[7] + " times");
		System.out.println("Ten was rolled " + count[8] + " times");
		System.out.println("Eleven was rolled " + count[9] + " times");
		System.out.println("Twelve was rolled " + count[10] + " times");
		

	}

}
