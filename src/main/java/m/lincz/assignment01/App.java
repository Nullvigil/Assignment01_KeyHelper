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
        
        //Number row
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        for (int j = 0; j < numbers.length; j++) {
            grid.add(createButton(numbers[j]), j, row);
        }
        row++;
        
        //Letter row 1
        String[] letters1 = {"Q", "W", "E", "R", "T", "Y", "U", "i", "O", "P"};
        for (int j = 0; j < letters1.length; j++) {
            grid.add(createButton(letters1[j]), j, row);
        }
        row++;
                
        //letter row 2
        String[] letters2 = {"A", "S", "D", "F", "G", "H", "J", "K", "L"};
        for (int j = 0; j < letters2.length; j++) {
            grid.add(createButton(letters2[j]), j, row);
        }
        row++;
        
        //letter row 3
        String[] letters3 = {"Z", "X", "C", "V", "B", "N", "M"};
        for (int j = 0; j < letters3.length; j++) {
            grid.add(createButton(letters3[j]), j, row);
        }
        row++;
                
        //misc row
        /*
        Button shiftBtn = ...
        
        Button spaceBtn = ...
        
        Button enterBtn = ...
        
        Button dotBtn = ...
        
        button commaBtn = ...
        
        button questionBtn = ...
        
        button exclamBtn = ...
        */
        
        var scene = new Scene(grid);
        stage.setTitle("Type Helper");
        stage.setScene(scene);
        stage.show();
    }
    
        
    private Button createButton(String text) {
        var btn = new Button(text);
        btn.setPrefSize(40, 40);
        btn.setOnAction(e -> System.out.println(text));
        return btn;
    }

    public static void main(String[] args) {
        launch();
    }

}