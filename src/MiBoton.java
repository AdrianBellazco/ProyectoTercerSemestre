


import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Thread.sleep;
import javax.swing.JButton;


public class MiBoton extends JButton {

	float opacity = 0.5f;

	public MiBoton(String text) {
		super(text);
		addMouseListener(new EventButton());
	}

	public MiBoton() {
		super();
		addMouseListener(new EventButton());
	}
	public float getOpacity() {
		return opacity;
	}
	public void setOpacity(float opacity) {
		this.opacity = opacity;
		repaint();
	}
	@Override
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));
		super.paintComponent(g2);
	}


	public class EventButton extends MouseAdapter {
		@Override
		public void mouseExited(MouseEvent me) {
			efectHover(1f, 0.5f, 0.03f, 10, false);
		}
		@Override
		public void mouseEntered(MouseEvent me) {
			efectHover(0.5f, 1f, 0.03f, 10, true);
		}
		@Override
		public void mousePressed(MouseEvent me) {
			efectHover(1f, 0.6f, 0.1f, 1, false);
		}
		private void efectHover(float index, float range, float cont, int sleep, boolean event) {
			new Thread(() -> {
				for (float i = index; (event) ? i <= range : i >= range; i = (event) ? i + cont : i - cont) {
					setOpacity(i);
					try {
						Thread.sleep(sleep);
					} catch (InterruptedException e) {
					}

				}
			}).start();
		}
	}

}

