package praktikum11;

import java.applet.Applet;
import java.awt.*;

public class ValgeMustaks extends Applet {

	@Override
	public void paint(Graphics g) {

		int w = getWidth();
		int h = getHeight();

		double v2rviMuutus =(double) 255 / h;
		for (int i = 0; i < h; i++) {

			int v2rviKood = (int) (255 - i * v2rviMuutus);
			Color minuV2rv = new Color(v2rviKood, v2rviKood, v2rviKood);
			g.setColor(minuV2rv);

			g.drawLine(0, i, w, i);

		}

	}
}
