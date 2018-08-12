package mapper;

import po.ItemsCustom;
import po.ItemsQueryVo;

import java.util.List;

public interface ItemsCustomMapper {

    //商品查询列表接口方法
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}
