package com.example.service.impl;

import com.example.bean.Item;
import com.example.mapper.ItemMapper;
import com.example.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName ItemServiceImpl
 * @Descrintion TODO
 * @Author wly
 * @Date 2018/11/17 11:49
 * @Version 1.0
 **/
@Service("itemService")
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    public Item selOne(int id) {
        return itemMapper.selOne(id);
    }
}
