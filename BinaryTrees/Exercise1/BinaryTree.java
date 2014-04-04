public class BinaryTree {
	// Node -> Key (data---stores info)
	// Nodes only have max 2 children (left child, right child)
	
	Node root;
	
	// add nodes to this binary tree
	public void add(int data) {
		Node nodeToAdd = new Node(data);
		// constructor was created so data can be passed in
		
		if (root == null) {
			root = nodeToAdd;
		}
		// if data < node, traverse left child, else traverse right child
		// until get a node that can no longer be traversed...then insert new node
		
		traverseAndAddNode(root, nodeToAdd);
		
		
	}
	
	private void traverseAndAddNode(Node node, Node nodeToAdd) {
		if (nodeToAdd.data < node.data) {
			if (node.leftChild == null){
				node.leftChild = nodeToAdd;
			} else {
			//recursively traverse
			traverseAndAddNode(node.leftChild, nodeToAdd);
			}
		} else if (nodeToAdd.data > node.data) {
			if (node.rightChild == null) {
				node.rightChild = nodeToAdd;
			} else {
			traverseAndAddNode(node.rightChild, nodeToAdd);
			}
		}
	}
}