package club.crazypenguin.modules.test.dao;

import club.crazypenguin.common.persistence.annotation.MyBatisDao;
import club.crazypenguin.common.persistence.CrudDao;
import club.crazypenguin.modules.test.entity.Test;

/**
 * 测试DAO接口
 *
 * @author crazypenguin
 * @version 1.0
 * @created 2016/5/20
 */
@MyBatisDao
public interface TestDao extends CrudDao<Test> {
	
}
