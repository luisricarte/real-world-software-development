import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class BankTransactionAnalyzerSimple {
  public static final String RESOURCE = "./files/";
  public static void main(String[] args) {

    try{
      final Path path = Paths.get(RESOURCE + args[0]);
      final List<String> lines = Files.readAllLines(path);
      double total = 0d;
  
      for(final String line: lines) {
        final String[] columns = line.split(",");
        System.out.println(columns[1]);
        final double amount = Double.parseDouble(columns[1]);
        total += amount;
      }
  
      System.out.println("The total for all transactions is: "+ total);
    } catch (IOException e) {
      System.err.println("Could not read the file "+ e.getMessage());
    }

  }
}

