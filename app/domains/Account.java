package domains;

import javax.persistence.*;

/**
 * Account class, contains login and internet info
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

    @OneToOne
    private Customer customer;

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
}
