package club.crazypenguin.modules.sys.dao;

import club.crazypenguin.common.persistence.annotation.MyBatisDao;
import club.crazypenguin.modules.sys.entity.Area;
import club.crazypenguin.common.persistence.TreeDao;

/**
 * 区域DAO接口
 *
 * @author crazypenguin
 * @version 1.0
 * @created 2016/5/20
 */
@MyBatisDao
public interface AreaDao extends TreeDao<Area> {
	
}
