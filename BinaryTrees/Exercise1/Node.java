// Node needs data, and can have a left and/or right child
// Only thing inside the tree package can see this class (is nonpublic)
class Node {
	int data;
	Node leftChild;
	Node rightChild;
	
	// Create the constructor
	
	public Node(int data) {
		this.data = data;
	}
	
	public Node() {
		
	}
}
