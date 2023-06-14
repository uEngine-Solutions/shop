package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class PlaceOrderCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String productName;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer quantity;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String customerName;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String address;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String email;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String phone;
}
