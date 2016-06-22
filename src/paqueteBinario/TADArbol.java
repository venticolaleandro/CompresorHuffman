
// interfaz para árbol binario. Debería ser la base común para binario, binario de búsqueda y balanceados.

package paqueteBinario;

public interface TADArbol {
		public void meter(Object nodeInfo);
		public boolean esta(Object nodeInfo);
		public void sacar(Object nodeInfo);
		public boolean estaVacio();
		public void vaciaArbol();
		public clsBinaryTreeNode devuelve(Object nodeInfo);

		public void preOrder(clsBinaryTreeNode node);
		public void inOrder(clsBinaryTreeNode node);
		public void postOrder(clsBinaryTreeNode node);
		
		// faltan operaciones como altura, cantidad de hojas, ....
		
		}	

