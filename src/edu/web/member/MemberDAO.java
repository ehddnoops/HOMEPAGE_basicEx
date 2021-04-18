package edu.web.member;

public interface MemberDAO {
	//가입
	public abstract int insert(MemberVO vo);
	//select
	public abstract MemberVO select(String userid);
	//update
	public abstract int update(MemberVO vo);
	//delete
	public abstract int delete(String userid);
	//아이디 비밀번호 확인
	public abstract MemberVO select(String userid, String password);

}
