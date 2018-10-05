package link;

class Node {
	private String data;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	private Node nextNode;
	public Node(String data)
	{
		this.data=data;
	}
	
}

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node("³µÍ·");
		Node A= new Node("A");
		Node B= new Node("B");
		Node C= new Node("C");
		root.setNextNode(A);
		A.setNextNode(B);
		B.setNextNode(C);
		print(root);
		
		
	}
	public static void print(Node root)
	{
		
		if(root.getNextNode()!=null)
		{
			System.out.println(root.getData());
			print(root.getNextNode());
		}
	}

}
