package cap2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankStatementAnalyser {
    private static final String RESOURCE = "./files/";
    private static final BankStatementCSVParser bankStatementParser = new BankStatementCSVParser();
    public static void main(String[] args) {

      try{
        final Path path = Paths.get(RESOURCE + args[0]);
        final List<String> lines = Files.readAllLines(path);
        final String fileName =  args[0];
        double total = 0d;
    
    
        System.out.println("The total for all transactions is: "+ total);
      } catch (IOException e) {
        System.err.println("Could not read the file "+ e.getMessage());
      }
  
    }
}


