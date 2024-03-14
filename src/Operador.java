import java.util.ArrayList;

public class Operador {

	private int idOperador;
    private String nome;
    private ArrayList<Maquina> maquinasOperadas;
    
    
	public int getIdOperador() {
		return idOperador;
	}
	public void setIdOperador(int idOperador) {
		this.idOperador = idOperador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
