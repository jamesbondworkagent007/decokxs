package com.beloo.widget.chipslayoutmanager.layouter.criteria;

/* JADX INFO: loaded from: classes21.dex */
public class InfiniteCriteriaFactory extends AbstractCriteriaFactory implements ICriteriaFactory {
    @Override // com.beloo.widget.chipslayoutmanager.layouter.criteria.ICriteriaFactory
    public IFinishingCriteria getBackwardFinishingCriteria() {
        return new InfiniteCriteria();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.criteria.ICriteriaFactory
    public IFinishingCriteria getForwardFinishingCriteria() {
        return new InfiniteCriteria();
    }
}
