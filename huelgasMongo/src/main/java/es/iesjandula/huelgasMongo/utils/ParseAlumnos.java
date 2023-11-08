package es.iesjandula.huelgasMongo.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
	
	public List<Alumno> parse (){
		
		List<Alumno> alumnos = new ArrayList<Alumno>();
		
		File file = new File(this.path);
		
		Scanner scanner = null;
		
		try
		{
			scanner = new Scanner(file);
			
			scanner.nextLine();
			
			while(scanner.hasNextLine()) {
				
				
				
			}
			
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return alumnos;
	}
	
	p
	
}
