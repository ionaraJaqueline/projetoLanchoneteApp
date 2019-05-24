package entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long codigo;
	@Column(name="Nome")
	private String nome;
	@Temporal(TemporalType.DATE)
	@Column(name="Data_Validade")
	private Date dataDeValidade;
	@Column(name="Quantidade")
	private Integer quantidade;
	@Temporal(TemporalType.DATE)
	@Column(name="Data_Entrada")
	private Date dataEntrada;
	@Temporal(TemporalType.DATE)
	@Column(name="Data_Saida")
	private Date dataSaida;

	public Produto() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataDeValidade() {
		return dataDeValidade;
	}

	public void setDataDeValidade(Date dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

}
