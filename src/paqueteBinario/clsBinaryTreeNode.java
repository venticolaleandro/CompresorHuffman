package paqueteBinario;

public class clsBinaryTreeNode {
	private Object nodeInfo;
	private clsBinaryTreeNode leftChild, rightChild;
	public Object clsBinaryTreeNode;

	
	clsBinaryTreeNode(){
		setNodeInfo(null);
		setLeftChild(null);
		setRightChild(null);
	}

	clsBinaryTreeNode(Object nodeInfo){
		this(nodeInfo, null,null);
	}
	
	clsBinaryTreeNode(Object nodeInfo, clsBinaryTreeNode leftChild, clsBinaryTreeNode rightChild){
		setNodeInfo(nodeInfo);
		setLeftChild(leftChild);
		setRightChild(rightChild);
	}
	
	
	void setNodeInfo(Object nodeInfo){
		this.nodeInfo=nodeInfo;
	}
	
	Object getNodeInfo(){
		return this.nodeInfo;
	}
	
	void setLeftChild(clsBinaryTreeNode leftChild){
		this.leftChild=leftChild;
	}

	void setRightChild(clsBinaryTreeNode rightChild){
		this.rightChild=rightChild;
	}
	

	clsBinaryTreeNode getLeftChild(){
		return this.leftChild;
	}

	clsBinaryTreeNode getRightChild(){
		return this.rightChild;
	}	
}
