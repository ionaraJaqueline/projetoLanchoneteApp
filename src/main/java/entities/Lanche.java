package entities;

public class Lanche {

	private String nome;
	private String descricao;
	private Integer codigo;
	private Float preco;

	public Lanche() {
	}

	public Lanche(String nome, String descricao, Integer code, Float preco) {

		this.nome = nome;
		this.descricao = descricao;
		this.codigo = code;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

}
