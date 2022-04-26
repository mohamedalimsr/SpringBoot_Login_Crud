package com.example.dali.service;

import java.util.List;
import java.util.Optional;

import com.example.dali.interfaceService.ICrudService;
import com.example.dali.interfaces.ICrud;
import com.example.dali.modelo.Crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CrudService implements ICrudService {
    @Autowired
    private ICrud data;
    @Override
    public List<Crud> list() {
        // TODO Auto-generated method stub
        return (List<Crud>)data.findAll();
    }

    @Override
    public Optional<Crud> list(int id) {
        // TODO Auto-generated method stub
        return data.findById(id);
    }

    @Override
    public int save(Crud p) {
        int res=0;
        Crud crud =data.save(p);
        if(!crud.equals(null)){
            res=1;
        }
        // TODO Auto-generated method stub
        return res;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        data.deleteById(id);

    }
    public Crud get(int id) {
        return data.findById(id).get();
    }
    public List<Crud> findByName(String name) {
		// TODO Auto-generated method stub
		return  data.findByNameLike("%"+name+"%");
	}

}
