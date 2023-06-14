package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

@RepositoryRestResource(collectionResourceRel = "experts", path = "experts")
public interface ExpertRepository
    extends PagingAndSortingRepository<Expert, String> {}
