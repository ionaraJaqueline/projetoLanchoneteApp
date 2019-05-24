package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Sobre_Mesa")
public class SobreMesa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigo;
	@Column(name="Nome")
	private String nome;
	@Column(name="Preço")
	private Float preco;
	@Column(name="Descrição")
	private String descricao;

	public SobreMesa() {
	}

	public SobreMesa(String nome, Float preco, Integer code) {

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
