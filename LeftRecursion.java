import java.lang.*;
import java.io.*;
import java.util.*;

public class LeftRecursion
{
	public static void main(String[] args)
	{
	try{
		Scanner sc = new Scanner(System.in);
		File myFile = new File("left_recurs.txt");
		Scanner reader = new Scanner(myFile);
		while(reader.hasNextLine())
		{
			ArrayList<String> alpha = new ArrayList<String>();
			ArrayList<String> beta = new ArrayList<String>();
			String inp = reader.nextLine();
			String[] a = inp.split("=");
			String b = a[0].toString();
			String[] c = a[1].split("/");
			for(int i = 0; i < c.length; i++)
			{
				char tp = c[i].charAt(0);
				String temp = Character.toString(tp);
				if(b.equals(temp))
				{
					String sub = c[i].substring(1);
					alpha.add(sub);
				}
				else
				{
					beta.add(c[i]);
				}
			}
			System.out.println();
			System.out.print(b + " -> ");
			for(String j : beta)
			{
				System.out.print(j + b + "'");
			} 
			
			System.out.println();
			System.out.print(b + "' -> ");
			for(String k : alpha)
			{
				System.out.print(k + b + "' " + "/");
			}
			System.out.print("$");
			System.out.println();
		}
		}

		catch(Exception e){
			System.out.println("Error : " + e);
		}
	}
}