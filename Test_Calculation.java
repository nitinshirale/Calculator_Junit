package junit_program;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
 
//Running test cases in order of method names in ascending order

import static org.junit.Assert.*;
import org.junit.Test;
public class Test_Calculation {
Calculate c1=new Calculate();
int testmul=12;
int mul=c1.multiplication(2,6);

@Test
public void testSum() {
	System.out.println("@Test multiplication(): " + mul + " = " + testmul);

assertEquals(mul,testmul);
}
int add=c1.addi(2,6);
int testadd=8;      
@Test
public void testadd() {
	System.out.println("@Test addi(): " + add + " = " + testadd);

assertEquals(add,testadd);
}

int subi=c1.Sub(2,6);
int testsub=-4;
@Test

public void testsub() {
	System.out.println("@Test sub(): " + subi + " = " + testsub);

assertEquals(subi,testsub);
}
int divi=c1.div(3,3);
int testdiv=1;
@Test

public void testdiv() {
	System.out.println("@Test div(): " + divi + " = " + testdiv);

assertEquals(divi,testdiv);
}

}