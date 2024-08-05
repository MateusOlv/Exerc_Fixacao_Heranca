package entities;

public abstract class Pessoa {
	private String name;
	protected Double rendaAnual;
	
	public Pessoa(String name, Double rendaAnual) {
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract Double calculoImposto();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(name + ": ");
		builder.append("$ " + String.format("%.2f", calculoImposto()));
		return builder.toString();
	}
	
	
}
