package o;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sUm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44561sUm {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public android.view.View AEQbTJ;
    public int AYXKKw;
    public float AhwBna;
    public float EZpvd;
    public final android.content.Context KWHzl;
    public android.animation.ValueAnimator copydefault;
    public int djBIcL;
    public int fetchVPNInfo;
    public final android.view.WindowManager gEmmrt;
    public boolean valueOf;

    public C44561sUm(@NotNull android.content.Context context, @NotNull android.view.WindowManager windowManager) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(windowManager, "");
        this.KWHzl = context;
        this.gEmmrt = windowManager;
    }

    /* JADX INFO: renamed from: o.sUm$Activity */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sUm.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void AEQbTJ(@NotNull android.view.View view, @NotNull final WindowManager.LayoutParams layoutParams, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(layoutParams, "");
        this.fetchVPNInfo = i;
        this.AEQbTJ = view;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: o.sUn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                return C44561sUm.KWHzl(this.AEQbTJ, layoutParams, view2, motionEvent);
            }
        });
    }

    public static final boolean KWHzl(C44561sUm c44561sUm, WindowManager.LayoutParams layoutParams, android.view.View view, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            Intrinsics.copydefault(motionEvent);
            c44561sUm.OLrzqt(motionEvent, layoutParams);
            return true;
        }
        if (action == 1) {
            Intrinsics.copydefault(view);
            return c44561sUm.AEQbTJ(view, layoutParams);
        }
        if (action != 2) {
            return false;
        }
        Intrinsics.copydefault(motionEvent);
        Intrinsics.copydefault(view);
        c44561sUm.OLrzqt(motionEvent, layoutParams, view);
        return true;
    }

    public final void OLrzqt(android.view.MotionEvent motionEvent, WindowManager.LayoutParams layoutParams) {
        this.AYXKKw = layoutParams.x;
        this.djBIcL = layoutParams.y;
        this.EZpvd = motionEvent.getRawX();
        this.AhwBna = motionEvent.getRawY();
        this.valueOf = false;
        pUU.EZpvd("FloatingWindowDragHelper", "Touch down: initialX=" + this.AYXKKw + ", initialY=" + this.djBIcL);
    }

    public final void OLrzqt(android.view.MotionEvent motionEvent, WindowManager.LayoutParams layoutParams, android.view.View view) {
        float rawX = motionEvent.getRawX() - this.EZpvd;
        float rawY = motionEvent.getRawY() - this.AhwBna;
        if (!this.valueOf && (java.lang.Math.abs(rawX) > 10.0f || java.lang.Math.abs(rawY) > 10.0f)) {
            this.valueOf = true;
            pUU.EZpvd("FloatingWindowDragHelper", "Started dragging");
        }
        if (this.valueOf) {
            if ((layoutParams.gravity & 8388613) == 8388613) {
                layoutParams.x = this.AYXKKw - ((int) rawX);
            } else {
                layoutParams.x = this.AYXKKw + ((int) rawX);
            }
            layoutParams.y = this.djBIcL - ((int) rawY);
            this.gEmmrt.updateViewLayout(view, layoutParams);
        }
    }

    public final boolean AEQbTJ(android.view.View view, WindowManager.LayoutParams layoutParams) {
        if (this.valueOf) {
            pUU.EZpvd("FloatingWindowDragHelper", "Drag ended: finalX=" + layoutParams.x + ", finalY=" + layoutParams.y);
            EZpvd(view, layoutParams);
            this.valueOf = false;
            return true;
        }
        view.performClick();
        return false;
    }

    public final void EZpvd(final android.view.View view, final WindowManager.LayoutParams layoutParams) {
        int i;
        int i2;
        int i3;
        int i4;
        android.animation.ValueAnimator valueAnimator = this.copydefault;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.util.DisplayMetrics displayMetrics = this.KWHzl.getResources().getDisplayMetrics();
        int i5 = displayMetrics.widthPixels;
        int i6 = (int) (4 * displayMetrics.density);
        boolean z = true;
        boolean z2 = (layoutParams.gravity & 8388613) == 8388613;
        if (z2) {
            i = (i5 - layoutParams.x) - (this.fetchVPNInfo / 2);
        } else {
            i = layoutParams.x + (this.fetchVPNInfo / 2);
        }
        int i7 = i5 - i;
        boolean z3 = i7 < i;
        pUU.EZpvd("FloatingWindowDragHelper", "snapToClosestEdge: screenWidth=" + i5 + ", windowCenterX=" + i + ", distanceToLeft=" + i + ", distanceToRight=" + i7 + ", snapToRight=" + z3);
        int i8 = z3 ? 8388693 : 8388691;
        if ((!z3 || z2) && (z3 || !z2)) {
            z = false;
        }
        if (z) {
            if (z3) {
                i3 = layoutParams.x;
                i4 = this.fetchVPNInfo;
            } else {
                i3 = layoutParams.x;
                i4 = this.fetchVPNInfo;
            }
            i2 = i5 - (i3 + i4);
        } else {
            i2 = layoutParams.x;
        }
        pUU.EZpvd("FloatingWindowDragHelper", "Animation: startX=" + i2 + ", targetX=" + i6 + ", needsGravityChange=" + z);
        if (z) {
            layoutParams.gravity = i8;
            layoutParams.x = i2;
            this.gEmmrt.updateViewLayout(view, layoutParams);
        }
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(i2, i6);
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.setInterpolator(new android.view.animation.DecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.sUj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                C44561sUm.EZpvd(layoutParams, this, view, valueAnimator2);
            }
        });
        valueAnimatorOfInt.start();
        this.copydefault = valueAnimatorOfInt;
        pUU.EZpvd("FloatingWindowDragHelper", "Started edge snap animation to " + (z3 ? "RIGHT" : "LEFT") + " edge");
    }

    public static final void EZpvd(WindowManager.LayoutParams layoutParams, C44561sUm c44561sUm, android.view.View view, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        layoutParams.x = ((java.lang.Integer) animatedValue).intValue();
        try {
            c44561sUm.gEmmrt.updateViewLayout(view, layoutParams);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("FloatingWindowDragHelper", "Failed to update layout during animation", e);
            valueAnimator.cancel();
        }
    }

    public final void AEQbTJ() {
        pUU.EZpvd("FloatingWindowDragHelper", "Cleaning up drag helper");
        android.animation.ValueAnimator valueAnimator = this.copydefault;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.copydefault = null;
        android.view.View view = this.AEQbTJ;
        if (view != null) {
            view.setOnTouchListener(null);
        }
        this.AEQbTJ = null;
        this.AYXKKw = 0;
        this.djBIcL = 0;
        this.EZpvd = 0.0f;
        this.AhwBna = 0.0f;
        this.valueOf = false;
        this.fetchVPNInfo = 0;
    }
}
