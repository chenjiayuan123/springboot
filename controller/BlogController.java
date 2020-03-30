package club.banyuan.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BlogController {
    //按用户名访问用户博客
    @GetMapping("blog/{username}")
    @ResponseBody
    String showBlogsByUserName(@PathVariable(value = "nsername") String userName){
        return "You are request" + userName + " blogs";
    }
}
