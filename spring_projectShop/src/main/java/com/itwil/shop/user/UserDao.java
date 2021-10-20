package com.itwil.shop.user;

public interface UserDao {
	
	//(1) 사용자 관리 테이블에 새로운 사용자 생성
	//insert into userinfo(userid,password,name,email) values(?,?,?,?);
	int create(User user) throws Exception;
	
	//(2) 사용자 정보 수정
	//update  userinfo set password=?,name=?,email=? where userid=?;
	int update(User user) throws Exception;

	//(3) 사용자 탈퇴
	//delete userinfo where userid=?
	int remove(User user) throws Exception;

	//(4) 사용자 정보 조회
	//select userid,password,name,email from userinfo where userid=?;
	User findUser(String userId) throws Exception;
	
	

}
