package com.beloo.widget.chipslayoutmanager.gravity;

/* JADX INFO: loaded from: classes21.dex */
public class LTRRowStrategyFactory implements IRowStrategyFactory {
    @Override // com.beloo.widget.chipslayoutmanager.gravity.IRowStrategyFactory
    public IRowStrategy createRowStrategy(int i) {
        if (i == 2) {
            return new LTRRowFillStrategy();
        }
        if (i == 4) {
            return new LTRRowFillSpaceStrategy();
        }
        if (i == 5) {
            return new LTRRowFillSpaceCenterStrategy();
        }
        if (i == 6) {
            return new LTRRowFillSpaceCenterDenseStrategy();
        }
        return new EmptyRowStrategy();
    }
}
