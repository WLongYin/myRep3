package com.example.controller;

import com.example.bean.Item;
import com.example.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName ItemController
 * @Descrintion TODO
 * @Author wly
 * @Date 2018/11/17 11:51
 * @Version 1.0
 **/
@Controller
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/getAll")
    public String getItems(Model model){
        Item items = itemService.selOne(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }

}
