package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class aController {

    @FXML
    private Button button;

    @FXML
    private TextField tInput;

    @FXML
    void toB(ActionEvent event) throws IOException {
    	// 텍스트 필드에 입력한 데이터
    	String data = tInput.getText();
    	
    	// B.fxml 을 읽기
    	FXMLLoader bFXML = new FXMLLoader(getClass().getResource("B.fxml"));
    	// B 화면
    	Parent bRoot = bFXML.load();
    	// B.fxml 에 연결된 컨트롤러 bController 가져오기
    	bController bController = bFXML.getController();
    	// B 화면으로 data 전달 (bController 메소드 호출하면서 data 전달)
    	bController.passData( data );	// A화면에서 B화면으로 데이터 전달
    	
    	// B 화면으로 이동
    	Main.setRoot(bRoot);
    }

    /**
     * 전달받은 데이터 텍스트필드에 출력
     * @param data
     */
	public void passData(String data) {
		System.out.println("B -> A 전달된 데이터 : " + data);
		tInput.setText(data);
	}

}












