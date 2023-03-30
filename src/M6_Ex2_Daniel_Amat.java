import java.util.ArrayList;
import java.util.Scanner;

public class M6_Ex2_Daniel_Amat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numPersones = 0;
		int edat = 0;
		int sumaEdats = 0;
		int numTotalPersones = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdueix el nombre de persones a qui se li ha de demanar l´edat: ");
		numPersones = entrada.nextInt();
		numTotalPersones = numPersones;
		
		while (0 < numPersones && (edat >= 0 || edat <= 120)) {
			System.out.println("Introdueix una edat: ");
			edat = entrada.nextInt();	
			sumaEdats += edat;
			numPersones--;
			if(edat < 0 || edat > 120) {
				System.out.println("Edat introduida fora de rang!");
			numPersones++;
			sumaEdats -= edat;
			}
			}
		
		//System.out.println(sumaEdats);
		System.out.println("El promig de totes les edats es: " + edatMitjana(sumaEdats,numTotalPersones));
		
	}
		public static float edatMitjana(int sumaEdats, int numTotalPersones){
		
			float promig = 0; 
			promig = (float) sumaEdats / numTotalPersones;
			
		return (promig);
			
			
		}
	}
	

