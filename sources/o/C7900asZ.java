package o;

import android.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.asZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C7900asZ extends android.widget.FrameLayout {
    public float AEQbTJ;
    public Function1<? super java.lang.Float, Unit> AYXKKw;
    public float AhwBna;
    public float AkhnZx;
    public float DbNXlk;
    public boolean EZpvd;
    public float KWHzl;
    public int OLrzqt;
    public android.view.View copydefault;
    public Function0<Unit> djBIcL;
    public final int fJNWhG;
    public float fetchVPNInfo;
    public float gEmmrt;
    public C31696mAn isConnected;
    public final float valueOf;
    public float values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7900asZ(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBackgroundDimView(android.view.View view) {
        this.copydefault = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnBackgroundAlphaChanged(Function1<? super java.lang.Float, Unit> function1) {
        this.AYXKKw = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnDismiss(Function0<Unit> function0) {
        this.djBIcL = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPhotoView(C31696mAn c31696mAn) {
        this.isConnected = c31696mAn;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:15) call: o.asZ.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C7900asZ(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7900asZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.fJNWhG = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.OLrzqt = -1;
        this.valueOf = 0.5f;
    }

    private final void OLrzqt(float f) {
        int iKWHzl = (int) (C56548yJl.KWHzl(f, 0.0f, 1.0f) * 255);
        android.view.View view = this.copydefault;
        if (view != null) {
            view.setBackgroundColor(Color.argb(iKWHzl, 0, 0, 0));
        }
        try {
            Function1<? super java.lang.Float, Unit> function1 = this.AYXKKw;
            if (function1 != null) {
                function1.invoke(java.lang.Float.valueOf(C56548yJl.KWHzl(f, 0.0f, 1.0f)));
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public final void KWHzl() {
        android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate;
        android.view.View childAt = getChildAt(0);
        if (childAt != null && (viewPropertyAnimatorAnimate = childAt.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        android.view.View childAt2 = getChildAt(0);
        if (childAt2 != null) {
            childAt2.setTranslationX(0.0f);
            childAt2.setTranslationY(0.0f);
            childAt2.setScaleX(1.0f);
            childAt2.setScaleY(1.0f);
        }
        OLrzqt(1.0f);
        this.EZpvd = false;
        this.fetchVPNInfo = 0.0f;
        this.AkhnZx = 0.0f;
        this.OLrzqt = -1;
        this.values = 0.0f;
        this.isConnected = null;
        this.copydefault = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        int iFindPointerIndex;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.OLrzqt = motionEvent.getPointerId(0);
            this.AEQbTJ = motionEvent.getX();
            this.gEmmrt = motionEvent.getY();
            this.EZpvd = false;
            this.fetchVPNInfo = 0.0f;
            this.AkhnZx = 0.0f;
            this.values = 0.0f;
            OLrzqt(1.0f);
            getLocationOnScreen(new int[2]);
            this.DbNXlk = r0[1] + (getHeight() / 2.0f);
            this.AhwBna = r0[1] + getHeight();
            android.view.View childAt = getChildAt(0);
            if (childAt != null) {
                childAt.getLocationOnScreen(new int[2]);
                this.KWHzl = r1[1] + (childAt.getHeight() / 2.0f);
            }
        } else if (actionMasked == 1) {
            this.OLrzqt = -1;
        } else if (actionMasked == 2) {
            int i = this.OLrzqt;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) < 0) {
                return false;
            }
            float x = motionEvent.getX(iFindPointerIndex);
            float f = this.AEQbTJ;
            float y = motionEvent.getY(iFindPointerIndex) - this.gEmmrt;
            boolean z = java.lang.Math.abs(y) > java.lang.Math.abs(x - f);
            C31696mAn c31696mAn = this.isConnected;
            boolean z2 = (c31696mAn != null ? c31696mAn.KWHzl() : 1.0f) <= 1.0001f;
            if (!this.EZpvd && z && z2 && y > this.fJNWhG && this.fetchVPNInfo == 0.0f && this.AkhnZx == 0.0f) {
                this.EZpvd = true;
                android.view.ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                return true;
            }
        } else if (actionMasked == 3) {
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r0 != 3) goto L54;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.OLrzqt = motionEvent.getPointerId(0);
            this.AEQbTJ = motionEvent.getX();
            this.gEmmrt = motionEvent.getY();
            this.values = 0.0f;
            this.AkhnZx = 0.0f;
            OLrzqt(1.0f);
            getLocationOnScreen(new int[2]);
            this.DbNXlk = r12[1] + (getHeight() / 2.0f);
            this.AhwBna = r12[1] + getHeight();
            android.view.View childAt = getChildAt(0);
            if (childAt != null) {
                childAt.getLocationOnScreen(new int[2]);
                this.KWHzl = r0[1] + (childAt.getHeight() / 2.0f);
            }
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.OLrzqt);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                float f = y - this.gEmmrt;
                if (!this.EZpvd) {
                    boolean z = java.lang.Math.abs(f) > java.lang.Math.abs(x - this.AEQbTJ);
                    C31696mAn c31696mAn = this.isConnected;
                    boolean z2 = (c31696mAn != null ? c31696mAn.KWHzl() : 1.0f) <= 1.0001f;
                    if (z && z2 && f > this.fJNWhG) {
                        this.EZpvd = true;
                        android.view.ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.EZpvd) {
                    float f2 = this.fetchVPNInfo + f;
                    this.fetchVPNInfo = f2;
                    float f3 = this.AkhnZx + (x - this.AEQbTJ);
                    this.AkhnZx = f3;
                    if (f2 > this.values) {
                        this.values = f2;
                    }
                    float f4 = this.KWHzl + f2;
                    float fCopydefault = C56548yJl.copydefault(this.AhwBna - this.DbNXlk, 1.0f);
                    float f5 = this.DbNXlk;
                    if (f4 < f5) {
                        android.view.View childAt2 = getChildAt(0);
                        if (childAt2 != null) {
                            childAt2.setTranslationY(f2);
                            childAt2.setTranslationX(f3);
                            childAt2.setScaleX(1.0f);
                            childAt2.setScaleY(1.0f);
                        }
                        OLrzqt(1.0f);
                    } else {
                        float fKWHzl = C56548yJl.KWHzl((f4 - f5) / fCopydefault, 0.0f, 1.0f);
                        float f6 = 1.0f - ((1.0f - this.valueOf) * fKWHzl);
                        android.view.View childAt3 = getChildAt(0);
                        if (childAt3 != null) {
                            childAt3.setTranslationY(f2);
                            childAt3.setTranslationX(f3);
                            childAt3.setScaleX(f6);
                            childAt3.setScaleY(f6);
                        }
                        OLrzqt(1.0f - fKWHzl);
                    }
                    this.AEQbTJ = x;
                    this.gEmmrt = y;
                    return true;
                }
                this.AEQbTJ = x;
                this.gEmmrt = y;
            }
            return super.onTouchEvent(motionEvent);
        }
        android.view.View childAt4 = getChildAt(0);
        if (childAt4 == null) {
            Function0<Unit> function0 = this.djBIcL;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (this.KWHzl + childAt4.getTranslationY() < this.DbNXlk || this.values <= 0.0f) {
            android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = childAt4.animate();
            if (viewPropertyAnimatorAnimate != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
            android.view.ViewPropertyAnimator viewPropertyAnimatorWithEndAction = childAt4.animate().translationY(0.0f).translationX(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).withEndAction(new java.lang.Runnable() { // from class: o.atg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C7900asZ.AEQbTJ(this.EZpvd);
                }
            });
            if (viewPropertyAnimatorWithEndAction != null) {
                viewPropertyAnimatorWithEndAction.start();
            }
        } else {
            Function0<Unit> function02 = this.djBIcL;
            if (function02 != null) {
                function02.invoke();
            }
        }
        this.EZpvd = false;
        this.fetchVPNInfo = 0.0f;
        this.AkhnZx = 0.0f;
        this.OLrzqt = -1;
        this.values = 0.0f;
        return true;
    }

    public static final void AEQbTJ(C7900asZ c7900asZ) {
        c7900asZ.OLrzqt(1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate;
        super.onDetachedFromWindow();
        try {
            android.view.View childAt = getChildAt(0);
            if (childAt != null && (viewPropertyAnimatorAnimate = childAt.animate()) != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
        } catch (java.lang.Throwable unused) {
        }
        OLrzqt(1.0f);
        this.isConnected = null;
        this.copydefault = null;
    }
}
