package com.uces.CopitoDeNieve.controller;

import com.uces.CopitoDeNieve.model.Gusto;
import com.uces.CopitoDeNieve.service.GustoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class GustosController {
    @Autowired
    private GustoService gustoService; // es quien "habla" con la base de datos

    @RequestMapping(value = "/gustos")
    // El ModelMap hace que los Objetos dentro de éste esten disponibles para la vista a renderizar
    public String listGustos(ModelMap modelMap){
        List<Gusto> gustos = gustoService.findAll();
        modelMap.put("gustos", gustos);
        return "gustos";
    }

    // Agregar un gusto (ADMIN)
    @RequestMapping(value = "/gustos", method = RequestMethod.POST) public String addGusto(@ModelAttribute("gusto") Gusto gusto){ gustoService.save(gusto); return "redirect:/gustos"; }

    @RequestMapping(value = "/gustos/{id}")
    // El ModelMap hace que los Objetos dentro de éste esten disponibles para la vista a renderizar
    public String findGustoById(@PathVariable int id, ModelMap modelMap){
        Gusto gusto = gustoService.findGustoById(id);
        modelMap.put("gusto", gusto);
        return "gustos";
    }

//    //TODO: Crear una nueva vista que liste los gustos por categoria
//    @RequestMapping(value = "/gustos/{idCategoria}")
//    // El ModelMap hace que los Objetos dentro de éste esten disponibles para la vista a renderizar
//    public String findGustoByCategoria(@PathVariable int idCategoria, ModelMap modelMap){
//        List<Gusto> gustosByIdCategoria = gustoService.findByIdCategoria(idCategoria);
//        modelMap.put("gusto", gustosByIdCategoria);
//        return "gustos";
//    }

    // Borrar un Gusto
    @RequestMapping(value = "/gustos/{id}/delete", method = RequestMethod.DELETE)
    public String deleteGusto(Gusto gusto){
        gustoService.delete(gusto);
        return "redirect:/gustos";
    }

    // Formulario para agregar un gusto
    @RequestMapping(value="gustos/add")
    public String formNewGusto(Model model){
        // model hace que el gusto y sus atributos estén disponibles para usar en la vista TH con el attributeName correspondiente (parecido a ModelMap)
        model.addAttribute("gusto", new Gusto());
        return "form";
    }

}
