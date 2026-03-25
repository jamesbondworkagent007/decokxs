package com.beloo.widget.chipslayoutmanager.gravity;

import android.graphics.Rect;
import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;
import com.beloo.widget.chipslayoutmanager.layouter.Item;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
class ColumnFillSpaceCenterStrategy implements IRowStrategy {
    @Override // com.beloo.widget.chipslayoutmanager.gravity.IRowStrategy
    public void applyStrategy(AbstractLayouter abstractLayouter, List<Item> list) {
        int verticalDifference = GravityUtil.getVerticalDifference(abstractLayouter) / (abstractLayouter.getRowSize() + 1);
        Iterator<Item> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Rect viewRect = it.next().getViewRect();
            i += verticalDifference;
            viewRect.top += i;
            viewRect.bottom += i;
        }
    }
}
