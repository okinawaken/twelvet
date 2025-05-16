package com.alibaba.nacos;

import com.alibaba.nacos.console.NacosConsole;
import com.alibaba.nacos.core.listener.startup.NacosStartUp;
import com.alibaba.nacos.core.listener.startup.NacosStartUpManager;
import com.alibaba.nacos.sys.env.Constants;
import com.alibaba.nacos.sys.env.DeploymentType;
import com.alibaba.nacos.sys.env.EnvUtil;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: nacos console 源码运行，方便开发 生产从官网下载zip最新版集群配置运行
 * https://github.com/alibaba/nacos/releases
 */
@SpringBootApplication
public class NacosApplication {

	/**
	 * 独立模式系统属性名称
	 */
	private static final String STANDALONE_MODE = "nacos.standalone";

	public static void main(String[] args) {
		System.setProperty(STANDALONE_MODE, "true");

		String type = System.getProperty(Constants.NACOS_DEPLOYMENT_TYPE, Constants.NACOS_DEPLOYMENT_TYPE_MERGED);
		DeploymentType deploymentType = DeploymentType.getType(type);
		EnvUtil.setDeploymentType(deploymentType);

		// Start Core Context
		NacosStartUpManager.start(NacosStartUp.CORE_START_UP_PHASE);
		ConfigurableApplicationContext coreContext = new SpringApplicationBuilder(NacosServerBasicApplication.class)
			.web(WebApplicationType.NONE)
			.run(args);

		// Start Server Web Context
		NacosStartUpManager.start(NacosStartUp.WEB_START_UP_PHASE);
		ConfigurableApplicationContext serverWebContext = new SpringApplicationBuilder(NacosServerWebApplication.class)
			.parent(coreContext)
			.run(args);

		// Start Console Context
		NacosStartUpManager.start(NacosStartUp.CONSOLE_START_UP_PHASE);
		ConfigurableApplicationContext consoleContext = new SpringApplicationBuilder(NacosConsole.class)
			.parent(coreContext)
			.run(args);
	}

}
