package entities;

public class PessoaFisica extends Pessoa{
	private Double gastosSaude;

	public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}


	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double calculoImposto() {
		Double imposto = 0.0;
		if(rendaAnual < 20000) {
			imposto = rendaAnual * 15 / 100;
		} 
		else {
			imposto = rendaAnual * 25 / 100;
		}
		
		if(gastosSaude > 0.0) imposto -= (gastosSaude * 50 /100);
		
		return imposto;
	}
	
}
