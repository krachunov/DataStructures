package classWordTree;

import java.util.SortedSet;

public class BinaryTreeTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		BinaryTree<String> myBinaryTree;

		myBinaryTree = new BinaryTree<String>("*", 
				new BinaryTree<String>( "+",
									new BinaryTree<String>("3",null,null),
									new BinaryTree<String>("2",null,null)),
				new BinaryTree<String>("-", 
									new BinaryTree<String>("9",null,null),
									new BinaryTree<String>("6",null,null)));
		
		
	myBinaryTree.PrintIndentedPreOrder();

	
	}
	
}
