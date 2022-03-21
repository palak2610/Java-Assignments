class D
{ 
public static void display() 
    { 
        System.out.println("Public Access Modifier"); 
    } 
}
public class Public extends D
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj = new D();
		obj.display();
	}

}
