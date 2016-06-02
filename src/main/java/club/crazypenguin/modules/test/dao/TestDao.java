/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/jamiebolton/Heracles">Heracles</a> All rights reserved.
 */
package club.crazypenguin.modules.test.dao;

import club.crazypenguin.common.persistence.annotation.MyBatisDao;
import club.crazypenguin.common.persistence.CrudDao;
import club.crazypenguin.modules.test.entity.Test;

/**
 * 测试DAO接口
 * @author crazypenguin
 * @version 2013-10-17
 */
@MyBatisDao
public interface TestDao extends CrudDao<Test> {
	
}
