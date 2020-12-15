package scaglia.luciano39464154;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Empresa {

	// completar la clase Empresa

	// si es necesraio agregue los metodos atributos y clases que crea que sea
	// conveniente
	private String nombre;
	private Integer id;
	private HashMap<Integer, Camion> flota;

	public Empresa(String nom) {
		this.id = -1;
		this.nombre = nom;
		this.flota = new HashMap<Integer, Camion>();
	}

	public void agregarCamion(Camion camion) {
		// se agrega uncamion el primer camion tiene como identificador 0 el el segundo
		// 1 2 3.4

		flota.put(id++, camion);
	}

	public Integer cantidadDeCamiones() {		
			return flota.size();		
	}

	public TreeSet<Camion> obtenerTiendascamionOrdenadoPorPatente() {

		return null;
	}

}
