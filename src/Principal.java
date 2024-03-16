import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Classe Produto
		ArrayList<Produto> listaProdutos = new ArrayList<>();

		System.out.print("Informe a quantidade de Produtos: ");
		int qtddProdutos = sc.nextInt();
		sc.nextLine(); // Consumir a quebra de linha

		for (int i = 0; i < qtddProdutos; i++) {
			Produto prod = new Produto();

			System.out.print("Informe o ID do Produto " + (i + 1) + ": ");
			prod.setIdProduto(sc.nextInt());
			sc.nextLine(); // Consumir a quebra de linha

			System.out.print("Informe o NOME do Produto " + (i + 1) + ": ");
			prod.setNome(sc.nextLine());

			System.out.print("Informe o DESCRIÇÃO do Produto " + (i + 1) + ": ");
			prod.setDescricao(sc.nextLine());

			System.out.print("Informe o PROCESSO DE FABRICAÇÃO do Produto " + (i + 1) + ": ");
			prod.setProcessoFabricacao(sc.nextLine());

			System.out.print("Informe o PREÇO do Produto " + (i + 1) + ": ");
			prod.setPreco(sc.nextDouble());

			System.out.print("Informe a QUANTIDADE do Produto " + (i + 1) + ": ");
			prod.setQtddProduto(sc.nextInt());

			listaProdutos.add(prod);
			sc.nextLine(); // Consumir a quebra de linha após a
		}

		System.out.println("Lista de Produtos:");
		for (int i = 0; i < listaProdutos.size(); i++) {
			Produto prod = listaProdutos.get(i);
			System.out.println("ID do Produto: " + prod.getIdProduto());
			System.out.println("Nome do Produto: " + prod.getNome());
			System.out.println("Descrição do Produto: " + prod.getDescricao());
			System.out.println("Processo de Fabricação do Produto: " + prod.getProcessoFabricacao());
			System.out.println("Preço do Produto: " + prod.getPreco());
			System.out.println("Quantidade do Produto: " + prod.getQtddProduto());
			System.out.println();
		}

		// Classe Operador
		System.out.print("Informe a quantidade de Operadores: ");
		int qtddOperador = sc.nextInt();
		sc.nextLine(); // Consumir a quebra de linha

		ArrayList<Operador> operadores = new ArrayList<>();

		for (int i = 0; i < qtddOperador; i++) {
			Operador op = new Operador();
			System.out.print("Informe o ID do Operador " + (i + 1) + ": ");
			op.setIdOperador(sc.nextInt());
			sc.nextLine(); // Consumir a quebra de linha

			System.out.print("Informe o NOME do Operador " + (i + 1) + ": ");
			op.setNome(sc.nextLine());

			operadores.add(op);
		}

		for (int i = 0; i < operadores.size(); i++) {
			Operador op = operadores.get(i);
			System.out.println("ID " + (i + 1) + ": " + op.getIdOperador());
			System.out.println("NOME " + (i + 1) + ": " + op.getNome());
		}

		// Classe Maquina
		System.out.print("Informe a quantidade de Máquinas: ");
		int qtddMaquina = sc.nextInt();
		sc.nextLine(); // Consumir a quebra de linha

		ArrayList<Maquina> maquinas = new ArrayList<>();

		for (int i = 0; i < qtddMaquina; i++) {
			Maquina maq = new Maquina();
			System.out.print("Informe o ID da Máquina " + (i + 1) + ": ");
			maq.setIdMaquina(sc.nextInt());
			sc.nextLine(); // Consumir a quebra de linha

			System.out.print("Informe o TIPO da Máquina " + (i + 1) + ": ");
			maq.setTipoMaquina(sc.nextLine());

			System.out.print("Informe o STATUS da Máquina " + (i + 1) + ": ");
			maq.setStatus(sc.nextLine());

			System.out.print("Informe o TEMPO DE ATIVIDADE da Máquina " + (i + 1) + ": ");
			maq.setTempoAtividade(sc.nextDouble());

			maquinas.add(maq);
			sc.nextLine(); // Consumir a quebra de linha após a leitura do tempo de atividade
		}

		for (int i = 0; i < maquinas.size(); i++) {
			Maquina maq = maquinas.get(i);
			System.out.println("ID " + (i + 1) + ": " + maq.getIdMaquina());
			System.out.println("TIPO " + (i + 1) + ": " + maq.getTipoMaquina());
			System.out.println("STATUS " + (i + 1) + ": " + maq.getStatus());
			System.out.println("TEMPO DE ATIVIDADE " + (i + 1) + ": " + maq.getTempoAtividade());
		}

		// Classe Componentes
		System.out.print("Informe a quantidade de Componentes: ");
		int qtddComponente = sc.nextInt();
		sc.nextLine(); // Consumir a quebra de linha

		ArrayList<Componentes> componentes = new ArrayList<>();

		for (int i = 0; i < qtddComponente; i++) {
			Componentes comp = new Componentes();
			System.out.print("Informe o ID do Componente " + (i + 1) + ": ");
			comp.setIdComponente(sc.nextInt());
			sc.nextLine(); // Consumir a quebra de linha

			System.out.print("Informe o NOME do Componente " + (i + 1) + ": ");
			comp.setNomeComponente(sc.nextLine());

			System.out.print("Informe a QUANTIDADE do Componente " + (i + 1) + ": ");
			comp.setQtddComponente(sc.nextInt());

			componentes.add(comp);
			sc.nextLine(); // Consumir a quebra de linha após a leitura da quantidade
		}

		for (int i = 0; i < componentes.size(); i++) {
			Componentes comp = componentes.get(i);
			System.out.println("ID COMPONENTE " + (i + 1) + ": " + comp.getIdComponente());
			System.out.println("NOME COMPONENTE " + (i + 1) + ": " + comp.getNomeComponente());
			System.out.println("QUANTIDADE DE COMPONENTES " + (i + 1) + ": " + comp.getQtddComponente());
		}

		// Classe LinhaProducao
		System.out.print("Informe a quantidade de Linhas de Produção: ");
		int qtddLinhas = sc.nextInt();
		sc.nextLine(); // Consumir a quebra de linha

		ArrayList<LinhaProducao> linhasProducao = new ArrayList<>();

		for (int i = 0; i < qtddLinhas; i++) {
			LinhaProducao lp = new LinhaProducao();
			System.out.print("Informe o ID da Linha de Produção " + (i + 1) + ": ");
			lp.setIdLinha(sc.nextLine());

			System.out.print("Informe o STATUS da Linha de Produção " + (i + 1) + ": ");
			lp.setStatusLinha(sc.nextLine());

			System.out.print("Informe o TEMPO DE CICLO da Linha de Produção " + (i + 1) + ": ");
			lp.setTempoCiclo(sc.nextDouble());
			sc.nextLine(); // Consumir a quebra de linha após a leitura do tempo de ciclo

			linhasProducao.add(lp);
		}

		for (int i = 0; i < linhasProducao.size(); i++) {
			LinhaProducao lp = linhasProducao.get(i);
			System.out.println("ID LINHA DE PRODUCAO " + (i + 1) + ": " + lp.getIdLinha());
			System.out.println("STATUS DA LINHA DE PRODUCAO " + (i + 1) + ": " + lp.getStatusLinha());
			System.out.println("TEMPO DE CICLO DA LINHA DE PRODUCAO " + (i + 1) + ": " + lp.getTempoCiclo());
		}
		
		// Classe Pedido
				System.out.print("Informe a quantidade de Pedidos: ");
				int qtddPedidos = sc.nextInt();
				sc.nextLine(); // Consumir a quebra de linha

				ArrayList<Pedido> listaPedidos = new ArrayList<>();

				for (int i = 0; i < qtddPedidos; i++) {
					Pedido ped = new Pedido();

					System.out.print("Informe o ID do Pedido " + (i + 1) + ": ");
					ped.setIdPedido(sc.nextInt());
					sc.nextLine(); // Consumir a quebra de linha

					System.out.print("Informe a Data de Entrega do Pedido " + (i + 1) + " (dd/MM/yyyy): ");
					String dataStr = sc.nextLine();

					int dia = Integer.parseInt(dataStr.substring(0, 2));
					int mes = Integer.parseInt(dataStr.substring(3, 5)) - 1;
					int ano = Integer.parseInt(dataStr.substring(6, 10));

					Date data = new Date((ano - 1900), mes, dia);
					ped.setDataEntrega(data);

					System.out.print("Informe o Preço Total do Pedido " + (i + 1) + ": ");
					ped.setPrecoTotal(sc.nextDouble());

					System.out.print("Informe a Quantidade Total do Pedido " + (i + 1) + ": ");
					ped.setQtddTotal(sc.nextInt());

					listaPedidos.add(ped);
					sc.nextLine(); // Consumir a quebra de linha após a leitura da quantidade total
				}

				// Imprimindo os pedidos
				for (int i = 0; i < listaPedidos.size(); i++) {
					Pedido ped = listaPedidos.get(i);
					System.out.println("ID do Pedido " + (i + 1) + ": " + ped.getIdPedido());
					System.out.println("Data de Entrega do Pedido " + (i + 1) + ": " + ped.getDataEntrega());
					System.out.println("Preço Total do Pedido " + (i + 1) + ": " + ped.getPrecoTotal());
					System.out.println("Quantidade Total do Pedido " + (i + 1) + ": " + ped.getQtddTotal());
				}

	}

}
