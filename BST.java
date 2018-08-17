package DataStructures.BinaryTree;    
public class BST {
    
	private class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data, Node left, Node right)
		{
			this.data=data;
			this.left=left;
			this.right=right;
		}
	}
	
	private Node root;
	private int size;
	
	BST()
	{
		this.root=null;
		this.size=0;
	}
	
	public void add(int data)
	{
		if(this.root==null)
		{
			this.root=new Node(data,null,null);
			this.size++;
		}
		
		else
			this.add(this.root, data);
	}
	
	private void add(Node node, int data)
	{
		if(data>node.data)
		{
			if(node.right!=null)
				this.add(node.right,data);
			else
			{
				node.right=new Node(data,null,null);
				this.size++;
			}
		}
		else if(data<node.data)
		{
			if(node.left!=null)
				this.add(node.left, data);
			else
			{
				node.left=new Node(data,null,null);
				this.size++;
			}
		}
		else
		{}
	}
	
	public void display()
	{
		this.display(this.root);
	}
	
	private void display(Node node)
	{
		if(node.left!=null)
			System.out.print(node.left.data + "=>");
		else
			System.out.print("END=>");
		
		System.out.print(node.data);
		
		if(node.right!=null)
			System.out.print("<=" + node.right.data);
		else
			System.out.print("<=END");
		
		System.out.println();
		
		if(node.left!=null)
			this.display(node.left);
		if(node.right!=null)
			this.display(node.right);
			
	}
	
	public int min()
	{
		if(this.root==null)
			return 0;
		else if(this.size==1)
			return this.root.data;
		else
			return this.min(this.root);
	}
	
	private int min(Node node)
	{
		if(node.left==null)
			return node.data;
		int lmin=this.min(node.left);
		return lmin;
	}
	
	public int max()
	{
		if(this.root==null)
			return 0;
		else if(this.size==1)
			return this.root.data;
		else
			return this.max(this.root);
	}
	
	private int max(Node node)
	{
		if(node.right==null)
			return node.data;
		int rmax=this.max(node.right);
		return rmax;
	}
	
	public void remove(int data)
	{
		this.root=this.remove(this.root, data);
	}
	
	private Node remove(Node node, int data)
	{
		if(node==null)
			return null;
		
		if(data>node.data)
		{
			node.right=this.remove(node.right, data);
			return node;
		}
		else if(data<node.data)
		{
			node.left=this.remove(node.left,data);
			return node;
		}
		else
		{
			if(node.left==null && node.right==null) //no child
			{
				this.size--;
				return null;
			}
			
			else if(node.left==null) 
			{
				this.size--;
				return node.right;
			}
			else if(node.right==null) 
			{
				this.size--;
				return node.left;
			}
			else 
			{
				int lmax=this.max(node.left);
				node.data=lmax;
				node.left=this.remove(node.left, lmax);
				this.size--;
				return node;
			}
			
		}
		
	}
    
	
}   