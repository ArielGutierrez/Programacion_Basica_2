package Figura;

public class Circulo {
	
	//Atributos
	private Double radio;
	
	//Getters y setters
	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

	//Métodos
	public Double calcularPerimetro(){
		Double perimetro;		
		return perimetro = 2 * Math.PI * radio;
	}
	
}
