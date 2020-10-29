package CodingTask.PrintDictionaryWord;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DictionaryWordPrint {
	

  public static void main(String[] args) throws IOException { 
  
  try { Scanner input = new Scanner(new File("Dictionary.txt")); 
  while (input.hasNext()) { 
	  String word = input.nextLine(); 
 for ( String Separated: word.split("[-,]+"))
  System.out.println(Separated); }
  
  
  
  } catch(FileNotFoundException e) { System.err.format("file does not found");
  } 
  }
  }
  
 