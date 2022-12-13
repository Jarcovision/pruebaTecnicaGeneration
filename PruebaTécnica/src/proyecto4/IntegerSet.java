package proyecto4;

public class IntegerSet {
	  private int [] a;  // Almacenará números de 0 a 100

	  public IntegerSet () {
		  a = new int [101];
	  }

	  public IntegerSet (IntegerSet setActual) {
		  a = new int [101];
		  for (int i=0; i<a.length; i++) {
			  a[i] = setActual.a[i];
		  }
	  }

	  public void insertElement(int i) {
		  if ((i >= 0) && (i < a.length)) {
			  a[i] = 1;
		  }
	  }
	  
	  public void deleteElement(int i) {
		  if ((i >= 0) && (i < a.length)) {
			  a[i] = 0;
		  }
	  }

	  public boolean isSet(int i) {
		  return (a[i] == 1);
	  }
	  
	  // Método de unión
	  public IntegerSet uniónDeIntegers(IntegerSet otroSet) {
		  IntegerSet newSet = new IntegerSet(this);

		  for (int i=0; i<a.length; i++) {
			  if (otroSet.isSet(i)) {
				  newSet.insertElement(i);
			  }
	      }

	      return newSet;
	  }

	  // Método de intersección
	  public IntegerSet intersecciónDeIntegers(IntegerSet otroSet) {
		  IntegerSet newSet = new IntegerSet(this);

	

		  for (int i=0; i<a.length; i++) {
			  if (!otroSet.isSet(i)) {
				  newSet.deleteElement(i);
			  }
		  }

		  return newSet;
	  }
	  	  
	  public boolean isEmpty() {
		  for (int i=0; i<a.length; i++)
	      if (isSet(i)) return false;
		  return true;
	  }

	  public int cardinality() {
		  int contador = 0;
		  for (int i=0; i<a.length; i++)
	      if (isSet(i))
	      contador++;
		  return contador;
	  }

	  public void toSetString() {
		  System.out.print("[Set:");

		  if (isEmpty())
	      System.out.print("-");

		  for (int i=0; i<a.length; i++) {
	      if (isSet(i))
	        System.out.print(" " + i);
	    }

	    System.out.print("]\n");
	  }

	  // Retorna true si los sets son iguales
	  public boolean isEqualTo(IntegerSet otroSet) {
		  for (int i=0; i<a.length; i++) {
			  if (otroSet.isSet(i) != isSet(i))
			  return false;
	    }
		  
		  return true;
	  }
	  
	  // Verificación
	  public static void main (String [] args) {
		  IntegerSet pares = new IntegerSet();
		  IntegerSet nones = new IntegerSet();
	      for (int i=0; i<10; i++)
	      if ((i % 2) == 0) {
	    	  pares.insertElement(i);
	      }
	      else {
	    	  nones.insertElement(i);
	      }
	      
	      System.out.print("Números pares: ");
	      pares.toSetString();

		  System.out.print("Números nones: ");
		  nones.toSetString();
	
		  IntegerSet union = pares.uniónDeIntegers(nones);
		  System.out.print("Unión: ");
		  union.toSetString();
	
		  IntegerSet intersección = pares.intersecciónDeIntegers(nones);
		  System.out.print("intersección: ");
		  intersección.toSetString();

	  }

	 
}