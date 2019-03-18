package me.yokeyword.itemtouchhelperdemo.helper;

/**
 * ViewHolder被选中以及拖拽释放触发监听器
 */
public interface OnDragVHListener {
    /**
     * Item被选中时触发
     */
    void onItemSelected();

    /**
     * Item在拖拽结束/滑动结束后触发
     */
    void onItemFinish();
}
