
public class superCon extends Dice {
public superCon(int DiceCount) {
		super(DiceCount);
		// TODO Auto-generated constructor stub
	}

@Override
	public int Throw(){
		int total; 
		int Average;
 total 	= super.Throw() + super.Throw() + super.Throw();
	
	Average = total/3;  
	
	return Average;
	
	
	
}

}
