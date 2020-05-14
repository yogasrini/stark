package Firstselanium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class reading {

	public static void main(String[] args)throws Exception {
		FileReader yo=new FileReader ("D:/my wok/Selanium/welcome/wel");
		Scanner sc=new Scanner(yo);
		while (sc.hasNext())
		{
			System.out.println(sc.next());
		}
		//BufferedReader	ga=new BufferedReader(yo);
		//String str="";
		//while ((str=ga.readLine()) !=null) {
			//System.out.println(str);
			
		//}
	}

}
