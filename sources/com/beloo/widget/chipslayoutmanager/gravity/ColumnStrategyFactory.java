package com.beloo.widget.chipslayoutmanager.gravity;

/* JADX INFO: loaded from: classes21.dex */
public class ColumnStrategyFactory implements IRowStrategyFactory {
    @Override // com.beloo.widget.chipslayoutmanager.gravity.IRowStrategyFactory
    public IRowStrategy createRowStrategy(int i) {
        if (i == 2) {
            return new ColumnFillStrategy();
        }
        if (i == 4) {
            return new ColumnFillSpaceStrategy();
        }
        if (i == 5) {
            return new ColumnFillSpaceCenterStrategy();
        }
        if (i == 6) {
            return new ColumnFillSpaceCenterDenseStrategy();
        }
        return new EmptyRowStrategy();
    }
}
