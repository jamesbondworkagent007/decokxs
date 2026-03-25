package com.beloo.widget.chipslayoutmanager.layouter.breaker;

import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
class LTRForwardRowBreaker implements ILayoutRowBreaker {
    @Override // com.beloo.widget.chipslayoutmanager.layouter.breaker.ILayoutRowBreaker
    public boolean isRowBroke(AbstractLayouter abstractLayouter) {
        return abstractLayouter.getViewLeft() > abstractLayouter.getCanvasLeftBorder() && abstractLayouter.getViewLeft() + abstractLayouter.getCurrentViewWidth() > abstractLayouter.getCanvasRightBorder();
    }
}
