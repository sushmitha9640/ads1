
class node
{
	String item;
	node next;
	
	public node(String item)
	{
		this.item=item;
	}
}
class LinkOperations
{
	node head=null, tail=null;
	public void insert(String s)
	{
		node n = new node(s);
		if(head==null && tail==null)
		{
			head=tail=n;
		}
		else
		{
			tail.next= n;
			tail=tail.next;		
		}
	}
	public void delete()
	{
		node temp = head;
		while(temp!=null)
		{
			if(temp.next.next==null) {
				temp.next=null;
				break;
			}
			temp=temp.next;
		}
	}
	public void display()
	{
		node tem = head;
		while(tem!=null)
		{
			System.out.println(tem.item);
			tem = tem.next;
		}
	}
}

public class LinkedList {
	
	public static void main(String[] args) {
		LinkOperations lo = new LinkOperations();
		node n = new node("Hai");
		lo.insert("JAVA");
		lo.insert("DBMS");
		lo.insert("C");
		lo.insert("Algorithms");
		lo.insert("Data structures");
		System.out.println("Before removal");
		lo.display();
		lo.delete();
		System.out.println("After removal");
		lo.display();
	}

}
