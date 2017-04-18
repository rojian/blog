package priv.luojian.blog.web;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.servlet.ModelAndView;
        import priv.luojian.blog.entity.User;
        import priv.luojian.blog.service.UserService;

/**
 * Created by Administrator on 2017/3/14.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index.action",method = RequestMethod.GET)
    public String index(){
        return "mainView";
    }

    @RequestMapping(value = "/single.action",method = RequestMethod.GET)
    public String single(Model model){
        return "single";
    }

    @RequestMapping(value = "/contact.action",method = RequestMethod.GET)
    public String contact(){
        return "contact";
    }

    @RequestMapping(value = "/about.action",method = RequestMethod.GET)
    public String about(){
        return "about";
    }

    @RequestMapping(value = "saveUser.action",method = RequestMethod.POST)
    public String saveUser(User user){
        System.out.println("name:"+user.getUserName()+user.getUserPassword());
        userService.saveUser(user);
        return "../main";
    }


}

