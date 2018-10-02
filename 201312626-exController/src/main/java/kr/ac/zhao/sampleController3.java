package kr.ac.zhao;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.zhao.domain.StudentVO;

@Controller
public class sampleController3 {
	@RequestMapping("urlD")
	public String urlD(Model model) {
		StudentVO studentVO = new StudentVO();
		studentVO.setNo("201312626");
		studentVO.setName("서상원");
		model.addAttribute(studentVO);
		return "read";
	}
}
