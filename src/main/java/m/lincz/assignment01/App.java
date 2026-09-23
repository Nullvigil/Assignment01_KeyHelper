package m.lincz.assignment01;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(10));
        
        
        int row = 0;
        /**
        //Number row
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        for (int j = 0; j < numbers.length; j++) {
            grid.add(createButton(numbers[j],""), j, row);
        }
        row++;
        **/
        //Letter row 1
        String[] letters1 = {"Q", "W", "E", "R", "T", "Y", "U", "i", "O", "P"};
        for (int j = 0; j < letters1.length; j++) {
            grid.add(createButton(letters1[j], ""), j, row);
        }
        grid.add(createButton("<-", ""), 10, row);
        row++;
                
        //letter row 2
        String[] letters2 = {"A", "S", "D", "F", "G", "H", "J", "K", "L"};
        for (int j = 0; j < letters2.length; j++) {
            grid.add(createButton(letters2[j], ""), j, row);
        }
        grid.add(createButton("Enter", "Big"), 9, row, 2, 1);
        row++;
        
        //letter row 3
        String[] letters3 = {"Z", "X", "C", "V", "B", "N", "M"};
        for (int j = 2; j < letters3.length + 2; j++) { //offset btns
            grid.add(createButton(letters3[j - 2], ""), j, row);
        }
        grid.add(createButton("Shift", "Big"), 0, row, 2, 1); 
        grid.add(createButton(".", ""), 9, row);
        grid.add(createButton(",", ""), 10, row);
        row++;
        
        grid.add(createButton("___", "Space"), 2, row, 8, 1);
        grid.add(createButton("?", ""), 9, row); //TODO: Combine , with ? when shift
        grid.add(createButton("!", ""), 10, row ); // TODO: Combine . with ! when shift
        
        //misc row
                

                

                
        
        
        
        
        
        
        var scene = new Scene(grid);
        stage.setTitle("Type Helper");
        stage.setScene(scene);
        stage.show();
    }
    
        
    private Button createButton(String text, String type) {
        var btn = new Button(text);
        if (type == "Big") {
            btn.setPrefSize(85, 40);
        }  else if (type == "Space") {
            btn.setPrefSize(305, 40);
        } else {
            btn.setPrefSize(40, 40);
        }
        btn.setOnAction(e -> System.out.println(text));
        return btn;
    }

    public static void main(String[] args) {
        launch();
    }
    
    //FOR USING ComboBox comboBox.setOnAction(event - >

}