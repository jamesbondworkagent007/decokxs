package com.okinc.market_widget;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ScrollSpeedLinearLayoutManger extends LinearLayoutManager {
    public float AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollSpeedLinearLayoutManger(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = context.getResources().getDisplayMetrics().density * 0.3f;
    }

    public static final class ActionBar extends LinearSmoothScroller {
        public ActionBar(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            Intrinsics.checkNotNullParameter(displayMetrics, "");
            return ScrollSpeedLinearLayoutManger.this.AEQbTJ / displayMetrics.density;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        ActionBar actionBar = new ActionBar(recyclerView.getContext());
        actionBar.setTargetPosition(i);
        startSmoothScroll(actionBar);
    }
}
