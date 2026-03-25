package com.beloo.widget.chipslayoutmanager.layouter.placer;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes21.dex */
class DisappearingViewAtStartPlacer extends AbstractPlacer {
    public DisappearingViewAtStartPlacer(RecyclerView.LayoutManager layoutManager) {
        super(layoutManager);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.placer.IPlacer
    public void addView(View view) {
        getLayoutManager().addDisappearingView(view, 0);
    }
}
