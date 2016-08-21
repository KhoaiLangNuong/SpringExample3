package springmvchibernatedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springmvchibernatedemo.business.SchoolManager;
import springmvchibernatedemo.model.SchoolModel;

@Controller 
public class DemoController {
	@Autowired  
    private SchoolManager schoolManager;  

    @RequestMapping(value="/viewBatch")  
    public ModelAndView viewBatch(SchoolModel schoolModel){  
         ModelAndView mav = new ModelAndView("viewBatch", "model", schoolModel);  
         schoolManager.getBatchInfo(schoolModel);  
         return mav;  
    }  

    public SchoolManager getSchoolManager() {  
         return schoolManager;  
    }  
    public void setSchoolManager(SchoolManager schoolManager) {  
         this.schoolManager = schoolManager;  
    }  
}
