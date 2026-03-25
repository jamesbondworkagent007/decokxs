package o;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.NestedScrollingChild3;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fDS extends CoordinatorLayout implements NestedScrollingChild3 {
    public final C18133fce AEQbTJ;
    public boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFlingSlow(boolean z) {
        this.KWHzl = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fDS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = new C18133fce(this);
        setNestedScrollingEnabled(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fDS(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fDS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13754dXa.PendingIntent.EZpvd);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.KWHzl = typedArrayObtainStyledAttributes.getBoolean(C13754dXa.PendingIntent.OLrzqt, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NotNull android.view.View view, @NotNull android.view.View view2, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        return super.onStartNestedScroll(view, view2, i, i2) | (i2 != 1 ? startNestedScroll(i, i2) : false);
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

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NotNull android.view.View view, @NotNull android.view.View view2, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        super.onNestedScrollAccepted(view, view2, i, i2);
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
            if (this.AEQbTJ.OLrzqt(i5) instanceof CoordinatorLayout) {
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

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        return this.AEQbTJ.copydefault(i, i2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        this.AEQbTJ.KWHzl(i);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i) {
        return this.AEQbTJ.EZpvd(i);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, @NotNull int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr2, "");
        this.AEQbTJ.KWHzl(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.AEQbTJ.AEQbTJ(i, i2, i3, i4, iArr, i5);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.AEQbTJ.copydefault(i, i2, iArr, iArr2, i3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NotNull android.view.View view, float f, float f2, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        if (f2 >= 0.0f) {
            return false;
        }
        boolean zOnNestedFling = super.onNestedFling(view, f, f2, z);
        return !zOnNestedFling ? dispatchNestedPreFling(f, f2) : zOnNestedFling;
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

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.AEQbTJ.AEQbTJ(f, f2, z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.AEQbTJ.EZpvd(f, f2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.AEQbTJ.copydefault(z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.AEQbTJ.EZpvd();
    }
}
