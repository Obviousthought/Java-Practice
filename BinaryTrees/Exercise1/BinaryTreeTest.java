import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void test() {
		BinaryTree tree = new BinaryTree();
		
		// add 50 nodes
		tree.add(50);
		// add 25 at the left child of the root
		tree.add(25);
		// add 75 as the right child
		tree.add(75);
		//add 10 (child of the 25 left child)
		tree.add(10);
		//add 30 (child of the 75 right child)
		tree.add(30);
		tree.add(60);
		tree.add(65);
		tree.add(80);
		tree.add(85);
		tree.add(1);
		tree.add(100);
		
	}
}
