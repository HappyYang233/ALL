class BinaryTree
{
	class Node
	{
		private Integer data;
		private Node left;
		private Node right;
		public Node(Integer data){
			this.data=data;
		}
		public void addNode(Node newNode)
		{
			if(newNode.data.compareTo(this.data)==-1)
			{
				if(this.left==null)
				this.left=newNode;
				else 
				this.left.addNode(newNode);
				
			}
			if(newNode.data.compareTo(this.data)>=0)
			{
				if(this.right==null)
				this.right=newNode;
				else
				this.right.addNode(newNode);
				
			}
			
		}
		public void printNode() {
			if(this.left!=null) {
				this.left.printNode(); 
			}
			System.out.println(this.data+"\t");
			if(this.right!=null)
			{
				this.right.printNode();
			}
		}
	}
	private Node root;
	public void add(Integer data)
	{
		Node newNode = new Node(data);
		if(root==null)
		{
			root=newNode;
		}
		else
		{
			root.addNode(newNode);
			
		}
				
	}
	public void print() {
		this.root.printNode();
	}
}
public class BinaryTreeDemo {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.add(1);
		bt.add(5);
		bt.add(6);
		bt.add(3);
		bt.add(7);
		bt.add(7);
		bt.add(9);
		bt.add(1);
		bt.print();
		
		 

	}
}
