package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private String productName;
    private String customerName;

    public OrderCanceled(Sale aggregate) {
        super(aggregate);
    }

    public OrderCanceled() {
        super();
    }
}
