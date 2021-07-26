package com.restconcept.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.restconcept.modal.BooksDb;

public interface MyJPARepo extends JpaRepository<BooksDb, Integer>
{

}
