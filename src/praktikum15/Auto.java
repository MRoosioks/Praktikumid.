package praktikum15;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.ArrayList;

public class Auto {

	
	int x = 200;
	
	public Auto (int x) {
		
		this.x = x;
		
	}
	
	public static void main(String[] args) {
		GraphicsContext g;
		Auto auto = new Auto();
		auto.joonista();
		
		
	}

//	@Override
//	public void start(Stage primaryStage) {
//		primaryStage.setTitle("JavaFX-iga joonistamise nÃ¤ide");
//		Group root = new Group();
//		Canvas canvas = new Canvas(1600, 800);
//		GraphicsContext gc = canvas.getGraphicsContext2D();
//		joonista(gc);
//		root.getChildren().add(canvas);
//		primaryStage.setScene(new Scene(root));
//		primaryStage.show();
//	}

	private void joonista(GraphicsContext gc) {
		
//		// MÃ¤Ã¤rame vÃ¤rvid
//		gc.setFill(Color.GREEN);
//		gc.setStroke(Color.BLUE);
//
//		// Joone laius
//		gc.setLineWidth(5);
//
//		// Tegelase roheline pea
//		gc.fillRoundRect(50, 50, 300, 300, 40, 40);
//
//		// Suu
//		gc.strokeLine(100, 300, 300, 300);
//
//		// Silmad
//		gc.strokeOval(100, 100, 50, 50);
//		gc.strokeOval(250, 100, 50, 50);
//
//		// VÃ¤rvivahetus
//		gc.setFill(Color.RED);
//
//		// Punane nina
//		gc.fillRoundRect(175, 200, 50, 50, 10, 10);
//
//		gc.fillText("Olen roheline mehike Marsilt", 100, 370);
		
		
		
		gc.setStroke(Color.BLUE);
		gc.setFill(Color.BLACK);
		gc.setLineWidth(5);
		
		gc.strokeLine(x, x+50, x-50, x+125); // aken

		gc.strokeLine(x+50, x+50, x, x+50); // kabiini katus
		gc.fillOval(x+250, x+175, x-100, x-100);
		gc.fillOval(x+ 75, x+ 175, x-100, x-100);
		
		gc.setFill(Color.BLUE);
		gc.fillRect(x+50, x, x+150, x);
		
		gc.setFill(Color.AQUA);
		
		gc.fillRect(x-100, x+125, x-50, x-125);
	}
}
