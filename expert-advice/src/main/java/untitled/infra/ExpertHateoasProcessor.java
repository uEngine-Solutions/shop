package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class ExpertHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Expert>> {

    @Override
    public EntityModel<Expert> process(EntityModel<Expert> model) {
        return model;
    }
}
