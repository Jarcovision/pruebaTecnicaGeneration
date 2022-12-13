package proyecto3;

public class EmpleadoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creación de objeto empleado 1 
		Empleado emp1 = new Empleado();
	 
	    //Asignación de valores a propiedades
	    emp1.setNombre("José");
	    emp1.setApellido("Sotelo");	  
	    emp1.setSalarioMensual(20000);

	    //Obtención de datos de salario
	    double sal1 = emp1.getSalarioMensual();
	    System.out.println("Salario mensual empleado 1: " + sal1);	 

	    
	    // Aumento de salario empleado 1
        double aumento1 = 0;
        aumento1 += (sal1 * 10) / 100;
	    sal1 = sal1 + aumento1; 
        emp1.setSalarioMensual(sal1);
	    System.out.println("Salario anual actualizado empleado 1: " + (sal1 * 12));	 

	    
		// Creación de objeto empleado 2 
        Empleado emp2 = new Empleado();
   	 
	    //Asignación de valores a propiedades
	    emp2.setNombre("Juan");
	    emp2.setApellido("Pérez");	  
	    emp2.setSalarioMensual(30000);
	 
	    //Obtención de datos de salario
	    double sal2 = emp2.getSalarioMensual();
	    System.out.println("\nSalario mensual empleado 2: " +sal2);	 

	    // Aumento de salario empleado 2
        double aumento2 = 0;
        aumento2 += (sal2 * 10)/100;
	    sal2 = sal2 + aumento2; 
        emp2.setSalarioMensual(sal2);      
	    System.out.println("Salario anual actualizado empleado 2: " + (sal2 * 12));	 
	}
	 
}
