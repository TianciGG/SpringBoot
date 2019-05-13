package chauncy.controller.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**   
 * @classDesc: 功能描述(第一个springboot)
 * 注解：@RestController是SpringBoot提供的http restful风格，等同于 ：类上@Controller+每个方法@ResponseBody，表示该类所有请求方法返回json格式。
 * @author: ChauncyWang
 * @createTime: 2019年5月12日 下午10:19:11   
 * @version: 1.0  
 */  
@RestController
@RequestMapping("/TestController")
//@EnableAutoConfiguration
public class TestController {
	
	@RequestMapping("/hello")
	public String hello(){
		return "success";
	}
	
	/*public static void main(String[] args) {
		//运行SpringBoot应用，不要写多个main函数，因为SpringBoot是一个独立的应用程序。
		SpringApplication.run(TestController.class, args);
	}*/
}
