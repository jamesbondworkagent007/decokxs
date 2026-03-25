package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;
import com.beloo.widget.chipslayoutmanager.layouter.ILayouter;
import com.beloo.widget.chipslayoutmanager.layouter.ILayouterListener;
import com.beloo.widget.chipslayoutmanager.layouter.Item;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class CriteriaPolitePositionReached extends FinishingCriteriaDecorator implements IFinishingCriteria, ILayouterListener {
    private boolean isPositionReached;
    private int reachedPosition;

    public CriteriaPolitePositionReached(AbstractLayouter abstractLayouter, IFinishingCriteria iFinishingCriteria, int i) {
        super(iFinishingCriteria);
        this.reachedPosition = i;
        abstractLayouter.addLayouterListener(this);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.criteria.FinishingCriteriaDecorator, com.beloo.widget.chipslayoutmanager.layouter.criteria.IFinishingCriteria
    public boolean isFinishedLayouting(AbstractLayouter abstractLayouter) {
        return super.isFinishedLayouting(abstractLayouter) || this.isPositionReached;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouterListener
    public void onLayoutRow(ILayouter iLayouter) {
        if (this.isPositionReached || iLayouter.getRowSize() == 0) {
            return;
        }
        Iterator<Item> it = iLayouter.getCurrentRowItems().iterator();
        while (it.hasNext()) {
            if (it.next().getViewPosition() == this.reachedPosition) {
                this.isPositionReached = true;
                return;
            }
        }
    }
}
