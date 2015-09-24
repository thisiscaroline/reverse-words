import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class ReverseWords{
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("string.txt"));		
		Stack<String> list = new Stack<String>();
		
		while (sc.hasNext())
			list.push(sc.next());
		
		System.out.println();
		
		while (!list.isEmpty())
			System.out.println(list.pop());
		
		System.out.println();
		
	}
	
}