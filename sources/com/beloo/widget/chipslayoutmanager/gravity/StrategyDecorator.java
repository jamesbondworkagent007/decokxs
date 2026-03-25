package com.beloo.widget.chipslayoutmanager.gravity;

import androidx.annotation.NonNull;
import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;
import com.beloo.widget.chipslayoutmanager.layouter.Item;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
class StrategyDecorator implements IRowStrategy {
    private IRowStrategy rowStrategy;

    public StrategyDecorator(@NonNull IRowStrategy iRowStrategy) {
        this.rowStrategy = iRowStrategy;
    }

    @Override // com.beloo.widget.chipslayoutmanager.gravity.IRowStrategy
    public void applyStrategy(AbstractLayouter abstractLayouter, List<Item> list) {
        this.rowStrategy.applyStrategy(abstractLayouter, list);
    }
}
