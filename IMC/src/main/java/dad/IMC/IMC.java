package dad.IMC;

import javafx.application.Application;
import javafx.beans.binding.IntegerExpression;
import javafx.beans.binding.StringExpression;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IMC extends Application {
	
	private TextField Peso;
	private TextField Altura;
	private Label IMC;
	private Label IMC_Value;
	private Label tipo_IMC;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Peso=new TextField();
		Peso.setMaxWidth(100);
		
		Altura=new TextField();
		Altura.setMaxWidth(100);
		
		IMC= new Label("IMC:");
		
		tipo_IMC=new Label("Tipo:");
		
		IMC=new Label();
		
		VBox boot=new VBox();
		boot.setAlignment(Pos.CENTER);
		boot.getChildren().addAll(Peso, Altura, IMC,tipo_IMC);
		
		HBox root = new HBox(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(boot);
		
		Scene scen=new Scene(root,300,300);
		primaryStage.setTitle("IMC");
		primaryStage.setScene(scen);
		primaryStage.show();
		
		IntegerProperty a2=new SimpleIntegerProperty();
		
		StringProperty a2=Peso.textProperty();
		
		 IMC_Value.bind(Peso.textProperty(),Altura.textProperty());
		
	}

	public static void main(String[] args) {
		launch(args);

	}


}
