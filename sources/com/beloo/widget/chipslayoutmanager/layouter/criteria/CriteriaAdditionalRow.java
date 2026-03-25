package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;
import com.beloo.widget.chipslayoutmanager.layouter.ILayouter;
import com.beloo.widget.chipslayoutmanager.layouter.ILayouterListener;

/* JADX INFO: loaded from: classes21.dex */
class CriteriaAdditionalRow extends FinishingCriteriaDecorator implements IFinishingCriteria, ILayouterListener {
    private int additionalRowsCount;
    private int requiredRowsCount;

    public CriteriaAdditionalRow(IFinishingCriteria iFinishingCriteria, int i) {
        super(iFinishingCriteria);
        this.requiredRowsCount = i;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.criteria.FinishingCriteriaDecorator, com.beloo.widget.chipslayoutmanager.layouter.criteria.IFinishingCriteria
    public boolean isFinishedLayouting(AbstractLayouter abstractLayouter) {
        abstractLayouter.addLayouterListener(this);
        return super.isFinishedLayouting(abstractLayouter) && this.additionalRowsCount >= this.requiredRowsCount;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouterListener
    public void onLayoutRow(ILayouter iLayouter) {
        if (super.isFinishedLayouting((AbstractLayouter) iLayouter)) {
            this.additionalRowsCount++;
        }
    }
}
