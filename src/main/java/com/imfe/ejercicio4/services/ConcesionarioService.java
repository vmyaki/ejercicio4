package com.imfe.ejercicio4.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.imfe.ejercicio4.model.Coche;

@Service
public class ConcesionarioService {
	
	public Coche service(String modelo){
		
		//Creamos array
		/*List <Coche> listaCoches= new ArrayList <Coche>();
		
		//Añadimos el objeto coche creado por defecto al array
		listaCoches.add(new Coche(modelo));*/
		
		Coche coche1=new Coche(modelo);
		return coche1;
	}


	

}




	
	
	