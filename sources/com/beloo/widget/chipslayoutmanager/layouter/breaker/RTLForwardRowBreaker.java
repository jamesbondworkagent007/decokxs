package com.beloo.widget.chipslayoutmanager.layouter.breaker;

import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
class RTLForwardRowBreaker implements ILayoutRowBreaker {
    @Override // com.beloo.widget.chipslayoutmanager.layouter.breaker.ILayoutRowBreaker
    public boolean isRowBroke(AbstractLayouter abstractLayouter) {
        return abstractLayouter.getViewRight() < abstractLayouter.getCanvasRightBorder() && abstractLayouter.getViewRight() - abstractLayouter.getCurrentViewWidth() < abstractLayouter.getCanvasLeftBorder();
    }
}
