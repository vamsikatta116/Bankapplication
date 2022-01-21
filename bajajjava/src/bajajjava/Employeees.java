package bajajjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class employee1{

	int id;
	String name;
	
	public employee1(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String toString()
	{
		return "\nemployee Details :" + "\nID: " + this.id + "\nName: " + this.name ;
	}
	
}

public class employeees {
	static void display(ArrayList<employee1> a1) {
		for(int i=0;i<a1.size();i++) {
			a1.get(i).toString();
		}
	}
	

	public static void main(String [] args) {
		int id;
		String name;
		
		Scanner sc = new Scanner(System.in);
		ArrayList<employee1> al = new ArrayList<employee1>();
		do
		{
			System.out.println("enter 1 for Add employee to the DataBase\n" +"enter 2 for Search for employee\n" +"enter 3 for edit employee details\n" +"enter 4 for Delete employee Details\n" +"enter 5 for Display all employees working in this company\n" +"enter 6 for eXIT\n");
			System.out.println("nter your choice : ");
			int ch = sc.nextInt();
			
			if(ch==1) {
				System.out.println("\nenter the following details to ADD list:\n");
				System.out.println("enter ID :");
				id = sc.nextInt();
				System.out.println("enter Name :");
				name = sc.next();
				al.add(new employee1(id, name));
				display(al);
				}
				
			else if(ch==2) { 
				System.out.println("enter the employee ID to search :");
					id = sc.nextInt();
					int i=0;
					for(employee1 e: al)
					{
						if(id == e.id)
						{
							System.out.println(e+"\n");
							i++;
						}
					}
					if(i == 0)
					{
						System.out.println("\nemployee Details are not available, Please enter a valid ID!!");
					}
					}
			
			else if(ch==3) {
				System.out.println("\nenter the employee ID to edit the details");
					id = sc.nextInt();
					int j=0;
					for(employee1 e: al)
					{
						if(id == e.id)
						{	
							int ch1;
							System.out.println("\nedit employee Details :\n" +"1). employee ID\n" +"2). Name\n");
							System.out.println("enter your choice : ");
							ch1 = sc.nextInt();
							
							if(ch1==1) {
								System.out.println("\nenter new employee ID:");
									e.id =sc.nextInt();
									System.out.println(e+"\n");
								
							}
							else if(ch==2) {
								System.out.println("enter new employee Name:");
									e.name =sc.nextLine();
									System.out.println(e+"\n");}
						 else
						{
							System.out.println("\nemployee Details are not available, Please enter a valid ID!!");
						}
						}
				
			
					
			else if(ch==4) {
				System.out.println("\nenter employee ID to delete from the Databse :");
					id = sc.nextInt();
					int k=0;
					try{
					for(employee1 e: al)
					{
						if(id == e.id)
						{
								al.remove(e);
								display(al);
								k++;
						}
					}
					if(k == 0)
					{
						System.out.println("\nemployee Details are not available");
					}
					}
					catch(Exception ex){
						System.out.println(ex);
					}
			}
			else if(ch==5) {
				display(al);
			}
			
			else {
				System.err.println("the system quitting place");
			}

		
	}while(true);
	}
		}