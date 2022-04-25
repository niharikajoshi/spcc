import java.lang.*;
import java.io.*;
import java.util.*;

public class LeftFactoring{
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			File myFile = new File("left_recurs.txt");
			Scanner reader = new Scanner(myFile);
			while(reader.hasNextLine())
			{
				//ArrayList<String> alpha = new ArrayList<String>();
				ArrayList<String> beta = new ArrayList<String>();

				String  inp = reader.nextLine();
				String[] a = inp.split("=");
				String d = a[0].toString();
				String[] c =a[1].split("/");
				char b = c[0].charAt(0);
				for(int i=0;i<c.length;i++)
				{
					char tp = c[i].charAt(0);
					//String temp = Character.toString(tp);
					if(b==tp){
					char sub1 = b;
					String sub = c[i].substring(1);
					beta.add(sub);
					}
				}
				System.out.println();
				System.out.print(d + "->" + b + d + "'");
				System.out.println();
				System.out.print(d +"'" + "->");
				// for(int i=0;i<beta.size();i++){
				// 	System.out.println(beta.get(i));
				// }

				
				for(String j:beta){
					System.out.print(j + "/");

				}
			System.out.print("$");

			}
		}
		catch(Exception e){
			System.out.println("Error : " + e);
		}
	}
}