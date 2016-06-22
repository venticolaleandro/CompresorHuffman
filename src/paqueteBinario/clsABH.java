package paqueteBinario;

public abstract class clsABH extends clsBinaryTree{
	
	public abstract boolean iguales(Object nodeA, Object nodeB);
	public abstract boolean menor(Object nodeA, Object nodeB);
	public abstract boolean mayor(Object nodeA, Object nodeB);	
	
	void meter(Object node, boolean pos){
		clsBinaryTreeNode temp=this.root;
		clsBinaryTreeNode nodo=(clsBinaryTreeNode)node;
		if(pos){
			temp.setRightChild(nodo);
		}else{
			temp.setLeftChild(nodo);
		}	
	}
	
}
