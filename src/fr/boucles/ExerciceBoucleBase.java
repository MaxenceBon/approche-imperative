package fr.boucles;

import javax.security.auth.callback.ConfirmationCallback;

import diginamic.Bonjour;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		for (int i=0; i<20; i++) {
			System.out.println("Bon Maxence");
		}
		for (int i=1; i<101; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
		for (int i=1; i<100; i++) {
			if (i%2 == 1) {
				System.out.println(i);
			}
		}
	}
}
