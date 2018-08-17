package DataStructures.BinaryTree;
import java.util.Scanner;

public class BinaryTree {
	
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
		
		public BinaryTree()
		{
			//TODO Auto-generated constructor stub
			Scanner s=new Scanner(System.in);
			this.root= takeInput(s,null,false);
		}
		
		private Node takeInput(Scanner s, Node parent, boolean isLeftOrRight)
		{
			if(parent==null)
			{
				System.out.println("Enter data for root node" );
			}
			else
			{
				if(isLeftOrRight)
				{
					System.out.println("Enter data for left node ");
				}
				else
				{
					System.out.println("Enter data for right node");
				}
			}
			
			int nodedata=s.nextInt();
			Node node=new Node(nodedata, null,null);
			this.size++;
			
			boolean child=false;
			System.out.println("Do you have left child for " + nodedata);
			child=s.nextBoolean();
			if(child)
			{
				node.left=takeInput(s,node,true);
			}
			System.out.println("Do you have right child for " + nodedata);
			child=s.nextBoolean();
			if(child)
			{
				node.right=takeInput(s,node,false);
			}
			
			return node;
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
		
		public int size2()
		{
			return size2(this.root);
		}
		
		private int size2(Node node)
		{
			int counter=1;
			if(node.left==null || node.right==null)
				return counter;
			
			counter += size2(node.left);
			counter += size2(node.right);
			
			return counter;
			
		}
		
		public int height()
		{
			return height(this.root);
		}
		
		private int height(Node node)
		{
			if(node==null)
				return -1;
			
			int lheight =this.height(node.left);
			int rheight =this.height(node.right);
			
			return Math.max(lheight, rheight)+1;
		}
		
		public int max()
		{
			return this.max(this.root);
		}
	
		private int max(Node node)
		{
			if(node==null)
				return Integer.MIN_VALUE;
			int lmax=this.max(node.left);
			int rmax=this.max(node.right);
			
			return Math.max(node.data, Math.max(lmax, rmax));
		}
		
		public int min()
		{
			return this.min(this.root);
		}
	
		private int min(Node node)
		{
			if(node==null)
				return Integer.MAX_VALUE;
			int lmin=this.min(node.left);
			int rmin=this.min(node.right);
			
			return Math.min(node.data, Math.min(lmin, rmin));
		}
		
		public boolean find(int data)
		{
			return this.find(this.root,data);
		}
		
		private boolean find(Node node, int data)
		{
			if(node==null)
				return false;
			if(node.data==data)
				return true;
			else if(find(node.left,data))
				return true;
			else if(find(node.right,data))
				return true;
			else
				return false;
		}
		
		public void preorder()
		{
			System.out.print("Preorder =>");
			this.preorder(this.root);
			System.out.println();
		}
		
		private void preorder(Node node)
		{
			if(node==null)
				return;
			System.out.print(node.data + " ");
			preorder(node.left);
			preorder(node.right);
		}
		
		public void inorder()
		{
			System.out.print("Inorder =>");
			this.inorder(this.root);
			System.out.println();
		}
		
		private void inorder(Node node)
		{
			if(node==null)
				return;
			inorder(node.left);
			System.out.print(node.data + " ");
			inorder(node.right);
		}
		
		public void postorder()
		{
			System.out.print("Postorder =>");
			this.postorder(this.root);
			System.out.println();
		}
		
		private void postorder(Node node)
		{
			if(node==null)
				return;
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data + " ");
		}
		
		public void levelorder()
		{
			System.out.print("Levelorder =>");
			this.levelorder(this.root);
			System.out.println();
		}
		
		private void levelorder(Node node)
		{
			Queue<Node> queue=new java.util.LinkedList<>();
			queue.add(this.root);
			while(!queue.isEmpty())
			{
				Node rv=queue.remove();
				System.out.print(rv.data + " ");
				if(rv.left!=null)
					queue.add(rv.left);
				if(rv.right!=null)
					queue.add(rv.right);
			}
		}
		
		public int lca(int d1, int d2)
		{
			return this.lca(this.root, d1, d2).data;
		}
		
		private Node lca(Node node, int d1, int d2)
		{
			if(node==null)
				return null;
			
			if(node.data==d1 || node.data==d2)
				return node;
			
			Node llca=this.lca(node.left, d1, d2);
			Node rlca=this.lca(node.right, d1, d2);
			
			if(llca!=null & rlca!=null)
				return node;
			else if(llca!=null)
				return llca;
			else if(rlca!=null)
				return rlca;
			else
				return null;
		}
		
}