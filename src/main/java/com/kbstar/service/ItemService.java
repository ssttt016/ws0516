package com.kbstar.service;


import com.kbstar.dto.Item;
import com.kbstar.dto.ItemSearch;
import com.kbstar.frame.KBService;
import com.kbstar.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService implements KBService<Integer, Item> {

    @Autowired
    ItemMapper mapper;

    /**
     * 등록 및 가입 진행
     * argument: Object
     * return: null
     *
     * @param item
     */
    @Override
    public void register(Item item) throws Exception {
        mapper.insert(item);
    }

    @Override
    public void remove(Integer id) throws Exception {
        mapper.delete(id);
    }

    @Override
    public void modify(Item item) throws Exception {
        mapper.update(item);
    }

    @Override
    public Item get(Integer id) throws Exception {
        return mapper.select(id);
    }

    @Override
    public List<Item> get() throws Exception {
        return mapper.selectall();
    }

    public List<Item> search(ItemSearch ms) throws Exception{
        return mapper.search(ms);
    }

}
