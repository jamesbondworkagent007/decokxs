package com.beloo.widget.chipslayoutmanager.layouter;

import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.gravity.IRowStrategyFactory;
import com.beloo.widget.chipslayoutmanager.layouter.breaker.IBreakerFactory;

/* JADX INFO: loaded from: classes21.dex */
interface IOrientationStateFactory {
    IBreakerFactory createDefaultBreaker();

    ILayouterCreator createLayouterCreator(RecyclerView.LayoutManager layoutManager);

    IRowStrategyFactory createRowStrategyFactory();
}
