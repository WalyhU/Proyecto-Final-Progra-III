package com.example.apinegocios.Data.Controllers;

import com.example.apinegocios.Data.Services.ProveedorService;
import com.example.apinegocios.Entities.Proveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;
    @GetMapping
    public List<Proveedor> getProveedores() {
        return proveedorService.findAll();
    }

    @GetMapping("/{id}")
    public Proveedor getProveedor(@PathVariable Long id) {
        return proveedorService.findById(id);
    }

    @PostMapping
    public void createProveedor(@RequestBody Proveedor proveedor) {
        proveedorService.createProveedor(proveedor);
    }

    @PutMapping("/{id}")
    public void updateProveedor(@PathVariable Long id, @RequestBody Proveedor proveedor) {
        proveedorService.updateProveedor(id, proveedor);
    }

    @DeleteMapping("/{id}")
    public void deleteProveedor(@PathVariable Long id) {
        proveedorService.deleteProveedor(id);
    }

}
