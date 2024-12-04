package cap2;

import java.time.LocalDate;

public class BankTransaction {
  private final LocalDate date;
  private final double amount;
  private final String description;

  public BankTransaction(final LocalDate date, final double amount, final String description) {
    this.date = date;
    this.amount = amount;
    this.description = description;
  }

  public LocalDate getDate() {
    return date;
  }

  public double getAmount() {
    return amount;
  }
  public String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    return "BankTransaction{" +
    "date= " + date + 
    ", amount= " + amount +
    ", description= " + description + "}";
  }

  
}
