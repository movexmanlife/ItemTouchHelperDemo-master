package me.yokeyword.itemtouchhelperdemo.helper;

/**
 * Item移动后触发
 */
public interface OnItemMoveListener {
    /**
     * Item移动后触发
     * @param fromPosition 起始位置
     * @param toPosition 结束位置
     */
    void onItemMove(int fromPosition, int toPosition);
}
