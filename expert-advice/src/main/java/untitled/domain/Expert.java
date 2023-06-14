package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.ExpertAdviceApplication;

@Entity
@Table(name = "Expert_table")
@Data
public class Expert {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    private String fashionAdvice;

    private String productAdvice;

    public static ExpertRepository repository() {
        ExpertRepository expertRepository = ExpertAdviceApplication.applicationContext.getBean(
            ExpertRepository.class
        );
        return expertRepository;
    }
}
