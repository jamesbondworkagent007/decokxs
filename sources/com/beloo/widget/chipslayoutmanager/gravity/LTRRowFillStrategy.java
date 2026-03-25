package com.beloo.widget.chipslayoutmanager.gravity;

import android.graphics.Rect;
import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;
import com.beloo.widget.chipslayoutmanager.layouter.Item;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
class LTRRowFillStrategy implements IRowStrategy {
    @Override // com.beloo.widget.chipslayoutmanager.gravity.IRowStrategy
    public void applyStrategy(AbstractLayouter abstractLayouter, List<Item> list) {
        int horizontalDifference = GravityUtil.getHorizontalDifference(abstractLayouter) / abstractLayouter.getRowSize();
        Iterator<Item> it = list.iterator();
        int i = horizontalDifference;
        while (it.hasNext()) {
            Rect viewRect = it.next().getViewRect();
            if (viewRect.left == abstractLayouter.getCanvasLeftBorder()) {
                int i2 = viewRect.left;
                int canvasLeftBorder = abstractLayouter.getCanvasLeftBorder();
                viewRect.left = abstractLayouter.getCanvasLeftBorder();
                viewRect.right = (viewRect.right - (i2 - canvasLeftBorder)) + i;
            } else {
                viewRect.left += i;
                i += horizontalDifference;
                viewRect.right += i;
            }
        }
    }
}
