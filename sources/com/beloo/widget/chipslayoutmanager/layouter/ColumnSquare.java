package com.beloo.widget.chipslayoutmanager.layouter;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes21.dex */
class ColumnSquare extends Square {
    @Override // com.beloo.widget.chipslayoutmanager.IBorder
    public final int getCanvasLeftBorder() {
        return 0;
    }

    public ColumnSquare(RecyclerView.LayoutManager layoutManager) {
        super(layoutManager);
    }

    @Override // com.beloo.widget.chipslayoutmanager.IBorder
    public final int getCanvasRightBorder() {
        return this.lm.getWidth();
    }

    @Override // com.beloo.widget.chipslayoutmanager.IBorder
    public final int getCanvasBottomBorder() {
        return this.lm.getHeight() - this.lm.getPaddingBottom();
    }

    @Override // com.beloo.widget.chipslayoutmanager.IBorder
    public final int getCanvasTopBorder() {
        return this.lm.getPaddingTop();
    }
}
