package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		String[] villes = {"Paris", "Marseille","Lyon","Nantes","Montpellier"};
		System.out.println(villes[0]);
		System.out.println(villes[1]);
		System.out.println(villes[2]);
		System.out.println(villes[3]);
		System.out.println(villes[4]);

		villes[2] = "Reims";
		System.out.println(villes[0]);
		System.out.println(villes[1]);
		System.out.println(villes[2]);
		System.out.println(villes[3]);
		System.out.println(villes[4]);
		
	}

}
