package com.uces.CopitoDeNieve.controller;

import com.uces.CopitoDeNieve.model.Gusto;
import com.uces.CopitoDeNieve.service.GustoService;
import com.uces.CopitoDeNieve.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class PedidoController {

    @Autowired
    private GustoService gustoService;
    @Autowired
    private ProductoService productoService;

    @RequestMapping(value="{gustos}/{name}/pedido", method = RequestMethod.POST)
    public String handleForm(@RequestParam(value="box") ArrayList gustosSeleccionados, @PathVariable(value="name") String
            tipoProducto, ModelMap modelMap){
        ArrayList<Gusto> selected = new ArrayList();
        for(Object id : gustosSeleccionados){
            String idGusto = id.toString();
            int gusto = Integer.parseInt(idGusto);
            selected.add(gustoService.findGustoById(gusto));
        }
        modelMap.put("seleccionados", selected);

        if(tipoProducto.equals("vasito")){
            modelMap.put("tipoProducto", tipoProducto);
        }
        else if(tipoProducto.equals("cucurucho")){
            modelMap.put("tipoProducto", tipoProducto);
        }
        else if(tipoProducto.equals("cuarto")){
            modelMap.put("tipoProducto", tipoProducto);
        }
        else if(tipoProducto.equals("medio")){
            modelMap.put("tipoProducto", tipoProducto);
        }
        else if(tipoProducto.equals("kilo")){
            modelMap.put("tipoProducto", tipoProducto);
        }

        return "pedido";
    }

}
