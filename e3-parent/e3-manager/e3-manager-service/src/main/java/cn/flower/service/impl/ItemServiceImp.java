package cn.flower.service.impl;/*
 @author flower
 @DESCRIPTION 
 @create 2019/9/24
*/

import cn.flower.mapper.TbItemMapper;
import cn.flower.pojo.TbItem;
import cn.flower.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImp implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById(long id) {
        return tbItemMapper.selectByPrimaryKey(id);
    }
}
