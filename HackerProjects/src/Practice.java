import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Practice {

	static int B, H;
	static boolean flag = true;
	static {

	 Scanner sc = new Scanner(System.in);
	 B = sc.nextInt();
	 H = sc.nextInt();
	 sc.close();
	 try {
	  if (B <= 0 || H <= 0)
	   throw new Exception("Breadth and height must be positive");
	 } catch (Exception e) {
	  System.out.println(e);
	  System.exit(0);
	 }

	}
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}
        
        
        }
    

