package com.qa.AccountApplication.AccMgmt;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

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

	public void removeAccount(String removeAcc) {
		boolean accIdExist = accMap.containsKey(removeAcc);
		if (accIdExist) {
			accMap.remove(removeAcc);
		}
	}

	public int countFirstName(String fName) {
		Iterator<Entry<String, Account>> search = accMap.entrySet().iterator();
		int count = 0;
		String firstName;
		while (search.hasNext()) {
			Entry<String, Account> entry = search.next();
			firstName = entry.getValue().getFirstName();
			if(fName == firstName) {
				count++;
			}
		}
		return count;
	}

}
