package service;

import po.ItemsCustom;
import po.ItemsQueryVo;

import java.util.List;

public interface ItemsService {

    //商品查询列表
    List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}
