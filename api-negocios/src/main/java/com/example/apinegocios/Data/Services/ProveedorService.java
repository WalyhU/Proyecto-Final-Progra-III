package com.example.apinegocios.Data.Services;

import com.example.apinegocios.Entities.Proveedor;

import java.util.List;

public interface ProveedorService {

    public List<Proveedor> findAll();
    public Proveedor findById(Long id);
    public void createStudent(Proveedor proveedor);
    public void updateStudent(Long id, Proveedor proveedor);
    public void deleteStudent(Long id);
}
