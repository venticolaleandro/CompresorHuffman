// implementa las operaciones insercion y eliminacion de nodos sobre un ABB. Sigue siendo abstracto

package paqueteBinario;

public abstract class clsABB extends clsBinaryTree{
		
	public abstract boolean iguales(Object nodeA, Object nodeB);
	public abstract boolean menor(Object nodeA, Object nodeB);
	public abstract boolean mayor(Object nodeA, Object nodeB);
	
	
	public void meter(Object nodeInfo){
		clsBinaryTreeNode temp, anterior;
		clsBinaryTreeNode node = new clsBinaryTreeNode(nodeInfo);
		
		if (estaVacio()){
			this.root=node;
		}else{
			temp=this.root;
			anterior=null;
			while (temp!=null){
				anterior=temp;
				if (mayor(temp.getNodeInfo(),nodeInfo)){
					temp=temp.getLeftChild();
				}else{
					temp=temp.getRightChild();
				}
			}
			
			if (menor(anterior.getNodeInfo(),nodeInfo)){
				anterior.setRightChild(node);
			}else{
				anterior.setLeftChild(node);
			}			
		}
		
	}

	
	private clsBinaryTreeNode devuelveNodo(Object nodeInfo){
		clsBinaryTreeNode node=null;
		boolean response=false;
		
		node=this.root;
		while (node!=null && !response){
			if (iguales(node.getNodeInfo(),nodeInfo)){
				response=true;
			}else {
				if (mayor(node.getNodeInfo(),nodeInfo)){
					node=node.getLeftChild();
				}else {
					node=node.getRightChild();
				}
			}
		}	
		return node;
	}
	

	public boolean esta(Object nodeInfo){
		clsBinaryTreeNode node;
		boolean response=false;
		if (!estaVacio()){
			node=devuelveNodo(nodeInfo);
			if (node!=null){
				response=true;
			}			
		}else{
			System.out.println("Error esta. arbol vacio...");
		}		
		return response;
	}
	
	
	public clsBinaryTreeNode devuelve(Object nodeInfo){
		clsBinaryTreeNode node=null;
		
		if (!estaVacio()){
			node=devuelveNodo(nodeInfo);			
			if (node==null){
				System.out.println("Error devuelve. No esta...");
			}			
		}else{
			System.out.println("Error devuelve. arbol vacio...");
		}		
		return node;
	}
		
	
	
	public void sacar(Object nodeInfo){
		clsBinaryTreeNode temp,anterior, auxiliar;
		boolean response=false;
		
		if (!estaVacio()){
			if (esta(nodeInfo)){
				anterior=null;
				temp=this.root;
				
				while (temp!=null && !response){					
					if (iguales(temp.getNodeInfo(),nodeInfo)){
						response=true;
					}else {
						anterior=temp;
						if (mayor(temp.getNodeInfo(),nodeInfo)){
							temp=temp.getLeftChild();
						}else {
							temp=temp.getRightChild();
						}
					}					
				}
				
				if (temp.getLeftChild()==null && temp.getRightChild()==null){
					// el nodo a eliminar es hoja
					if (anterior==null){
						vaciaArbol();
					}else{
						if (anterior.getLeftChild()==temp){
							anterior.setLeftChild(null);
						}else{
							anterior.setRightChild(null);
						}
					}
				}else{
					if (temp.getLeftChild()!=null && temp.getRightChild()!=null){
						// el nodo a eliminar tiene dos hijos
						anterior=temp;
						auxiliar=temp.getLeftChild(); // tomo hijo izq del nodo a eliminar
						// y busco el mayor de los menores
						while (auxiliar.getRightChild()!=null){
							anterior=auxiliar;
							auxiliar=auxiliar.getRightChild();
						}
						temp.setNodeInfo(auxiliar.getNodeInfo());
						// el nodo a eliminar ahora toma el valor del mayor de los menores
						if (anterior==temp){
							anterior.setLeftChild(auxiliar.getLeftChild());
							// el nuevo hijo izq del nodo eliminado es su nieto izq
						}else{
							// el nuevo hijo derecho del padre del nodo "eliminado" es su nieto izq.
							anterior.setRightChild(auxiliar.getLeftChild());
						}				
						
					}else{
						// el nodo a eliminar tiene un hijo der
						if (temp.getRightChild()!=null){
							if (anterior==null){
								// nodo raiz con hijo der
								this.root=temp.getRightChild();
							}else{
								if (anterior.getRightChild()==temp){
									anterior.setRightChild(temp.getRightChild());
								}else{
									anterior.setLeftChild(temp.getRightChild());
								}
							}
						}else{
							if (anterior==null){
								// nodo raiz con hijo izq
								this.root=temp.getLeftChild();
							}else{
								if (anterior.getRightChild()==temp){
									anterior.setRightChild(temp.getLeftChild());
								}else{
									anterior.setLeftChild(temp.getLeftChild());
								}
							}
						}
					}
				}				
	
			}else{
				System.out.println("Error sacar. No esta elemento..");
			}
		}else{
			System.out.println("Error sacar. arbol vacio...");
		}
		
	}
	
}
