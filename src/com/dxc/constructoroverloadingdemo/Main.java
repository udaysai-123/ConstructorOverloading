package com.dxc.constructoroverloadingdemo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
       Product p=new Product();
       System.out.println("Enter the product id");
       long pid=Long.parseLong(s.nextLine());
       p.setPid(pid);
       
       System.out.println("Enter the supplier name");
       String sname=s.nextLine();
       p.setSname(sname);
       
       System.out.println(p.getSname());
       System.out.println("Enter the product name");
       String pname=s.nextLine();
       p.setPname( pname);
       System.out.println("---------------------------------------------------");
       System.out.println("Product id is"    +p.getPid());
       System.out.println("product name is"   +p.getPname());
       System.out.println("Supplier name is"  +p.getSname());




	}

}
