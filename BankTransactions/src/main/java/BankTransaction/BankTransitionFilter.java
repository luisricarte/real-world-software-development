package BankTransaction;
@FunctionalInterface
public interface BankTransitionFilter {
    boolean test(BankTransaction bankTransaction);
}

