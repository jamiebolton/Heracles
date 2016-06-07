package club.crazypenguin.test.dao;

import club.crazypenguin.common.persistence.annotation.MyBatisDao;
import club.crazypenguin.test.entity.TestTree;
import club.crazypenguin.common.persistence.TreeDao;

/**
 * 树结构生成DAO接口
 * @author crazypenguin
 * @version 1.0
 * @created 2016/5/20
 */
@MyBatisDao
public interface TestTreeDao extends TreeDao<TestTree> {
	
}