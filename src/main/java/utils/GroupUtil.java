package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 根据list分组工具类
 * @param <E>
 */
public class GroupUtil<E> {
    public Map<Integer, List<E>> groupByList(List<E> list, int batchNum) {
        Map<Integer, List<E>> chatRoomMap2 = new HashMap<Integer, List<E>>(100);
        int size = list.size();
        int count = size % batchNum > 0 ? size / batchNum + 1 : size / batchNum;
        int fromIndex;
        int toIndex;
        for (int i = 0; i < count; i++) {
            fromIndex = i * batchNum;
            if (i == count - 1 && (size % batchNum != 0)) {
                batchNum = size % batchNum;
                toIndex = size;
            } else {
                toIndex = (i + 1) * batchNum;
            }
            List<E> subList = new ArrayList<E>(list.subList(fromIndex, toIndex));
            chatRoomMap2.put(i, subList);
        }
        return chatRoomMap2;
    }
}
