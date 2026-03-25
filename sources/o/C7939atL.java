package o;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.atL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7939atL extends CoordinatorLayout {
    public boolean KWHzl;
    public final int[] OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportHorizontal(boolean z) {
        this.KWHzl = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7939atL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = new int[2];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7939atL(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7939atL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNestedPreScroll(@NotNull final android.view.View view, final int i, final int i2, @NotNull final int[] iArr, final int i3) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        if (this.KWHzl && i2 > 0) {
            int childCount = getChildCount();
            boolean z = false;
            int iMax = 0;
            int iMax2 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                android.view.View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 8) {
                    iMax = iMax;
                } else {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    Intrinsics.copydefault(layoutParams, "");
                    CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                    if (behavior != null) {
                        int[] iArr2 = this.OLrzqt;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        Intrinsics.copydefault(childAt);
                        int i5 = iMax;
                        behavior.onNestedPreScroll(this, childAt, view, i, i2, this.OLrzqt, i3);
                        iMax2 = i > 0 ? java.lang.Math.max(iMax2, this.OLrzqt[0]) : java.lang.Math.min(iMax2, this.OLrzqt[0]);
                        iMax = i2 > 0 ? java.lang.Math.max(i5, this.OLrzqt[1]) : java.lang.Math.min(i5, this.OLrzqt[1]);
                        z = true;
                    }
                }
            }
            iArr[0] = iMax2;
            iArr[1] = iMax;
            if (z) {
                OLrzqt(new Function0() { // from class: o.atR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C7939atL.AEQbTJ(this.OLrzqt, view, i, i2, iArr, i3);
                    }
                });
                return;
            }
            return;
        }
        super.onNestedPreScroll(view, i, i2, iArr, i3);
    }

    public static final Unit AEQbTJ(C7939atL c7939atL, android.view.View view, int i, int i2, int[] iArr, int i3) {
        super.onNestedPreScroll(view, i, i2, iArr, i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNestedScroll(@NotNull final android.view.View view, final int i, final int i2, final int i3, final int i4, final int i5, @NotNull final int[] iArr) {
        int i6;
        int iMin;
        int iMin2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        if (this.KWHzl) {
            int childCount = getChildCount();
            boolean z = false;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i9 < childCount) {
                android.view.View childAt = getChildAt(i9);
                if (childAt.getVisibility() == 8) {
                    i6 = i9;
                    i8 = i8;
                    i7 = i7;
                } else {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    Intrinsics.copydefault(layoutParams, "");
                    CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                    if (behavior != null) {
                        int[] iArr2 = this.OLrzqt;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        Intrinsics.copydefault(childAt);
                        int i10 = i7;
                        int i11 = i8;
                        i6 = i9;
                        behavior.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, this.OLrzqt);
                        if (i3 > 0) {
                            iMin = java.lang.Math.max(i11, this.OLrzqt[0]);
                        } else {
                            iMin = java.lang.Math.min(i11, this.OLrzqt[0]);
                        }
                        i8 = iMin;
                        if (i4 > 0) {
                            iMin2 = java.lang.Math.max(i10, this.OLrzqt[1]);
                        } else {
                            iMin2 = java.lang.Math.min(i10, this.OLrzqt[1]);
                        }
                        i7 = iMin2;
                        z = true;
                    }
                }
                i9 = i6 + 1;
            }
            iArr[0] = iArr[0] + i8;
            iArr[1] = iArr[1] + i7;
            if (z) {
                OLrzqt(new Function0() { // from class: o.atI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C7939atL.EZpvd(this.AEQbTJ, view, i, i2, i3, i4, i5, iArr);
                    }
                });
                return;
            }
            return;
        }
        super.onNestedScroll(view, i, i2, i3, i4, i5, iArr);
    }

    public static final Unit EZpvd(C7939atL c7939atL, android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        super.onNestedScroll(view, i, i2, i3, i4, i5, iArr);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(Function0<Unit> function0) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            java.lang.reflect.Method declaredMethod = CoordinatorLayout.class.getDeclaredMethod("onChildViewsChanged", java.lang.Integer.TYPE);
            declaredMethod.setAccessible(true);
            objM7377constructorimpl = Result.m7377constructorimpl(declaredMethod.invoke(this, 1));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            function0.invoke();
            C43296rmc.KWHzl("thc", "MyLayoutSuper onNestedPreScroll onChildViewsChanged error:  message：" + thM7380exceptionOrNullimpl.getMessage() + " localizedMessage：" + thM7380exceptionOrNullimpl.getLocalizedMessage() + " stackTrace：" + thM7380exceptionOrNullimpl.getStackTrace());
        }
    }
}
