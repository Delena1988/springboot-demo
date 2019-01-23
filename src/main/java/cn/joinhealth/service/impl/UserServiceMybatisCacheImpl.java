package cn.joinhealth.service.impl;

import cn.joinhealth.mapper.UserMapper;
import cn.joinhealth.model.User;
import cn.joinhealth.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * UserServiceMybatisCacheImpl
 *
 * @author jlin
 * @date 2018/12/12 14:28
 * @Description
 */
@Service("userServiceMybatisCache")
@Slf4j
public class UserServiceMybatisCacheImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	/**
	 * 新增用户
	 *
	 * @param user
	 * @return
	 */
	@Override
	public User save(User user) {
		userMapper.insert(user);
		return user;
	}

	/**
	 * 获取用户列表
	 *
	 * @return
	 */
	@Override
	public List<User> list() {
		return userMapper.listUser();
	}

	/**
	 * 根据id获取用户
	 *
	 * @param id
	 * @return
	 */
	@Override
	public User get(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	/**
	 * 根据id删除用户
	 *
	 * @param id
	 */
	@Override
	public void delete(Integer id) {
		userMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 编辑用户
	 *
	 * @param user
	 */
	@Override
	public User update(User user) {
		userMapper.updateByPrimaryKey(user);
		return user;
	}
}
