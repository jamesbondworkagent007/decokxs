package com.okinc.business.defi.wallet.home.nestedscroll;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.NestedScrollingChild3;
import kotlin.jvm.internal.Intrinsics;
import o.C18133fce;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CoorLayoutSuper extends CoordinatorLayout implements NestedScrollingChild3 {
    public final C18133fce EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoorLayoutSuper(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new C18133fce(this);
        setNestedScrollingEnabled(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoorLayoutSuper(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoorLayoutSuper(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NotNull View view, @NotNull View view2, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        return startNestedScroll(i, i2) || super.onStartNestedScroll(view, view2, i, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NotNull View view, int i, int i2, @NotNull int[] iArr, int i3) {
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
    public void onNestedScroll(@NotNull View view, int i, int i2, int i3, int i4, int i5, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        if (i4 < 0) {
            int[] iArr2 = {0, 0};
            super.onNestedScroll(view, i, i2, i3, i4, i5, iArr);
            int i6 = iArr[1];
            int i7 = i4 - i6;
            iArr[1] = 0;
            if (this.EZpvd.OLrzqt(i5) instanceof MotionLayout) {
                dispatchNestedPreScroll(i3, i7, iArr, iArr2, i5);
            } else {
                dispatchNestedScroll(i, i2, i3, i7, iArr2, i5, iArr);
            }
            iArr[1] = iArr[1] + i6;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onStopNestedScroll(view, i);
        stopNestedScroll(i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NotNull View view, float f, float f2, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        if (f2 >= 0.0f) {
            return false;
        }
        boolean zOnNestedFling = super.onNestedFling(view, f, f2, z);
        return !zOnNestedFling ? dispatchNestedFling(f, f2, z) : zOnNestedFling;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NotNull View view, float f, float f2) {
        Intrinsics.checkNotNullParameter(view, "");
        if (f2 <= 0.0f) {
            return false;
        }
        boolean zDispatchNestedPreFling = dispatchNestedPreFling(f, f2);
        return !zDispatchNestedPreFling ? super.onNestedPreFling(view, f, f2) : zDispatchNestedPreFling;
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        return this.EZpvd.copydefault(i, i2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        this.EZpvd.KWHzl(i);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i) {
        return this.EZpvd.EZpvd(i);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, @NotNull int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr2, "");
        this.EZpvd.KWHzl(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.EZpvd.AEQbTJ(i, i2, i3, i4, iArr, i5);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.EZpvd.copydefault(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.EZpvd.copydefault(z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.EZpvd.EZpvd();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.EZpvd.AEQbTJ(f, f2, z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.EZpvd.EZpvd(f, f2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static class Behavior2<V extends View> extends CoordinatorLayout.Behavior<V> {
        public Behavior2(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public Behavior2() {
            this(null, null);
        }
    }
}
