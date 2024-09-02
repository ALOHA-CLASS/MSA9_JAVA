package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class bController {

    @FXML
    private Button button;

    @FXML
    private TextField tInput;

    @FXML
    void toA(ActionEvent event) throws IOException {
    	// 텍스트 필드에 입력한 데이터
    	String data = tInput.getText();
    	
    	// A.fxml 을 읽기
    	FXMLLoader aFXML = new FXMLLoader(getClass().getResource("A.fxml"));
    	// B 화면
    	Parent aRoot = aFXML.load();
    	// A.fxml 에 연결된 컨트롤러 aController 가져오기
    	aController aController = aFXML.getController();
    	// A 화면으로 data 전달 (aController 메소드 호출하면서 data 전달)
    	aController.passData( data );	// B화면에서 A화면으로 데이터 전달
    	
    	// A 화면으로 이동
    	Main.setRoot(aRoot);
    }

    // 전달 받은 데이터 텍스트 필드에 출력하기
	public void passData(String data) {
		System.out.println("A -> B 전달된 데이터 : " + data);
		tInput.setText(data);
	}

}











