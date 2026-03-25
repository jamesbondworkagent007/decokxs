package com.beloo.widget.chipslayoutmanager.layouter.placer;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes21.dex */
class RealPlacerFactory implements IPlacerFactory {
    private RecyclerView.LayoutManager layoutManager;

    public RealPlacerFactory(RecyclerView.LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.placer.IPlacerFactory
    public IPlacer getAtStartPlacer() {
        return new RealAtStartPlacer(this.layoutManager);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.placer.IPlacerFactory
    public IPlacer getAtEndPlacer() {
        return new RealAtEndPlacer(this.layoutManager);
    }
}
