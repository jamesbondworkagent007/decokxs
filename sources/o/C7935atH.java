package o;

import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.NestedScrollingChild3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.atH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7935atH extends CoordinatorLayout implements NestedScrollingChild3 {
    public final C7931atD OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7935atH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = new C7931atD(this);
        setNestedScrollingEnabled(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7935atH(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7935atH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NotNull android.view.View view, @NotNull android.view.View view2, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        return super.onStartNestedScroll(view, view2, i, i2) | startNestedScroll(i, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NotNull android.view.View view, @NotNull android.view.View view2, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        super.onNestedScrollAccepted(view, view2, i, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NotNull android.view.View view, int i, int i2, @NotNull int[] iArr, int i3) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        if (i2 != 0) {
            int[] iArr2 = {0, 0};
            if (i2 >= 0) {
                dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
                int i4 = iArr[1];
                iArr[1] = 0;
                super.onNestedPreScroll(view, i, i2 - i4, iArr, i3);
                iArr[1] = iArr[1] + i4;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        if (i4 < 0) {
            int[] iArr2 = {0, 0};
            super.onNestedScroll(view, i, i2, i3, i4, i5, iArr);
            int i6 = iArr[1];
            int i7 = i4 - i6;
            iArr[1] = 0;
            if (this.OLrzqt.KWHzl(i5) instanceof MotionLayout) {
                dispatchNestedPreScroll(i3, i7, iArr, iArr2, i5);
            } else {
                dispatchNestedScroll(i, i2, i3, i7, iArr2, i5, iArr);
            }
            iArr[1] = iArr[1] + i6;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onStopNestedScroll(view, i);
        stopNestedScroll(i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NotNull android.view.View view, float f, float f2, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        if (f2 >= 0.0f) {
            return false;
        }
        boolean zOnNestedFling = super.onNestedFling(view, f, f2, z);
        return !zOnNestedFling ? dispatchNestedFling(f, f2, z) : zOnNestedFling;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NotNull android.view.View view, float f, float f2) {
        Intrinsics.checkNotNullParameter(view, "");
        if (f2 <= 0.0f) {
            return false;
        }
        dispatchNestedPreFling(f, f2);
        return super.onNestedPreFling(view, f, f2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        return this.OLrzqt.AEQbTJ(i, i2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        this.OLrzqt.AEQbTJ(i);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i) {
        return this.OLrzqt.OLrzqt(i);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, @NotNull int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr2, "");
        this.OLrzqt.AEQbTJ(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.OLrzqt.OLrzqt(i, i2, i3, i4, iArr, i5);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.OLrzqt.KWHzl(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.OLrzqt.EZpvd(z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.OLrzqt.OLrzqt();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.OLrzqt.EZpvd(f, f2, z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.OLrzqt.copydefault(f, f2);
    }
}
