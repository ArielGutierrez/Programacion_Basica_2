import static org.junit.Assert.*;

import org.junit.Assert;

import Figura.Circulo;


public class Test {
	
	//Test para comprobar el armado de los círculos, seteo los radios y luego los verifico con el método
	@org.junit.Test
	public void testParaComprobarExistenciaDelPrimerCirculo() {
		Circulo circuloUno = new Circulo();
		circuloUno.setRadio(2.0);
		Assert.assertEquals(2.0, circuloUno.getRadio(), 0.1);
	}
	
	@org.junit.Test
	public void testParaComprobarExistenciaDelSegundoCirculo() {
		Circulo circuloDos = new Circulo();
		circuloDos.setRadio(3.7);
		Assert.assertEquals(3.7, circuloDos.getRadio(), 0.1);
	}
	
	@org.junit.Test
	public void testParaComprobarExistenciaDelTercerCirculo() {
		Circulo circuloTres = new Circulo();
		circuloTres.setRadio(5.0);
		Assert.assertEquals(5.0, circuloTres.getRadio(), 0.1);
	}
	
	@org.junit.Test
	public void testParaComprobarExistenciaDelCuartoCirculo() {
		Circulo circuloCuatro = new Circulo();
		circuloCuatro.setRadio(10.9);
		Assert.assertEquals(10.9, circuloCuatro.getRadio(), 0.1);
	}
	
	@org.junit.Test
	public void testParaCalcularPerimetro() {
		Circulo circuloCinco = new Circulo();
		circuloCinco.setRadio(9.8);
		Double perimetroCinco = circuloCinco.calcularPerimetro();
		System.out.println("El perímetro del círculo con radio de 9.8 es: " + perimetroCinco);
		Assert.assertEquals(61.57, perimetroCinco, 0.2);
	}
	
	@org.junit.Test
	public void testParaCalcularSegundoPerimetro() {
		Circulo circuloSeis = new Circulo();
		circuloSeis.setRadio(16.6);
		Double perimetroSeis = circuloSeis.calcularPerimetro();
		System.out.println("El perímetro del círculo con radio 16.6 es: " + perimetroSeis);
		Assert.assertEquals(104.30, perimetroSeis, 0.2);
	}


}
