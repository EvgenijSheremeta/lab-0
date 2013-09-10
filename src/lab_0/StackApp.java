package lab_0;

public class StackApp {
	public static void main (String[] args)
	{
		Stack stack = new Stack(5);
		
		stack.push(20);
		stack.push(32);
		stack.push(40);
		stack.push(242);
		stack.push(57);
		stack.push(1);
		
		
		while (!stack.isEmpty())
		{
			long value = stack.pop();
			System.out.print(value);
			System.out.print(" ");
		}
		
		System.out.println("");
	}
}
