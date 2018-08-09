package com.qa.AccountApplication;

import org.junit.*;
import com.qa.AccountApplication.AccMgmt.*;

public class TDD {

	static Service service = new Service();
	static Account account;
	
	@Before
	public void setUp() {
		service.addAccount("1", new Account("Daniel", "Oguns", "12345"));
		service.addAccount("2", new Account("JC", "Sterling", "12346"));
		service.addAccount("3", new Account("Daniel", "Og", "12347"));
		service.addAccount("4", new Account("David", "Odun", "12348"));
		service.addAccount("5", new Account("Jev", "Sterling", "12349"));
	}
	
	@Test
	public void test() {
		Assert.assertEquals(1, service.countFirstName("JC"));
	}

}
