package chauncy.controller.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/IndexController")
public class IndexController {
	
	
	@RequestMapping("/index")
	public String index(ModelMap map){
		//ModelMap类似于HttpServletRequest的request.setAttribute,只不过ModelMap是SpringMVC封装好的。
		map.put("name", "ChauncyWang");
		map.put("sex", 1);
		List<String> userlist=new ArrayList<String>();
		userlist.add("chauncy1");
		userlist.add("chauncy2");
		userlist.add("chauncy3");
		map.put("userList", userlist);
		return "index";
	}
}
