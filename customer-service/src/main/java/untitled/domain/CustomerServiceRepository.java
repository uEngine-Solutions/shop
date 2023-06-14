package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "customerServices",
    path = "customerServices"
)
public interface CustomerServiceRepository
    extends PagingAndSortingRepository<CustomerService, String> {}
