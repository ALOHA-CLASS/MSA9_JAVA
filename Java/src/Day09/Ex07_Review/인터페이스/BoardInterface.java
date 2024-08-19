package Day09.Ex07_Review.인터페이스;

/**
 * 게시판 인터페이스
 * - 데이터 등록
 * - 데이터 목록
 * - 데이터 조회
 * - 데이터 수정
 * - 데이터 삭제
 */
public interface BoardInterface {
	
	// 데이터 등록
	Board create(Board board);
	
	// 데이터 목록
	Board[] list(); 
			
	// 데이터 조회
	Board read(int no);
	
	// 데이터 수정
	int update(Board board);
	
	// 데이터 삭제
	int delete(int no);

}
