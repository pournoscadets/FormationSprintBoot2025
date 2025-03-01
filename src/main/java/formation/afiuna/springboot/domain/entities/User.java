package formation.afiuna.springboot.domain.entities;

import formation.afiuna.springboot.domain.entities.helper.Auditable;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "users")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class User extends Auditable {
    
    @Column(name = "username", nullable = false, unique = false)
    private String username;
    
    //Zéro ou plusieurs instances de User ne peuvent être associé à une seule instance de Address
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_address", nullable = true)
    private Address address;

    @Override
    public String toString() {
        try {            
            return "Address: "+this.address.toString();
        } catch (Exception e) {            
            throw new RuntimeException(e);         
        }                
    }
}
