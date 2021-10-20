package com.itwil.shop.user;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoMybatisImpl implements UserDao{
	
	public final static String NAMESPACE = "com.itwill.shop.user.mapper.UserMapper.";
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int create(User user) throws Exception {
		return sqlSession.insert(NAMESPACE+"create", user);
	}
	@Override
	public int update(User user) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int remove(User user) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public User findUser(String userId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
