package com.beloo.widget.chipslayoutmanager;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class SpacingItemDecoration extends RecyclerView.ItemDecoration {
    private int horizontalSpacing;
    private int verticalSpacing;

    public SpacingItemDecoration(int i, int i2) {
        this.horizontalSpacing = i;
        this.verticalSpacing = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i = this.horizontalSpacing / 2;
        rect.left = i;
        rect.right = i;
        int i2 = this.verticalSpacing / 2;
        rect.top = i2;
        rect.bottom = i2;
    }
}
