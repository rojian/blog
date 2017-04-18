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
    public String index(Model model){
        return "mainView";
    }


    @RequestMapping(value = "saveUser.action",method = RequestMethod.POST)
    public String saveUser(User user){
        System.out.println("name:"+user.getUserName()+user.getUserPassword());
        userService.saveUser(user);
        return "../main";
    }


}

