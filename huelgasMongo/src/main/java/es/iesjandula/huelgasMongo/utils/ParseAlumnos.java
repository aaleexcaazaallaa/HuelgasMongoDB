package es.iesjandula.huelgasMongo.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ParseAlumnos
{

	private String path;

	/**
	 * @param path
	 */
	public ParseAlumnos(String path)
	{
		this.path = path;
	}

	public Map<String, Alumno> parse()
	{

		Map<String, Alumno> alumnos = new TreeMap<String, Alumno>();

		File file = new File(this.path);

		Scanner scanner = null;

		try
		{
			scanner = new Scanner(file);

			scanner.nextLine();

			while (scanner.hasNextLine())
			{
				Alumno newAlumno = createAlumno(scanner.nextLine().split(";"));
				alumnos.put(newAlumno.getDni(), newAlumno);
			}

		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return alumnos;
	}

	public Alumno createAlumno(String[] parameters)
	{
		return new Alumno(parameters[0], parameters[1], parameters[2]);
	}

}
