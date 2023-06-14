package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class AnswerInquiryCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String customerName;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String inquiry;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String answer;
}
