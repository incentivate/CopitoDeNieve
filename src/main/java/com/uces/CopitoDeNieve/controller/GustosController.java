package com.uces.CopitoDeNieve.controller;

import com.uces.CopitoDeNieve.data.GustosRepository;
import com.uces.CopitoDeNieve.model.Gusto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GustosController {

    @Autowired // Dependency Injection (si no hay un repositorio ya creado, crea uno, sin necesidad de ningun constructor)
    private GustosRepository gustosRepository;

    @RequestMapping(value = "/gustos")
    // El ModelMap hace que los Objetos dentro de éste esten disponibles para la vista a renderizar
    public String gustos(ModelMap modelMap){
        List<Gusto> gustos = gustosRepository.getAllGustos();
        modelMap.put("gustos", gustos);
        return "gustos";
    }


    @RequestMapping(value = "/gustos/{id}")
    // El ModelMap hace que los Objetos dentro de éste esten disponibles para la vista a renderizar
    public String gusto(@PathVariable int id, ModelMap modelMap){
        Gusto gusto = gustosRepository.findById(id);
        modelMap.put("gusto", gusto);
        return "gustos";
    }

}
