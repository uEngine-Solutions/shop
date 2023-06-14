package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.CustomerServiceApplication;
import untitled.domain.AnsweredInquiry;

@Entity
@Table(name = "CustomerService_table")
@Data
public class CustomerService {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String customerName;

    private String inquiry;

    @PostPersist
    public void onPostPersist() {
        AnsweredInquiry answeredInquiry = new AnsweredInquiry(this);
        answeredInquiry.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static CustomerServiceRepository repository() {
        CustomerServiceRepository customerServiceRepository = CustomerServiceApplication.applicationContext.getBean(
            CustomerServiceRepository.class
        );
        return customerServiceRepository;
    }
}
