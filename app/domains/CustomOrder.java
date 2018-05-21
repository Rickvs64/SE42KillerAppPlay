package domains;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Order class, called 'CustomOrder' because Hibernate throws some strange error if it's called 'Order'.
 * Multiple orders belong to one Account. Account is the dominant class - and thus has the LIST property that manages all relevant orders.
 * The order class therefore does NOT have any connections to an Account of its own, that's all on Account's side.
 */
@Entity
public class CustomOrder {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    @Temporal(TemporalType.DATE)
    private Calendar date;

    // Db will have a column declaring owner account.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Account account;

    @ManyToMany(mappedBy = "orders")
    private List<Product> products = new ArrayList<>();

    /**
     * DO NOT USE!
     */
    public CustomOrder() {}   // Empty constructor to ensure JPA compatibility.
}
