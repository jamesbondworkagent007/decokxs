package com.beloo.widget.chipslayoutmanager.gravity;

import android.graphics.Rect;
import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;
import com.beloo.widget.chipslayoutmanager.layouter.Item;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
class RTLRowFillStrategy implements IRowStrategy {
    @Override // com.beloo.widget.chipslayoutmanager.gravity.IRowStrategy
    public void applyStrategy(AbstractLayouter abstractLayouter, List<Item> list) {
        int horizontalDifference = GravityUtil.getHorizontalDifference(abstractLayouter) / abstractLayouter.getRowSize();
        Iterator<Item> it = list.iterator();
        int i = horizontalDifference;
        while (it.hasNext()) {
            Rect viewRect = it.next().getViewRect();
            if (viewRect.right == abstractLayouter.getCanvasRightBorder()) {
                viewRect.left += abstractLayouter.getCanvasRightBorder() - viewRect.right;
                viewRect.right = abstractLayouter.getCanvasRightBorder();
                viewRect.left -= i;
            } else {
                viewRect.right -= i;
                i += horizontalDifference;
                viewRect.left -= i;
            }
        }
    }
}
