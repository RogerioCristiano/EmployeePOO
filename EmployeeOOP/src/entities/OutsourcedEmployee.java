package entities;

public class OutsourcedEmployee extends Employee{

	private double despesaAdicional;
	
	public OutsourcedEmployee() {
	super();	
	}

	public OutsourcedEmployee(String name, Integer hours, double valuePerHour, double despesaAdicional) {
		super(name, hours, valuePerHour);
		this.despesaAdicional = despesaAdicional;
	}
	
	
	
	public double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}

	@Override
	public double pagamento() {
		return super.pagamento() + despesaAdicional * 1.1;
	}
	
}