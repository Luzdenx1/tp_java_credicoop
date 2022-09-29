package api.models;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="seller")
@Setter
@Getter
public class Seller {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name="name")
    private String name;
}
