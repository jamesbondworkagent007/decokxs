package o;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uAe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C47971uAe extends CoordinatorLayout implements NestedScrollingChild3 {
    public final NestedScrollingChildHelper EZpvd;
    public int KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C47971uAe(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C47971uAe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.uAe.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C47971uAe(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47971uAe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = "TradeNestedCL";
        NestedScrollingChildHelper nestedScrollingChildHelper = new NestedScrollingChildHelper(this);
        nestedScrollingChildHelper.setNestedScrollingEnabled(true);
        this.EZpvd = nestedScrollingChildHelper;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.EZpvd.setNestedScrollingEnabled(z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.EZpvd.isNestedScrollingEnabled();
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        return this.EZpvd.startNestedScroll(i, i2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        this.EZpvd.stopNestedScroll(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i) {
        return this.EZpvd.hasNestedScrollingParent(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.EZpvd.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.EZpvd.dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, @NotNull int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr2, "");
        this.EZpvd.dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.EZpvd.dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.EZpvd.dispatchNestedFling(f, f2, z);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NotNull android.view.View view, @NotNull android.view.View view2, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        boolean zOnStartNestedScroll = super.onStartNestedScroll(view, view2, i, i2);
        int i3 = this.KWHzl + 1;
        this.KWHzl = i3;
        pUU.EZpvd(this.OLrzqt, "G" + i3 + " start: target=" + view2.getClass().getSimpleName() + ", axes=" + i + ", type=" + i2 + ", accepted=" + zOnStartNestedScroll);
        return zOnStartNestedScroll | startNestedScroll(i, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onStopNestedScroll(view, i);
        stopNestedScroll(i);
        pUU.EZpvd(this.OLrzqt, "G" + this.KWHzl + " stop: target=" + view.getClass().getSimpleName() + ", type=" + i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NotNull android.view.View view, int i, int i2, @NotNull int[] iArr, int i3) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        int[] iArr2 = new int[2];
        dispatchNestedPreScroll(i, i2, iArr2, null, i3);
        int[] iArr3 = new int[2];
        super.onNestedPreScroll(view, i - iArr2[0], i2 - iArr2[1], iArr3, i3);
        iArr[0] = iArr2[0] + iArr3[0];
        int i4 = iArr2[1] + iArr3[1];
        iArr[1] = i4;
        pUU.EZpvd(this.OLrzqt, "G" + this.KWHzl + " pre: dy=" + i2 + ", type=" + i3 + ", parentY=" + iArr2[1] + ", coordinatorY=" + iArr3[1] + ", totalY=" + i4);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onNestedScroll(view, i, i2, i3, i4, i5);
        dispatchNestedScroll(i, i2, i3, i4, null, i5);
        if (i4 != 0) {
            pUU.EZpvd(this.OLrzqt, "G" + this.KWHzl + " scroll: dyUnc=" + i4 + ", type=" + i5 + ", target=" + view.getClass().getSimpleName());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        int[] iArr2 = new int[2];
        super.onNestedScroll(view, i, i2, i3, i4, i5, iArr2);
        int[] iArr3 = new int[2];
        dispatchNestedScroll(i, i2, i3 - iArr2[0], i4 - iArr2[1], null, i5, iArr3);
        iArr[0] = iArr2[0] + iArr3[0];
        iArr[1] = iArr2[1] + iArr3[1];
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NotNull android.view.View view, float f, float f2) {
        Intrinsics.checkNotNullParameter(view, "");
        return dispatchNestedPreFling(f, f2) || super.onNestedPreFling(view, f, f2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NotNull android.view.View view, float f, float f2, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        return dispatchNestedFling(f, f2, z) || super.onNestedFling(view, f, f2, z);
    }
}
