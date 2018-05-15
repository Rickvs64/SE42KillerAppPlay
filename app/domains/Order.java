package domains;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    @Basic
    @Temporal(TemporalType.DATE)
    private Date date;
    
}
