package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.SalesAndMarketingApplication;
import untitled.domain.OrderCanceled;
import untitled.domain.OrderPlaced;

@Entity
@Table(name = "Sale_table")
@Data
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String productName;

    private Integer quantity;

    private String customerName;

    private String address;

    private String email;

    private String phone;

    @PostPersist
    public void onPostPersist() {
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static SaleRepository repository() {
        SaleRepository saleRepository = SalesAndMarketingApplication.applicationContext.getBean(
            SaleRepository.class
        );
        return saleRepository;
    }

    public void 보류() {
        //impl
        setStatus("보류");
        set보류(true);
    }
}
