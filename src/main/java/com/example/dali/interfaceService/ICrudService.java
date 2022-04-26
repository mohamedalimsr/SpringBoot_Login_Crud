package com.example.dali.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.dali.modelo.Crud;

public interface ICrudService {
    public List<Crud>list();
    public Optional<Crud>list(int id);
    public int save(Crud p);
    public void delete(int id);
    public List<Crud> findByName(String name);
}
