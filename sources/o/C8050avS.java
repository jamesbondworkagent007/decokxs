package o;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import com.lzf.easyfloat.enums.SidePattern;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.avS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C8050avS implements InterfaceC8115awe {
    @Override // o.InterfaceC8115awe
    public android.animation.Animator OLrzqt(@NotNull android.view.View view, @NotNull WindowManager.LayoutParams layoutParams, @NotNull android.view.WindowManager windowManager, @NotNull SidePattern sidePattern) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(layoutParams, "");
        Intrinsics.checkNotNullParameter(windowManager, "");
        Intrinsics.checkNotNullParameter(sidePattern, "");
        return AEQbTJ(view, layoutParams, windowManager, sidePattern, false);
    }

    @Override // o.InterfaceC8115awe
    public android.animation.Animator AEQbTJ(@NotNull android.view.View view, @NotNull WindowManager.LayoutParams layoutParams, @NotNull android.view.WindowManager windowManager, @NotNull SidePattern sidePattern) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(layoutParams, "");
        Intrinsics.checkNotNullParameter(windowManager, "");
        Intrinsics.checkNotNullParameter(sidePattern, "");
        return AEQbTJ(view, layoutParams, windowManager, sidePattern, true);
    }

    public final android.animation.Animator AEQbTJ(android.view.View view, WindowManager.LayoutParams layoutParams, android.view.WindowManager windowManager, SidePattern sidePattern, boolean z) {
        Triple<java.lang.Integer, java.lang.Integer, java.lang.Boolean> tripleKWHzl = KWHzl(view, layoutParams, windowManager, sidePattern);
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt((z ? tripleKWHzl.getSecond() : tripleKWHzl.getFirst()).intValue(), (z ? tripleKWHzl.getFirst() : tripleKWHzl.getSecond()).intValue());
        valueAnimatorOfInt.addUpdateListener(new StateListAnimator(valueAnimatorOfInt, tripleKWHzl, layoutParams, windowManager, view));
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfInt, "");
        return valueAnimatorOfInt;
    }

    /* JADX INFO: renamed from: o.avS$StateListAnimator */
    public static final class StateListAnimator implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ android.view.WindowManager AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ Triple KWHzl;
        public final /* synthetic */ android.animation.ValueAnimator OLrzqt;
        public final /* synthetic */ WindowManager.LayoutParams copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.animation.ValueAnimator valueAnimator, Triple triple, WindowManager.LayoutParams layoutParams, android.view.WindowManager windowManager, android.view.View view) {
            this.OLrzqt = valueAnimator;
            this.KWHzl = triple;
            this.copydefault = layoutParams;
            this.AEQbTJ = windowManager;
            this.EZpvd = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
            try {
                Intrinsics.checkNotNullExpressionValue(valueAnimator, "");
                java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                int iIntValue = ((java.lang.Integer) animatedValue).intValue();
                if (((java.lang.Boolean) this.KWHzl.getThird()).booleanValue()) {
                    this.copydefault.x = iIntValue;
                } else {
                    this.copydefault.y = iIntValue;
                }
                this.AEQbTJ.updateViewLayout(this.EZpvd, this.copydefault);
            } catch (java.lang.Exception unused) {
                this.OLrzqt.cancel();
            }
        }
    }

    public final Triple<java.lang.Integer, java.lang.Integer, java.lang.Boolean> KWHzl(android.view.View view, WindowManager.LayoutParams layoutParams, android.view.WindowManager windowManager, SidePattern sidePattern) {
        int i;
        int right;
        int i2;
        int i3;
        int i4;
        int iEZpvd;
        int bottom;
        android.graphics.Rect rect = new android.graphics.Rect();
        windowManager.getDefaultDisplay().getRectSize(rect);
        int i5 = layoutParams.x;
        int right2 = rect.right - (view.getRight() + i5);
        int i6 = layoutParams.y;
        int bottom2 = rect.bottom - (view.getBottom() + i6);
        int iMin = java.lang.Math.min(i5, right2);
        int iMin2 = java.lang.Math.min(i6, bottom2);
        boolean z = false;
        switch (C8051avT.copydefault[sidePattern.ordinal()]) {
            case 1:
            case 2:
                i = layoutParams.x;
                right = view.getRight();
                i2 = -right;
                z = true;
                break;
            case 3:
            case 4:
                i = layoutParams.x;
                i2 = rect.right;
                z = true;
                break;
            case 5:
            case 6:
                i = layoutParams.y;
                i2 = -view.getBottom();
                break;
            case 7:
            case 8:
                i3 = layoutParams.y;
                i4 = rect.bottom;
                iEZpvd = EZpvd(view, layoutParams);
                i2 = iEZpvd + i4;
                i = i3;
                break;
            case 9:
            case 10:
            case 11:
                i = layoutParams.x;
                if (i5 >= right2) {
                    i2 = rect.right;
                    z = true;
                } else {
                    right = view.getRight();
                    i2 = -right;
                    z = true;
                }
                break;
            case 12:
            case 13:
                i3 = layoutParams.y;
                if (i6 < bottom2) {
                    bottom = view.getBottom();
                    i2 = -bottom;
                    i = i3;
                } else {
                    i4 = rect.bottom;
                    iEZpvd = EZpvd(view, layoutParams);
                    i2 = iEZpvd + i4;
                    i = i3;
                }
                break;
            default:
                if (iMin <= iMin2) {
                    i = layoutParams.x;
                    if (i5 < right2) {
                        right = view.getRight();
                        i2 = -right;
                        z = true;
                    } else {
                        i2 = rect.right;
                        z = true;
                    }
                } else {
                    i3 = layoutParams.y;
                    if (i6 < bottom2) {
                        bottom = view.getBottom();
                        i2 = -bottom;
                        i = i3;
                    } else {
                        i4 = rect.bottom;
                        iEZpvd = EZpvd(view, layoutParams);
                        i2 = iEZpvd + i4;
                        i = i3;
                    }
                }
                break;
        }
        return new Triple<>(java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z));
    }

    public final int EZpvd(android.view.View view, WindowManager.LayoutParams layoutParams) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (iArr[1] == layoutParams.y) {
            return C8124awn.EZpvd.copydefault(view);
        }
        return 0;
    }
}
