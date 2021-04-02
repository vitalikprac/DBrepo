package org.obrii.mit.dp2021.luninleonid.leonidlunin.Spring;

import org.obrii.mit.dp2021.luninleonid.leonidlunin.CRUD.Data;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Leonid
 */
public interface SpringInterface extends CrudRepository<Data , Integer> {
    
}