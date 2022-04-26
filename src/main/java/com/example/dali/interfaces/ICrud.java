package com.example.dali.interfaces;

import java.util.List;

import com.example.dali.modelo.Crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ICrud extends CrudRepository <Crud,Integer> {
    List<Crud> findByNameLike(String name);
}
