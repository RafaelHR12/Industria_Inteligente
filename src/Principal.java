import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		//Classe Operador
		System.out.print("Informe a quantidade de Operadores: ");
		int qtddOperador =sc.nextInt();
		
		Operador[] operador = new Operador[qtddOperador];
		
		for (int i=0; i<qtddOperador; i++) {
			
			Operador op = new Operador(); // Criando um novo objeto Operador
			
			System.out.print("Informe o ID do Operador " + (i+1) + ": ");
			op.setIdOperador(sc.nextInt());
			
			sc.nextLine();
			
			System.out.print("Informe o NOME do Operador " + (i+1) + ": ");
			op.setNome(sc.nextLine());
			
			// Armazenando o operador no array
		    operador[i] = op;
		}
		
		for (int i=0; i<qtddOperador; i++) {
			System.out.println("ID "+(i+1)+": "+operador[i].getIdOperador());
			
			System.out.println("NOME "+(i+1)+": "+operador[i].getNome());
		}
		
		//Classe Maquina
		System.out.print("Informe a quantidade de Maquinas: ");
		int qtddMaquina =sc.nextInt();
		
		Maquina[] maquina = new Maquina [qtddMaquina];
		
		
		for (int i=0; i<qtddMaquina; i++) {
			Maquina maq = new Maquina();
			
			System.out.print("Informe o ID da Maquina " + (i+1) + ": ");
			maq.setIdMaquina(sc.nextInt());
			
			sc.nextLine();
			
			System.out.print("Informe o TIPO da Maquina " + (i+1) + ": ");
			maq.setTipoMaquina(sc.nextLine());
			
			System.out.print("Informe o STATUS da Maquina " + (i+1) + ": ");
			maq.setStatus(sc.nextLine());
			
			System.out.print("Informe o TEMPO DE ATIVIDADE da Maquina " + (i+1) + ": ");
			maq.setTempoAtividade(sc.nextDouble());
			
			maquina[i] = maq;
		}
		
		for (int i=0; i<qtddOperador; i++) {
			System.out.println("ID "+(i+1)+": "+maquina[i].getIdMaquina());
			
			System.out.println("TIPO Maquina "+(i+1)+": "+maquina[i].getTipoMaquina());
			
			System.out.println("STATUS da Maquina "+(i+1)+": "+maquina[i].getStatus());
			
			System.out.println("TEMPO DE ATIVIDADE da Maquina "+(i+1)+": "+maquina[i].getTempoAtividade());
		}
		
		//Classe Componentes 
		System.out.print("Informe a quantidade de Componentes: ");
		int qtddComponente =sc.nextInt();
		
		Componentes[] componente = new Componentes [qtddComponente];
		
		for (int i=0; i<qtddComponente; i++) {
			Componentes comp = new Componentes();
			
			System.out.print("Informe o ID do Componente " + (i+1) + ": ");
			comp.setIdComponente(sc.nextInt());
			
			sc.nextLine();
			
			System.out.print("Informe o NOME do Componente " + (i+1) + ": ");
			comp.setNomeComponente(sc.nextLine());
			
			System.out.print("Informe a QUANTIDADE do Componente " + (i+1) + ": ");
			comp.setQtddComponente(sc.nextInt());
			
			componente[i] = comp;
		}
		
		for (int i=0; i<qtddOperador; i++) {
			System.out.println("ID COMPONENTE"+(i+1)+": "+componente[i].getIdComponente());
			
			System.out.println("NOME COMPONENTE "+(i+1)+": "+componente[i].getNomeComponente());
			
			System.out.println("QUANTIDADE DE COMPONENTES "+(i+1)+": "+componente[i].getQtddComponente());
		}
		
		//Classe LinhaProducao
		System.out.print("Informe a quantidade de Linhas de Produção: ");
		int qtddLinhas =sc.nextInt();
		
		LinhaProducao[] linhaProducao = new LinhaProducao[qtddLinhas];
		
		
		for (int i=0; i<qtddLinhas; i++) {
			LinhaProducao lp = new LinhaProducao();
			
			System.out.print("Informe o ID da Linha de Produção " + (i+1) + ": ");
			lp.setIdLinha(sc.nextLine());
			
			sc.nextLine();
			
			System.out.print("Informe o STATUS da Linha de Produção " + (i+1) + ": ");
			lp.setStatusLinha(sc.nextLine());
			
			System.out.print("Informe o TEMPO DE CICLO da Linha de Produção " + (i+1) + ": ");
			lp.setTempoCiclo(sc.nextDouble());
			
			linhaProducao[i] = lp;
		}
		
		for (int i=0; i<qtddOperador; i++) {
			System.out.println("ID LINHA DE PRODUCAO "+(i+1)+": "+linhaProducao[i].getIdLinha());
			
			System.out.println("STATUS DA LINHA DE PRODUCAO "+(i+1)+": "+linhaProducao[i].getStatusLinha());
			
			System.out.println("TEMPO DE CICLO DA LINHA DE PRODUCAO "+(i+1)+": "+linhaProducao[i].getTempoCiclo());
		}
		
		//Classe Produto
		System.out.println("Informe a quantidade de Produtos: ");
		int qtddProdutos = sc.nextInt();
		
		Produto[] produto = new Produto[qtddProdutos];
		for (int i=0; i<produto.length; i++) {
			Produto prod = new Produto();
			
			System.out.println("Informe o ID do Produto "+(i+1)+": ");
			prod.setIdProduto(sc.nextInt());
			
			System.out.println("Informe o NOME do Produto "+(i+1)+": ");
			prod.setNome(sc.nextLine());
			
			System.out.println("Informe o DESCRIÇÃO do Produto "+(i+1)+": ");
			prod.setDescricao(sc.nextLine());
			
			System.out.println("Informe o PROCESSO DE FABRICAÇÃO do Produto "+(i+1)+": ");
			prod.setProcessoFabricacao(sc.nextLine());
			
			System.out.println("Informe o PREÇO do Produto "+(i+1)+": ");
			prod.setPreco(sc.nextDouble());
			
			System.out.println("Informe a QUANTIDADE do Produto "+(i+1)+": ");
			prod.setQtddProduto(sc.nextInt());
			
			produto[i] = prod;
		}
		
		for (int i=0; i<produto.length; i++) {
			System.out.println("ID PRODUTO "+(i+1)+": "+produto[i].getIdProduto());
			
			System.out.println("NOME PRODUTO "+(i+1)+": "+produto[i].getNome());

			System.out.println("DESCRIÇÃO PRODUTO "+(i+1)+": "+produto[i].getDescricao());
			
			System.out.println("PROCESSO DE FABRICAÇÃO DO PRODUTO "+(i+1)+": "+produto[i].getProcessoFabricacao());
			
			System.out.println("PREÇO DO PRODUTO "+(i+1)+": "+produto[i].getPreco());

			System.out.println("QUANTIDADE DO PRODUTO "+(i+1)+": "+produto[i].getQtddProduto());

		}
	}
	
}
