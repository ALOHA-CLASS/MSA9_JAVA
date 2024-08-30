package DBCP;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

public class Main {
    public static void main(String[] args) {
        // BasicDataSource 객체 생성 (연결 풀 설정)
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl("jdbc:mysql://localhost:3306/aloha");
        ds.setUsername("aloha");
        ds.setPassword("123456");
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        
        // 연결 풀 초기 설정
        ds.setInitialSize(5);  // 초기 연결 개수
        ds.setMaxTotal(10);    // 최대 연결 개수

        try (Connection conn = ds.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM board")) {

            // 결과 처리
            while (rs.next()) {
                System.out.println("제목: " + rs.getString("title"));
                System.out.println("작성자: " + rs.getString("writer"));
                System.out.println("내용: " + rs.getString("content"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
