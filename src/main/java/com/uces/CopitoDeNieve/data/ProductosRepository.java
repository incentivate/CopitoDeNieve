package com.uces.CopitoDeNieve.data;

import com.uces.CopitoDeNieve.model.Producto;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductosRepository {

    private static final List<Producto> ALL_PRODUCTOS = Arrays.asList(
            new Producto("Vaso", 2, "Dejate tentar por nuestro helado servido en este crujiente vasito"),
            new Producto("Cucurucho", 2, "Disfruta hasta dos sabores del más sabroso helado en nuestro cucurucho"),
            new Producto("Cuarto", 2, "Disfruta de nuestro delicioso helado en nuestra versión de 1/4 Kg, solo para vos"),
            new Producto("Medio", 3, "Elegí hasta 3 sabores y disfruta de 1/2 Kg de nuestro delicioso helado"),
            new Producto("Kilo", 4, "Elegí hasta 4 sabores del helado más delicioso")
    );

    public List<Producto> getAllPoductos(){
        return ALL_PRODUCTOS;
    }
}
