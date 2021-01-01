package com.TPS_TVQ;

import java.util.Scanner;

public class ValeurFuture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner le montant du capital :");
		double capital = sc.nextDouble();
		sc.nextLine();
		System.out.println("Donner le taux d'interet:");
		double taux= sc.nextDouble();
		double Interet=  (capital*taux)/100;
		double Valeurfuture= capital+Interet;
		System.out.println("Montant du capital: "+ capital);
		System.out.println("valeur du taux d'interets :" + taux);
		System.out.println("l'interet annuel au "+ taux + " % :"+Interet);
		System.out.println(" la valeur du future : " + Valeurfuture);
		
		

	}

}
