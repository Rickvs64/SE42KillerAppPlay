package domains;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

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
