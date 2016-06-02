/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/jamiebolton/Heracles">Heracles</a> All rights reserved.
 */
package club.crazypenguin.modules.sys.dao;

import club.crazypenguin.common.persistence.annotation.MyBatisDao;
import club.crazypenguin.modules.sys.entity.Area;
import club.crazypenguin.common.persistence.TreeDao;

/**
 * 区域DAO接口
 * @author crazypenguin
 * @version 2014-05-16
 */
@MyBatisDao
public interface AreaDao extends TreeDao<Area> {
	
}
