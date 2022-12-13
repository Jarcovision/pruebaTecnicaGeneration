package proyecto1;

public class Automóvil {
	protected String modelo;
	protected String color;
	protected int año;
	protected String marca;
	protected int Chasís;
	protected String propietario;
	protected int velocidadMáxima;
	protected int velocidadActual;
	protected int númeroDePuertas;
	protected boolean techoSolar;
	protected int númeroDeMarchas;
	protected boolean transmisiónAutomática;
	
	public int acelerar() {
		this.velocidadActual=this.velocidadActual + 1;
	    System.out.println("Velocidad: " + this.velocidadActual);
	    return this.velocidadActual;
	} /* Quise implementar la velocidad máxima aquí, pero no logré
		plasmar la idea al final. */
	
	public int frenar() {
		 this.velocidadActual = 0;
		    System.out.println("Velocidad: "+this.velocidadActual);
		    return this.velocidadActual;
	}
	
	public int ascMarcha() {
		if (this.velocidadActual > 5) {
			this.númeroDeMarchas = this.númeroDeMarchas + 1;
		}
			/*
			for (this.númeroDeMarchas = 0; this.númeroDeMarchas < 5; this.númeroDeMarchas++) {
				for (this.velocidadActual = 0; this.velocidadActual => 5; this.velocidadActual++) {
					this.númeroDeMarchas++;
				}
				
			}  Aquí tenía pensado anidar un ciclo for para la velocidad dentro de otro para
			   las marchas.
			
			*/
		return this.númeroDeMarchas;
	}
	
	public void descMarcha() {
		
	}
	
	public Automóvil(/*Propietario*/) {
		//propietario =  
	}
}
