package com.beloo.widget.chipslayoutmanager.layouter.placer;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes21.dex */
class DisappearingViewAtEndPlacer extends AbstractPlacer {
    public DisappearingViewAtEndPlacer(RecyclerView.LayoutManager layoutManager) {
        super(layoutManager);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.placer.IPlacer
    public void addView(View view) {
        getLayoutManager().addDisappearingView(view);
    }
}
