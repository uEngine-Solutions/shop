package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private String productName;
    private Integer quantity;
    private String customerName;
    private String address;
    private String email;
    private String phone;

    public OrderPlaced(Sale aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
