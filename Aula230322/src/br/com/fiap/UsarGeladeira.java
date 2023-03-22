package br.com.fiap;

import java.util.Scanner;

public class UsarGeladeira {

	public static void main(String[] args) {
		Geladeira g1 = new Geladeira();
		int temperatura;
		String modo, abrir;
		Scanner scan;

		try {
			scan = new Scanner(System.in);
			System.out.println("Você deseja abrir a sua geladeira?");
			abrir = scan.next();

			System.out.println("Que temperatura você deseja?");
			temperatura = scan.nextInt();

			System.out.println("Que modo você deseja?");
			modo = scan.next();

			g1.temperatura = temperatura;
			g1.modo = modo;

			if (abrir.equals("sim")) {
				System.out.println("Geladeia aberta");
			} else if (abrir.equals("não")) {
				System.out.println("Geladeira fechada.");
			} else {
				System.out.println("Inconclusivo");
			}
			g1.mostrar();
		} catch (Exception e) {

		}

	}

}
