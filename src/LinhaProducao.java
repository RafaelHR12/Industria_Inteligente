import java.util.ArrayList;

public class LinhaProducao {

	private String idLinha;
    private String statusLinha;
    private double tempoCiclo;
    
    //Lista de máquinas 
    private ArrayList<Maquina> maquinas;
    
    public LinhaProducao() {
        this.maquinas = new ArrayList<>();
    }
    
    public void addMaquina(Maquina maquina) {
        maquinas.add(maquina);
    }
    
	public String getIdLinha() {
		return idLinha;
	}
	public void setIdLinha(String idLinha) {
		if (idLinha.length() > 5)
			this.idLinha = idLinha;
	}
	
	public String getStatusLinha() {
		return statusLinha;
	}
	public void setStatusLinha(String statusLinha) {
		this.statusLinha = "Inativa";
	}
	public double getTempoCiclo() {
		return tempoCiclo;
	}
	public void setTempoCiclo(double tempoCiclo) {
		if (tempoCiclo >= 0)
			this.tempoCiclo = tempoCiclo;
	}
	
	Maquina maquina = new Maquina();
	
	public void exibirMaquinas() {
        System.out.println("Máquinas na linha de produção:");
        for (Maquina maquina : maquinas) {
            System.out.println("ID: " + maquina.getIdMaquina() + " - Tipo: " + maquina.getTipoMaquina());
        }
    }
	
}
