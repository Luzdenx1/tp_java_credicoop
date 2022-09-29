package api.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="product")
@Setter
@Getter
public class Product {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private Integer price;
    @Column(name="description")
    private String description;
    @Column(name="fabricationTime")
    private String fabricationTime;
    @OneToMany
    private List<Customization> customizations;

    public Product(){
        this.customizations = new ArrayList<>();
    }
}
