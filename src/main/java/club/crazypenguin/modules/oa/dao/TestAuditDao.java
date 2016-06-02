/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/jamiebolton/Heracles">Heracles</a> All rights reserved.
 */
package club.crazypenguin.modules.oa.dao;

import club.crazypenguin.common.persistence.CrudDao;
import club.crazypenguin.common.persistence.annotation.MyBatisDao;
import club.crazypenguin.modules.oa.entity.TestAudit;

/**
 * 审批DAO接口
 * @author crazypenguin
 * @version 2014-05-16
 */
@MyBatisDao
public interface TestAuditDao extends CrudDao<TestAudit> {

	public TestAudit getByProcInsId(String procInsId);
	
	public int updateInsId(TestAudit testAudit);
	
	public int updateHrText(TestAudit testAudit);
	
	public int updateLeadText(TestAudit testAudit);
	
	public int updateMainLeadText(TestAudit testAudit);
	
}
