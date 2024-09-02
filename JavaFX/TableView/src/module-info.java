module TableView {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	
	opens application to javafx.base, javafx.graphics, javafx.fxml;
}
