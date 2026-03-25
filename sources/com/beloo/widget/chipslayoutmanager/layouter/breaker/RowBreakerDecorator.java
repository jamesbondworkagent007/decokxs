package com.beloo.widget.chipslayoutmanager.layouter.breaker;

import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
class RowBreakerDecorator implements ILayoutRowBreaker {
    private ILayoutRowBreaker decorate;

    public RowBreakerDecorator(ILayoutRowBreaker iLayoutRowBreaker) {
        this.decorate = iLayoutRowBreaker;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.breaker.ILayoutRowBreaker
    public boolean isRowBroke(AbstractLayouter abstractLayouter) {
        return this.decorate.isRowBroke(abstractLayouter);
    }
}
