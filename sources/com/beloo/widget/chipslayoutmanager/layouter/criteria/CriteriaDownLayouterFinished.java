package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
class CriteriaDownLayouterFinished implements IFinishingCriteria {
    private boolean isFinished;

    @Override // com.beloo.widget.chipslayoutmanager.layouter.criteria.IFinishingCriteria
    public boolean isFinishedLayouting(AbstractLayouter abstractLayouter) {
        boolean z = this.isFinished || abstractLayouter.getViewTop() >= abstractLayouter.getCanvasBottomBorder();
        this.isFinished = z;
        return z;
    }
}
