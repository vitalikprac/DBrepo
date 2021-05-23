/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.luninleonid.LeonidLunin.repository;

import org.obrii.mit.dp2021.luninleonid.LeonidLunin.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Leonid
 */
@RepositoryRestResource(collectionResourceRel = "student", path="student")
public interface StudentRepository extends JpaRepository<Student,Integer>{
    
}