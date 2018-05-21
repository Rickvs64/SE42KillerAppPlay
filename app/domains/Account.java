package domains;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Account class, contains login and online info
 */
@Entity
public class Account {

    @Id
    @GeneratedValue
    private Long id;


    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    // Will become customer_id.
    @ManyToOne
    private Customer customer;

    // Note that this method does NOT remove orphans. Orphaned orders should still exist in the db.
    @OneToMany(mappedBy = "account", cascade = CascadeType.PERSIST)
    private List<CustomOrder> orders = new ArrayList<>();


    /**
     * DO NOT USE!
     */
    public Account() {}    // Blank constructor to ensure JPA compatibility.

    /**
     * Constructor that defines all necessary information.
     * @param email
     * @param password
     */
    public Account(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /**
     * Constructor that defines all necessary information with a preexisting link to a customer.
     * @param email
     * @param password
     * @param customer
     */
    public Account(String email, String password, Customer customer) {
        this.email = email;
        this.password = password;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<CustomOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<CustomOrder> orders) {
        this.orders = orders;
    }
}
