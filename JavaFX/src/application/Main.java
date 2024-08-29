package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            // Main.fxml 파일을 로드하여 Parent 객체로 변환
            Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
            
            // Scene에 Parent 객체를 추가하고, Scene을 스테이지에 설정
            Scene scene = new Scene(root);
            
            // CSS 파일 적용 (필요시)
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            
            // 스테이지 설정 및 화면 출력
            primaryStage.setScene(scene);
            primaryStage.setTitle("My JavaFX Application");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
