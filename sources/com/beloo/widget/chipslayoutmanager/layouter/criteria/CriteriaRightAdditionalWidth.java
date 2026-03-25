package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
class CriteriaRightAdditionalWidth extends FinishingCriteriaDecorator {
    private int additionalWidth;

    public CriteriaRightAdditionalWidth(IFinishingCriteria iFinishingCriteria, int i) {
        super(iFinishingCriteria);
        this.additionalWidth = i;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.criteria.FinishingCriteriaDecorator, com.beloo.widget.chipslayoutmanager.layouter.criteria.IFinishingCriteria
    public boolean isFinishedLayouting(AbstractLayouter abstractLayouter) {
        return super.isFinishedLayouting(abstractLayouter) && abstractLayouter.getViewLeft() > abstractLayouter.getCanvasRightBorder() + this.additionalWidth;
    }
}
