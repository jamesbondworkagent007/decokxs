package com.immomo.mls.fun.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import o.C7326ahi;
import o.C7531alb;
import o.C7870arw;
import o.InterfaceC7473akW;

/* JADX INFO: loaded from: classes14.dex */
public class LuaLinearLayoutManager extends LinearLayoutManager implements InterfaceC7473akW {
    public TaskDescription AEQbTJ;
    public boolean KWHzl;
    public final C7531alb copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7473akW
    public void KWHzl(boolean z) {
        this.KWHzl = z;
    }

    public LuaLinearLayoutManager(Context context) {
        super(context);
        this.KWHzl = true;
        this.copydefault = new C7531alb();
    }

    public LuaLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.KWHzl = true;
        this.copydefault = new C7531alb();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.KWHzl && super.canScrollVertically();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.KWHzl && super.canScrollHorizontally();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(@NonNull View view, int i, int i2) {
        super.measureChildWithMargins(view, i, i2);
        this.copydefault.AEQbTJ(this, view);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return this.copydefault.EZpvd(this);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            return super.scrollVerticallyBy(i, recycler, state);
        } catch (Throwable th) {
            if (C7326ahi.EZpvd) {
                C7870arw.AEQbTJ(th, new Object[0]);
            }
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = new TaskDescription(recyclerView.getContext());
        }
        this.AEQbTJ.setTargetPosition(i);
        startSmoothScroll(this.AEQbTJ);
    }

    /* JADX INFO: loaded from: classes22.dex */
    public class TaskDescription extends LinearSmoothScroller {
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            return -1;
        }

        public TaskDescription(Context context) {
            super(context);
        }
    }
}
