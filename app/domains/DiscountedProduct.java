package domains;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class DiscountedProduct extends Product {

    @Column
    private Float discountRatio = 0.0f;

    /**
     * DO NOT USE!
     */
    public DiscountedProduct() {}     // Empty constructor to ensure JPA compatibility.

}
