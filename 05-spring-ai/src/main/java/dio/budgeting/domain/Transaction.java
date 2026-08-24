package dio.budgeting.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Transaction {
    private TransactionId id;
    private UserId userId;
    private String description;
    private long amount;
    private Category category;

    public Transaction(UserId userId, String description, long amount, Category category) {
        if (userId == null) {
            throw new IllegalArgumentException("UserId cannot be null");
        }
        this.id = new TransactionId();
        this.userId = userId;
        this.description = description;
        this.amount = amount;
        this.category = category;
    }
}
