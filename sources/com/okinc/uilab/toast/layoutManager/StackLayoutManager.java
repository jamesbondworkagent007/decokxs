package com.okinc.uilab.toast.layoutManager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C55298xhM;

/* JADX INFO: loaded from: classes11.dex */
public final class StackLayoutManager extends RecyclerView.LayoutManager {
    public int OLrzqt = (int) C55298xhM.dp$default(10.0f, (Context) null, 1, (Object) null);

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        super.onLayoutChildren(recycler, state);
        if (recycler == null || state == null) {
            return;
        }
        super.onLayoutChildren(recycler, state);
        detachAndScrapAttachedViews(recycler);
        int itemCount = getItemCount() <= 3 ? getItemCount() : 3;
        if (itemCount == 0) {
            return;
        }
        for (int i = itemCount - 1; -1 < i; i--) {
            View viewForPosition = recycler.getViewForPosition(i);
            Intrinsics.checkNotNullExpressionValue(viewForPosition, "");
            int i2 = 0;
            measureChildWithMargins(viewForPosition, 0, 0);
            int width = getWidth();
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition);
            int i3 = this.OLrzqt;
            ViewGroup.LayoutParams layoutParams = viewForPosition.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                i2 = marginLayoutParams.topMargin;
            }
            int i4 = (i3 * i) + i2;
            int i5 = (width - decoratedMeasuredWidth) / 2;
            layoutDecorated(viewForPosition, i5, i4, getDecoratedMeasuredWidth(viewForPosition) + i5, getDecoratedMeasuredHeight(viewForPosition) + i4);
            addView(viewForPosition);
        }
    }
}
