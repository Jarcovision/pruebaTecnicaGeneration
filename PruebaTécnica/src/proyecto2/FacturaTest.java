package proyecto2;

public class FacturaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factura prod1 = new Factura();		
		double total = prod1.getCantidadComprada() * 						   prod1.getPrecioUnitario();
		System.out.println(total);
				
		if	(total > 0) {
			System.out.println(0);
		} 
		
		else if (total <= 0) {
			System.out.println(0.0);
		}	

	}
	
}