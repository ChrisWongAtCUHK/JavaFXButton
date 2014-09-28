package button;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class GridPaneButton extends Application {

    private static MainFrame mainFrame;

    public static MainFrame getMainFrame() {
        return mainFrame;
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("GridPaneButton");
       
        //Adding GridPane
        GridPane gridPane = new GridPane();
       
        // 2D array of Buttons with value of 5,5
        Button[][] btn = new Button[4][4];
       
        //Column is a vertical line and row is a horizontal line
        //Two FOR loops used for creating 2D array of buttons with values i,j
        for(int i=0; i<btn.length; i++){
                for(int j=0; j<btn.length;j++){
                       
                        //Initializing 2D buttons with values i,j
                        btn[i][j] = new Button("0");
                        btn[i][j].setPrefSize(50, 50);
                        btn[i][j].setStyle("-fx-base: white;-fx-background-radius:0px;-fx-focus-color: transparent;");
                        gridPane.add(btn[i][j], i, j);  
                        }
        }
        btn[1][1].setStyle("-fx-base: white;-fx-background-radius:0px;"
        		+ "-fx-border-width: 3 0 3 3; -fx-border-color: black;"
        		+ "-fx-focus-color: transparent;");				// no glow on selection
        
        btn[2][1].setStyle("-fx-base: white;-fx-background-radius:0px;"
        		+ "-fx-border-width: 3 3 3 0; -fx-border-color: black;"
        		+ "-fx-focus-color: transparent;");				// no glow on selection
        //Adding GridPane to the scene
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    public class MainFrame {
    	// Instance of scene root node
    	private Group root;
    	
    	private MainFrame(Group root) {
    		this.root = root;
    	}
    	
    	// Initializes game
    	public void startGame() {
    	}
    	
    }
    
    
 
}

