package praktikum15;

import javafx.scene.canvas.GraphicsContext;

public class GraafilineAutosadu extends Autosadu {

	public GraafilineAutosadu(int autodeArv, GraphicsContext gc) {
		super(helvesteArv, (int) gc.getCanvas().getWidth(), (int) gc.getCanvas().getHeight());
		for (Lumehelves lumehelves : lumehelbed) {
			lumehelves.joonistaMind(gc);
		}
	}

}
