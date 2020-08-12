// Assignment: Explore shift operators on negative numbers
		// >>> works for positive numbers :)

public class ShiftOperators {
	public static void main(String[] args) {
		int num1 = 2, num2 = -2;
		System.out.println("Positive Number is:"+num1);
		System.out.println("Negative Number is:"+num2);
		System.out.println("Before shift number "+num1+" in binary is : " + Integer.toBinaryString(num1));
		System.out.println("Before shift number "+num2+" in binary is : " + Integer.toBinaryString(num2));
		num1 = num1 >> 1; //shifting 1 right bit 
		num2 = num2 >> 1; //shifting 1 right bit
		System.out.println("After shift number convert to "+num1+" and in binary is : " + Integer.toBinaryString(num1));
		System.out.println("After shift number convert to "+num2+" and in binary is : " + Integer.toBinaryString(num2));
	}
}
