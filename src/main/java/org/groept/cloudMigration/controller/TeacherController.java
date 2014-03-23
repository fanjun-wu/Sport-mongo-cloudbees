package org.groept.cloudMigration.controller;



import org.groept.cloudMigration.model.Teacher;
import org.groept.cloudMigration.service.TeacherSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Locale;

@Controller
@SessionAttributes
public class TeacherController {

    @Autowired
    MongoTemplate mongoTemplate;
    @Autowired
   TeacherSevice teacherService;
    // TeacherDao teacherDao;

    @RequestMapping(value = "/saveTeacher", method = RequestMethod.POST)
    public String addTeacher(@ModelAttribute("teacher") Teacher teacher, BindingResult result) {


        List<Teacher> teacherList = teacherService.findbyName(teacher.getUsername());

        if (teacherList.size() > 0) {
            System.out.println("Error username already exists");
        } else {
            System.out.println("Ok: new username");
            mongoTemplate.save(teacher);
        }

        return "redirect:/teacherHome";
    }

    @RequestMapping("/addTeacher")
    public ModelAndView showContacts() {

        return new ModelAndView("teacher", "command", new Teacher());

    }
    
    /**
     * teacherHome page renderer
     */
    @RequestMapping(value = "/teacherHome", method = RequestMethod.GET)
    public String teacherHome(Locale locale, Model model) {

       

        Iterable<Teacher> teacherList = teacherService.getAllTeacher();

        model.addAttribute("teacherList", teacherList);

        return "teacherHome";
    }
    
    @RequestMapping(value = "/teacher/delete", method = RequestMethod.GET)  
  	public String deletePerson(@ModelAttribute Teacher teacher, ModelMap model) {  
    	teacherService.delete(teacher);  
          return "redirect:/teacherHome";
          
      }    
}
