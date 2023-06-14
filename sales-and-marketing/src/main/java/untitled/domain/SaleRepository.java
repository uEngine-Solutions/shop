package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

@RepositoryRestResource(collectionResourceRel = "sales", path = "sales")
public interface SaleRepository
    extends PagingAndSortingRepository<Sale, String> {}
