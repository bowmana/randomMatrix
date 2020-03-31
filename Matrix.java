/*Alex Bowman
 *Problem 14.7 
 *Professor Silvestri
 *3/30
 */
package randomMatrix;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Matrix extends Application {
	private static int HEIGHT = 250;
	private static int WIDTH = 250;

	public void start(Stage primaryStage) throws Exception {

		TextField[][] textField = new TextField[10][10];

		int[][] nums = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				textField[i][j] = new TextField();

			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				nums[i][j] = (int) (Math.random() * 2);
				String number = Integer.toString(nums[i][j]);

				textField[i][j].setText(number);
			}
		}
		GridPane grid = new GridPane();

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				grid.add(textField[i][j], i, j);
				grid.setMaxWidth(WIDTH);
				grid.setMaxHeight(HEIGHT);
			}
		}

		Scene scene = new Scene(grid);

		primaryStage.setTitle("10x10 Matrix");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
