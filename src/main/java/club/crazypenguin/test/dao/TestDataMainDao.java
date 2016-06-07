package club.crazypenguin.test.dao;

import club.crazypenguin.common.persistence.annotation.MyBatisDao;
import club.crazypenguin.common.persistence.CrudDao;
import club.crazypenguin.test.entity.TestDataMain;

/**
 * 主子表生成DAO接口
 * @author crazypenguin
 * @version 1.0
 * @created 2016/5/20
 */
@MyBatisDao
public interface TestDataMainDao extends CrudDao<TestDataMain> {
	
}