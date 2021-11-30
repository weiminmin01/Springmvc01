package cn.smbms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.ResponseWrapper;
import java.util.AbstractCollection;
@Controller()
public class IndexController extends AbstractController {
    @RequestMapping("index.html")
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("嘿嘿");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
       return modelAndView;
    }
}
