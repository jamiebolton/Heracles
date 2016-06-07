package club.crazypenguin.common.utils.excel.fieldtype;

import club.crazypenguin.common.utils.StringUtils;
import club.crazypenguin.modules.sys.entity.Area;
import club.crazypenguin.modules.sys.utils.UserUtils;

/**
 * 字段类型转换
 *
 * @author crazypenguin
 * @version 1.0
 * @created 2016/6/2
 */
public class AreaType {

	/**
	 * 获取对象值（导入）
	 */
	public static Object getValue(String val) {
		for (Area e : UserUtils.getAreaList()){
			if (StringUtils.trimToEmpty(val).equals(e.getName())){
				return e;
			}
		}
		return null;
	}

	/**
	 * 获取对象值（导出）
	 */
	public static String setValue(Object val) {
		if (val != null && ((Area)val).getName() != null){
			return ((Area)val).getName();
		}
		return "";
	}
}
