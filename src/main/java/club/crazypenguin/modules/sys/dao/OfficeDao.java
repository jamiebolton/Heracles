package club.crazypenguin.modules.sys.dao;

import club.crazypenguin.common.persistence.annotation.MyBatisDao;
import club.crazypenguin.common.persistence.TreeDao;
import club.crazypenguin.modules.sys.entity.Office;

/**
 * 机构DAO接口
 *
 * @author crazypenguin
 * @version 1.0
 * @created 2016/5/20
 */
@MyBatisDao
public interface OfficeDao extends TreeDao<Office> {
	
}
