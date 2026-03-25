package com.beloo.widget.chipslayoutmanager.gravity;

import android.graphics.Rect;
import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;
import com.beloo.widget.chipslayoutmanager.layouter.Item;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
class ColumnFillStrategy implements IRowStrategy {
    @Override // com.beloo.widget.chipslayoutmanager.gravity.IRowStrategy
    public void applyStrategy(AbstractLayouter abstractLayouter, List<Item> list) {
        int verticalDifference = GravityUtil.getVerticalDifference(abstractLayouter) / abstractLayouter.getRowSize();
        Iterator<Item> it = list.iterator();
        int i = verticalDifference;
        while (it.hasNext()) {
            Rect viewRect = it.next().getViewRect();
            if (viewRect.top == abstractLayouter.getCanvasTopBorder()) {
                int i2 = viewRect.top;
                int canvasTopBorder = abstractLayouter.getCanvasTopBorder();
                viewRect.top = abstractLayouter.getCanvasTopBorder();
                viewRect.bottom = (viewRect.bottom - (i2 - canvasTopBorder)) + i;
            } else {
                viewRect.top += i;
                i += verticalDifference;
                viewRect.bottom += i;
            }
        }
    }
}
