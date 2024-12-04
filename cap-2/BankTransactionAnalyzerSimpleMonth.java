import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class BankTransactionAnalyzerSimpleMonth {
  public static final String RESOURCE = "./files/";
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try{
      final Path path = Paths.get(RESOURCE + args[0]);
      final List<String> lines = Files.readAllLines(path);
      final String month = scanner.nextLine();
      double total = 0d;
      scanner.close();

      for(final String line: lines) {
        final String[] columns = line.split(",");
        if(columns[0].substring(3,5).equals(month)){
          final double amount = Double.parseDouble(columns[1]);
          total += amount;
        }
      }
  
      System.out.println("The total for all transactions is: "+ total);
    } catch (IOException e) {
      System.err.println("Could not read the file "+ e.getMessage());
    }
    
  }
}

