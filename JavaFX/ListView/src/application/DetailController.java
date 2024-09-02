package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DetailController {

    @FXML
    private Label myLabel;
    
    @FXML
    private ImageView image;

	public void passData(String currentFood) {
		System.out.println("전달받은 데이터 : " + currentFood);
		// 상세 항목 이름 지정
		myLabel.setText(currentFood);
		// 상세 이미지 지정
		String filePath = getClass().getResource("/img/" + currentFood + ".jpg").toExternalForm();
		image.setImage(new Image(filePath));
	}

}





