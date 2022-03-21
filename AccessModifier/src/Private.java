class A 
{ 
private void display() 
    { 
        System.out.println("GeeksforGeeks"); 
    } 
} 
  
class Private extends A
{ 
public static void main(String args[]) 
    { 
        A obj = new A();  
        obj.display(); 
    } 
} 