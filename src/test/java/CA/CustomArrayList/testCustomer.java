package CA.CustomArrayList;

import static org.junit.Assert.assertTrue;

//import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

//import CA.CustomArrayList;

public class testCustomer {
	
	  Customer myCustomer;
	    @Before
	    public void setUp() throws Exception {
	    myCustomer = new Customer("Name1", 2, "Name2", 18);
	    }
	    public void tearDown() throws Exception {
	    }

    @Test
    public void test() {
        //fail("Not yet implemented");
        assertTrue("It can't be null", (myCustomer.getName() !=null));
        assertTrue("It can't be null", (myCustomer.getEmail() !=""));
        assertTrue("It can't be negative number", (myCustomer.getPps() >=0));
        assertTrue("It can't be smaller than 18", (myCustomer.getAge() >=18));

    }

}
