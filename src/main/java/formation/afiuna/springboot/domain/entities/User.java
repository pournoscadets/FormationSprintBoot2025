package formation.afiuna.springboot.domain.entities;

import formation.afiuna.springboot.domain.entities.helper.Auditable;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
    
}
