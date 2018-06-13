package domains;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Bow extends Product {
    @Column
    private Float drawSpeed;

    public Bow() {}
}
