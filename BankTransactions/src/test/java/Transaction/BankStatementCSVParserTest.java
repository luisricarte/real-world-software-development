package Transaction;

import BankTransaction.BankStatementCSVParser;
import BankTransaction.BankTransaction;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class BankStatementCSVParserTest {
    private final BankStatementCSVParser statementCSVParser = new BankStatementCSVParser();

    @Test
    public void shouldParseFail() throws Exception {
        Assert.fail("Not yet Implemented");
    }

    @Test
    public void shouldParseOneCorrectLine() throws Exception {
        final String line = "30-01-2017,-50,Tesco";

        final BankTransaction result = statementCSVParser.parseFromCSV(line);
        final BankTransaction expected = new BankTransaction(LocalDate.of(2017, Month.JANUARY, 30), -50, "Tesco");
        final double tolerance = 0.0d;

        Assert.assertEquals(expected.getDate(), result.getDate());
        Assert.assertEquals(expected.getAmount(), result.getAmount(),tolerance);
        Assert.assertEquals(expected.getDescription(), result.getDescription());
    }

    @Test
    public void shouldParseOneCorrectLineDebit() throws Exception {
        final String line = "31-12-2020,310,Debit";

        final BankTransaction result = statementCSVParser.parseFromCSV(line);
        final BankTransaction expected = new BankTransaction(LocalDate.of(2020, Month.DECEMBER, 31), 310, "Debit");
        final double tolerance = 0.0d;

        Assert.assertEquals(expected.getDate(), result.getDate());
        Assert.assertEquals(expected.getAmount(), result.getAmount(),tolerance);
        Assert.assertEquals(expected.getDescription(), result.getDescription());
    }
}
