package es.iesjandula.huelgasMongo.launcher;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import es.iesjandula.huelgasMongo.connections.MongoClientConnection;
import es.iesjandula.huelgasMongo.utils.Alumno;
import es.iesjandula.huelgasMongo.windows.InitialWindow;


public class StartWindow
{

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					MongoClientConnection mongo = new MongoClientConnection("mongodb+srv://admin:admin@cluster0.0j45czf.mongodb.net/?retryWrites=true&w=majority");
					JFrame initialWindow = new InitialWindow(mongo);
					initialWindow.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}
