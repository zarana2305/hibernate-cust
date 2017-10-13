package com.cg.jpacrud.client;

import java.util.Date;
import java.util.Scanner;

import com.cg.jpacrud.entities.Customer;
import com.cg.jpacrud.service.CustomerService;
import com.cg.jpacrud.service.CustomerServiceImpl;

public class clientCust {

	public static void main(String[] args) {
	//Debug this program as Debug -> Debug as Java Application
		System.out.println("0.List By ID");
		System.out.println("1.List By Phone Numbers");
		System.out.println("2.List By Name");
		System.out.println("3.List All");
		System.out.println("4.insert data");
		System.out.println("Enter the Desired option");

	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	CustomerService service = new CustomerServiceImpl();
	Customer customer=new Customer();
	/*Customer c=new Customer();
	Customer c1=new Customer();
	Customer c2=new Customer();
	Customer c3=new Customer();
	Customer u1=new Customer();
	Customer u2=new Customer();
	
	/*customer.setCustomerId(1);
	customer.setName("Zarana");
	customer.setDob(new Date());
	customer.setPhone(2540123);
	service.addCustomer(customer);
	
	c3.setCustomerId(2);
	c3.setName("Harsh");
	c3.setDob(new Date());
	c3.setPhone(8080);
	service.addCustomer(c3);
	
	c1.setCustomerId(3);
	c1.setName("Bhatia");
	c1.setDob(new Date());
	c1.setPhone(8080);
	service.addCustomer(c1);*/
	
	
	//at this breakpoint, we have added one record to table
	/*customer = service.findCustomerById(1);
	System.out.println("found 1");
	System.out.print("ID:"+customer.getCustomerId());
	System.out.print(" Name:"+customer.getName());
	System.out.println(" PhoneNo:"+customer.getPhone());
	customer = service.findCustomerById(2);
	System.out.println("found 1");
	System.out.print("ID:"+customer.getCustomerId());
	System.out.print(" Name:"+customer.getName());
	System.out.println(" PhoneNo:"+customer.getPhone());
	
	u1.setName("update1");
	service.updateCustomer(u1);
	u1 = service.findCustomerById(1);
	System.out.println("After Updation");
	System.out.println("ID: "+u1.getCustomerId());
	System.out.println(" Name: "+u1.getName());
	
	u2.setName("update2");
	service.updateCustomer(u2);
	u2 = service.findCustomerById(2);

	System.out.println("After Updation");
	System.out.println("ID: "+u2.getCustomerId());
	System.out.println(" Name: "+u2.getName());*/
	
	//at this breakpoint, we have updated record added in first section
	
	switch(choice){
	case 0:
		System.out.println("Enter the ID");
		int des_id=sc.nextInt();
		customer = service.findCustomerById(des_id);
		System.out.println("found 1");
		System.out.println(customer);
		/*System.out.print("ID:"+z.getCustomerId());
		System.out.print(" Name:"+z.getName());
		System.out.println(" PhoneNo:"+z.getPhone());*/
	break;
	case 1:
		System.out.println("Enter The Phone Number");
		long ph=sc.nextInt();
	System.out.println("\n************Listing By Phone*************");
	for(Customer c:service.getByPhone(ph)) {
		//System.out.println(c);
		System.out.println("name :"+c.getName());
	}
	break;
	case 2:
		System.out.println("Enter The Name");
		String names=sc.next();
	System.out.println("\n************Listing By Name*************");
	for(Customer out:service.getByName(names)) {
		System.out.println(out);
		//System.out.println("Name "+ out.getName()+" ID :"+out.getCustomerId());
	}
	break;
	case 3:
	System.out.println("\n************Listing All customers*************");
	for(Customer m:service.getAll()) {
		System.out.println(m);
		//System.out.println(m.getName());
	}
	break;
	case 4:
		
			
		System.out.println("Enter ID");int in_id=sc.nextInt();
		System.out.println("Enter name");String in_name=sc.next();
		System.out.println("Enter phone");long in_ph=sc.nextInt();
		customer.setCustomerId(in_id);
		customer.setName(in_name);
		customer.setDob(new Date());
		customer.setPhone(in_ph);
		service.addCustomer(customer);
		break;
			
		/*System.out.println("Do You want to continue?\n1.yes 2.no");
		int check=sc.nextInt();*/
	
		
		
	//at this breakpoint, record is removed from table
	/*service.removeCustomer(customer);
	System.out.println("End of program...");*/
	
	}

}
	
	
}
