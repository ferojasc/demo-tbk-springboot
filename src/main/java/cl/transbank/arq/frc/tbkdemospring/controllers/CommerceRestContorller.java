package cl.transbank.arq.frc.tbkdemospring.controllers;


import cl.transbank.arq.frc.tbkdemospring.representation.Commerce;
import cl.transbank.arq.frc.tbkdemospring.representation.Sucursal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class CommerceRestContorller {

    @RequestMapping( path = "comercio/{rut}")
    public Commerce getCommerce (@PathVariable(name = "rut") String rut){
        return this.findCommerce(rut);
    }

    @RequestMapping ( path = "comercio/{rut}/sucursales" )
    public List<Sucursal> listSucursales(@PathVariable(name = "rut") String rut){
        return this.findSucursales(rut);
    }

    private List<Sucursal> findSucursales(String rut) {
        // todo: use database connection
        List<Sucursal> sucursals = new ArrayList<>();
        for ( int i =0 ; i<10 ; i++ ){
            Sucursal s = new Sucursal();
            s.setAddress( "Direccion #" +(i+2150) );
            s.setCode(String.valueOf(i));
            sucursals.add(s);
        }
        return sucursals;
    }


    private Commerce findCommerce(String rut) {
        // todo: send database object :)
        Commerce commerce = new Commerce();
        commerce.setId( "965120111" );
        commerce.setName( "Transbank S.A." );
        commerce.setRut( rut );
        return commerce;
    }



}
