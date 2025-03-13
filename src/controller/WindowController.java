package controller;

import java.util.Map;

import model.*;
import windows.WindowButtons;

public class WindowController {
	Alumno_AsignaturaDAO dao=new DBImplementation();
	
	public void visualizarPantalla() {
		WindowButtons ven = new WindowButtons(this);
		ven.setVisible(true);	
	}
	
	public boolean comprobarAsignatura(Asignatura a) {
		return dao.comprobarAsignatura(a);	
	}
	
	public Map<String, Alumno> showAlumnos() {
		return dao.showAlumnos();
	}
	
	public Map<Integer, Asignatura> showAsignaturasDNI() {
		return dao.showAsignaturasDNI();
	}
	
	public boolean insert(Asignatura a) {
		return dao.insert(a);
	}
	
	public boolean update(Asignatura a) {
		return dao.update(a);
	}

	public boolean delete(String nom) {
		return dao.delete(nom);
	}
}
