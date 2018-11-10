
import java.util.Scanner;

class Student
{
	String name;
	double total;
	public Student(String name, double total)
	{
		this.name=name;
		this.total=total;
	}
}
class Node
{
	Student Value;
	int key;
	Node left,right;
	public Node(int key,Student value)
	{
		this.key=key;
		this.Value=value;
	}
}
class BST
{
	Node root;
	public void put(int key,Student value)
	{
		root = put(root,key,value);
	}
	private Node put(Node n,int key, Student value)
	{
		if(n==null)
			return n= new Node(key,value);
		if(value.total<n.Value.total)
		{
			n.left=put(n.left,key,value);
		}
		else if(value.total>n.Value.total)
		{
			n.right=put(n.right,key,value);
		}
		else
			n.Value=value;
		return n;
	}
	public void printInBetween(double i, double j)
	{
		printInBetween(root,i,j);
	}
	private void printInBetween(Node n,double i ,double j)
	{
		if(n!=null)
		{
				printInBetween(n.left,i,j);
				if(n.Value.total>=i && n.Value.total<=j)
					{System.out.println(n.Value.name);}
				printInBetween(n.right,i,j);
		}
	}
	public void printGreatest(double i)
	{
		printGreatest(root,i);
	}
	private void printGreatest(Node n,double i)
	{
		if(n!=null)
		{
				printGreatest(n.left,i);
				if(n.Value.total>=i && n.Value.total<=100)
					{System.out.println(n.Value.name);}
				printGreatest(n.right,i);
		}
	}
	public void printLess(double i)
	{
		printLess(root,i);
	}
	private void printLess(Node n,double i)
	{
		if(n!=null)
		{
				printLess(n.left,i);
				if(n.Value.total<=i)
					{System.out.println(n.Value.name);}
				printLess(n.right,i);
		}
	}
}
public class Solution {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		BST bst = new BST();
		String input1 = input.nextLine();
		int n = Integer.parseInt(input1);
		int i = 0 ;
		while(i<n)
		{
			String in = input.nextLine();
			String []data1 = in.split(",");
			Student st = new Student(data1[1],Double.parseDouble(data1[2]));
			bst.put(Integer.parseInt(data1[0]), st);
			i++;
		}
		String input2 = input.nextLine();
		int m = Integer.parseInt(input2);
		int j=0;
		while(j<m)
		{
			String out = input.nextLine();
			String [] data2 = out.split(" ");
			switch (data2[0])
			{
			case "BE":
				bst.printInBetween(Double.parseDouble(data2[1]),Double.parseDouble(data2[2]));
				break;
			case "GE":
				bst.printGreatest(Double.parseDouble(data2[1]));
				break;
			case "LE":
				bst.printLess(Double.parseDouble(data2[1]));
			}
			j++;
		}
	}

}
