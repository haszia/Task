package CodingTask.PrintDictionaryWord;
	import java.util.Random;
	public class PrintNthSmallNumber {

	          public static void main(String[] args) {

	          Random rnum = new Random();
	          int counter;
	          int[] numbers = new int[500];
	          int smallest = numbers[0];
	          for (counter = 1; counter <= 500; counter++) {
	          System.out.println(rnum.nextInt(500));
	           {
	             for(int i = 1;  i<numbers.length; i++) {

	                if(numbers[i]<smallest) {
	                     smallest = numbers[i];
	                 }
	          }
	           System.out.println("Smallest number is : " +smallest);
	        }
	     }
	  }
}
