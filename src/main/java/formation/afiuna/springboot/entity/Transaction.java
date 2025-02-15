package formation.afiuna.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    private int id;
    private double accountId;
    private User destination;
    private User reciever;
}
