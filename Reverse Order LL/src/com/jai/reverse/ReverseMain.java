package com.jai.reverse;
import java.util.*;

public class ReverseMain {

	public static void main(String[] args) {
			
		Scanner scanner=new Scanner(System.in);
		
		ReverseOrder<Integer> linkedList=new ReverseOrder<Integer>();
		int ch=1;
		while(ch!=0) {
			System.out.println("Enter element : ");
			linkedList.insertElement(scanner.nextInt());
			System.out.println("Do you want to add more elements press 0 for no and 1 for yes: ");
			ch=scanner.nextInt();
		}
		
		linkedList.displayList();
			
		System.out.println("Enter element you want to delete ");
		linkedList.reverse();
		
		linkedList.displayList();

	}

}
