/**
* File Name: Lesson 1.3 - Strings
* Author: Mr. Kalisz
* Date Created: Feb 8, 2023
* Date Last Modified: Feb 8, 2023
*/

class Notes  {
	public static void main(String args[]) {

		// Documentation/multi line comments

		/*
This is a multi line comment
HEre is a comment
This is a comment too
And this
And this
		*/ // The "*/" ended my multi comment

		/**
			* These are documentation
			*
			*
			*/
		
		// print - does not add a new line after the output

		System.out.print("Hello World");
		System.out.println("Hello World"); //println does add a new line after the output
		
		// newline character - "\n"

		System.out.println("Hello\n\n\n\nWorld");

		System.out.println("a" + "\n" + "b"); //must be used inside quotation marks otherwise the new line character does nothing
		
		// Strings

		String word;
		word = "Hello";

		System.out.println(word);
		System.out.println("word");

		//concatenation

		String word2;
		word2 = "Help Me";

		System.out.println(word + word2); //has no space between them
		System.out.println(word + " " + word2); //add a space concatenated inbetween the two variables to separate them.
		
	}
}
