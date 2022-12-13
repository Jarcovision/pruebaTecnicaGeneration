package proyecto2;

import java.util.Scanner;

public class Factura {
	private String número;
	private String descripción;
	private int cantidadComprada;
	private double precioUnitario;
	
	//Getters y setters
	public String getNúmero() {
		return número;
	}
	
	public void setNúmero(String número) {
		this.número = número;
	}
	
	public String getDescripción() {
        return descripción;
    }
	
	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	public int getCantidadComprada() {
		return cantidadComprada;
	}
	 
	public void setCantidadComprada(int cantidadComprada) {
		this.cantidadComprada = cantidadComprada;
	}
	    
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	    
	public double getPrecioUnitario() {
		return precioUnitario;
	}
			    
	public Factura(){
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Cantidad comprada: ");
        setCantidadComprada(entrada.nextInt());
        System.out.println("Precio unitario: ");
        setPrecioUnitario(entrada.nextDouble());
    }
	
	
}
