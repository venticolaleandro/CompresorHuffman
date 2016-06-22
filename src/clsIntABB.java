
import paqueteBinario.*;

public class clsIntABB extends clsABB{
	
	/*public clsIntABB(){
		super();
	}
	*/
	
	public boolean iguales(Object nodeA, Object nodeB){
		boolean response=false;
		if (((Integer)nodeA).intValue()==((Integer)nodeB).intValue()){
			response=true;
		}		
		return response;
	}
	
	public boolean menor(Object nodeA, Object nodeB){
		boolean response=false;
		if (((Integer)nodeA).intValue()<((Integer)nodeB).intValue()){
			response=true;
		}
		return response;
	}
	
	public boolean mayor(Object nodeA, Object nodeB){
		boolean response=false;
		if (((Integer)nodeA).intValue()>((Integer)nodeB).intValue()){
			response=true;
		}
		return response;		
	}
	
	public void imprimir(Object node){
	System.out.println("Nodo " + node.toString());
		
	}	
}
