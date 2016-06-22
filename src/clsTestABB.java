
public class clsTestABB {
	public static void main(String[] args) {
		clsIntABB miArbol;
		
		miArbol = new clsIntABB();
		
		miArbol.meter(new Integer(10));
		
/*		
		miArbol.meter(new Integer(7));
		miArbol.meter(new Integer(5));
		miArbol.meter(new Integer(1));
		miArbol.meter(new Integer(6));
		miArbol.meter(new Integer(9));
*/
		
		miArbol.meter(new Integer(20));
		miArbol.meter(new Integer(15));
		miArbol.meter(new Integer(14));
		miArbol.meter(new Integer(30));
		miArbol.meter(new Integer(40));
		
		miArbol.muestraInOrder();
		System.out.println("***");
		
		miArbol.sacar(new Integer(10));
		miArbol.muestraInOrder();
		System.out.println("***");
	
	}

}
