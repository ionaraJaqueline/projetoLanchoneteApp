package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lanche {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long codigo;
	@Column(name="Nome")
	private String nome;
	@Column(name="Descrição")
	private String descricao;
	@Column(name="Preço")
	private Float preco;

	public Lanche() {
	}

	public Lanche(String nome, String descricao, Long code, Float preco) {

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

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

}
