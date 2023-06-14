package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class AnsweredInquiry extends AbstractEvent {

    private String customerName;
    private String inquiry;
    private String answer;

    public AnsweredInquiry(CustomerService aggregate) {
        super(aggregate);
    }

    public AnsweredInquiry() {
        super();
    }
}
