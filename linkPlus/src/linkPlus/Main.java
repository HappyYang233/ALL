package linkPlus;



class Link{
	
	 class Node{
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
		public void add(Node newNode)
		{
			if(this.nextNode==null)
			{
				this.nextNode=newNode;
				
			}
			else
			{
				this.nextNode.add(newNode);
			}
		}
		public void print()
		{
			if(this.getNextNode()!=null)
			{
				System.out.println(this.data);
				this.getNextNode().print();
			}
			else {
				System.out.println(this.data);
			}
		}
		public boolean search(String data)
		{
			/*boolean flag;
			if(!this.getData().equals(data))
			{
				if(this.getNextNode()!=null)
			flag=this.getNextNode().search(data);
				else
				{
					if(this.getData().equals(data))
						flag=true;
					else
						flag=false;
				}
			}
			else {
				flag=true;
			}
			return flag;*/
	/**
	 * 另一种更好的写法
	 */
		if(this.getData().equals(data))
		{
			return true;
		}
		else
		{
			if(this.nextNode!=null)
			{
				return this.getNextNode().search(data);
			}
			else
			{
				return false;
			}
		}
		}
		public boolean delect(Node pre,String data)
		{
			/*
		  boolean flag=false;
			if(!this.data.equals(data))
			{
				if(this.getNextNode()!=null)
				flag=this.getNextNode().delect(this, data);
				else
					flag=false;
				
			}
			else
			{
				
				pre.setNextNode(this.nextNode);
				flag=true;
			}
			return flag;
		}*/
			if(this.data.equals(data))
			{
				pre.setNextNode(this.nextNode);
				return true;
			}
			else
			{
				if(this.nextNode!=null)
				{
					return this.getNextNode().delect(this, data);
				}
				else
				{
					return false;
				}
			}
		
	}
	 };
	private Node root;
	public boolean contains(String data)
	{
		/*boolean flag=false;
		/*if(this.root.getData().equals(data))
		{
			System.out.println("存在"+data);
			return true;
		}
		else
		{
			flag=this.root.getNextNode().search(data);
			
		}
		return flag;*/
		/**
		 * 更好的写法
		 */
		return this.root.search(data);
	
	}
	public void addNode(String data)
	{
		Node newNode= new Node(data);
		if(this.root==null)
		{
			this.root=newNode;
		}
		else
		{
			this.root.add(newNode);
		}
	}
	public void printlink()
	{
		if(this.root!=null)
		{
			this.root.print();
		}
		else
		{
			System.out.println("链表为空");
		
		}
	}
	//删除节点
	public boolean delect(String data)
	{
		if(this.contains(data))
		{
			if(this.root.data.equals(data))
			{
				this.root=this.root.nextNode;
				return true;
				
			}
			else
			{
				return this.root.getNextNode().delect(this.root,data);
			}
		}
		else
		{
			System.out.println("不存在这个节点");
			return false;
		}
	
	}
	
}

public class Main {
	public static void main(String[] args)
	{
		Link link = new Link();
		//添加节点
		link.addNode("a");
		link.addNode("b");
		link.addNode("c");
		link.addNode("d");
		link.addNode("e");
		link.addNode("f");
		//-------------
		link.printlink();//输出链表
		System.out.println(link.contains("f"));//查询链表中是否含有f节点
		System.out.println(link.delect("f"));//删除f节点，若不存在此节点则返回false
		link.printlink();//打印删除结果
		
		
		
	}
}
