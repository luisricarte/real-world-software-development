package BankTransaction;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankStatementProcessor {

    private final List<BankTransaction> bankTransactions;

    public BankStatementProcessor(final List<BankTransaction> bankTransactions) {
        this.bankTransactions = bankTransactions;
    }

    public double calculateTotalAmount() {
        double total = 0;
        for(final BankTransaction bankTransaction : bankTransactions) {
            total += bankTransaction.getAmount();
        }
        return total;
    }

    public double calculateTotalAmountInMonth(final Month month) {
        double total = 0;
        for (final BankTransaction bankTransaction : bankTransactions) {
            if(month == bankTransaction.getDate().getMonth()){
                total += bankTransaction.getAmount();
            }
        }
        return total;
    }

    public double calculateTotalForCategory(final String category) {
        double total = 0;
        for (final BankTransaction bankTransaction : bankTransactions) {
            if(bankTransaction.getDescription().equals(category)){
                total += bankTransaction.getAmount();
            }
        }
        return total;
    }

    public List<BankTransaction> getTransitionByValue(final double value) {
        final List<BankTransaction> transactions = new ArrayList<>();

        for(final BankTransaction bankTransaction : bankTransactions) {
            if(bankTransaction.getAmount() >= value) {
                transactions.add(bankTransaction);
            }
        }
        return transactions;
    }

    public List<BankTransaction> getTransitionByMonth(final Month month) {
        final List<BankTransaction> transactions = new ArrayList<>();

        for(final BankTransaction bankTransaction : bankTransactions) {
            if(bankTransaction.getDate().getMonth() == month) {
                transactions.add(bankTransaction);
            }
        }
        return transactions;
    }

    public List<BankTransaction> getTransitionByMonthValue(final Month month, final double value) {
        final List<BankTransaction> transactions = new ArrayList<>();

        for(final BankTransaction bankTransaction : bankTransactions) {
            if(bankTransaction.getDate().getMonth() == month && bankTransaction.getAmount() >= value) {
                transactions.add(bankTransaction);
            }
        }
        return transactions;
    }
}

