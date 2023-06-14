package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.ProductInfoApplication;
import untitled.domain.OutOfStock;

@Entity
@Table(name = "Product_table")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    private String size;

    @ElementCollection
    private List<String> detailedImages;

    private String returnAndExchangePolicy;

    @PostPersist
    public void onPostPersist() {
        OutOfStock outOfStock = new OutOfStock(this);
        outOfStock.publishAfterCommit();
    }

    public static ProductRepository repository() {
        ProductRepository productRepository = ProductInfoApplication.applicationContext.getBean(
            ProductRepository.class
        );
        return productRepository;
    }
}
