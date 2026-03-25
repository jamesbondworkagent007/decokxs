package com.beloo.widget.chipslayoutmanager.layouter.breaker;

import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
public class LTRForwardColumnBreaker implements ILayoutRowBreaker {
    @Override // com.beloo.widget.chipslayoutmanager.layouter.breaker.ILayoutRowBreaker
    public boolean isRowBroke(AbstractLayouter abstractLayouter) {
        return abstractLayouter.getViewTop() > abstractLayouter.getCanvasTopBorder() && abstractLayouter.getViewTop() + abstractLayouter.getCurrentViewHeight() > abstractLayouter.getCanvasBottomBorder();
    }
}
