/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/jamiebolton/Heracles">Heracles</a> All rights reserved.
 */
package club.crazypenguin.modules.gen.dao;

import club.crazypenguin.common.persistence.CrudDao;
import club.crazypenguin.common.persistence.annotation.MyBatisDao;
import club.crazypenguin.modules.gen.entity.GenTemplate;

/**
 * 代码模板DAO接口
 * @author crazypenguin
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenTemplateDao extends CrudDao<GenTemplate> {
	
}
