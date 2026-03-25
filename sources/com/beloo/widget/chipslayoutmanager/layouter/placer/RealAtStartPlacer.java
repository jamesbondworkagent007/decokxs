package com.beloo.widget.chipslayoutmanager.layouter.placer;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes21.dex */
class RealAtStartPlacer extends AbstractPlacer implements IPlacer {
    public RealAtStartPlacer(RecyclerView.LayoutManager layoutManager) {
        super(layoutManager);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.placer.IPlacer
    public void addView(View view) {
        getLayoutManager().addView(view, 0);
    }
}
