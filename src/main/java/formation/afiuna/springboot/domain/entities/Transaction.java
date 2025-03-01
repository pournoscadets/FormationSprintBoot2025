package formation.afiuna.springboot.domain.entities;

import java.util.Set;

import formation.afiuna.springboot.domain.entities.helper.Auditable;
import formation.afiuna.springboot.domain.entities.helper.TransactionState;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transaction")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class Transaction extends Auditable {

    @Column(name = "transaction_identifier", nullable = false, unique = true)
    private String transactionIdentifier;

    @Column(name = "amount", nullable = false, unique = false)
    private Double amount;

    @Column(name = "transaction_type", nullable = false, unique = false)
    private TransactionState transactionState;

    @Column(name = "description", nullable = true, unique = false)
    private String description;

    @ManyToMany(mappedBy = "transactions")
    private Set<Account> account;
    
    // @Column(name = "sender", nullable = false, unique = false)
    // private String sender;

    // @Column(name = "receiver", nullable = false, unique = false)
    // private String receiver;
}
