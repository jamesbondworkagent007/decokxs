package com.beloo.widget.chipslayoutmanager.layouter;

import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.gravity.IRowStrategyFactory;
import com.beloo.widget.chipslayoutmanager.gravity.LTRRowStrategyFactory;
import com.beloo.widget.chipslayoutmanager.layouter.breaker.IBreakerFactory;
import com.beloo.widget.chipslayoutmanager.layouter.breaker.LTRRowBreakerFactory;

/* JADX INFO: loaded from: classes21.dex */
class LTRRowsOrientationStateFactory implements IOrientationStateFactory {
    @Override // com.beloo.widget.chipslayoutmanager.layouter.IOrientationStateFactory
    public ILayouterCreator createLayouterCreator(RecyclerView.LayoutManager layoutManager) {
        return new LTRRowsCreator(layoutManager);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IOrientationStateFactory
    public IRowStrategyFactory createRowStrategyFactory() {
        return new LTRRowStrategyFactory();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IOrientationStateFactory
    public IBreakerFactory createDefaultBreaker() {
        return new LTRRowBreakerFactory();
    }
}
