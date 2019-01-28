package CA.CustomArrayList;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testArrayList {
	
	private CustomListGenerics<Customer> setUpList(){
		CustomListGenerics<Customer> list = new CustomListGenerics<Customer>();
		list.add(new Customer("Name1", 2, "Name2", 18));
		list.add(new Customer("Name3", 2, "Name4", 18));
		list.add(new Customer("Name5", 2, "Name6", 18));
		return list;
	}
	
	@Test
	public void testAdd() {
		CustomListGenerics<Customer> list = new CustomListGenerics<Customer>();
		list = setUpList();
		assertEquals(3, list.size());
	}
	@Test
	public void testRemove() {
		CustomListGenerics<Customer> list = new CustomListGenerics<Customer>();
		list = setUpList();
		list.remove(0);
		assertEquals(2, list.size());
		
	}
	
	
	
	@Test
	public void testGet() {
		CustomListGenerics<Customer> list = new CustomListGenerics<Customer>();
		list = setUpList();
		Customer customer = new Customer("Name1", 2, "Name2", 18);
		assertEquals(customer, list.get(0));
		
	}
	@Test
	public void testClear() {
		CustomListGenerics<Customer> list = new CustomListGenerics<Customer>();
		list = setUpList();
		list.clear();
		assertEquals(0, list.size());
	}
	

}
