package com.beloo.widget.chipslayoutmanager.layouter;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes21.dex */
class RowSquare extends Square {
    @Override // com.beloo.widget.chipslayoutmanager.IBorder
    public final int getCanvasTopBorder() {
        return 0;
    }

    public RowSquare(RecyclerView.LayoutManager layoutManager) {
        super(layoutManager);
    }

    @Override // com.beloo.widget.chipslayoutmanager.IBorder
    public final int getCanvasRightBorder() {
        return this.lm.getWidth() - this.lm.getPaddingRight();
    }

    @Override // com.beloo.widget.chipslayoutmanager.IBorder
    public final int getCanvasBottomBorder() {
        return this.lm.getHeight();
    }

    @Override // com.beloo.widget.chipslayoutmanager.IBorder
    public final int getCanvasLeftBorder() {
        return this.lm.getPaddingLeft();
    }
}
