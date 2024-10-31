package day9;

public class Vector {

	public static void main(String[] args) {
		String nomesEstudantes[] = {"Sansão Vieira", "Domingos Ambrósio", "António Agostinho", "Camilla Cabello"};
		
		for(int i = 0; i < nomesEstudantes.length; i++) {
			System.out.println((i + 1) + "° element: " + nomesEstudantes[i]);
		}
	}

}
