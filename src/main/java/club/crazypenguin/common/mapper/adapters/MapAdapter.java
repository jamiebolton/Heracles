package club.crazypenguin.common.mapper.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.HashMap;
import java.util.Map;

/**
 * 使用jaxb对xml中的属性进行格式化 - 使用@XmlJavaTypeAdapter(MapAdapter.class),在xml中输出想要的格式
 *
 * @author crazypenguin
 * @version 1.0
 * @created 2016/6/2
 */
public class MapAdapter extends XmlAdapter<MapConvertor, Map<String, Object>> {  
	  
    @Override  
    public MapConvertor marshal(Map<String, Object> map) throws Exception {  
        MapConvertor convertor = new MapConvertor();  
        for (Map.Entry<String, Object> entry : map.entrySet()) {  
            MapConvertor.MapEntry e = new MapConvertor.MapEntry(entry);  
            convertor.addEntry(e);  
        }  
        return convertor;  
    }  
  
    @Override  
    public Map<String, Object> unmarshal(MapConvertor map) throws Exception {  
        Map<String, Object> result = new HashMap<String, Object>();  
        for (MapConvertor.MapEntry e : map.getEntries()) {  
            result.put(e.getKey(), e.getValue());  
        }  
        return result;  
    }
    
}  

