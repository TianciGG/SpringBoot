package chauncy.controller.catchexception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @classDesc: 功能描述:(全局捕获异常)
 * @author: ChauncyWang
 * @createTime: 2019年5月13日 下午11:44:45
 * @verssion: v1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody//拦截异常返回json格式的结果
	public Map<String,Object> execptionHandler(){
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("code", "500");
		result.put("msg", "系统错误，请稍后重试。");
		return result;
	}
}
