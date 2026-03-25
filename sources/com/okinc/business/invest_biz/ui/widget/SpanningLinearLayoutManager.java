package com.okinc.business.invest_biz.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SpanningLinearLayoutManager extends LinearLayoutManager {
    public final int AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 android.content.Context)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
 A[MD:(android.content.Context, int, int, int, int):void (m)] (LINE:18) call: com.okinc.business.invest_biz.ui.widget.SpanningLinearLayoutManager.<init>(android.content.Context, int, int, int, int):void type: THIS */
    public /* synthetic */ SpanningLinearLayoutManager(Context context, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpanningLinearLayoutManager(@NotNull Context context, int i, int i2, int i3, int i4) {
        super(context, 0, false);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = i;
        this.OLrzqt = i2;
        this.EZpvd = i3;
        this.AEQbTJ = i4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.copydefault && getOrientation() == 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.copydefault && getOrientation() == 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        RecyclerView.LayoutParams layoutParamsGenerateDefaultLayoutParams = super.generateDefaultLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParamsGenerateDefaultLayoutParams, "");
        return KWHzl(layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        RecyclerView.LayoutParams layoutParamsGenerateLayoutParams = super.generateLayoutParams(layoutParams);
        Intrinsics.checkNotNullExpressionValue(layoutParamsGenerateLayoutParams, "");
        return KWHzl(layoutParamsGenerateLayoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        RecyclerView.LayoutParams layoutParamsGenerateLayoutParams = super.generateLayoutParams(context, attributeSet);
        Intrinsics.checkNotNullExpressionValue(layoutParamsGenerateLayoutParams, "");
        return KWHzl(layoutParamsGenerateLayoutParams);
    }

    public final RecyclerView.LayoutParams KWHzl(RecyclerView.LayoutParams layoutParams) {
        int orientation = getOrientation();
        if (orientation == 0) {
            int iEZpvd = EZpvd() / Math.max(getItemCount(), this.AEQbTJ);
            int i = this.EZpvd;
            this.copydefault = iEZpvd < i;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = Math.max(iEZpvd, i);
        } else if (orientation == 1) {
            int iCopydefault = copydefault() / Math.max(getItemCount(), this.AEQbTJ);
            int i2 = this.EZpvd;
            this.copydefault = iCopydefault < i2;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = Math.max(iCopydefault, i2);
        }
        return layoutParams;
    }

    private final int EZpvd() {
        return (((getWidth() - getPaddingEnd()) - getPaddingStart()) + this.OLrzqt) - this.KWHzl;
    }

    public final int copydefault() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }
}
