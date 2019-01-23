package cn.joinhealth.service;

import cn.joinhealth.model.User;

import java.util.List;

/**
 * UserService
 *
 * @author linjian
 * @date 2018/7/27 上午11:24
 */
public interface UserService {
	/**
	 * 新增用户
	 *
	 * @param user
	 * @return
	 */
	User save(User user);

	/**
	 * 获取用户列表
	 *
	 * @return
	 */
	List<User> list();

	/**
	 * 根据id获取用户
	 *
	 * @param id
	 * @return
	 */
	User get(Integer id);

	/**
	 * 根据id删除用户
	 *
	 * @param id
	 */
	void delete(Integer id);

	/**
	 * 编辑用户
	 *
	 * @param user
	 */
	User update(User user);
}
