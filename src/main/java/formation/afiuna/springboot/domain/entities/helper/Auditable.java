package formation.afiuna.springboot.domain.entities.helper;

import java.io.Serializable;
import java.time.Instant;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class Auditable implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @CreatedBy
    @Column(name = "created_by", nullable = true)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    protected String createdBy;

    @CreatedDate
    @Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    protected Instant createdAt = Instant.now();

    @LastModifiedDate
    @Column(name = "updated_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    protected Instant updatedAt = Instant.now();

    @LastModifiedBy
    @Column(name = "updated_by", nullable = true)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    protected String updatedBy;
}
