package siestageek.spring.dao;

import siestageek.spring.vo.Member;

public interface MemberDAO {

	int insertMember(Member m);
	int selectLogin(Member m);
	Member selectOneMember(String mno);
	
}
