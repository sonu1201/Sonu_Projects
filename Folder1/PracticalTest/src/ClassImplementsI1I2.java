
public class ClassImplementsI1I2 implements Interface1, Interface2 {

	@Override
	public void m1() {
		Interface1.super.m1();
		System.out.println("Overridden Method m1 in class");
	}
		

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		Interface2.super.m2();
		System.out.println("Overridden Method m2 in class ");
	}


	public static void main(String[] args) {
		
		ClassImplementsI1I2 classobj = new ClassImplementsI1I2();
		classobj.m1();
		classobj.m2();
		Interface1.m3();
		Interface2.m3();
		

	}


}
