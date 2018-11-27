package com.uces.CopitoDeNieve.controller;

import com.uces.CopitoDeNieve.model.Gusto;
import com.uces.CopitoDeNieve.service.GustoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

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

    // Guardar un gusto (ADMIN)
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
    @RequestMapping(value = "/gustos/edit", method=RequestMethod.POST)
    // @PathVariable mapea el {id} del URL con el @PathVariable int id
    public String updateGustoById(@RequestParam(value="gustos") int id, @RequestParam(value="newCat") String catNombre, @RequestParam(value="newName") String newName){
        Gusto gusto = gustoService.findGustoById(id);
        gusto.setNombre(newName);
        if(catNombre.equals("Dulces de Leche")){
            gusto.setIdCategoria(1);
        }
        else if(catNombre.equals("Cremas")){
            gusto.setIdCategoria(2);
        }
        else if(catNombre.equals("Chocolates")){
            gusto.setIdCategoria(3);
        }
        if(catNombre.equals("Frutales")){
            gusto.setIdCategoria(4);
        }
        gusto.setCategoria(catNombre);
        gustoService.update(gusto);
        return "redirect:/gustos/edit";
    }

}
