package application;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MainController {

    @FXML
    private Label myLabel;

    @FXML
    private ListView<String> myListView;
    
    @FXML
    private TextField tInput;
    
    @FXML
    private Button btnAdd;
    
    @FXML
    private Button btnDelete;
    
    String food[] = {"국밥", "김밥", "돈까스", "떡볶이", "삼겹살", "초밥", "치킨", "햄버거"};
    List<String> foodList = Arrays.asList( new String[] {
    	"국밥", "김밥", "돈까스", "떡볶이", "삼겹살", "초밥", "치킨", "햄버거"
    });

    // 현재 선택한 아이템
    String currentFood;
    
    @FXML
    public void initialize() {
    	// food[] 배열 데이터를 리스트뷰에 초기화
    	myListView.getItems().addAll( foodList );
    	
    	// 리스트뷰의 항목 선택 이벤트
    	myListView.getSelectionModel().selectedItemProperty().addListener( new ChangeListener<String>() {

    		// 선택한 항복이 변경됐을 때 실행되는 메소드
			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				// 선택한 항목을 currentFood 에 지정
				currentFood = myListView.getSelectionModel().getSelectedItem();	// 선택된 항목
				// 선택된 항목 라벨에 텍스트 지정
				myLabel.setText(currentFood);
			}
    		
		});
    	
    	// 리스트뷰의 클릭 이벤트
    	myListView.setOnMouseClicked( new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// 더블 클릭
				if( event.getClickCount() == 2 ) {
					System.out.println("더블 클릭!");
					currentFood = myListView.getSelectionModel().getSelectedItem();
					System.out.println("선택된 아이템 : " + currentFood);
					
					// 상세 화면으로 이동 - Detail.fxml 화면으로 이동
					try {
						FXMLLoader fxmlLoader = Main.getFXML("Detail");
						Parent root = fxmlLoader.load();
						DetailController detailController = (DetailController) fxmlLoader.getController();
						// 데이터 전달
						detailController.passData(currentFood);
						// 화면 이동
						Main.setRoot(root);
						
						// 화면 이동만
						// Main.setRoot("Detail");			
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
			}
    		
		});
    	
    }
    
    /**
     * 추가 버튼 클릭
     * @param event
     */
    public void add(ActionEvent event) {
    	System.out.println("[추가] 버튼 클릭!");
    	String input = tInput.getText();
    	if( input != null && !input.equals("") ) {
    		// 리스트뷰에 입력 값 추가
    		myListView.getItems().add(input);
    		// 입력 후 텍스트 필드 비우기
    		tInput.clear();
    	}
    }
    
    /**
     * 삭제 버튼 클릭
     * @param event
     */
    public void delete(ActionEvent event) {
    	System.out.println("[삭제] 버튼 클릭!");
    	if( currentFood == null || currentFood.equals("") ) {
    		System.err.println("선택된 항목이 없습니다.");
    		return;
    	}
    	myListView.getItems().remove(currentFood);
    	currentFood = null;
    }
    
    
    

}











