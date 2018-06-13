package domains;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.INTEGER, name = "product_type", columnDefinition = "TINYINT(1)")
public abstract class Product {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private Float price;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable
    private List<CustomOrder> orders = new ArrayList<>();


    /**
     * DO NOT USE!
     */
    public Product() {}     // Empty constructor to ensure JPA compatibility.
}
