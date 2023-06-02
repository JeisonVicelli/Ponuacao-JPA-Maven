package modelos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	@SuppressWarnings("unused")
	private static Integer novoCodigo = 1;
	
	public enum Status{
		ABERTO,
		CONCLUIDO,
		CANCELADO
	}
	
	private Integer codigo; 
	private double valorTotal;
	private Usuario vendedor;
	private Cliente cliente;
	private List<Produto> produtos;
	private Status status;
	
	public Pedido() {
		this.setStatus(Status.ABERTO);
		//this.codigo = função .getNovoId;		
		//this.vendedor = ControleDeAcesso.usuarioLogado;
		this.produtos = new ArrayList<>();
		this.valorTotal = 0;
	}
	
	public Pedido( Usuario vendedor) {
		this();
		this.vendedor = vendedor;	
	}
	
	public Pedido(Integer codigo, Usuario vendedor) {
		this();
		this.codigo = codigo;
		this.vendedor = vendedor;
	}	

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Usuario getVendedor() {
		return vendedor;
	}

	public void setVendedor(Usuario vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void adicionar(Produto produto) {
		this.valorTotal =+ produto.getPreco();
		this.produtos.add(produto);
	}
	
	public void remover(Produto produto) {
		this.valorTotal =- produto.getPreco();
		this.produtos.remove(produto);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [codigo=" + codigo + ", status =" + status + ", vendedor=" + vendedor + ", cliente="
				+ cliente + ", produtos=" + produtos + ", valor total =" + valorTotal + "]";
	}
	
	
	
	
	
	
	

}
