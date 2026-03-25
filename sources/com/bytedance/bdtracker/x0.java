package com.bytedance.bdtracker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class x0 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f293a;
    public int b;
    public final int c;
    public final yHO<Float, Float, Integer, Unit> d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yHO<? super java.lang.Float, ? super java.lang.Float, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public x0(int i, @NotNull yHO<? super Float, ? super Float, ? super Integer, Unit> yho) {
        Intrinsics.EZpvd((Object) yho, "");
        this.c = i;
        this.d = yho;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        Intrinsics.EZpvd((Object) recyclerView, "");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            if (Math.abs(this.f293a) >= this.c || Math.abs(this.b) >= this.c) {
                yHO<Float, Float, Integer, Unit> yho = this.d;
                float f = this.f293a;
                float f2 = this.b;
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                int i2 = 1;
                if (layoutManager instanceof LinearLayoutManager) {
                    RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                    if (layoutManager2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    }
                    int orientation = ((LinearLayoutManager) layoutManager2).getOrientation();
                    if (orientation == 0) {
                        i2 = this.f293a > 0 ? 4 : 3;
                    } else if (orientation != 1 || this.b > 0) {
                        i2 = 2;
                    }
                } else if (!(layoutManager instanceof StaggeredGridLayoutManager) || this.b > 0) {
                }
                yho.invoke(Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i2));
                this.f293a = 0;
                this.b = 0;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        Intrinsics.EZpvd((Object) recyclerView, "");
        super.onScrolled(recyclerView, i, i2);
        if (Math.abs(i) > this.c || Math.abs(i2) > this.c) {
            int i3 = this.f293a;
            this.f293a = i > 0 ? Math.max(i3, i) : Math.min(i3, i);
            int i4 = this.b;
            this.b = i2 > 0 ? Math.max(i4, i2) : Math.min(i4, i2);
        }
    }
}
