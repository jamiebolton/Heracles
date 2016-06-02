/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/jamiebolton/Heracles">Heracles</a> All rights reserved.
 */
package club.crazypenguin.modules.cms.service;

import club.crazypenguin.common.service.CrudService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import club.crazypenguin.modules.cms.dao.ArticleDataDao;
import club.crazypenguin.modules.cms.entity.ArticleData;

/**
 * 站点Service
 * @author crazypenguin
 * @version 2013-01-15
 */
@Service
@Transactional(readOnly = true)
public class ArticleDataService extends CrudService<ArticleDataDao, ArticleData> {

}
