package entities;

public class Pedido {
	private Integer qtdBebida;
	private Integer qtdSobreMesa;
	private Integer qtdLanche;
	private Float valorUnitario;
	private Float valorTotal;
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

}
