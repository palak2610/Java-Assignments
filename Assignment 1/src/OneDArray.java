//11. Write statements that perform the following one‐dimensional‐array operations: a. Set the 10
//elements of integer array counts to zero. b. Add one to each of the 15 elements of integer array
//bonus. c. Display the five values of integer array bestScores in column format.
import java.util.*;
public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={0,0,0,0,0,0,0,0,0,0}; 
		 int bonus[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; 
		 for(int i=0;i<15;i++){ 
		 bonus[i]+=1;
		 System.out.print(bonus[i]);
		 }
		 int bestScores[]={1,2,3,4,5};
		 for (int j=0;j<5;j++)
		 {
			 System.out.println();
			 System.out.printf("%d\t", bestScores[j]); 
		 }
	}

}
