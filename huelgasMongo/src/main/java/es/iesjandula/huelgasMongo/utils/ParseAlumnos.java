package es.iesjandula.huelgasMongo.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
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

	public Map<String, Curso> parse()
	{

		Map<String, Curso> cursos = new TreeMap<String, Curso>();
		Map<String, Alumno> alumnos = new TreeMap<String, Alumno>();

		File file = new File(this.path);

		Scanner scanner = null;

		try
		{
			scanner = new Scanner(file);

			scanner.nextLine();

			while (scanner.hasNextLine())
			{

				String[] parameters = scanner.nextLine().split(";");

				if (!cursos.containsKey(parameters[2]))
				{
					Curso newCurso = new Curso(parameters[2], new TreeMap<String, Alumno>());
					cursos.put(parameters[2], newCurso);
				}
				cursos.get(parameters[2]).getAlumnos().put(parameters[1], createAlumno(parameters));

			}

		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cursos;
	}

	public Alumno createAlumno(String[] parameters)
	{
		return new Alumno(parameters[0], parameters[1], parameters[2]);
	}

}
