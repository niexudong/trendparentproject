package trend;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version 1.0
 * @author: 3137596614@qq.com
 * @date: 2021年01月26日 17:45
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	/**
	 * 服务注册中心
	 */

	public static void main(String[] args) {
		int port=8761;
		if (!NetUtil.isUsableLocalPort(port)){
			System.err.printf("端口%d被占用，启动失败",port);
			System.exit(1);
		}
		new SpringApplicationBuilder(EurekaServerApplication.class).properties("server.port="+port).run(args);

	}
}

