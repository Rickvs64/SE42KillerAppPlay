package domains;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class Quiver extends Product {
    @Column
    private Integer arrowCount;

    public Quiver() {}
}
