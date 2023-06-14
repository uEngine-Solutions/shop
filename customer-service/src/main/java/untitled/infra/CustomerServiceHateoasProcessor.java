package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class CustomerServiceHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<CustomerService>> {

    @Override
    public EntityModel<CustomerService> process(
        EntityModel<CustomerService> model
    ) {
        return model;
    }
}
