package com.beloo.widget.chipslayoutmanager.gravity;

import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
abstract class GravityUtil {
    public static int getHorizontalDifference(AbstractLayouter abstractLayouter) {
        return (abstractLayouter.getCanvasRightBorder() - abstractLayouter.getCanvasLeftBorder()) - abstractLayouter.getRowLength();
    }

    public static int getVerticalDifference(AbstractLayouter abstractLayouter) {
        return (abstractLayouter.getCanvasBottomBorder() - abstractLayouter.getCanvasTopBorder()) - abstractLayouter.getRowLength();
    }
}
