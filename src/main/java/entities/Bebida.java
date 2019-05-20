package entities;
public class Bebida {
	
	private String nome;
	private Float preco;
	private Integer codigo;
	
	public Bebida() {}
	
	public Bebida(String nome, Float preco, Integer code){
		
		this.nome = nome;
		this.preco = preco;
		this.codigo = code;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}