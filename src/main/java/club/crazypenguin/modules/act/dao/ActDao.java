package club.crazypenguin.modules.act.dao;

import club.crazypenguin.common.persistence.annotation.MyBatisDao;
import club.crazypenguin.common.persistence.CrudDao;
import club.crazypenguin.modules.act.entity.Act;

/**
 * 审批DAO接口
 *
 * @author crazypenguin
 * @version 1.0
 * @created 2016/5/20
 */
@MyBatisDao
public interface ActDao extends CrudDao<Act> {

	public int updateProcInsIdByBusinessId(Act act);
	
}
