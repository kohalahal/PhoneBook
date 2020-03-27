package org;

import java.util.InputMismatchException;

public class BootApp {
	
	public static final int MAX = 100;
	

	
	public static void main(String[] args) {
		
		
		Service srv = new Service(MAX);
		

			
		while(true) {
			
			try {
			
				System.out.println();
				System.out.printf("      ==== %d개 저장되는 전화 번호부 ===\n",MAX);
				System.out.print("1.연락처 입력\t2.다 보기\t3.검색하기\n4.수정하기\t5.삭제하기\t6.종료하기\n선택>>");
				
	
				switch(srv.sc()) {	
					case 1: 
						System.out.println("\t< 연락처 입력 >");
						srv.save(srv.inputP());
						break;
					case 2: 
						System.out.println("\t< 다 보기 >");
						srv.print();
						break;
					case 3: 
						System.out.println("\t< 검색 >");
						srv.print(srv.search());
						break;
					case 4: 
						System.out.println("\t< 수정하기 >");
						System.out.println("수정할 연착처 찾기");
						srv.modify(srv.print(srv.search()));
						break;
					case 5: 
						System.out.println("\t< 삭제하기 >");
						System.out.println("삭제할 연착처 찾기");
						srv.delete(srv.print(srv.search()));
						break;
					case 6: 
						System.out.println("\t< 종료하기 >");
						System.out.println("프로그램이 종료됩니다.");
						System.exit(0);
					default: 
						System.out.println("오류: 잘못 입력되었습니다.");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("오류: 잘못 입력되었습니다.");
				srv.scs();
			
			}
	
		}
		

		
	}
	
	

}
