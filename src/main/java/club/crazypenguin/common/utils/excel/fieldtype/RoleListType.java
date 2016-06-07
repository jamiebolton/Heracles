package club.crazypenguin.common.utils.excel.fieldtype;

import club.crazypenguin.common.utils.Collections3;
import club.crazypenguin.common.utils.SpringContextHolder;
import club.crazypenguin.common.utils.StringUtils;
import club.crazypenguin.modules.sys.entity.Role;
import club.crazypenguin.modules.sys.service.SystemService;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * 字段类型转换
 *
 * @author crazypenguin
 * @version 1.0
 * @created 2016/6/2
 */
public class RoleListType {

	private static SystemService systemService = SpringContextHolder.getBean(SystemService.class);
	
	/**
	 * 获取对象值（导入）
	 */
	public static Object getValue(String val) {
		List<Role> roleList = Lists.newArrayList();
		List<Role> allRoleList = systemService.findAllRole();
		for (String s : StringUtils.split(val, ",")){
			for (Role e : allRoleList){
				if (StringUtils.trimToEmpty(s).equals(e.getName())){
					roleList.add(e);
				}
			}
		}
		return roleList.size()>0?roleList:null;
	}

	/**
	 * 设置对象值（导出）
	 */
	public static String setValue(Object val) {
		if (val != null){
			@SuppressWarnings("unchecked")
			List<Role> roleList = (List<Role>)val;
			return Collections3.extractToString(roleList, "name", ", ");
		}
		return "";
	}
	
}
