package com.starter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.starter.models.Coche;

public class CocheService {
	
	//No sé por qué me pedía público esta lista.
	public List<Coche> cochebd;

	public CocheService() {
		this.cochebd = new ArrayList<Coche>();
	}

	public List<Coche> getCochebd() {
		return cochebd;
	}

	public void setCochebd(List<Coche> cochebd) {
		this.cochebd = cochebd;
	}
	
	public List<Coche> getAll(){
		return this.cochebd;
	}
	
	
	
	//MIXTO DE LOS DOS METODOS DE PROGRAMACION.
	
	//Implementación programacion funciona para conseguir la ID de la base de datos ficticia mediante programación funcional.
	
	public Optional<Coche> getById(Long id){
		return this.cochebd.stream().filter(x -> x.getId()== id).findFirst();
	}
	
	
	//Actualizar un coche mediante programación funcional
	public void updateCoche(Coche ch) {
		Optional<Integer> i = this.cochebd.stream().filter(x -> x.getId() == ch.getId()).map(x -> this.cochebd.indexOf(x)).findFirst();
		if(!i.isEmpty()) {
			this.cochebd.set(i.get(), ch);
		}
	}
	
	
	//Borrar un coche
	public void deleteCocheId(Long id) {
		int index = -1;
		for (Coche coche : this.cochebd) {
			if(coche.getId() == id) {
				index = this.cochebd.indexOf(coche);
			}
		}
		if(index >= 0) {
			this.cochebd.remove(index);
		}		
	}
	
	
	//Añadir un coche
	public void addCoche(Coche coche) {
		this.cochebd.add(coche);
	}
	
	

}
