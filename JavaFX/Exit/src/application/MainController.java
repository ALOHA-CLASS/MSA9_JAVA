package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;

public class MainController {

	@FXML
	private AnchorPane anchorPane;		// 변수명 anchorPane - fxml 의 fx:id 랑 일치
	
    @FXML
    private Button button;
    
    Stage stage;

    // 프로그램 종료 처리 메소드
    @FXML
    void exit(ActionEvent event) {
    	System.out.println("프로그램 종료를 시도합니다...");
		
		// 확인 경고창
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("프로그램 종료");
		alert.setHeaderText("프로그램을 종료합니다.");
		alert.setContentText("종료 전에 수정 내용을 저장하시겠습니까?");
		
		// 경고창에서 OK 버튼 클릭 시
		if( alert.showAndWait().get() == ButtonType.OK ) {
			stage = (Stage) anchorPane.getScene().getWindow();
			System.out.println("프로그램을 종료합니다...");
			stage.close();
		}
    }

}
