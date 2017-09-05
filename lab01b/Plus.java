/**
  * Plus.java - prints stuff formatted just so.
  *
  * @author   Corey Caldwell
  * @version  1/22/2015
  */
  public class Plus
  {
      public static void main (String[] args)
      {
		System.out.println("This is a string literal.");
		System.out.println("This is a long String of output " +
							"which is broken into two Strings.");
		System.out.println(12+5);
		System.out.println("8 plus 5 is " + 8 + 5);
		System.out.println("8 plus 5 is " + (8 + 5));
		System.out.println(8 + 5 + " equals 8 plus 5.");
		System.out.println("\n\n\tSome handy escape sequences:\n");
		System.out.println("\tSequence:\tMeaning:");
		System.out.println("\t\\n\t\tline feed");
		System.out.println("\t\\t\t\ttab");
		System.out.println("\t\\\"\t\tdouble quote");
		System.out.println("\t\\\'\t\tsingle quote");
		System.out.println("\t\\\\\t\tbackslash");
		System.out.println("\n\t/\\\n       /  \\\n      /    \\\n      \\    /\n       \\  /\n\t\\/\n");
		System.out.println("Adding some Numbers:\n\t  1234\n\t  2345\n\t+ 3456\n\t------\n\t= 7035");
      }
  }