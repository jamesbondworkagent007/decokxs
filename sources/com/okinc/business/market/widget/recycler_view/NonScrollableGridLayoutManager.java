package com.okinc.business.market.widget.recycler_view;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class NonScrollableGridLayoutManager extends GridLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return false;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (r2v0 int)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r3v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(android.content.Context, int, int, boolean):void (m)] (LINE:7) call: com.okinc.business.market.widget.recycler_view.NonScrollableGridLayoutManager.<init>(android.content.Context, int, int, boolean):void type: THIS */
    public /* synthetic */ NonScrollableGridLayoutManager(Context context, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, (i3 & 4) != 0 ? 1 : i2, (i3 & 8) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonScrollableGridLayoutManager(@NotNull Context context, int i, int i2, boolean z) {
        super(context, i, i2, z);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
