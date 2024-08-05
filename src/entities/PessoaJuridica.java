package entities;

public class PessoaJuridica extends Pessoa{
	private Integer numFunc;

	public PessoaJuridica(String name, Double rendaAnual, Integer numeroFunc) {
		super(name, rendaAnual);
		this.numFunc = numeroFunc;
	}

	public Integer getNumeroFunc() {
		return numFunc;
	}

	public void setNumeroFunc(Integer numeroFunc) {
		this.numFunc = numeroFunc;
	}

	@Override
	public Double calculoImposto() {
		Double imposto = 0.0;
		if(numFunc <= 10) imposto = rendaAnual * 16 / 100;
		else imposto = rendaAnual * 14 / 100;
		return imposto;
	}
	
}
