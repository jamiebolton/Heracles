/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/jamiebolton/Heracles">Heracles</a> All rights reserved.
 */
package club.crazypenguin.modules.test.service;

import club.crazypenguin.common.service.CrudService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import club.crazypenguin.modules.test.entity.Test;
import club.crazypenguin.modules.test.dao.TestDao;

/**
 * 测试Service
 * @author crazypenguin
 * @version 2013-10-17
 */
@Service
@Transactional(readOnly = true)
public class TestService extends CrudService<TestDao, Test> {

}
