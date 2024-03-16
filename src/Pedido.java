import java.util.Date;

public class Pedido {

	private int idPedido;
	private Date dataEntrega;
	private double precoTotal;
	private int qtddTotal;
	
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		if (idPedido > 0)
			this.idPedido = idPedido;
	}
	public Date getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Date dataEntrega) {
		if (dataEntrega != null)
			this.dataEntrega = dataEntrega;
		else 
			System.out.println("Data Inválida!");
	}
	
	Produto produto = new Produto();
	
	public double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal += produto.getPreco();
	}
	
	public double getQtddTotal() {
		return precoTotal;
	}
	public void setQtddTotal(double qtddTotal) {
		if (qtddTotal > 0)
			this.qtddTotal += produto.getQtddProduto();
	}
}
