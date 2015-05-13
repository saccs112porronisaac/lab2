public class Dice
{

	private int mDiceCount;  //Member variable
	private int DiceValue;	//Member Variable
	public Dice(int DiceCount)
	{
		mDiceCount = DiceCount;
	}
	public int Throw()
	{
		int val;
		int value = 0;
		int Bounces = 1;
		
		for ( int i = 0; i < mDiceCount; i++)
		{
			val = (int)(Math.random()*6) + 1;
			return val;
		}
		return value;
	}
	
	public int Value()
	{	
		DiceValue = 1 + (int)(Math.random()*6);
		
				
		return DiceValue;
		
	}
	
}

