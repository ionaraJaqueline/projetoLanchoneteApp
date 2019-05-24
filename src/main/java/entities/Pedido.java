package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long codigo;
	@Column(name="Qtd_Bebida")
	private Integer qtdBebida;
	
	@Column(name="Qtd_Sobre_Mesa")
	private Integer qtdSobreMesa;
	
	@Column(name="Qtd_Lanche")
	private Integer qtdLanche;
	
	@Column(name="Valor_Unitario")
	private Float valorUnitario;
	
	@Column(name="Valor_Total")
	private Float valorTotal;
	
	@Column(name="Tipo_Pagamento")
	private TipoDePagamento tipoDePagemento;

	public Pedido() {

	}

	public Integer getQtdBebida() {
		return qtdBebida;
	}

	public void setQtdBebida(Integer qtdBebida) {
		this.qtdBebida = qtdBebida;
	}

	public Integer getQtdSobreMesa() {
		return qtdSobreMesa;
	}

	public void setQtdSobreMesa(Integer qtdSobreMesa) {
		this.qtdSobreMesa = qtdSobreMesa;
	}

	public Integer getQtdLanche() {
		return qtdLanche;
	}

	public void setQtdLanche(Integer qtdLanche) {
		this.qtdLanche = qtdLanche;
	}

	public Float getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public TipoDePagamento getTipoDePagemento() {
		return tipoDePagemento;
	}

	public void setTipoDePagemento(TipoDePagamento tipoDePagemento) {
		this.tipoDePagemento = tipoDePagemento;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

}
