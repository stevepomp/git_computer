package po;

public class ItemsQueryVo {

    //商品信息包装进来，为了可扩展性对原始po进行扩展，如定义扩展类ItemsCustom
    private ItemsCustom itemsCustom;

    public ItemsCustom getItemsCustom() {
        return itemsCustom;
    }

    public void setItemsCustom(ItemsCustom itemsCustom) {
        this.itemsCustom = itemsCustom;
    }
}
