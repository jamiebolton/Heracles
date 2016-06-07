package club.crazypenguin.modules.sys.listener;

import club.crazypenguin.modules.sys.service.SystemService;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

/**
 * web端监听器
 *
 * @author crazypenguin
 * @version 1.0
 * @created 2016/5/20
 */
public class WebContextListener extends org.springframework.web.context.ContextLoaderListener {
	
	@Override
	public WebApplicationContext initWebApplicationContext(ServletContext servletContext) {
		if (!SystemService.printKeyLoadMessage()){
			return null;
		}
		return super.initWebApplicationContext(servletContext);
	}
}
