module RandomLaunch {
	requires javafx.controls;
	requires javafx.fxml;		// FXML 설정
	
	opens application to javafx.graphics, javafx.fxml;
}
