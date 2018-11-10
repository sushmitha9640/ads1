import java.util.Hashtable;
import java.util.Scanner;
class Stud
{
	String name;
	double total;
	public Stud(String name, double total)
	{
		this.name=name;
		this.total=total;
	}
}
public class Solution {
	public static void main(String[] args) {
		int count = 0 ;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Hashtable<Integer,Stud> hst = new Hashtable<Integer,Stud>();
		String input1 = input.nextLine();
		int n = Integer.parseInt(input1);
		while(count<n)
		{
			String in = input.nextLine();
			String []data = in.split(",");
			Stud st = new Stud(data[1],Double.parseDouble(data[2]));
			hst.put(Integer.parseInt(data[0]), st);
			count++;
		}
		String input2 = input.nextLine();
		int m = Integer.parseInt(input2);
		int i = 0 ;
		while(i<m)
		{
			String input3 = input.nextLine();
			String []data=input3.split(" ");
			if(!hst.containsKey(Integer.parseInt(data[1])))
			{
				System.out.println("Student doesn't exists...");
			}
			else if(Integer.parseInt(data[2])==1)
			{
				Stud stu = hst.get(Integer.parseInt(data[1]));
				System.out.println(stu.name);
			}
			else if(Integer.parseInt(data[2])==2)
			{
				Stud stu = hst.get(Integer.parseInt(data[1]));
				System.out.println(stu.total);
			}	
			i++;
		}
	}
}