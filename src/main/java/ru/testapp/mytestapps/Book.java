package ru.testapp.mytestapps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Book {

	public static void main(String[] args) {

		String user;
		Scanner in = new Scanner(System.in);
		user = in.nextLine();
		ArrayList<String> result = new ArrayList<>();
		result = add(user);

		for(String results : result){
			System.out.println(results);
		}
	}

	public static ArrayList<String> add(String user) {
		// TODO Auto-generated method stub

		HashMap<String, ArrayList<String>> Book = new HashMap<String, ArrayList<String>>();

		Book.put("Иванов И.И.", new ArrayList<String>());
		Book.get("Иванов И.И.").add("+8 800 2000 500");
		Book.get("Иванов И.И.").add("+8 800 200 600");

		Book.put("Петров П.П.", new ArrayList<String>());
		Book.get("Петров П.П.").add("+8 800 2000 700");
		Book.put("Сидоров С.С.", new ArrayList<String>());
		Book.get("Сидоров С.С.").add("+8 800 2000 800 ");
		Book.get("Сидоров С.С.").add("+8 800 2000 900");
		Book.get("Сидоров С.С.").add("+8 800 2000 000");
		
		//String user1;
		//Scanner in = new Scanner(System.in);
		//user1 = in.nextLine();
		
		boolean er_User = Book.containsKey(user);
		ArrayList<String> result = new ArrayList<>();
		//String[] result;

		if (er_User == true) {
			
			ArrayList<String> phoneList = Book.get(user);
			
			for (String phone : phoneList) {
				result.add(phone);
			    System.out.println(phone); 
			} 
			
		} else{
			result.add("Данного ФИО нет в БД");
			System.out.println("Данного ФИО нет в БД");
			
		}

		return result;
	}



	}

