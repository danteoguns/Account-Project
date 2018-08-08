package com.qa.AccountApplication.AccMgmt;

import java.util.HashMap;

public class Service {
	
	private HashMap<String, Account> accMap = new HashMap<String, Account>();
	
	public void addAccount(String key, Account account) {
		// Account account1 = new Account(firstName, lastName, accountNumber);
		this.accMap.put(key, account);
	}
	
	public Account getAccount(String key) {
		return this.accMap.get(key);
		
	}

	public HashMap<String, Account> getAccMap() {
		return accMap;
	}

	public void setAccMap(HashMap<String, Account> accMap) {
		this.accMap = accMap;
	}

}
