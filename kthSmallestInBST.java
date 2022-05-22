
import java.util.ArrayList;
import java.util.List;

//insert operation in binary
//search tree
class BinarySearchTree {

	/* Class containing left
	and right child of current node
	* and key value*/
	class Node {
		int key;
		Node left, right;

		public Node(int item)
		{
			key = item;
			left = right = null;
		}
	}

	// Root of BST
	Node root;

	// Constructor
	BinarySearchTree() { root = null; }

	BinarySearchTree(int value) { root = new Node(value); }

	// This method mainly calls insertRec()
	void insert(int key) { root = insertRec(root, key); }

	/* A recursive function to
	insert a new key in BST */
	Node insertRec(Node root, int key)
	{

		/* If the tree is empty,
		return a new node */
		if (root == null) {
			root = new Node(key);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		/* return the (unchanged) node pointer */
		return root;
	}

	  public static int kthSmallest(Node root, int k) {
//        List to store the values of the nodes
       List<Integer> nodeValues = new ArrayList<>();
       // calling the  method to store the elements in ascending order
       findKthSmallestElement(root, nodeValues);
//       returning the element at the index so that we get kth smallest element
       return  nodeValues.get(k-1);
   }
   public static void findKthSmallestElement(Node root,List<Integer> nodeValues){
//     checking the base case if the root is equal to null or not.   
       if(root == null){
           return ;
       }
//        calling the method till the left is reached 
       findKthSmallestElement(root.left, nodeValues);
//        appending the values to the array list.
       nodeValues.add(root.key);
//        calling the right part.
       findKthSmallestElement(root.right, nodeValues);
   }
	// Driver Code
	public static void main(String[] args)
	{
		BinarySearchTree tree = new BinarySearchTree();

		/* Let us create following BST
			50
		/	 \
		30	 70
		/ \ / \
	20 40 60 80 */
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		System.out.println("The third smallest element is "+kthSmallest(tree.root, 3));
	}
}

