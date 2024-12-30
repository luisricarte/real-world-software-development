package BankTransaction;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankStatementProcessor {
    private final List<BankTransaction> bankTransactions;

    public BankStatementProcessor(final List<BankTransaction> bankTransactions) {
        this.bankTransactions = bankTransactions;
    }

    public double summarizeTransactions(final BankTransactionSummarizer bankTransactionSummarizer) {
        double result = 0;
        for(final BankTransaction bankTransaction : bankTransactions){
            result = bankTransactionSummarizer.summarize(result,bankTransaction);
        }
        return result;
    }
    public double calculateTotalInMonth(final Month month) {
        return summarizeTransactions(((accumulator, bankTransaction) ->
                bankTransaction.getDate().getMonth() == month ? accumulator + bankTransaction.getAmount() : accumulator));
    }
    public List<BankTransaction> findTransactions(final BankTransitionFilter bankTransitionFilter) {
        final List<BankTransaction> result = new ArrayList<>();
        for(final BankTransaction bankTransaction : bankTransactions) {
            if(bankTransitionFilter.test(bankTransaction)){
                result.add(bankTransaction);
            }
        }
        return result;
    }
    public List<BankTransaction> findTransitionsGreaterThanEqual(final int amount) {
        return findTransactions(bankTransaction -> bankTransaction.getAmount() >= amount);
    }

}

