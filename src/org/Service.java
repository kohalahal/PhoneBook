package org;

import java.util.Scanner;

public class Service {
	
	List pbList;
	
	Scanner sc = new Scanner(System.in);
	int in;
	String inS;
	int[] res = null;
	
	public int sc() {
			int res = sc.nextInt();
			sc.nextLine();
			return res;	
	}
	
	public String scs() {
		return sc.nextLine();
	}
	
	public Service(int size) {
		pbList = new List(size);
	}
	
	public People inputP() {
		People p = new People();
		System.out.println("이름 입력>>");
		p.setName(scs());
		System.out.println("전화 번호 입력>>");
		p.setPhone(scs());
		return p;
	}
	
	public void save(People p) {
		pbList.save(pbList.emptyIdx(), p);
	}
	
	public void save(int idx) {
		People p = new People();
		System.out.print("이름 입력>>");
		p.setName(scs());
		System.out.print("전화 번호 입력>>");
		p.setPhone(scs());
		pbList.save(idx, p);
	}
	
	public int[] search() {
		System.out.println("1.이름으로\t2.전화 번호로");
		in = sc();
		
		switch(in) {
			case 1: 
				System.out.println("이름 입력>>");
				inS = sc.nextLine();
				return pbList.srcName(inS);
				
			case 2: 
				System.out.println("전화 번호 입력>>");
				inS = sc.nextLine();
				return pbList.srcPhone(inS);
			default:
				System.out.println("오류: 잘못 입력되었습니다.");
				return null;						
		}	
	}

	public int[] print(int[] a) {
		pbList.print(a);
		return a;
	}
	
	public void print() {		
		pbList.print();
	}
		
	public void delete(int[] a) {
		System.out.println("삭제할 연락처의 #넘버 입력>>");
		in = sc()-1;
		boolean flag = false;
		for( int i = 0; i < a.length; i++) {
			if(a[i]==in) flag = true;
			else continue;
		}
		if (flag == false) {
			System.out.println("오류: #넘버가 잘못 입력되었습니다.");
		} else pbList.delete(in);
	}
	
	public void modify(int[] a) {
		System.out.println("수정할 연락처의 #넘버 입력>>");
		in = sc()-1;
		boolean flag = false;
		for( int i = 0; i < a.length; i++) {
			if(a[i]==in) flag = true;
			else continue;
		}
		if (flag == false) {
			System.out.println("오류: #넘버가 잘못 입력되었습니다.");
		} else pbList.modify((in), inputP());
	}
	
	

}
