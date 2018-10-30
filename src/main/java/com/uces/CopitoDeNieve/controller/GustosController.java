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

    // Lista los modales de los gustos
    @RequestMapping(value = "/gustos")
    // El ModelMap hace que los Objetos dentro de éste esten disponibles para la vista a renderizar
    public String listAllGustos(ModelMap modelMap){
        List<Gusto> gustos = gustoService.findAll();
        modelMap.put("gustos", gustos);
        return "gustos";
    }

    // Agregar un gusto (ADMIN)
    @RequestMapping(value = "/gustos", method = RequestMethod.POST)
    public String addGusto(@ModelAttribute("gusto") Gusto gusto){
        gustoService.save(gusto);
        return "redirect:/gustos";
    }

    @RequestMapping(value = "/gustos/{id}")
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

    // Formulario para agregar un gusto
    @RequestMapping(value="gustos/add")
    public String formNewGusto(Model model){
        // model hace que el gusto y sus atributos estén disponibles para usar en la vista TH con el attributeName correspondiente (parecido a ModelMap)
        model.addAttribute("gusto", new Gusto());
        return "addGusto";
    }

    // Mostrar las opciones de Gustos que hay para borrar
    @RequestMapping(value = "/gustos/delete")
    public String deleteGusto(ModelMap modelMap){
        List<Gusto> allGustos = gustoService.findAll();
        modelMap.put("gustos", allGustos);
        return "deleteGusto";
    }

    // Borrar un Gusto por ID
    @RequestMapping(value = "/gustos/{id}/delete", method = RequestMethod.POST)
    // @PathVariable mapea el {id} del URL con el @PathVariable int id
    public String deleteGustoById(@PathVariable int id, ModelMap modelMap){
        Gusto gusto = gustoService.findGustoById(id);
        modelMap.put("gusto", gusto);
        gustoService.delete(gusto);
        return "redirect:/gustos/delete";
    }

    // Actualizar un Gusto por ID
    @RequestMapping(value = "/gustos/edit")
    // @PathVariable mapea el {id} del URL con el @PathVariable int id
    public String updateGusto(ModelMap modelMap){
        //modelMap.put("gusto", gustoService.findGustoById(id));
        modelMap.put("gustos", gustoService.findAll());
        return "updateGusto";
    }

    // Borrar un Gusto por ID
    @RequestMapping(value = "/gustos/{id}/edit/{newName}/{newIdCat}", method = RequestMethod.PUT)
    // @PathVariable mapea el {id} del URL con el @PathVariable int id
    public String updateGustoById(@PathVariable("id") int id, @PathVariable("newIdCat") int newIdCat, @PathVariable("newName") String newName){
        Gusto gusto = gustoService.findGustoById(id);
        gusto.setNombre(newName);
        gusto.setIdCategoria(newIdCat);
        gustoService.update(gusto);
        return "redirect:/gustos/edit";
    }

}
