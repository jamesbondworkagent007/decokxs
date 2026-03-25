package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
class CriteriaLeftAdditionalWidth extends FinishingCriteriaDecorator {
    private int additionalWidth;

    public CriteriaLeftAdditionalWidth(IFinishingCriteria iFinishingCriteria, int i) {
        super(iFinishingCriteria);
        this.additionalWidth = i;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.criteria.FinishingCriteriaDecorator, com.beloo.widget.chipslayoutmanager.layouter.criteria.IFinishingCriteria
    public boolean isFinishedLayouting(AbstractLayouter abstractLayouter) {
        return super.isFinishedLayouting(abstractLayouter) && abstractLayouter.getViewRight() < abstractLayouter.getCanvasLeftBorder() - this.additionalWidth;
    }
}
