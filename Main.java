import java.util.Scanner;               
import java.io.File;                    //for file operation
import java.io.FileNotFoundException;   //for file operation

//steps to solve problem:
//part 1 - calculate support of each product
//part 2 - compare support with threshold to see if purchasing product set is frequent
//part 3 - if support exceeds threshold, output frequent purchsing product set
//part 4 - if it does not exceed the threshold, then do nothing

public final class Main {
	   public static void main(String[] args)
	          throws FileNotFoundException {//"throws" declared here
//part 1 of solution
	      Scanner kbd = new Scanner(new File(input.txt));  // Scan input from text file
	      int supportthreshold;
	      Scanner threshold = new Scanner(System.in);
	      supportthreshold = threshold.nextInt();
	      
	      public static void calculatesupport(input.txt, supportthreshold){
	    
	    	  //calcuate support for each product in table
	    	  String s;
	    	  int i;
	    	  int counter = 0;

	      while ((s = in.readLine()) != null) {
	          i = Integer.parseInt(s);
	          for (int j = 0; j <= n; j++) {
	              if (i == Math.pow(10, j)) {
	                  counter++;
	                  out.write(Integer.toString(counter) + " " + Integer.toString(i) + "\n");
	              }
	              }
	          }
	      }
//part 2-4 of solution
	      //compare
	      if(input.txt(support of each product) > supportthreshold){
	    	  System.out.printf(//frequent purchased product sets);	    			      			  
	    			  }
	      else(System.out.printf("No frequent purchased product sets exceed the support threshold");
	      }
	   }
