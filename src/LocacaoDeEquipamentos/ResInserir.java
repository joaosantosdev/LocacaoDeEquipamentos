package LocacaoDeEquipamentos;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ResInserir extends Application {
    private static Stage stage;
    
    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("view/FXMLResInserir.fxml"));
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setResizable(true);
        stage.setTitle("Inserir reserva");
        stage.show();
        setStage(stage);
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
    public static Stage getStage(){
        return stage;
    }
    public static void setStage(Stage stage2){
        stage = stage2;
    }
    
}
