package gr11review.part2;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
    
    //Methods
    String str;
    int intcountnum;
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)); 

    System.out.println("enter sequence");
    str = keyboard.readLine();

    intcountnum= Utility.sumNumbers(str);
    System.out.println(intcountnum);

    ////File IO - Read 2
    String strfilename;
    String strword;

    System.out.println("enter file name");
    str = keyboard.readLine();

    strword= Utility.alphaWord(str);
    System.out.println(strword);

    //Array 2 - One Dimensional
    int[] nums;
    int value;

    System.out.println("enter array");
    nums = Integer.parseInt(keyboard.readLine());

    System.out.println("enter value");
    value = Integer.parseInt(keyboard.readLine());

    nums=Utility.notAlone(nums,value);
    System.out.println("[ "+nums+" ]");

    //Array 4 - One Dimensional - Two Loops
    int[] num;
    boolean split;

    System.out.println("enter array");
    num = Integer.parseInt(keyboard.readLine());

    split = Utility.canBalance(num);
    System.out.println("Can split in half? -->"+split);

    //Array 6 - Two Dimensional
    int n;

    System.out.println("enter n");
    n = Integer.parseInt(keyboard.readLine());

    Utility.diagonal(n);
  }
}
