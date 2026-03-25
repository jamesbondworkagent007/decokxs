package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
class CriteriaDownAdditionalHeight extends FinishingCriteriaDecorator {
    private int additionalHeight;

    public CriteriaDownAdditionalHeight(IFinishingCriteria iFinishingCriteria, int i) {
        super(iFinishingCriteria);
        this.additionalHeight = i;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.criteria.FinishingCriteriaDecorator, com.beloo.widget.chipslayoutmanager.layouter.criteria.IFinishingCriteria
    public boolean isFinishedLayouting(AbstractLayouter abstractLayouter) {
        return super.isFinishedLayouting(abstractLayouter) && abstractLayouter.getViewTop() > abstractLayouter.getCanvasBottomBorder() + this.additionalHeight;
    }
}
