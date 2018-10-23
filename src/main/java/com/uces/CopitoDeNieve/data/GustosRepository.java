package com.uces.CopitoDeNieve.data;

import com.uces.CopitoDeNieve.model.Gusto;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class GustosRepository {

    // 1) Dulce de leche         2) Cremas        3) Chocolates         4) Frutales

    private static final List<Gusto> ALL_GUSTOS = Arrays.asList(
            new Gusto(1, "Dulces de Leche", "Dulce de Leche c/ nuez"),
            new Gusto(1, "Dulces de Leche","Dulce de Leche c/ almendras"),
            new Gusto(1, "Dulces de Leche","Dulce de Leche granizado"),
            new Gusto(1, "Dulces de Leche","Dulce de Leche tentación"),
            new Gusto(2, "Cremas", "Crema del Cielo"),
            new Gusto(2, "Cremas", "Crema Chantilly"),
            new Gusto(2, "Cremas", "Crema de Almendras"),
            new Gusto(2, "Cremas", "Crema y vainilla"),
            new Gusto(3, "Chocolates","Chocolate Amargo"),
            new Gusto(3, "Chocolates","Chocolate Blanco"),
            new Gusto(3, "Chocolates","Chocolate con Almendras"),
            new Gusto(4, "Frutales","Frutilla al agua"),
            new Gusto(4, "Frutales","Limon al agua"),
            new Gusto(4, "Frutales","Quinotos al whisky"),
            new Gusto(4, "Frutales","Menta granizada")
    );

    public List<Gusto> getAllGustos()
    {
        return ALL_GUSTOS;
    }

    public Gusto findById(int id){
        for(Gusto gusto : ALL_GUSTOS){
            if(gusto.getId() == id){
                return gusto;
            }
        }
        return null;
    }

}
