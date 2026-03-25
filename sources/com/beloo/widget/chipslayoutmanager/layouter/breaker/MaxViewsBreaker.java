package com.beloo.widget.chipslayoutmanager.layouter.breaker;

import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
public class MaxViewsBreaker extends RowBreakerDecorator {
    private int maxViewsInRow;

    public MaxViewsBreaker(int i, ILayoutRowBreaker iLayoutRowBreaker) {
        super(iLayoutRowBreaker);
        this.maxViewsInRow = i;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.breaker.RowBreakerDecorator, com.beloo.widget.chipslayoutmanager.layouter.breaker.ILayoutRowBreaker
    public boolean isRowBroke(AbstractLayouter abstractLayouter) {
        return super.isRowBroke(abstractLayouter) || abstractLayouter.getRowSize() >= this.maxViewsInRow;
    }
}
