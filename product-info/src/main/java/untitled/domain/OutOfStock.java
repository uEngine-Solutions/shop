package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class OutOfStock extends AbstractEvent {

    private Long id;

    public OutOfStock(Product aggregate) {
        super(aggregate);
    }

    public OutOfStock() {
        super();
    }
}
