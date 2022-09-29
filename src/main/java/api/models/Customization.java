package api.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="customization")
@Setter
@Getter
public class Customization {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name="name")
    private String name;
    @OneToMany(mappedBy = "customization")
    private List<CustomizationType> customizationTypes;

    public Customization(){
        this.customizationTypes = new ArrayList<>();
    }

}
