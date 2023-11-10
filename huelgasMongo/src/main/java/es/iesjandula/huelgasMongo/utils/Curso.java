package es.iesjandula.huelgasMongo.utils;

import java.util.Map;

public class Curso
{

	private String nombre;
	private Map<String, Alumno> alumnos;
	/**
	 * @param nombre
	 * @param alumnos
	 */
	public Curso(String nombre, Map<String, Alumno> alumnos)
	{
		this.nombre = nombre;
		this.alumnos = alumnos;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre()
	{
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	/**
	 * @return the alumnos
	 */
	public Map<String, Alumno> getAlumnos()
	{
		return alumnos;
	}
	/**
	 * @param alumnos the alumnos to set
	 */
	public void setAlumnos(Map<String, Alumno> alumnos)
	{
		this.alumnos = alumnos;
	}
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(nombre);
		return builder.toString();
	}
	
	
	
}
