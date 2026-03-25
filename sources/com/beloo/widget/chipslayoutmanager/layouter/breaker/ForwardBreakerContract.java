package com.beloo.widget.chipslayoutmanager.layouter.breaker;

import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
class ForwardBreakerContract extends RowBreakerDecorator {
    private IRowBreaker breaker;

    public ForwardBreakerContract(IRowBreaker iRowBreaker, ILayoutRowBreaker iLayoutRowBreaker) {
        super(iLayoutRowBreaker);
        this.breaker = iRowBreaker;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.breaker.RowBreakerDecorator, com.beloo.widget.chipslayoutmanager.layouter.breaker.ILayoutRowBreaker
    public boolean isRowBroke(AbstractLayouter abstractLayouter) {
        if (super.isRowBroke(abstractLayouter)) {
            return true;
        }
        return abstractLayouter.getCurrentViewPosition() != 0 && this.breaker.isItemBreakRow(abstractLayouter.getCurrentViewPosition() - 1);
    }
}
