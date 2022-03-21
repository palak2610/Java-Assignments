class B
{ 
    void display() 
    { 
        System.out.println("Default Access Modifier"); 
    } 
} 
public class Default extends A 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B(); 
		  
        obj.display();
	}

}
