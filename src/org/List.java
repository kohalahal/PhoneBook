package org;

public class List {
	
	private People[] pArr;
	public int current;
	public int total;
	
	public List(int size) {
		this.pArr = new People[size];
		current = 0;
		total = 0;
	}
	
	public int emptyIdx() {
		int idx = -1;
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[i]==null) {
				idx = i;
				break;
			}
		}
		return idx;
	}
	
	public void save(int idx, People p) {
		if (idx == -1) {
			System.out.println("오류: 저장 공간 가득참.");
		} else {
			pArr[idx] = p;
			System.out.println("[#]\t이름\t전화번호");
			System.out.println("["+(idx+1)+"]\t"+pArr[idx].toString());
			System.out.println("저장되었습니다.");
			total++;
			current++;
		}
	}
	

	public void print() {
		boolean flag = false;
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[i]!=null) flag = true;
			else continue;
		}
		
		if(flag==true) {
			System.out.println("[#]\t이름\t전화번호");
			for(int i = 0; i < pArr.length; i++) {
				if(pArr[i]!=null) {
					System.out.println("["+(i+1)+"]\t"+pArr[i].toString());
				} else continue;
			}
		} else System.out.println("연락처가 없습니다.");
	}
	
	public void print(int[] a) {
		if (a!=null) {
			//System.out.println(Arrays.toString(a));
			System.out.println("[#]\t이름\t전화번호");
			for(int i = 0; i < a.length; i++) {
				System.out.println("["+(a[i]+1)+"]\t"+pArr[a[i]].toString());
			}
		} else System.out.println("연락처가 없습니다.");
	}
	
	public int[] srcName(String name) {
		int[] a = null;
		int cnt = 0;
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[i]!=null) {
				if (pArr[i].getName().equals(name)) cnt++;
			} else continue;
		}
		if (cnt>0) {
			a = new int[cnt];
			int j = 0;
			for(int i = 0; i < pArr.length; i++) {
				if(pArr[i]!=null) {
					if (pArr[i].getName().equals(name))	{
						a[j] = i;
						j++;
					} else continue;
				} else continue;
			}
		}
		return a;
	}
	
	public int[] srcPhone(String phone) {
		int[] a = null;
		int cnt = 0;
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[i]!=null) {
				if (pArr[i].getPhone().equals(phone)) cnt++;
			} else continue;
		}
		if (cnt>0) {
			a = new int[cnt];
			int j = 0;
			for(int i = 0; i < pArr.length; i++) {
				if(pArr[i]!=null) {
					if (pArr[i].getPhone().equals(phone)) {
						a[j] = i;
						j++;
					} else continue;
				} else continue;
			}
		}
		return a;
	}
	
	public void modify(int idx, People p) {
		try {
			if(pArr[idx]==null) {
				System.out.println("오류: #넘버 잘못 입력");
			} else {
				System.out.println("["+(idx+1)+"]\t"+pArr[idx].toString());
				pArr[idx]=p;
				System.out.println("다음과 같이 수정 완료!");
				System.out.println("["+(idx+1)+"]\t"+pArr[idx].toString());
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("오류: #넘버 잘못 입력");
		}
	}

	
	public void delete(int idx) {
		try {
			if(pArr[idx]==null) {
				System.out.println("오류: #넘버 잘못 입력");
			} else {
				System.out.println("["+(idx+1)+"]\t"+pArr[idx].toString());
				pArr[idx]=null;
				System.out.println("연락처 삭제 완료!");
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("오류: #넘버 잘못 입력");
		}

	}
	
	
	
	

}

