package com.okinc.cruilib.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class CustomSpeedLinearLayoutManager extends LinearLayoutManager {
    public final float KWHzl;

    public static final class TaskDescription extends LinearSmoothScroller {
        public TaskDescription(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            Intrinsics.checkNotNullParameter(displayMetrics, "");
            return super.calculateSpeedPerPixel(displayMetrics) * CustomSpeedLinearLayoutManager.this.KWHzl;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(@NotNull RecyclerView recyclerView, RecyclerView.State state, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        TaskDescription taskDescription = new TaskDescription(recyclerView.getContext());
        taskDescription.setTargetPosition(i);
        startSmoothScroll(taskDescription);
    }
}
