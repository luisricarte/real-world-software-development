package BankTransaction;
@FunctionalInterface
public interface BankTransitionFilter {
    boolean filterNeeded(BankTransaction bankTransaction);
}
