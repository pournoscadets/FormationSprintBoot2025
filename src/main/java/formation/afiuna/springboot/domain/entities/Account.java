package formation.afiuna.springboot.domain.entities;

import java.util.Set;

import formation.afiuna.springboot.domain.entities.helper.Auditable;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
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
@Table(name = "account")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class Account extends Auditable {

    @Column(name = "account_number", nullable = false, unique = true)
    private String accountNumber;

    @Column(name = "balance", nullable = false)
    private Double balance;

    @OneToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Transaction> transactions;

    @Override
    public String toString() {        
        return "Account [accountNumber=" + accountNumber + ", balance=" + balance +", user=" + user + "]";
    }
}
