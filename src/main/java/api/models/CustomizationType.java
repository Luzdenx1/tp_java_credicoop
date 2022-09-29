package api.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="customizationType")
@Setter
@Getter
public class CustomizationType {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name="customization_id",referencedColumnName = "id")
    private Customization customization;
}
