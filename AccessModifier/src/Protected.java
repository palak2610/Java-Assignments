class C
{ 
protected void display() 
    { 
        System.out.println("Protected Access Modifier"); 
    } 
}
public class Protected extends C
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new C();
		obj.display();
	}

}
