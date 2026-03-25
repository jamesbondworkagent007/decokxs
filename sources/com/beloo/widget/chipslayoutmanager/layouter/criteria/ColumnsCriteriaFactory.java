package com.beloo.widget.chipslayoutmanager.layouter.criteria;

/* JADX INFO: loaded from: classes21.dex */
public class ColumnsCriteriaFactory extends AbstractCriteriaFactory {
    @Override // com.beloo.widget.chipslayoutmanager.layouter.criteria.ICriteriaFactory
    public IFinishingCriteria getBackwardFinishingCriteria() {
        CriteriaLeftLayouterFinished criteriaLeftLayouterFinished = new CriteriaLeftLayouterFinished();
        int i = this.additionalLength;
        return i != 0 ? new CriteriaLeftAdditionalWidth(criteriaLeftLayouterFinished, i) : criteriaLeftLayouterFinished;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.criteria.ICriteriaFactory
    public IFinishingCriteria getForwardFinishingCriteria() {
        IFinishingCriteria criteriaRightLayouterFinished = new CriteriaRightLayouterFinished();
        int i = this.additionalLength;
        if (i != 0) {
            criteriaRightLayouterFinished = new CriteriaRightAdditionalWidth(criteriaRightLayouterFinished, i);
        }
        int i2 = this.additionalRowCount;
        return i2 != 0 ? new CriteriaAdditionalRow(criteriaRightLayouterFinished, i2) : criteriaRightLayouterFinished;
    }
}
