/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/jamiebolton/Heracles">Heracles</a> All rights reserved.
 */
package club.crazypenguin.test.dao;

import club.crazypenguin.common.persistence.annotation.MyBatisDao;
import club.crazypenguin.common.persistence.CrudDao;
import club.crazypenguin.test.entity.TestDataMain;

/**
 * 主子表生成DAO接口
 * @author crazypenguin
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestDataMainDao extends CrudDao<TestDataMain> {
	
}