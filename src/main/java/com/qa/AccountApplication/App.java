package com.qa.AccountApplication;

import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.qa.AccountApplication.AccMgmt.Account;
import com.qa.AccountApplication.AccMgmt.Service;
import json.JsonConvertion;

public class App {

	static Service service = new Service();
	static Account account;

	public static void main(String[] args) {
		// System.out.println("Hello world to the standard out");

		service.addAccount("1", new Account("Daniel", "Oguns", "12345"));
		service.addAccount("2", new Account("JC", "Sterling", "12346"));
		service.addAccount("3", new Account("Daniel", "Og", "12347"));
		service.addAccount("4", new Account("David", "Odun", "12348"));
		service.addAccount("2", new Account("Jev", "Sterling", "12349"));
		
		Account account = service.getAccount("2");

		System.out.println("Non-JSON Format");
		System.out.println("First Name is: " + account.getFirstName());
		System.out.println("Last Name is: " + account.getLastName());
		System.out.println("Account Number is: " + account.getAccountNumber());

		System.out.println("------------------------------------------------------");

		HashMap<String, Account> accMap = service.getAccMap();

		Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
		
		String prettyJson = prettyGson.toJson(accMap);
		System.out.println("JSON Format - Print All");
		sysout("\nPretty JSONObject ==> " + prettyJson);
		
		System.out.println("------------------------------------------------------");
		
		String prettyJson2 = prettyGson.toJson(account);
		System.out.println("JSON Format - Print Individual");
		sysout("\nPretty JSONObject ==> " + prettyJson2);
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("Search using Iterator");
		String firstName = prettyJson2.getO
		System.out.println("Search First Name");
		
		System.out.println("Search Last Name");
		
		System.out.println("Search Account No.");
		
		
		
	}

	private static void sysout(Object print) {
		System.out.println(print);

	}

}
