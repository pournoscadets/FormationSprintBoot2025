package formation.afiuna.springboot.domain.entities;

import java.util.Set;

import formation.afiuna.springboot.domain.entities.helper.Auditable;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
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
@Table(name = "address")
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class Address extends Auditable {

    @Column(name = "label", nullable = false, unique = true)
    private String label;

    // Une instance de la classe Address peut être liée à zero ou plusieurs instances de la classe User
    @OneToMany(mappedBy = "address", fetch = FetchType.EAGER)    
    private Set<User> users;

    @Override
    public String toString() {        
        return "Address [label=" + users.size() + "]";
    }
}
