package com.beloo.widget.chipslayoutmanager.layouter.breaker;

import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
class BackwardBreakerContract extends RowBreakerDecorator {
    private IRowBreaker breaker;

    public BackwardBreakerContract(IRowBreaker iRowBreaker, ILayoutRowBreaker iLayoutRowBreaker) {
        super(iLayoutRowBreaker);
        this.breaker = iRowBreaker;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.breaker.RowBreakerDecorator, com.beloo.widget.chipslayoutmanager.layouter.breaker.ILayoutRowBreaker
    public boolean isRowBroke(AbstractLayouter abstractLayouter) {
        return super.isRowBroke(abstractLayouter) || this.breaker.isItemBreakRow(abstractLayouter.getCurrentViewPosition());
    }
}
