package org.obrii.mit.dp2021.luninleonid.leonidlunin.CRUD;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="data",path="data")
public interface StudentRepository extends PagingAndSortingRepository<Data,Long> {
    
    List<Data> findByName(@Param("name") String name);
    
}
