package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import po.ItemsCustom;
import service.ItemsService;

import java.util.List;

//注解映射器标识此类是一个控制器，使用@RequestMapping指定Handler方法所对应的url
@Controller
public class ItemsController {

    //定义所有的注入属性
    private final ItemsService itemsService;

    //注入service
    @Autowired
    public ItemsController (ItemsService itemsService){
        this.itemsService = itemsService;
    }

    @RequestMapping("/queryItems")
    public ModelAndView queryItems() throws Exception{

        //调用service查找数据库
        List<ItemsCustom> itemsList = itemsService.findItemsList(null);

        //返回ModelAndView
        ModelAndView modelAndView=new ModelAndView();
        //相当于request的setAttribute，在jsp页面中通过itemsList取数据
        modelAndView.addObject("itemsList",itemsList);

        modelAndView.setViewName("itemsList");//指定用户访问的jsp页面地址

        return modelAndView;
    }
}
