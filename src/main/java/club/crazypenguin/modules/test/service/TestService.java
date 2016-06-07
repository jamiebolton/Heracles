package club.crazypenguin.modules.test.service;

import club.crazypenguin.common.service.CrudService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import club.crazypenguin.modules.test.entity.Test;
import club.crazypenguin.modules.test.dao.TestDao;

/**
 * 测试Service
 *
 * @author crazypenguin
 * @version 1.0
 * @created 2016/5/20
 */
@Service
@Transactional(readOnly = true)
public class TestService extends CrudService<TestDao, Test> {

}
