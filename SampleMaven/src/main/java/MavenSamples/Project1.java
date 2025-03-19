package MavenSamples;

public class Project1 {

	public static void main(String[] args) {
		Project1 obj=new Project1();
		System.out.println(obj.add(5,9));
		obj.print("Wlecome to Maven ");

	}


public int add(int a,int b) {
	int c=a+b;
	return c;

}
public void print(String s)
{
	System.out.println(s);
}
}