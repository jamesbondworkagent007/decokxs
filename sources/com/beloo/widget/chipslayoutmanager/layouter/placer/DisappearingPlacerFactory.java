package com.beloo.widget.chipslayoutmanager.layouter.placer;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes21.dex */
class DisappearingPlacerFactory implements IPlacerFactory {
    private RecyclerView.LayoutManager layoutManager;

    public DisappearingPlacerFactory(RecyclerView.LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.placer.IPlacerFactory
    public IPlacer getAtStartPlacer() {
        return new DisappearingViewAtStartPlacer(this.layoutManager);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.placer.IPlacerFactory
    public IPlacer getAtEndPlacer() {
        return new DisappearingViewAtEndPlacer(this.layoutManager);
    }
}
