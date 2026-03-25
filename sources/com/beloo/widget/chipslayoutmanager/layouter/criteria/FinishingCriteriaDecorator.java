package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
abstract class FinishingCriteriaDecorator implements IFinishingCriteria {
    private IFinishingCriteria finishingCriteria;

    public FinishingCriteriaDecorator(IFinishingCriteria iFinishingCriteria) {
        this.finishingCriteria = iFinishingCriteria;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.criteria.IFinishingCriteria
    public boolean isFinishedLayouting(AbstractLayouter abstractLayouter) {
        return this.finishingCriteria.isFinishedLayouting(abstractLayouter);
    }
}
