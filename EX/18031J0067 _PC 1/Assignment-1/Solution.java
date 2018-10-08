
import java.util.LinkedList;
import java.util.Scanner;
class Node1
{
	int data;
	Node1 next;
	Node1(int a)
	{
		this.data=a;
		this.next=null;
	}
}
class list
{
	int size=0;
	Node1 Head;
	list()
	{
		Head=null;
	}
	public void addFirst(int a)
	{
		Node1 value=new Node1(a);
		size++;
		if(Head==null)
		{
			Head=value;
		}
		else
		{
			value.next=Head;
			Head=value;
		}
	}
	public void add(int a)
	{
		Node1 value=new Node1(a);
		size++;
		if(Head==null)
		Head=value;
		else
		{
			Node1 temp=Head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=value;
		}
		//System.out.print(Disp());
	}
	public int popend()
	{
		size--;
		Node1 temp=Head;
		if(Head==null)
		{
			int c=0;
			return c;
		}
		else
		{
		if(temp.next==null)
		{
			int b=temp.data;
			Head=null;
			return b;
		}
		else
		{
			//Node1 temp=Head;
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			int a=temp.next.data;
			temp.next=null;
			return a;
		}
		}
		
		
	}
	public String Disp()
	{
		Node1 temp1=Head;
		String s="";
		if(temp1==null)
		{
			return null;
		}
		else
		{
		while(temp1!=null)
		{
			s+=temp1.data;
			temp1=temp1.next;
			//System.out.println(temp1.data);
		}
		}
		//System.out.println("dis"+s);
		return s;
	}
}
class AddLargeNumbers {
    static Scanner sc=new Scanner(System.in);
    public static list numberToDigits(String number) {
    	String s=number;
    	list one=new list();
    	//System.out.println(s);
    	for(int i=0;i<s.length();i++)
    	{
    		int a=Character.getNumericValue(s.charAt(i));
    		one.add(a);
    		
    	}
    	//System.out.println(one.Disp());
		return one;

    }

    public static String digitsToNumber(list result) {
    	//System.out.println(result.Disp());
    	Node1 temp1=result.Head;
		String s="";
		if(temp1==null)
		{
			return null;
		}
		else
		{
		while(temp1!=null)
		{
			s+=temp1.data;
			temp1=temp1.next;
			//System.out.println(temp1.data);
		}
		}
		//System.out.println("dis"+s);
		return s;
    }
}

 