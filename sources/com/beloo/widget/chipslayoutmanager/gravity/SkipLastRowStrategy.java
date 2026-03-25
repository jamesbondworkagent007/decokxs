package com.beloo.widget.chipslayoutmanager.gravity;

import androidx.annotation.NonNull;
import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;
import com.beloo.widget.chipslayoutmanager.layouter.Item;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class SkipLastRowStrategy extends StrategyDecorator {
    private boolean skipLastRow;

    public SkipLastRowStrategy(@NonNull IRowStrategy iRowStrategy, boolean z) {
        super(iRowStrategy);
        this.skipLastRow = z;
    }

    @Override // com.beloo.widget.chipslayoutmanager.gravity.StrategyDecorator, com.beloo.widget.chipslayoutmanager.gravity.IRowStrategy
    public void applyStrategy(AbstractLayouter abstractLayouter, List<Item> list) {
        if (!this.skipLastRow || abstractLayouter.isRowCompleted()) {
            super.applyStrategy(abstractLayouter, list);
        }
    }
}
