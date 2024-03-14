import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		//Classe Operador
		Operador op = new Operador();
		
		System.out.print("Informe a quantidade de Operadores: ");
		int qtddOperador =sc.nextInt();
		
		for (int i=0; i<qtddOperador; i++) {
			System.out.print("Informe o ID do Operador " + (i+1) + ": ");
			op.setIdOperador(sc.nextInt());
			
			sc.nextLine();
			
			System.out.print("Informe o NOME do Operador " + (i+1) + ": ");
			op.setNome(sc.nextLine());
		}
		
		//Classe Maquina
		Maquina maq = new Maquina ();
		
		System.out.print("Informe a quantidade de Maquinas: ");
		int qtddMaquina =sc.nextInt();
		
		for (int i=0; i<qtddMaquina; i++) {
			System.out.print("Informe o ID da Maquina " + (i+1) + ": ");
			maq.setIdMaquina(sc.nextInt());
			
			sc.nextLine();
			
			System.out.print("Informe o TIPO da Maquina " + (i+1) + ": ");
			maq.setTipoMaquina(sc.nextLine());
		}
		
	}

}
