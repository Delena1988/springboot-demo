package cn.joinhealth.service.impl;

import cn.joinhealth.mapper.UserMapper;
import cn.joinhealth.model.User;
import cn.joinhealth.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserServiceImpl
 *
 * @author linjian
 * @date 2018/7/27 上午11:25
 */
@Service("userService")
@CacheConfig(cacheNames = {"user"})
@Slf4j
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	/**
	 * 新增用户
	 *
	 * @param user
	 */
	@Override
	@CachePut(key = "#user.userId")
	public User save(User user) {
		userMapper.insert(user);
		return user;
	}

	/**
	 * 分页获取用户
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
	@Cacheable(key = "#id")
	public User get(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	/**
	 * 根据id删除用户
	 *
	 * @param id
	 */
	@Override
	@CacheEvict(key = "#id")
	public void delete(Integer id) {
		userMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 编辑用户
	 *
	 * @param user
	 */
	@Override
	@CachePut(key = "#user.userId")
	public User update(User user) {
		userMapper.updateByPrimaryKey(user);
		return user;
	}
}
