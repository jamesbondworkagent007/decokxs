package com.beloo.widget.chipslayoutmanager.gravity;

/* JADX INFO: loaded from: classes21.dex */
public class RTLRowStrategyFactory implements IRowStrategyFactory {
    @Override // com.beloo.widget.chipslayoutmanager.gravity.IRowStrategyFactory
    public IRowStrategy createRowStrategy(int i) {
        if (i == 2) {
            return new RTLRowFillStrategy();
        }
        if (i == 4) {
            return new RTLRowFillSpaceStrategy();
        }
        if (i == 5) {
            return new RTLRowFillSpaceCenterStrategy();
        }
        if (i == 6) {
            return new RTLRowFillSpaceCenterDenseStrategy();
        }
        return new EmptyRowStrategy();
    }
}
