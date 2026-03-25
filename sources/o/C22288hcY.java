package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material3.TooltipKt;
import androidx.core.widget.NestedScrollView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C22288hcY;
import o.InterfaceC22278hcO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hcY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22288hcY extends NestedScrollView implements InterfaceC22278hcO {
    public final InterfaceC56387yDm AYXKKw;
    public boolean AhwBna;
    public boolean AkhnZx;
    public boolean AuCTel;
    public android.animation.ValueAnimator AuCTelauCTel;
    public int AubY;
    public Function0<java.lang.Boolean> DbNXlk;
    public int EZpvd;
    public int KWHzl;
    public boolean OLrzqt;
    public final android.os.Handler copydefault;
    public boolean djBIcL;
    public int ejfBZ;
    public Function0<Unit> fARcdN;
    public int fIwbmz;
    public Function0<Unit> fJNWhG;
    public int fetchVPNInfo;
    public boolean gEmmrt;
    public boolean getFieldNames;
    public Function0<Unit> getNewProxyInstance;
    public int hDKMBd;
    public boolean isConnected;
    public final int iwGUEr;
    public InterfaceC22283hcT uzCIH;
    public boolean valueOf;
    public boolean values;
    public final InterfaceC56387yDm wlaJM;
    public int zLjUOn;
    public int zsXlph;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22288hcY(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22288hcY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22278hcO
    public boolean AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22278hcO
    public void OLrzqt(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22278hcO
    public void copydefault() {
        this.valueOf = false;
        this.gEmmrt = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22278hcO
    public void setRefreshListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.getNewProxyInstance = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22278hcO
    public void setStickScrollChangeListener(@NotNull InterfaceC22283hcT interfaceC22283hcT) {
        Intrinsics.checkNotNullParameter(interfaceC22283hcT, "");
        this.uzCIH = interfaceC22283hcT;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: o.hcY.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C22288hcY(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22288hcY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setOverScrollMode(2);
        setMotionEventSplittingEnabled(false);
        this.wlaJM = C56392yDr.copydefault(new Function0() { // from class: o.hdd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22288hcY.values(this.AEQbTJ);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.hdf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22288hcY.fetchVPNInfo(this.copydefault);
            }
        });
        this.zLjUOn = 5;
        this.iwGUEr = C55298xhM.dpInt$default(60, (android.content.Context) null, 1, (java.lang.Object) null);
        this.copydefault = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: o.hcY$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hcY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    private final android.view.View fJNWhG() {
        return (android.view.View) this.wlaJM.getValue();
    }

    public static final android.view.View values(C22288hcY c22288hcY) {
        return c22288hcY.findViewWithTag("sticky_layout");
    }

    private final android.view.View DbNXlk() {
        return (android.view.View) this.AYXKKw.getValue();
    }

    public static final android.view.ViewGroup fetchVPNInfo(C22288hcY c22288hcY) {
        return (android.view.ViewGroup) c22288hcY.findViewWithTag("header_tag");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int AkhnZx() {
        android.view.View viewDbNXlk = DbNXlk();
        if (viewDbNXlk != null) {
            return viewDbNXlk.getMeasuredHeight();
        }
        return 0;
    }

    private final int ejfBZ() {
        return KWHzl();
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0153  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (this.AhwBna && !this.valueOf && !this.gEmmrt) {
            if (AhwBna() || this.djBIcL) {
                pUU.KWHzl("StickyHeaderNestScrollView", "is playing anim now, operation forbidden!");
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.fIwbmz = AkhnZx();
                this.hDKMBd = 0;
                this.AubY = (int) motionEvent.getY();
                if (this.isConnected) {
                    this.fIwbmz -= this.iwGUEr;
                }
                this.isConnected = false;
                this.zsXlph = 0;
            } else if (action == 1) {
                gEmmrt();
                isConnected();
            } else if (action == 2) {
                int y = (int) motionEvent.getY();
                this.EZpvd = y;
                int i = y - this.fetchVPNInfo;
                this.ejfBZ = i;
                this.KWHzl = (int) (((double) i) * 0.25d);
                this.fetchVPNInfo = y;
                this.values = y - this.AubY > 0;
                OLrzqt();
                if (this.values && !AhwBna() && getScrollY() == 0) {
                    this.OLrzqt = true;
                    if (!this.valueOf && !this.gEmmrt && this.AkhnZx) {
                        AYXKKw();
                    }
                    pUU.KWHzl("StickyHeaderNestScrollView", this.EZpvd - this.AubY > 0 ? "move down" : "move up");
                    InterfaceC22283hcT interfaceC22283hcT = this.uzCIH;
                    if (interfaceC22283hcT != null) {
                        interfaceC22283hcT.EZpvd(this.EZpvd - this.AubY > 0 ? 1 : -1, this.hDKMBd);
                    }
                    if (this.EZpvd != this.AubY && java.lang.Math.abs(this.ejfBZ) > 0 && java.lang.Math.abs(this.ejfBZ) < 200) {
                        android.view.View viewFJNWhG = fJNWhG();
                        ViewGroup.LayoutParams layoutParams = viewFJNWhG != null ? viewFJNWhG.getLayoutParams() : null;
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        int i2 = this.fIwbmz - this.KWHzl;
                        this.fIwbmz = i2;
                        if (marginLayoutParams != null) {
                            marginLayoutParams.topMargin = -i2;
                        }
                        android.view.View viewFJNWhG2 = fJNWhG();
                        if (viewFJNWhG2 != null) {
                            viewFJNWhG2.setLayoutParams(marginLayoutParams);
                        }
                        this.hDKMBd += this.KWHzl;
                    }
                    int i3 = this.iwGUEr;
                    int i4 = i3 / 4;
                    int i5 = i4 * 3;
                    int i6 = i3 + i4;
                    int iDpInt$default = C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null) + i6;
                    pUU.KWHzl("StickyHeaderNestScrollView", "user realMove: " + this.hDKMBd);
                    int i7 = this.hDKMBd;
                    if (1 <= i7 && i7 < i5) {
                        this.zLjUOn = 1;
                    } else if (i5 <= i7 && i7 < i6) {
                        this.zLjUOn = 2;
                    } else if (i6 > i7 || i7 >= iDpInt$default) {
                        this.zLjUOn = (iDpInt$default > i7 || i7 >= AkhnZx()) ? 5 : 4;
                    } else {
                        this.zLjUOn = 3;
                        InterfaceC22283hcT interfaceC22283hcT2 = this.uzCIH;
                        if (interfaceC22283hcT2 != null) {
                            interfaceC22283hcT2.AEQbTJ(true);
                        }
                    }
                    this.zsXlph = this.hDKMBd;
                }
                if (!this.values && getScrollY() > 0) {
                    values();
                    this.hDKMBd = 0;
                }
                if (!this.values && this.getFieldNames) {
                    pUU.KWHzl("StickyHeaderNestScrollView", "user move when refresh, stop refresh now!");
                    AEQbTJ(true);
                }
            } else if (action == 3) {
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void isConnected() {
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(this.zsXlph), 0)) {
            return;
        }
        C33129mqd.AEQbTJ(java.lang.Integer.valueOf(C55298xhM.px2dp$default(this.zsXlph, (android.content.Context) null, 1, (java.lang.Object) null) / 10), 13);
        this.zsXlph = 0;
    }

    public final void AYXKKw() {
        if (this.AkhnZx) {
            this.AkhnZx = false;
            android.view.View viewDbNXlk = DbNXlk();
            if (viewDbNXlk != null) {
                viewDbNXlk.setVisibility(0);
            }
            pUU.KWHzl("StickyHeaderNestScrollView", "recover headView to " + AkhnZx());
            AEQbTJ(-AkhnZx());
        }
    }

    public final void values() {
        if (this.AkhnZx) {
            return;
        }
        pUU.KWHzl("StickyHeaderNestScrollView", "user move up and setting group to 0");
        this.AkhnZx = true;
        post(new java.lang.Runnable() { // from class: o.hcX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C22288hcY.DbNXlk(this.OLrzqt);
            }
        });
    }

    public static final void DbNXlk(C22288hcY c22288hcY) {
        android.view.View viewDbNXlk = c22288hcY.DbNXlk();
        if (viewDbNXlk != null) {
            viewDbNXlk.setVisibility(8);
        }
        c22288hcY.AEQbTJ(0);
    }

    public final void gEmmrt() {
        pUU.KWHzl("StickyHeaderNestScrollView", "onUserStopScroll realMove: " + this.hDKMBd);
        if (java.lang.Math.abs(this.hDKMBd) <= 0 || AhwBna()) {
            return;
        }
        this.hDKMBd = 0;
        pUU.KWHzl("StickyHeaderNestScrollView", "do move up action: " + this.zLjUOn);
        int i = this.zLjUOn;
        if (i == 2) {
            fetchVPNInfo();
        } else if (i == 3 || i == 4) {
            InterfaceC22278hcO.ActionBar.openPullDownPanel$default(this, null, 1, null);
        } else {
            android.view.View viewDbNXlk = DbNXlk();
            if (viewDbNXlk != null) {
                viewDbNXlk.post(new java.lang.Runnable() { // from class: o.hcW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C22288hcY.isConnected(this.AEQbTJ);
                    }
                });
            }
            InterfaceC22283hcT interfaceC22283hcT = this.uzCIH;
            if (interfaceC22283hcT != null) {
                interfaceC22283hcT.KWHzl(false);
            }
        }
        this.zLjUOn = 5;
    }

    public static final void isConnected(C22288hcY c22288hcY) {
        c22288hcY.AEQbTJ(-c22288hcY.AkhnZx());
        c22288hcY.values();
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (ejfBZ() == 0) {
            super.onMeasure(i, i2);
            return;
        }
        try {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            android.view.View viewFJNWhG = fJNWhG();
            if (viewFJNWhG != null) {
                viewFJNWhG.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            valueOf();
        } catch (java.lang.Exception e) {
            kotlin.Pair[] pairArr = new kotlin.Pair[1];
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("errMsg", message);
            pUU.AEQbTJ("StickyHeaderNestScrollView onMeasure catch error", C56424yEw.AYXKKw(pairArr));
        }
    }

    public final void valueOf() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt instanceof C22281hcR) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + ejfBZ(), 1073741824));
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (ejfBZ() > 0) {
            i2 = java.lang.Math.min(ejfBZ(), i2);
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void scrollTo(int i, int i2) {
        if (ejfBZ() > 0) {
            i2 = java.lang.Math.min(ejfBZ(), i2);
        }
        super.scrollTo(i, i2);
    }

    @Override // androidx.core.widget.NestedScrollView, androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NotNull android.view.View view, int i, int i2, @NotNull int[] iArr, int i3) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        if (ejfBZ() == 0) {
            super.onNestedPreScroll(view, i, i2, iArr, i3);
            return;
        }
        if (dispatchNestedPreScroll(i, i2, iArr, null, i3) || i2 <= 0 || getScrollY() >= ejfBZ()) {
            return;
        }
        this.AuCTel = true;
        scrollBy(0, i2);
        iArr[1] = i2;
    }

    public final int KWHzl() {
        android.view.View viewFJNWhG = fJNWhG();
        int minimumHeight = viewFJNWhG != null ? viewFJNWhG.getMinimumHeight() : 0;
        if (minimumHeight <= 0) {
            return 0;
        }
        android.view.View viewFJNWhG2 = fJNWhG();
        int measuredHeight = (viewFJNWhG2 != null ? viewFJNWhG2.getMeasuredHeight() : 0) - minimumHeight;
        if (measuredHeight > 0) {
            return measuredHeight;
        }
        return 0;
    }

    @Override // androidx.core.widget.NestedScrollView, androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        this.AuCTel = true;
        super.onNestedScroll(view, i, i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public boolean awakenScrollBars() {
        if (this.AuCTel) {
            invalidate();
            return true;
        }
        return super.awakenScrollBars();
    }

    @Override // o.InterfaceC22278hcO
    public void EZpvd() {
        this.gEmmrt = false;
        Function0<java.lang.Boolean> function0 = this.DbNXlk;
        if (function0 != null && !function0.invoke().booleanValue()) {
            if (this.AkhnZx) {
                return;
            }
            AEQbTJ(-AkhnZx());
            values();
            return;
        }
        this.valueOf = true;
        InterfaceC22283hcT interfaceC22283hcT = this.uzCIH;
        if (interfaceC22283hcT != null) {
            interfaceC22283hcT.KWHzl(true);
        }
        djBIcL();
    }

    public static /* synthetic */ void doSecondaryGuide$default(C22288hcY c22288hcY, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        c22288hcY.copydefault(i, i2, z);
    }

    public final void copydefault(int i, int i2, boolean z) {
        android.animation.ValueAnimator valueAnimator = this.AuCTelauCTel;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(i, i2);
        this.AuCTelauCTel = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.setDuration(1000L);
        }
        android.animation.ValueAnimator valueAnimator2 = this.AuCTelauCTel;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.hde
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator3) {
                    C22288hcY.EZpvd(this.OLrzqt, valueAnimator3);
                }
            });
        }
        android.animation.ValueAnimator valueAnimator3 = this.AuCTelauCTel;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new TaskDescription(z, this));
        }
        android.animation.ValueAnimator valueAnimator4 = this.AuCTelauCTel;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    public static final void EZpvd(C22288hcY c22288hcY, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c22288hcY.AEQbTJ(((java.lang.Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: o.hcY$TaskDescription */
    public static final class TaskDescription implements Animator.AnimatorListener {
        public final /* synthetic */ C22288hcY EZpvd;
        public final /* synthetic */ boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public TaskDescription(boolean z, C22288hcY c22288hcY) {
            this.copydefault = z;
            this.EZpvd = c22288hcY;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            InterfaceC22283hcT interfaceC22283hcT;
            Intrinsics.checkNotNullParameter(animator, "");
            if (!this.copydefault || (interfaceC22283hcT = this.EZpvd.uzCIH) == null) {
                return;
            }
            interfaceC22283hcT.KWHzl();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            if (this.copydefault) {
                this.EZpvd.isConnected = true;
                android.os.Handler handler = this.EZpvd.copydefault;
                final C22288hcY c22288hcY = this.EZpvd;
                handler.postDelayed(new java.lang.Runnable() { // from class: o.hdh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C22288hcY.TaskDescription.KWHzl(c22288hcY);
                    }
                }, 1000L);
                return;
            }
            this.EZpvd.isConnected = false;
            InterfaceC22283hcT interfaceC22283hcT = this.EZpvd.uzCIH;
            if (interfaceC22283hcT != null) {
                interfaceC22283hcT.EZpvd();
            }
            Function0 function0 = this.EZpvd.fJNWhG;
            if (function0 != null) {
                function0.invoke();
            }
        }

        public static final void KWHzl(C22288hcY c22288hcY) {
            c22288hcY.isConnected = false;
            C22288hcY.doSecondaryGuide$default(c22288hcY, (-c22288hcY.AkhnZx()) + c22288hcY.iwGUEr, -c22288hcY.AkhnZx(), false, 4, null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            InterfaceC22283hcT interfaceC22283hcT = this.EZpvd.uzCIH;
            if (interfaceC22283hcT != null) {
                interfaceC22283hcT.EZpvd();
            }
            Function0 function0 = this.EZpvd.fJNWhG;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.hcY$ActionBar */
    public static final class ActionBar implements java.lang.Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C22288hcY.this.AEQbTJ(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.hcY */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void animatorTo$default(C22288hcY c22288hcY, long j, int i, int i2, boolean z, Function0 function0, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            j = 400;
        }
        long j2 = j;
        if ((i3 & 8) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i3 & 16) != 0) {
            function0 = null;
        }
        c22288hcY.OLrzqt(j2, i, i2, z2, function0);
    }

    public final void OLrzqt(long j, int i, int i2, boolean z, Function0<Unit> function0) {
        android.animation.ValueAnimator valueAnimator = this.AuCTelauCTel;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(i, i2);
        this.AuCTelauCTel = valueAnimatorOfInt;
        if (z && valueAnimatorOfInt != null) {
            valueAnimatorOfInt.setDuration(j);
        }
        android.animation.ValueAnimator valueAnimator2 = this.AuCTelauCTel;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new Application(function0));
        }
        android.animation.ValueAnimator valueAnimator3 = this.AuCTelauCTel;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.hcZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator4) {
                    C22288hcY.copydefault(this.KWHzl, valueAnimator4);
                }
            });
        }
        android.animation.ValueAnimator valueAnimator4 = this.AuCTelauCTel;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    /* JADX INFO: renamed from: o.hcY$Application */
    public static final class Application implements Animator.AnimatorListener {
        public final /* synthetic */ Function0<Unit> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Application(Function0<Unit> function0) {
            this.AEQbTJ = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            Function0<Unit> function0 = this.AEQbTJ;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final void copydefault(C22288hcY c22288hcY, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c22288hcY.AEQbTJ(((java.lang.Integer) animatedValue).intValue());
    }

    private final void fetchVPNInfo() {
        this.getFieldNames = true;
        InterfaceC22283hcT interfaceC22283hcT = this.uzCIH;
        if (interfaceC22283hcT != null) {
            interfaceC22283hcT.copydefault(true);
        }
        Function0<Unit> function0 = this.getNewProxyInstance;
        if (function0 != null) {
            function0.invoke();
        }
        AEQbTJ((-AkhnZx()) + this.iwGUEr);
        postDelayed(new ActionBar(), TooltipKt.TooltipDuration);
    }

    @Override // o.InterfaceC22278hcO
    public void AEQbTJ(boolean z) {
        if (this.getFieldNames) {
            this.getFieldNames = false;
            InterfaceC22283hcT interfaceC22283hcT = this.uzCIH;
            if (interfaceC22283hcT != null) {
                interfaceC22283hcT.copydefault(false);
            }
            AEQbTJ(z ? 0 : -AkhnZx());
            InterfaceC22283hcT interfaceC22283hcT2 = this.uzCIH;
            if (interfaceC22283hcT2 != null) {
                interfaceC22283hcT2.KWHzl(false);
            }
            values();
        }
    }

    @Override // o.InterfaceC22278hcO
    public void EZpvd(final Function0<Unit> function0) {
        AYXKKw();
        this.valueOf = true;
        InterfaceC22283hcT interfaceC22283hcT = this.uzCIH;
        if (interfaceC22283hcT != null) {
            interfaceC22283hcT.OLrzqt(this.AhwBna);
        }
        animatorTo$default(this, 0L, fARcdN(), 0, false, new Function0() { // from class: o.hda
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22288hcY.KWHzl(this.EZpvd, function0);
            }
        }, 9, null);
    }

    public static final Unit KWHzl(C22288hcY c22288hcY, Function0 function0) {
        InterfaceC22283hcT interfaceC22283hcT = c22288hcY.uzCIH;
        if (interfaceC22283hcT != null) {
            interfaceC22283hcT.KWHzl(true);
        }
        c22288hcY.djBIcL = false;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC22278hcO
    public void OLrzqt(boolean z, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.valueOf = false;
        OLrzqt(300L, fARcdN(), -AkhnZx(), z, new Function0() { // from class: o.hdc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22288hcY.OLrzqt(this.EZpvd, function0);
            }
        });
    }

    public static final Unit OLrzqt(C22288hcY c22288hcY, Function0 function0) {
        InterfaceC22283hcT interfaceC22283hcT = c22288hcY.uzCIH;
        if (interfaceC22283hcT != null) {
            interfaceC22283hcT.KWHzl(false);
        }
        c22288hcY.AEQbTJ(-(c22288hcY.AkhnZx() + c22288hcY.iwGUEr));
        c22288hcY.values();
        Function0<Unit> function02 = c22288hcY.fARcdN;
        if (function02 != null) {
            function02.invoke();
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(int i) {
        android.view.View viewFJNWhG = fJNWhG();
        ViewGroup.LayoutParams layoutParams = viewFJNWhG != null ? viewFJNWhG.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i;
            android.view.View viewFJNWhG2 = fJNWhG();
            if (viewFJNWhG2 != null) {
                viewFJNWhG2.setLayoutParams(marginLayoutParams);
            }
        }
    }

    private final int fARcdN() {
        android.view.View viewFJNWhG = fJNWhG();
        ViewGroup.LayoutParams layoutParams = viewFJNWhG != null ? viewFJNWhG.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public final void OLrzqt() {
        android.animation.ValueAnimator valueAnimator = this.AuCTelauCTel;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.copydefault.removeCallbacksAndMessages(null);
    }

    public final boolean AhwBna() {
        android.animation.ValueAnimator valueAnimator = this.AuCTelauCTel;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.AuCTelauCTel;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.AuCTelauCTel = null;
        this.uzCIH = null;
        this.getNewProxyInstance = null;
        this.DbNXlk = null;
        this.fARcdN = null;
        this.fJNWhG = null;
    }

    public final void djBIcL() {
        postDelayed(new java.lang.Runnable() { // from class: o.hdb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C22288hcY.AkhnZx(this.AEQbTJ);
            }
        }, 50L);
    }

    public static final void AkhnZx(C22288hcY c22288hcY) {
        Function0<Unit> function0 = c22288hcY.fARcdN;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
