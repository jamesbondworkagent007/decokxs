package com.okinc.core.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public class FullyLinearLayoutManager extends LinearLayoutManager {
    public int[] AEQbTJ;

    public FullyLinearLayoutManager(Context context) {
        super(context);
        this.AEQbTJ = new int[2];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < getItemCount(); i5++) {
            EZpvd(recycler, View.MeasureSpec.makeMeasureSpec(i5, 0), View.MeasureSpec.makeMeasureSpec(i5, 0), this.AEQbTJ);
            if (getOrientation() == 0) {
                int[] iArr = this.AEQbTJ;
                i3 += iArr[0];
                if (i5 == 0) {
                    i4 = iArr[1];
                }
            } else {
                int[] iArr2 = this.AEQbTJ;
                i4 += iArr2[1];
                if (i5 == 0) {
                    i3 = iArr2[0];
                }
            }
        }
        if (mode != 1073741824) {
            size = i3;
        }
        if (mode2 != 1073741824) {
            size2 = i4;
        }
        setMeasuredDimension(size, size2);
    }

    public final void EZpvd(RecyclerView.Recycler recycler, int i, int i2, int[] iArr) {
        try {
            View viewForPosition = recycler.getViewForPosition(0);
            if (viewForPosition != null) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewForPosition.getLayoutParams();
                viewForPosition.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
                iArr[0] = viewForPosition.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                iArr[1] = viewForPosition.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                recycler.recycleView(viewForPosition);
            }
        } catch (Exception unused) {
        }
    }
}
