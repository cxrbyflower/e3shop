package cn.flower.controller;/*
 @author flower
 @DESCRIPTION 
 @create 2019/9/24
*/

import cn.flower.pojo.TbItem;
import cn.flower.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable long itemId){
        return itemService.getItemById(itemId);
    }

}
