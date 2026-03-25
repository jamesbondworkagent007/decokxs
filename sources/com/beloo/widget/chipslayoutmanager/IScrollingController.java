package com.beloo.widget.chipslayoutmanager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;

/* JADX INFO: loaded from: classes21.dex */
public interface IScrollingController {
    boolean canScrollHorizontally();

    boolean canScrollVertically();

    int computeHorizontalScrollExtent(RecyclerView.State state);

    int computeHorizontalScrollOffset(RecyclerView.State state);

    int computeHorizontalScrollRange(RecyclerView.State state);

    int computeVerticalScrollExtent(RecyclerView.State state);

    int computeVerticalScrollOffset(RecyclerView.State state);

    int computeVerticalScrollRange(RecyclerView.State state);

    RecyclerView.SmoothScroller createSmoothScroller(@NonNull Context context, int i, int i2, AnchorViewState anchorViewState);

    boolean normalizeGaps(RecyclerView.Recycler recycler, RecyclerView.State state);

    int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state);

    int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state);
}
