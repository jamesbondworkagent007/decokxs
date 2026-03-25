package com.beloo.widget.chipslayoutmanager.layouter;

import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.gravity.IRowStrategyFactory;
import com.beloo.widget.chipslayoutmanager.gravity.RTLRowStrategyFactory;
import com.beloo.widget.chipslayoutmanager.layouter.breaker.IBreakerFactory;
import com.beloo.widget.chipslayoutmanager.layouter.breaker.RTLRowBreakerFactory;

/* JADX INFO: loaded from: classes21.dex */
class RTLRowsOrientationStateFactory implements IOrientationStateFactory {
    @Override // com.beloo.widget.chipslayoutmanager.layouter.IOrientationStateFactory
    public ILayouterCreator createLayouterCreator(RecyclerView.LayoutManager layoutManager) {
        return new RTLRowsCreator(layoutManager);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IOrientationStateFactory
    public IRowStrategyFactory createRowStrategyFactory() {
        return new RTLRowStrategyFactory();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IOrientationStateFactory
    public IBreakerFactory createDefaultBreaker() {
        return new RTLRowBreakerFactory();
    }
}
