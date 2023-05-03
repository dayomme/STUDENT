package View;
import java.util.Scanner;

import Model.DAO;

public class View {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  DAO dao = new DAO();
		
		while(true) {
			System.out.println("[스마트인재개발원 학생관리 프로그램]");
			System.out.println("[1] 학생 등록 [2] 학생 조회 [3] 학생 정보수정 [4] 학생 삭제 [5] 종료 ");
			int menu = sc.nextInt(); 
			
			if(menu==1) { // 1. 학생등록 
				System.out.println();
			}else if(menu==2) { // 2. 학생 조회
				dao.List();
			}else if(menu==3) { // 3. 학생 정보수정 
				
			}else if(menu==4) { // 4. 학생 삭제 
				
			}else if(menu==5) { // 5. 종료
				 System.out.println("프로그램을 종료합니다.");
				 break; 
			}else { // 다른번호 선택시 
				System.out.println("번호를 다시 선택해주세요");
			}
			
		}
		

	}

}
