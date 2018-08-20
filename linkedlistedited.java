package Project1;

public class linkedlistedited {
	
	class Node 
	{
		long time;
		String data;
		Node next;
		
		Node(long time, String data, Node next)
		{
			this.time= time;
			this.data=data;
			this.next=next;
		}

	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public linkedlistedited()
	{
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	
	public int size()
	{
		return this.size;
	}
	
	public boolean isEmpty()
	{
		if(this.size==0)
			return true;
		else
			return false;
	}
	
	public void addLast(String data, long time)
	{
		Node node=new Node(time,data,null);
		if(this.isEmpty())
		{
			this.head=node;
			this.tail=node;
		}
		else
		{
			this.tail.next=node;
			this.tail=node;
		}
		this.size++;
	}
	
	private Node getNodeAt(int index) throws Exception
	{
		if(index<0 || index>=this.size)
		{
			throw new Exception("Invalid index");
		}
		Node temp=this.head;
		int c=0;
		while(c<index)
		{
			temp=temp.next;
			c++;
		}
		return temp;
	}
	
	public String getAt(int index) throws Exception
	{
		if(this.isEmpty())
			throw new Exception("Linked list is empty");
		if(index<0 || index>=this.size)
		{
			throw new Exception("Invalid index");
		}
		return this.getNodeAt(index).data;
	}
	
	public void removeFirst() throws Exception
	{
		if(this.isEmpty())
			throw new Exception("Linked list is empty");
		if(this.size==1)
		{
			this.head=null;
			this.tail=null;
		}
		else
		{
			this.head=this.head.next;
		}
		this.size--;
	}
	
	public void removeLast() throws Exception
	{
		if(this.isEmpty())
			throw new Exception("Linked list is empty");
		if(this.size==1)
		{
			this.head=null;
			this.tail=null;
		}
		else
		{
			Node nm1=this.getNodeAt(this.size-2);
			nm1.next=null;
			this.tail=nm1;
		}
		this.size--;
	}
	
	public void removeAt(int index) throws Exception
	{
		if(this.isEmpty())
			throw new Exception("Linked list is empty");
		if(index<0 || index>=this.size)
		{
			throw new Exception("Invalid index");
		}
		if(index==0)
			this.removeFirst();
		else if(index==this.size-1)
			this.removeLast();
		else
		{
			Node temp=this.getNodeAt(index-1);  
			temp.next=temp.next.next;
			this.size--;
		}
	}
	
	public void display()
	{
		Node temp=this.head;
		while(temp!=null)
		{
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
		System.out.println("END");
	}
	
	public long search(String data)
	{
		Node temp=this.head;
		while(temp!=null)
		{
			if(temp.data== data)
			{
				return temp.time;
			}
			temp=temp.next;
		}
		
		//System.out.println("Entry not found ");
		return 0;
	}
	
	public void removethis(String data) throws Exception
	{
		Node temp=this.head;
		int a=0;
		while(temp!=null)
		{
			if(temp.data== data)
			{
				this.removeAt(a);
			}
			temp=temp.next;
			a++;
		}
		
	}

}
