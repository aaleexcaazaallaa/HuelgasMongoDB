package es.iesjandula.huelgasMongo.utils;

public class Alumno
{

	private String nombre;
	private String dni;
	private String curso;
	/**
	 * @param nombre
	 * @param dni
	 * @param curso
	 */
	public Alumno(String nombre, String dni, String curso)
	{
		this.nombre = nombre;
		this.dni = dni;
		this.curso = curso;
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
	 * @return the dni
	 */
	public String getDni()
	{
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni)
	{
		this.dni = dni;
	}
	/**
	 * @return the curso
	 */
	public String getCurso()
	{
		return curso;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso)
	{
		this.curso = curso;
	}
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(nombre);
		builder.append(", ");
		builder.append(dni);
		return builder.toString();
	}
	
}
