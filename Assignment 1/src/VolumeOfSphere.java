//10. Write a complete Java application to prompt the user for the double radius of a sphere, and call
//method sphereVolume to calculate and display the volume of the sphere.

import java.util.*;
public class VolumeOfSphere {
	public static void sphereVolume(double radius) { 
		 double Volume =  (4.0/3.0)* Math.PI * Math.pow (radius,3);
		 System.out.printf("Volume = "+ Volume); 
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in); 
		 double radius=0.0, volume=0.0;

		 System.out.printf("Enter the radius: ");
		 radius=sc.nextInt();
		 sphereVolume(radius);
	}

}
