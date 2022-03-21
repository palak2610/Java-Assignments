import java.util.*;
public class transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,3,4},{2,4,3},{3,4,5}};  
		int b[][] = new int [3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j] = a[j][i];
			}
		}
		System.out.println("Printing Matrix without transpose:");  
		
		for(int i=0;i<3;i++)
		{    
			for(int j=0;j<3;j++)
			{    
				System.out.print(a[i][j]+" ");    
			}    
			System.out.println();//new line    
		}    
		
		System.out.println("Printing Matrix After Transpose:");  
		
		for(int i=0;i<3;i++)
		{    
			for(int j=0;j<3;j++)
			{    
				System.out.print(b[i][j]+" ");    
			}    
			System.out.println();//new line    
		}    
	}

}
