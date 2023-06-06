package modelos;

import java.util.ArrayList;
import java.util.List;

import controles.ControleLogin;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Pedido {
	
	
	private static Pedido emMemoria;	
	
	public enum Status{
		ABERTO,
		CONCLUIDO,
		CANCELADO
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double valorTotal;
	private Status status;
	private int pontos;
	
	@ManyToOne
	private Usuario vendedor;
	
	@ManyToOne
	private Cliente cliente;
	
	@OneToMany
	private List<Mercadoria> mercadorias;
	
	public Pedido() {
		this.setStatus(Status.ABERTO);
		this.vendedor = ControleLogin.usuarioLogado;
		this.mercadorias = new ArrayList<>();		
		this.valorTotal = 0;
	}
	
	public Pedido(Usuario vendedor) {
		this();
		this.vendedor = vendedor;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	public void adicionar(Mercadoria mercadoria) {
		this.valorTotal =+ mercadoria.getPreco();
		this.mercadorias.add(mercadoria);
	}
	
	public void remover(Mercadoria mercadoria) {
		this.valorTotal =- mercadoria.getPreco();
		this.mercadorias.remove(mercadoria);
	}
	
	public int adicionarPontos() {
		pontos =+ mercadoria.getPonto();
		return pontos;
	}
	
	public List<Mercadoria> getMercadorias() {
		return mercadorias;
	}

	public void setMercadorias(List<Mercadoria> mercadorias) {
		this.mercadorias = mercadorias;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [codigo=" + id + ", status =" + status + ", vendedor=" + vendedor + ", cliente="
				+ cliente + ", produtos=" + mercadorias + ", valor total =" + valorTotal + "]";
	}
	
	
	
	
	
	
	

}
