package com.taotao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.taotao.mapper.TbItemMapper;
/**
 * 商品管理service
 * 
 * 
 */
import com.taotao.pojo.TbItem;
import com.taotao.sevice.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

  @Autowired
  private TbItemMapper itemMapper;

  @Override
  public TbItem getItemById(long itemId) {
    TbItem item = itemMapper.selectByPrimaryKey(itemId);
    return item;
  }

}