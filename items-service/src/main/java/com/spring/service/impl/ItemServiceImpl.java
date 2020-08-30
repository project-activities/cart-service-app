package com.spring.service.impl;

import com.java.model.Item;
import com.spring.dao.IItemDao;
import com.spring.model.AppError;
import com.spring.service.IItemService;
import com.spring.utils.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements IItemService {
    @Autowired
    IItemDao<Item,Integer> itemDao;

    @Override
    public Integer save(Item items) {
        try {
            return itemDao.save(items);
        } catch (ExceptionUtils e) {
            //e.printStackTrace();
            AppError error=new AppError("ItemException occured",500);
            ExceptionUtils utils=new ExceptionUtils("itemexception occured during save",error);
            throw utils;
        }catch (Exception e){
            throw new RuntimeException("exception accured"+e);
        }
    }

    @Override
    public Integer update(Item items,Integer id) {
        try {
            return itemDao.update(items,id);
        } catch (ExceptionUtils e) {
            //e.printStackTrace();
            AppError error=new AppError("ItemException occured",500);
            ExceptionUtils utils=new ExceptionUtils("itemexception occured during update",error);
            throw utils;
        }catch (Exception e){
            throw new RuntimeException("exception accured"+e);
        }
    }

    @Override
    public Item select(Integer id) {
        return itemDao.select(id);
    }

    @Override
    public List<Item> selectAll() {
        return itemDao.selectAll();
    }
}
