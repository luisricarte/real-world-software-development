package cap2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
// classe referente ao objeto padrão espero pela entrada das transações de banco. Um exemplo pode ser encontrado junto ao csv.
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

  @Override
  public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    return super.equals(obj);
  }

  @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    return super.hashCode();
  }
}
