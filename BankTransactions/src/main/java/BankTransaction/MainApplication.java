package BankTransaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class MainApplication {
    public static final String RESOURCE = "src/main/resources/";

    public static double calculateTotalAmount (final List<BankTransaction> bankTransactions) {
        double total = 0d;
        for(final BankTransaction bankTransaction : bankTransactions) {
            total += bankTransaction.getAmount();
        }
        return total;
    }

    public static List<BankTransaction> selectInMonth(final List<BankTransaction> bankTransactions, final Month month) {
        final List<BankTransaction> bankTransactionsInMonth = new ArrayList<>();

        for(final BankTransaction bankTransaction : bankTransactions) {
            if(bankTransaction.getDate().getMonth() == month) {
                bankTransactionsInMonth.add(bankTransaction);
            }
        }
        return bankTransactionsInMonth;
    }
    public static void main(String[] args) {
        try {
            final BankStatementCSVParser bankStatementCSVParser = new BankStatementCSVParser();

            if (args.length == 0) {
                System.err.println("Usage: java BankTransactionAnalyzerSimpleMonth <file-name>");
                return;
            }

            final String fileName = args[0];
            final Path path = Paths.get(RESOURCE + fileName);

            final List<String> lines = Files.readAllLines(path);
            final List<BankTransaction> bankTransactions = bankStatementCSVParser.parseLinesFrom(lines);

            System.out.println("The total for all transactions is: " + calculateTotalAmount(bankTransactions));
            System.out.println("Transactions in January: " + selectInMonth(bankTransactions, Month.JANUARY));
        } catch (IOException e) {
            System.err.println("Could not read the file: " + e.getMessage());
        }
    }
}
