package com.okinc.widget.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class CenterLayoutManager extends LinearLayoutManager {
    public CenterLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public CenterLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        Application application = new Application(recyclerView.getContext());
        application.setTargetPosition(i);
        startSmoothScroll(application);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public final class Application extends LinearSmoothScroller {
        public Application(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(@NotNull DisplayMetrics displayMetrics) {
            Intrinsics.checkNotNullParameter(displayMetrics, "");
            return 100.0f / displayMetrics.densityDpi;
        }
    }
}
