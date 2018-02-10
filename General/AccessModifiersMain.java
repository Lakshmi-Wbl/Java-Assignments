package com.General;

public class AccessModifiersMain {
	    private void test4(){
	    	System.out.println("this is private example");
	    }

	public static void main(String[] args) {
		AccessModifiersMain am=new AccessModifiersMain();
		am.test4();//visible only within class
		DefaultExample de=new DefaultExample();
		de.test3();//visible only within package
		PublicExample pe=new PublicExample();
		pe.test2();//visible from anywhere
		ProtectedExample pre=new ProtectedExample();
		pre.test1();//visible within package and outside the package but through inheritance only
	}

}
