package net.aoisoft.service.impl;

import javax.annotation.Resource;

import net.aoisoft.mybatis.dao.IUserDao;
import net.aoisoft.pojo.User;
import net.aoisoft.service.IUserService;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
