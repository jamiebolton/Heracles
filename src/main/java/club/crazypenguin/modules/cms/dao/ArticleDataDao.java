/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/jamiebolton/Heracles">Heracles</a> All rights reserved.
 */
package club.crazypenguin.modules.cms.dao;

import club.crazypenguin.common.persistence.CrudDao;
import club.crazypenguin.common.persistence.annotation.MyBatisDao;
import club.crazypenguin.modules.cms.entity.ArticleData;

/**
 * 文章DAO接口
 * @author crazypenguin
 * @version 2013-8-23
 */
@MyBatisDao
public interface ArticleDataDao extends CrudDao<ArticleData> {
	
}
