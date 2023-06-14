package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class SaleHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Sale>> {

    @Override
    public EntityModel<Sale> process(EntityModel<Sale> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/보류")
                .withRel("보류")
        );

        return model;
    }
}
