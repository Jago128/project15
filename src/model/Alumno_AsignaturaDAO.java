package model;

import java.util.Map;

public interface Alumno_AsignaturaDAO {
	public boolean comprobarAsignatura(Asignatura a);
	public Map<String, Alumno> showAlumnos();
	public Map<Integer, Asignatura> showAsignaturasDNI();
	public boolean insert(Asignatura a);
	public boolean update(Asignatura a);
	public boolean delete(String nom);
}
