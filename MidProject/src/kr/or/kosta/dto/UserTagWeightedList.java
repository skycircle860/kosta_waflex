package kr.or.kosta.dto;

import java.util.List;

/*
 * ������ MyList�� �ӿ� �ִ� ��ȭ���� �������մ� �±׵�� �±׵��� ����ġ�� ����� ���� ������ Ŭ����
 * */
public class UserTagWeightedList {
		int member_number;
		List<TagVO> list;
		public int getMember_number() {
			return member_number;
		}
		public void setMember_number(int member_number) {
			this.member_number = member_number;
		}
		public List<TagVO> getList() {
			return list;
		}
		public void setList(List<TagVO> list) {
			this.list = list;
		}
		
	
}
