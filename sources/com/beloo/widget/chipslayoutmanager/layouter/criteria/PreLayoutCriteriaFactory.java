package com.beloo.widget.chipslayoutmanager.layouter.criteria;

/* JADX INFO: loaded from: classes21.dex */
public class PreLayoutCriteriaFactory implements ICriteriaFactory {
    private int additionalHeight;
    private int additionalRowsCount;

    public PreLayoutCriteriaFactory(int i, int i2) {
        this.additionalHeight = i;
        this.additionalRowsCount = i2;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.criteria.ICriteriaFactory
    public IFinishingCriteria getBackwardFinishingCriteria() {
        return new CriteriaUpAdditionalHeight(new CriteriaUpLayouterFinished(), this.additionalHeight);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.criteria.ICriteriaFactory
    public IFinishingCriteria getForwardFinishingCriteria() {
        return new CriteriaAdditionalRow(new CriteriaDownAdditionalHeight(new CriteriaDownLayouterFinished(), this.additionalHeight), this.additionalRowsCount);
    }
}
