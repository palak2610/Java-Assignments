//4. Write an application that displays the numbers 1 to 4 on the same line, with each pair of
//adjacent numbers separated by one space. Write the application using the following
//techniques:
//a. Use one System.out.println statement.
//b. Use four System.out.print statements.
//c. Use one System. out.printf statement.

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		System.out.println(a + " "+ b + " " + c + " " + d);
		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.print(c + " ");
		System.out.print(d + " ");
		System.out.printf("\n%d %d %d %d",a,b,c,d);
	}

}
