package com.example.apinegocios.Data.Services;

import com.example.apinegocios.Dao.ProveedorDao;
import com.example.apinegocios.Entities.Proveedor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProveedorServicelmpl implements ProveedorService {

    @Autowired
    private ProveedorDao proveedorDao;


    @Override
    public List<Proveedor> findAll() {
        return (List<Proveedor>) proveedorDao.findAll();
    }

    @Override
    public Proveedor findById(Long id) {
        return proveedorDao.findById(id).orElse(null);
    }

    @Override
    public void createStudent(Proveedor proveedor) {
        proveedorDao.save(proveedor);
    }

    @Override
    public void updateStudent(Long id, Proveedor proveedor) {
        if (proveedorDao.existsById(id)) {
            proveedor.setId(id);
            proveedorDao.save(proveedor);
        }
    }

    @Override
    public void deleteStudent(Long id) {
        if (proveedorDao.existsById(id)) {
            proveedorDao.deleteById(id);
        }
    }

}
