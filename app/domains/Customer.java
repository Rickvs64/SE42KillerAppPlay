package domains;

import javax.persistence.*;

/**
 * Customer class, contains mostly contact information.
 */
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String surname;

    private String postcode;
    private String address;
    private String city;
    private String country;




    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }





    /**
     * DO NOT USE!
     */
    public Customer() {}   // Blank constructor to ensure JPA compatibility.

    /**
     * Create a new customer with only essential information.
     */
    public Customer(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }

    /**
     * Create a new customer with all possible information.
     * @param firstname
     * @param surname
     * @param postcode
     * @param address
     * @param city
     * @param country
     */
    public Customer(String firstname, String surname, String postcode, String address, String city, String country) {
        this.firstname = firstname;
        this.surname = surname;
        this.postcode = postcode;
        this.address = address;
        this.city = city;
        this.country = country;
    }
}
