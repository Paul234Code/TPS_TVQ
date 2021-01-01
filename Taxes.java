package com.TPS_TVQ;

import java.util.Scanner;

public class Taxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner le montant avant taxes");
		double montant= sc.nextDouble();
		sc.nextLine();
		 double TPS=  (montant*5)/100 ;
		 double TVQ= (montant*9.975)/100;
		 double Total_Taxes= montant+TPS +TVQ;
		 System.out.println("Montant avant Taxes: "+ montant);
		 System.out.println("Montant de la TPS(9.975 %): " + TPS);
		 System.out.println("montant de la TVQ(5 %): " + TVQ);
		 System.out.println("Total avec Taxes: "+ Total_Taxes);

	}

}
