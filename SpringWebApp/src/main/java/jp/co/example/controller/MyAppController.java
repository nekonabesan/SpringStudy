package jp.co.example.controller;

import jp.co.example.entity.FormModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyAppController {
	
	@ModelAttribute
	public FormModel initEntity(){
		FormModel formModel = new FormModel();
		return formModel;
	}
	
	@RequestMapping(value="/helo",method=RequestMethod.GET)
	public String helo(Model model){
		FormModel formModel = this.initEntity();
		formModel.setInput1("ここに書く");
		formModel.setChk1(true);
		model.addAttribute("formModel",formModel);
		model.addAttribute("message","Write");
		return "showMessage";
	}
	
	
	@RequestMapping(value="/helo",method=RequestMethod.POST)
	public ModelAndView form(FormModel formModel, Model model){
		model.addAttribute("message","you typed:"+formModel.getInput1());
		return new ModelAndView("showMessage");
	}

}
