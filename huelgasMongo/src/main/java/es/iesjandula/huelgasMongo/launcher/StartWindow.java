package es.iesjandula.huelgasMongo.launcher;

import java.awt.EventQueue;

import javax.swing.JFrame;
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
					JFrame initialWindow = new InitialWindow();
					initialWindow.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}
