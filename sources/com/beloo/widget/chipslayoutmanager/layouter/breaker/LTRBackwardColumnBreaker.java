package com.beloo.widget.chipslayoutmanager.layouter.breaker;

import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
public class LTRBackwardColumnBreaker implements ILayoutRowBreaker {
    @Override // com.beloo.widget.chipslayoutmanager.layouter.breaker.ILayoutRowBreaker
    public boolean isRowBroke(AbstractLayouter abstractLayouter) {
        return abstractLayouter.getViewBottom() - abstractLayouter.getCurrentViewHeight() < abstractLayouter.getCanvasTopBorder() && abstractLayouter.getViewBottom() < abstractLayouter.getCanvasBottomBorder();
    }
}
