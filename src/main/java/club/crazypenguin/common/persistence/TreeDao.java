package club.crazypenguin.common.persistence;

import java.util.List;

/**
 * DAO层树型结构基类
 *
 * @author crazypenguin
 * @version 1.0
 * @created 2016/6/2
 */
public interface TreeDao<T extends TreeEntity<T>> extends CrudDao<T> {

	/**
	 * 找到所有子节点
	 * @param entity
	 * @return
	 */
	public List<T> findByParentIdsLike(T entity);

	/**
	 * 更新所有父节点字段
	 * @param entity
	 * @return
	 */
	public int updateParentIds(T entity);
	
}