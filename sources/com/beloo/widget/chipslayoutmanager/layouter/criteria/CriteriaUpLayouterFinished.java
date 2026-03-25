package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
class CriteriaUpLayouterFinished implements IFinishingCriteria {
    @Override // com.beloo.widget.chipslayoutmanager.layouter.criteria.IFinishingCriteria
    public boolean isFinishedLayouting(AbstractLayouter abstractLayouter) {
        return abstractLayouter.getViewBottom() <= abstractLayouter.getCanvasTopBorder();
    }
}
