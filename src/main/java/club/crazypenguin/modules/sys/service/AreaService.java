package club.crazypenguin.modules.sys.service;

import club.crazypenguin.common.service.TreeService;
import club.crazypenguin.modules.sys.dao.AreaDao;
import club.crazypenguin.modules.sys.entity.Area;
import club.crazypenguin.modules.sys.utils.UserUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 区域Service
 *
 * @author crazypenguin
 * @version 1.0
 * @created 2016/5/20
 */
@Service
@Transactional(readOnly = true)
public class AreaService extends TreeService<AreaDao, Area> {

	public List<Area> findAll(){
		return UserUtils.getAreaList();
	}

	@Transactional(readOnly = false)
	public void save(Area area) {
		super.save(area);
		UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
	}
	
	@Transactional(readOnly = false)
	public void delete(Area area) {
		super.delete(area);
		UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
	}
	
}
