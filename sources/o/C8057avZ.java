package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.WindowManager;
import com.lzf.easyfloat.enums.ShowPattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C8114awd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.avZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8057avZ {
    public final C8055avX AEQbTJ;
    public int AYXKKw;
    public final int[] AhwBna;
    public int AkhnZx;
    public int AuCTel;
    public int DbNXlk;
    public int EZpvd;
    public int KWHzl;
    public final android.content.Context OLrzqt;
    public int copydefault;
    public float djBIcL;
    public int ejfBZ;
    public int fARcdN;
    public int fIwbmz;
    public int fJNWhG;
    public int fetchVPNInfo;
    public int gEmmrt;
    public android.graphics.Rect isConnected;
    public float valueOf;
    public int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8055avX copydefault() {
        return this.AEQbTJ;
    }

    public C8057avZ(@NotNull android.content.Context context, @NotNull C8055avX c8055avX) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c8055avX, "");
        this.OLrzqt = context;
        this.AEQbTJ = c8055avX;
        this.isConnected = new android.graphics.Rect();
        this.AhwBna = new int[2];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fb A[PHI: r4
  0x00fb: PHI (r4v19 int) = (r4v18 int), (r4v37 int), (r4v41 int) binds: [B:54:0x00e9, B:64:0x0101, B:60:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(@NotNull android.view.View view, @NotNull android.view.MotionEvent motionEvent, @NotNull android.view.WindowManager windowManager, @NotNull WindowManager.LayoutParams layoutParams) {
        C8114awd.Application applicationKWHzl;
        Function1<android.view.View, Unit> function1KWHzl;
        C8114awd.Application applicationKWHzl2;
        Function2<android.view.View, android.view.MotionEvent, Unit> function2EZpvd;
        C8114awd.Application applicationKWHzl3;
        Function2<android.view.View, android.view.MotionEvent, Unit> function2EZpvd2;
        int i;
        int width;
        C8114awd.Application applicationKWHzl4;
        Function2<android.view.View, android.view.MotionEvent, Unit> function2AYXKKw;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Intrinsics.checkNotNullParameter(windowManager, "");
        Intrinsics.checkNotNullParameter(layoutParams, "");
        InterfaceC8111awa interfaceC8111awaOLrzqt = this.AEQbTJ.OLrzqt();
        if (interfaceC8111awaOLrzqt != null) {
            interfaceC8111awaOLrzqt.KWHzl(view, motionEvent);
        }
        C8114awd c8114awdAYXKKw = this.AEQbTJ.AYXKKw();
        if (c8114awdAYXKKw != null && (applicationKWHzl4 = c8114awdAYXKKw.KWHzl()) != null && (function2AYXKKw = applicationKWHzl4.AYXKKw()) != null) {
            function2AYXKKw.invoke(view, motionEvent);
        }
        int width2 = 0;
        if (!this.AEQbTJ.EZpvd() || this.AEQbTJ.zsXlph()) {
            this.AEQbTJ.EZpvd(false);
            return;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.AEQbTJ.EZpvd(false);
            this.valueOf = motionEvent.getRawX();
            this.djBIcL = motionEvent.getRawY();
            copydefault(view, layoutParams);
            return;
        }
        if (action != 1) {
            if (action == 2) {
                if (motionEvent.getRawX() < this.gEmmrt || motionEvent.getRawX() > this.fJNWhG + view.getWidth() || motionEvent.getRawY() < this.ejfBZ || motionEvent.getRawY() > this.EZpvd + view.getHeight()) {
                    return;
                }
                float rawX = motionEvent.getRawX() - this.valueOf;
                float rawY = motionEvent.getRawY() - this.djBIcL;
                if (this.AEQbTJ.zLjUOn() || (rawX * rawX) + (rawY * rawY) >= 81) {
                    this.AEQbTJ.EZpvd(true);
                    int i2 = layoutParams.x + ((int) rawX);
                    int iOLrzqt = layoutParams.y + ((int) rawY);
                    int i3 = this.gEmmrt;
                    if (i2 < i3 || i2 > (i3 = this.fJNWhG)) {
                        i2 = i3;
                    }
                    if (this.AEQbTJ.uzCIH() == ShowPattern.CURRENT_ACTIVITY && iOLrzqt < OLrzqt(view) && !this.AEQbTJ.AkhnZx()) {
                        iOLrzqt = OLrzqt(view);
                    }
                    int i4 = this.ejfBZ;
                    if (iOLrzqt >= i4) {
                        if (iOLrzqt >= 0) {
                            i4 = this.EZpvd;
                            if (iOLrzqt > i4) {
                            }
                        } else if (this.AEQbTJ.AkhnZx()) {
                            i4 = -this.fIwbmz;
                            if (iOLrzqt < i4) {
                                iOLrzqt = i4;
                            }
                        } else {
                            iOLrzqt = 0;
                        }
                    }
                    switch (C8054avW.AEQbTJ[this.AEQbTJ.getFieldNames().ordinal()]) {
                        case 1:
                            break;
                        case 2:
                            i = this.fetchVPNInfo;
                            width = view.getWidth();
                            width2 = i - width;
                            break;
                        case 3:
                            iOLrzqt = width2;
                            width2 = i2;
                            break;
                        case 4:
                            width2 = this.copydefault;
                            iOLrzqt = width2;
                            width2 = i2;
                            break;
                        case 5:
                            int i5 = this.fetchVPNInfo;
                            if (motionEvent.getRawX() * 2 > i5) {
                                width2 = i5 - view.getWidth();
                            }
                            break;
                        case 6:
                            float rawY2 = motionEvent.getRawY();
                            float f = this.isConnected.top;
                            int i6 = this.values;
                            if ((rawY2 - f) * 2 > i6) {
                                width2 = i6 - view.getHeight();
                            }
                            iOLrzqt = width2;
                            width2 = i2;
                            break;
                        case 7:
                            this.AYXKKw = (int) motionEvent.getRawX();
                            this.AuCTel = this.fetchVPNInfo - ((int) motionEvent.getRawX());
                            int rawY3 = (int) motionEvent.getRawY();
                            int i7 = this.isConnected.top;
                            this.fARcdN = rawY3 - i7;
                            this.KWHzl = (this.values + i7) - ((int) motionEvent.getRawY());
                            this.DbNXlk = java.lang.Math.min(this.AYXKKw, this.AuCTel);
                            int iMin = java.lang.Math.min(this.fARcdN, this.KWHzl);
                            this.AkhnZx = iMin;
                            int i8 = this.DbNXlk;
                            if (i8 >= iMin) {
                                if (this.fARcdN != iMin) {
                                    width2 = this.copydefault;
                                }
                                iOLrzqt = width2;
                                width2 = i2;
                            } else if (this.AYXKKw != i8) {
                                i = this.fetchVPNInfo;
                                width = view.getWidth();
                                width2 = i - width;
                            }
                            break;
                        default:
                            width2 = i2;
                            break;
                    }
                    layoutParams.x = width2;
                    layoutParams.y = iOLrzqt;
                    windowManager.updateViewLayout(view, layoutParams);
                    InterfaceC8111awa interfaceC8111awaOLrzqt2 = this.AEQbTJ.OLrzqt();
                    if (interfaceC8111awaOLrzqt2 != null) {
                        interfaceC8111awaOLrzqt2.copydefault(view, motionEvent);
                    }
                    C8114awd c8114awdAYXKKw2 = this.AEQbTJ.AYXKKw();
                    if (c8114awdAYXKKw2 != null && (applicationKWHzl3 = c8114awdAYXKKw2.KWHzl()) != null && (function2EZpvd2 = applicationKWHzl3.EZpvd()) != null) {
                        function2EZpvd2.invoke(view, motionEvent);
                    }
                    this.valueOf = motionEvent.getRawX();
                    this.djBIcL = motionEvent.getRawY();
                    return;
                }
                return;
            }
            if (action != 3) {
            }
        }
        if (this.AEQbTJ.zLjUOn()) {
            InterfaceC8111awa interfaceC8111awaOLrzqt3 = this.AEQbTJ.OLrzqt();
            if (interfaceC8111awaOLrzqt3 != null) {
                interfaceC8111awaOLrzqt3.copydefault(view, motionEvent);
            }
            C8114awd c8114awdAYXKKw3 = this.AEQbTJ.AYXKKw();
            if (c8114awdAYXKKw3 != null && (applicationKWHzl2 = c8114awdAYXKKw3.KWHzl()) != null && (function2EZpvd = applicationKWHzl2.EZpvd()) != null) {
                function2EZpvd.invoke(view, motionEvent);
            }
            switch (C8054avW.copydefault[this.AEQbTJ.getFieldNames().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    copydefault(view, layoutParams, windowManager);
                    break;
                default:
                    InterfaceC8111awa interfaceC8111awaOLrzqt4 = this.AEQbTJ.OLrzqt();
                    if (interfaceC8111awaOLrzqt4 != null) {
                        interfaceC8111awaOLrzqt4.KWHzl(view);
                    }
                    C8114awd c8114awdAYXKKw4 = this.AEQbTJ.AYXKKw();
                    if (c8114awdAYXKKw4 != null && (applicationKWHzl = c8114awdAYXKKw4.KWHzl()) != null && (function1KWHzl = applicationKWHzl.KWHzl()) != null) {
                        function1KWHzl.invoke(view);
                        break;
                    }
                    break;
            }
        }
    }

    public final void EZpvd(@NotNull android.view.View view, @NotNull WindowManager.LayoutParams layoutParams, @NotNull android.view.WindowManager windowManager) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(layoutParams, "");
        Intrinsics.checkNotNullParameter(windowManager, "");
        copydefault(view, layoutParams);
        copydefault(view, layoutParams, windowManager);
    }

    public final void copydefault(android.view.View view, WindowManager.LayoutParams layoutParams) {
        int newProxyInstance;
        int iMin;
        this.fetchVPNInfo = C8124awn.EZpvd.copydefault(this.OLrzqt);
        this.values = this.AEQbTJ.AEQbTJ().EZpvd(this.OLrzqt);
        view.getLocationOnScreen(this.AhwBna);
        this.fIwbmz = this.AhwBna[1] > layoutParams.y ? OLrzqt(view) : 0;
        this.copydefault = (this.values - view.getHeight()) - this.fIwbmz;
        this.gEmmrt = java.lang.Math.max(0, this.AEQbTJ.fARcdN());
        this.fJNWhG = java.lang.Math.min(this.fetchVPNInfo, this.AEQbTJ.iwGUEr()) - view.getWidth();
        ShowPattern showPatternUzCIH = this.AEQbTJ.uzCIH();
        ShowPattern showPattern = ShowPattern.CURRENT_ACTIVITY;
        if (showPatternUzCIH == showPattern) {
            newProxyInstance = this.AEQbTJ.AkhnZx() ? this.AEQbTJ.getNewProxyInstance() : this.AEQbTJ.getNewProxyInstance() + OLrzqt(view);
        } else {
            newProxyInstance = this.AEQbTJ.AkhnZx() ? this.AEQbTJ.getNewProxyInstance() - OLrzqt(view) : this.AEQbTJ.getNewProxyInstance();
        }
        this.ejfBZ = newProxyInstance;
        if (this.AEQbTJ.uzCIH() == showPattern) {
            if (this.AEQbTJ.AkhnZx()) {
                iMin = java.lang.Math.min(this.copydefault, this.AEQbTJ.copydefault() - view.getHeight());
            } else {
                iMin = java.lang.Math.min(this.copydefault, (this.AEQbTJ.copydefault() + OLrzqt(view)) - view.getHeight());
            }
        } else if (this.AEQbTJ.AkhnZx()) {
            iMin = java.lang.Math.min(this.copydefault, (this.AEQbTJ.copydefault() - OLrzqt(view)) - view.getHeight());
        } else {
            iMin = java.lang.Math.min(this.copydefault, this.AEQbTJ.copydefault() - view.getHeight());
        }
        this.EZpvd = iMin;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(android.view.View view, WindowManager.LayoutParams layoutParams, android.view.WindowManager windowManager) {
        int i;
        int i2;
        int i3;
        boolean z;
        AEQbTJ(layoutParams);
        switch (C8054avW.EZpvd[this.AEQbTJ.getFieldNames().ordinal()]) {
            case 1:
                i = this.gEmmrt;
                z = true;
                int[] iArr = new int[2];
                iArr[0] = !z ? layoutParams.x : layoutParams.y;
                iArr[1] = i;
                android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(iArr);
                valueAnimatorOfInt.addUpdateListener(new Activity(z, layoutParams, windowManager, view, valueAnimatorOfInt));
                valueAnimatorOfInt.addListener(new TaskDescription(view));
                valueAnimatorOfInt.start();
                break;
            case 2:
                i2 = layoutParams.x;
                i3 = this.AuCTel;
                i = i2 + i3;
                z = true;
                int[] iArr2 = new int[2];
                iArr2[0] = !z ? layoutParams.x : layoutParams.y;
                iArr2[1] = i;
                android.animation.ValueAnimator valueAnimatorOfInt2 = android.animation.ValueAnimator.ofInt(iArr2);
                valueAnimatorOfInt2.addUpdateListener(new Activity(z, layoutParams, windowManager, view, valueAnimatorOfInt2));
                valueAnimatorOfInt2.addListener(new TaskDescription(view));
                valueAnimatorOfInt2.start();
                break;
            case 3:
                int i4 = this.AYXKKw;
                i3 = this.AuCTel;
                if (i4 >= i3) {
                    i2 = layoutParams.x;
                    i = i2 + i3;
                    z = true;
                    int[] iArr22 = new int[2];
                    iArr22[0] = !z ? layoutParams.x : layoutParams.y;
                    iArr22[1] = i;
                    android.animation.ValueAnimator valueAnimatorOfInt22 = android.animation.ValueAnimator.ofInt(iArr22);
                    valueAnimatorOfInt22.addUpdateListener(new Activity(z, layoutParams, windowManager, view, valueAnimatorOfInt22));
                    valueAnimatorOfInt22.addListener(new TaskDescription(view));
                    valueAnimatorOfInt22.start();
                } else {
                    i = this.gEmmrt;
                    z = true;
                    int[] iArr222 = new int[2];
                    iArr222[0] = !z ? layoutParams.x : layoutParams.y;
                    iArr222[1] = i;
                    android.animation.ValueAnimator valueAnimatorOfInt222 = android.animation.ValueAnimator.ofInt(iArr222);
                    valueAnimatorOfInt222.addUpdateListener(new Activity(z, layoutParams, windowManager, view, valueAnimatorOfInt222));
                    valueAnimatorOfInt222.addListener(new TaskDescription(view));
                    valueAnimatorOfInt222.start();
                }
                break;
            case 4:
                i = this.ejfBZ;
                z = false;
                int[] iArr2222 = new int[2];
                iArr2222[0] = !z ? layoutParams.x : layoutParams.y;
                iArr2222[1] = i;
                android.animation.ValueAnimator valueAnimatorOfInt2222 = android.animation.ValueAnimator.ofInt(iArr2222);
                valueAnimatorOfInt2222.addUpdateListener(new Activity(z, layoutParams, windowManager, view, valueAnimatorOfInt2222));
                valueAnimatorOfInt2222.addListener(new TaskDescription(view));
                valueAnimatorOfInt2222.start();
                break;
            case 5:
                i = this.EZpvd;
                z = false;
                int[] iArr22222 = new int[2];
                iArr22222[0] = !z ? layoutParams.x : layoutParams.y;
                iArr22222[1] = i;
                android.animation.ValueAnimator valueAnimatorOfInt22222 = android.animation.ValueAnimator.ofInt(iArr22222);
                valueAnimatorOfInt22222.addUpdateListener(new Activity(z, layoutParams, windowManager, view, valueAnimatorOfInt22222));
                valueAnimatorOfInt22222.addListener(new TaskDescription(view));
                valueAnimatorOfInt22222.start();
                break;
            case 6:
                if (this.fARcdN < this.KWHzl) {
                }
                z = false;
                int[] iArr222222 = new int[2];
                iArr222222[0] = !z ? layoutParams.x : layoutParams.y;
                iArr222222[1] = i;
                android.animation.ValueAnimator valueAnimatorOfInt222222 = android.animation.ValueAnimator.ofInt(iArr222222);
                valueAnimatorOfInt222222.addUpdateListener(new Activity(z, layoutParams, windowManager, view, valueAnimatorOfInt222222));
                valueAnimatorOfInt222222.addListener(new TaskDescription(view));
                valueAnimatorOfInt222222.start();
                break;
            case 7:
                if (this.DbNXlk >= this.AkhnZx) {
                    if (this.fARcdN < this.KWHzl) {
                    }
                    z = false;
                    int[] iArr2222222 = new int[2];
                    iArr2222222[0] = !z ? layoutParams.x : layoutParams.y;
                    iArr2222222[1] = i;
                    android.animation.ValueAnimator valueAnimatorOfInt2222222 = android.animation.ValueAnimator.ofInt(iArr2222222);
                    valueAnimatorOfInt2222222.addUpdateListener(new Activity(z, layoutParams, windowManager, view, valueAnimatorOfInt2222222));
                    valueAnimatorOfInt2222222.addListener(new TaskDescription(view));
                    valueAnimatorOfInt2222222.start();
                } else {
                    int i5 = this.AYXKKw;
                    i3 = this.AuCTel;
                    if (i5 >= i3) {
                        i2 = layoutParams.x;
                        i = i2 + i3;
                        z = true;
                        int[] iArr22222222 = new int[2];
                        iArr22222222[0] = !z ? layoutParams.x : layoutParams.y;
                        iArr22222222[1] = i;
                        android.animation.ValueAnimator valueAnimatorOfInt22222222 = android.animation.ValueAnimator.ofInt(iArr22222222);
                        valueAnimatorOfInt22222222.addUpdateListener(new Activity(z, layoutParams, windowManager, view, valueAnimatorOfInt22222222));
                        valueAnimatorOfInt22222222.addListener(new TaskDescription(view));
                        valueAnimatorOfInt22222222.start();
                    } else {
                        i = this.gEmmrt;
                        z = true;
                        int[] iArr222222222 = new int[2];
                        iArr222222222[0] = !z ? layoutParams.x : layoutParams.y;
                        iArr222222222[1] = i;
                        android.animation.ValueAnimator valueAnimatorOfInt222222222 = android.animation.ValueAnimator.ofInt(iArr222222222);
                        valueAnimatorOfInt222222222.addUpdateListener(new Activity(z, layoutParams, windowManager, view, valueAnimatorOfInt222222222));
                        valueAnimatorOfInt222222222.addListener(new TaskDescription(view));
                        valueAnimatorOfInt222222222.start();
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: o.avZ$Activity */
    public static final class Activity implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ boolean AEQbTJ;
        public final /* synthetic */ android.animation.ValueAnimator EZpvd;
        public final /* synthetic */ WindowManager.LayoutParams KWHzl;
        public final /* synthetic */ android.view.WindowManager OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(boolean z, WindowManager.LayoutParams layoutParams, android.view.WindowManager windowManager, android.view.View view, android.animation.ValueAnimator valueAnimator) {
            this.AEQbTJ = z;
            this.KWHzl = layoutParams;
            this.OLrzqt = windowManager;
            this.copydefault = view;
            this.EZpvd = valueAnimator;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
            try {
                if (this.AEQbTJ) {
                    WindowManager.LayoutParams layoutParams = this.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(valueAnimator, "");
                    java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                    layoutParams.x = ((java.lang.Integer) animatedValue).intValue();
                } else {
                    WindowManager.LayoutParams layoutParams2 = this.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(valueAnimator, "");
                    java.lang.Object animatedValue2 = valueAnimator.getAnimatedValue();
                    if (animatedValue2 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                    layoutParams2.y = ((java.lang.Integer) animatedValue2).intValue();
                }
                this.OLrzqt.updateViewLayout(this.copydefault, this.KWHzl);
            } catch (java.lang.Exception unused) {
                this.EZpvd.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: o.avZ$TaskDescription */
    public static final class TaskDescription implements Animator.AnimatorListener {
        public final /* synthetic */ android.view.View KWHzl;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
        }

        public TaskDescription(android.view.View view) {
            this.KWHzl = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            C8057avZ.this.EZpvd(this.KWHzl);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            C8057avZ.this.EZpvd(this.KWHzl);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            C8057avZ.this.copydefault().copydefault(true);
        }
    }

    public final void EZpvd(android.view.View view) {
        C8114awd.Application applicationKWHzl;
        Function1<android.view.View, Unit> function1KWHzl;
        this.AEQbTJ.copydefault(false);
        InterfaceC8111awa interfaceC8111awaOLrzqt = this.AEQbTJ.OLrzqt();
        if (interfaceC8111awaOLrzqt != null) {
            interfaceC8111awaOLrzqt.KWHzl(view);
        }
        C8114awd c8114awdAYXKKw = this.AEQbTJ.AYXKKw();
        if (c8114awdAYXKKw == null || (applicationKWHzl = c8114awdAYXKKw.KWHzl()) == null || (function1KWHzl = applicationKWHzl.KWHzl()) == null) {
            return;
        }
        function1KWHzl.invoke(view);
    }

    public final void AEQbTJ(WindowManager.LayoutParams layoutParams) {
        int i = layoutParams.x;
        int i2 = i - this.gEmmrt;
        this.AYXKKw = i2;
        int i3 = this.fJNWhG - i;
        this.AuCTel = i3;
        int i4 = layoutParams.y;
        this.fARcdN = i4 - this.ejfBZ;
        this.KWHzl = this.EZpvd - i4;
        this.DbNXlk = java.lang.Math.min(i2, i3);
        this.AkhnZx = java.lang.Math.min(this.fARcdN, this.KWHzl);
    }

    public final int OLrzqt(android.view.View view) {
        return C8124awn.EZpvd.copydefault(view);
    }
}
