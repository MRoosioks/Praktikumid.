package praktikum15;

import javafx.scene.canvas.GraphicsContext;

public class GraafilineAutosadu extends Autosadu {

	public GraafilineAutosadu(int autodeArv, GraphicsContext gc) {
		super(autodeArv, (int) gc.getCanvas().getWidth(), (int) gc.getCanvas().getHeight());
		for (Auto auto : autod) {
			.joonista(gc);
		}
	}

}
