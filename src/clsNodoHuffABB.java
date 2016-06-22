import paqueteBinario.*;

public class clsNodoHuffABB extends clsABB {
	
	private int valor;
	private double peso;
	clsNodoHuffABB anterior;
	
	public clsNodoHuffABB(int valor, double peso, clsNodoHuffABB anterior) {
		this.valor=valor;
		this.peso=peso;
		this.anterior=anterior;
	};

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public clsNodoHuffABB getAnterior() {
		return anterior;
	}

	public void setAnterior(clsNodoHuffABB anterior) {
		this.anterior = anterior;
	}	
	
	public boolean iguales(Object nodeA, Object nodeB) {
		if(((clsNodoHuffABB)nodeA).getValor()==((clsNodoHuffABB)nodeB).getValor()){
			return true;
		}else{
			return false;
		}
	}

	public boolean menor(Object nodeA, Object nodeB) {
		if(((clsNodoHuffABB)nodeA).getValor()<((clsNodoHuffABB)nodeB).getValor()){
			return true;
		}else{
			return false;
		}
	}

	public boolean mayor(Object nodeA, Object nodeB) {
		if(((clsNodoHuffABB)nodeA).getValor()>((clsNodoHuffABB)nodeB).getValor()){
			return true;
		}else{
			return false;
		}
	}

	public void imprimir(Object nodeInfo) {
		// TODO Auto-generated method stub
		
	}
	
}
