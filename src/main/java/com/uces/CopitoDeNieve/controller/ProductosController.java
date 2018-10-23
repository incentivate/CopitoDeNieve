package com.uces.CopitoDeNieve.controller;

import com.uces.CopitoDeNieve.data.ProductosRepository;
import com.uces.CopitoDeNieve.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductosController {

    @Autowired
    ProductosRepository productosRepository;

    @RequestMapping(value = "/")
    public String getAllProductos(ModelMap modelMap){
        List<Producto> allProductos = productosRepository.getAllPoductos();
        modelMap.put("productos", allProductos);
        return "home";
    }

}
