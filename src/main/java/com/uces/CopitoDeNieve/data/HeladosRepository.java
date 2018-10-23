package com.uces.CopitoDeNieve.data;

import com.uces.CopitoDeNieve.model.Gusto;
import com.uces.CopitoDeNieve.model.Helado;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component // Para que el AutoWired del controlador sepa que esto es un componente de Spring y lo pueda auto-linkear
public class HeladosRepository {

    private static final List<Helado> ALL_HELADOS = Arrays.asList(
            new Helado("cucurucho", 1, 75),
            new Helado("vaso", 2, 50),
            new Helado("medio", 3, 150),
            new Helado("kilo", 4, 220)
    );

    public Helado findByTipo(String type){
        for(Helado helado : ALL_HELADOS){
            if(helado.getTipo().equals(type)){
                return helado;
            }
        }
        return null;
    }

    public List<Helado> findByGusto(int id){
        List<Helado> helados = new ArrayList<>();
        for (Helado helado : ALL_HELADOS){
            if(helado.getIdGusto() == id){
                helados.add(helado);
            }
        }
        return helados;
    }

    public List<Helado> getAllHelados(){
        return ALL_HELADOS;
    }

}
