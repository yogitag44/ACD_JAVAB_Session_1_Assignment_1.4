import java.util.Scanner; 

public class TypeCasting {
	
	public static void main(String[] args) {
			
		System.out.println("Enter variable of byte type: \n");
		Scanner FirstValue = new Scanner(System.in);     //Scanner class object to take first input	
		byte ByteValue = FirstValue.nextByte();    		//taking byte type input from user, nextByte() is method of scanner class
		
		System.out.println("Enter Variable of short type: \n");
		Scanner SecondValue = new Scanner(System.in);	 //Scanner class object to take second input
		short ShortValue = SecondValue.nextShort();      //taking short type input from user, nextShort() is another method of Scanner class
		
		int IntVar = ByteValue + ShortValue;   			//Storing sum of byte and short in integer
		System.out.println("Sum of Byte and Short variable stored in int variable is: \n" + IntVar );
		
		long LongVar = ShortValue +  IntVar;			//Storing sum of short and int in long variable
		System.out.println("Sum of Short and Integer variable stored in Long variable is:  \n" + LongVar );
		
		float FloatVar = IntVar + LongVar;				//storing sum of int and long in float variable
		System.out.println("Sum of int and long variable stored in float is:  \n" + FloatVar );
		
		double DoubleVar = LongVar + FloatVar;			//storing sum of long and float in double variable
		System.out.println("Sum of long and float variable stored in double is:  \n" + DoubleVar );
		
		
		
		FirstValue.close(); // Closing the first Scanner InputStream
		SecondValue.close();  //Closing second Scanner InputStream
	}
		
}

