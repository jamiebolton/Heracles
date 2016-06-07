package club.crazypenguin.modules.sys.service;

import club.crazypenguin.common.service.CrudService;
import club.crazypenguin.common.utils.CacheUtils;
import club.crazypenguin.modules.sys.dao.DictDao;
import club.crazypenguin.modules.sys.entity.Dict;
import club.crazypenguin.modules.sys.utils.DictUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 字典Service
 *
 * @author crazypenguin
 * @version 1.0
 * @created 2016/5/20
 */
@Service
@Transactional(readOnly = true)
public class DictService extends CrudService<DictDao, Dict> {
	
	/**
	 * 查询字段类型列表
	 * @return
	 */
	public List<String> findTypeList(){
		return dao.findTypeList(new Dict());
	}

	@Transactional(readOnly = false)
	public void save(Dict dict) {
		super.save(dict);
		CacheUtils.remove(DictUtils.CACHE_DICT_MAP);
	}

	@Transactional(readOnly = false)
	public void delete(Dict dict) {
		super.delete(dict);
		CacheUtils.remove(DictUtils.CACHE_DICT_MAP);
	}

}
