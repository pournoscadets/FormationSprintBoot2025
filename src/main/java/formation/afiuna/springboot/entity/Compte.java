package formation.afiuna.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Compte {
    private Integer id;
    private int compteNumber;
    private double amount;
    private User user;
}
