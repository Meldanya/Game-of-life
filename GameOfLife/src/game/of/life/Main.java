package game.of.life;

import java.awt.*;
import java.awt.event.*;

public class Main extends Frame {
	/**
	 * Ignorera
	 */
	private static final long serialVersionUID = -7756878323926974220L;

	/**
	 * Bredd och h�jd p� f�nstret
	 */
	private int width = 447, height = 293;

	/**
	 * Frame, sj�lva f�nstret
	 */
	private Frame frame;

	/**
	 * Konstruktor, initierar f�nstret och ser till s� att 
	 * vi kan st�nga f�nstret
	 */
	public Main() {
		createWindow();

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
				System.exit(0);
			}
		});
	}

	/**
	 * Skapar f�nstret och l�gger till CellCanvasen till det
	 */
	private void createWindow() {
		frame = new Frame("Game of Life");

		frame.setSize(width, height);
		frame.setResizable(false);

		frame.add(new CellCanvas(width, height));

		frame.setLocation(windowLocation());

		frame.setVisible(true);
	}


	/**
	 * Ser till s� att f�nstret hamnar i mitten av sk�rmen
	 * @return Point med x- och y-v�rdet i 
	 */
	private Point windowLocation() {
		Point p = new Point();
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension scrnsize = tk.getScreenSize();

		p.setLocation((int)((scrnsize.width/2)-width/2), (int)((scrnsize.height/2)-height/2));

		return p;
	}


	/**
	 * Startar en instans av Main
	 * @param args argument att skicka till programmet, f�r n�rvarande st�ds inga argument
	 */
	public static void main(String[] args) {
		/** Create an instance of the class */
		new Main();
	}
}