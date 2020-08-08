class Emp1
{
	static String cname="TCS";
	String name;
	int salary;
	
	void set(String s1,int s2)
    {
		name=s1;                //error
		salary=s2;
	}
	
	void show()
	{
		System.out.println(name);
		System.out.println(salary);
		System.out.println(cname);
	}
	
	static int add(int a,int b)
	{
		return a+b;
	}
	
	public static void main(String...s)
	{
		Emp1 e1=new Emp1();
		System.out.println(e1);
		
		e1.name="lalu";
		System.out.println(e1.name);
		Emp1 e2=e1;
		System.out.println(e2);
		//e2.name="bhalu";
		e1.set("bhalu",200000);
		System.out.println(e1.name);
		System.out.println(e2.name);
		e1.show();
		System.out.println(add(10,20));
	}
}