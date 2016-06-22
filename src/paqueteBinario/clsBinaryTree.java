package paqueteBinario;


public abstract class clsBinaryTree implements TADArbol{
	protected clsBinaryTreeNode root;
	
	
	public abstract void imprimir(Object nodeInfo);
	public abstract void meter(Object nodeInfo);
	public abstract boolean esta(Object nodeInfo);
	public abstract void sacar(Object nodeInfo);
	public abstract clsBinaryTreeNode devuelve(Object nodeInfo);
	
	public boolean estaVacio(){
		return (this.root==null);
	}
		
	public void vaciaArbol(){
		this.root=null;
	}
	

	public void inOrder(clsBinaryTreeNode node){
		if (node!=null){
			inOrder(node.getLeftChild());
			imprimir(node.getNodeInfo());
			inOrder(node.getRightChild());
		}
	}	

	
	
	
	public void preOrder(clsBinaryTreeNode node){
      // completar
	}
	
	
	public void postOrder(clsBinaryTreeNode node){
		// completar
	}	
	
	
	public void muestraInOrder(){
		inOrder(this.root);	
	}
	
	
	public void muestraPreOrder(){
		// completar
	}	

	
	public void muestraPostOrder(){
		// completar
	}
	
	
}
