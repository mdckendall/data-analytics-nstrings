import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(final String[] args) throws FileNotFoundException {
    final ArrayList<String> names = new ArrayList<>();
		final FileReader fr = new FileReader("names.txt");
		final Scanner fileScanner = new Scanner(fr);

  while (fileScanner.hasNext()) {
      names.add(fileScanner.nextLine());
    }
    
    final Scanner read = new Scanner(System.in); 
      
    int i = 0;
    while (i !=5) {
    System.out.println("Press 1 to learn about salary.");
    System.out.println("Press 2 to learn about the job.");
    System.out.println("Press 3 to learn about demand.");
    System.out.println("Press 4 to view current students.");
    System.out.println("Press 5 to quit.");
    i = read.nextInt();

    if(i == 1) {
      
    System.out.println("$98,345 average salary in South Florida!");
      
    } else if(i == 2) {
      
      System.out.println("US News - 100 Best Jobs!");
      
    } else if(i == 3) {
      
      System.out.println("Top 10 Forbes In-Demand Jobs!");
      
    } else if(i == 4) {
        System.out.println("Current Students:");
        for (final String s : names) {
          System.out.println(s);
        }
      }
    }
	}
}