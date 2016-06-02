/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/jamiebolton/Heracles">Heracles</a> All rights reserved.
 */
package club.crazypenguin.modules.gen.dao;

import club.crazypenguin.common.persistence.annotation.MyBatisDao;
import club.crazypenguin.common.persistence.CrudDao;
import club.crazypenguin.modules.gen.entity.GenTableColumn;

/**
 * 业务表字段DAO接口
 * @author crazypenguin
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenTableColumnDao extends CrudDao<GenTableColumn> {
	
	public void deleteByGenTableId(String genTableId);
}
