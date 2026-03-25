package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C50016uzU;
import o.InterfaceC47981uAo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uzU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50016uzU extends NestedScrollView implements InterfaceC47981uAo {
    public static final java.lang.String AEQbTJ;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public Function0<Unit> AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public boolean AkhnZx;
    public int AuCTel;
    public int AuCTelauCTel;
    public final InterfaceC56387yDm AubY;
    public boolean DbNXlk;
    public int EZpvd;
    public int KWHzl;
    public final InterfaceC56387yDm copydefault;
    public boolean djBIcL;
    public int ejfBZ;
    public boolean fARcdN;
    public Function0<Unit> fIwbmz;
    public boolean fJNWhG;
    public boolean fetchVPNInfo;
    public boolean gEmmrt;
    public android.animation.ValueAnimator gHZMYf;
    public Function0<Unit> getFieldNames;
    public final int getNewProxyInstance;
    public boolean hDKMBd;
    public Function0<java.lang.Boolean> isConnected;
    public int iwGUEr;
    public int sSMYrx;
    public int uzCIH;
    public final android.os.Handler valueOf;
    public boolean values;
    public int wlaJM;
    public InterfaceC49775uus zLjUOn;
    public boolean zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50016uzU(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50016uzU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCallbacks(@NotNull Function0<java.lang.Boolean> function0, Function0<Unit> function02, Function0<Unit> function03) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.isConnected = function0;
        this.fIwbmz = function02;
        this.AYXKKw = function03;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setRefreshListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.getFieldNames = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTradeScrollChangeListener(@NotNull InterfaceC49775uus interfaceC49775uus) {
        Intrinsics.checkNotNullParameter(interfaceC49775uus, "");
        this.zLjUOn = interfaceC49775uus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:40) call: o.uzU.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C50016uzU(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50016uzU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setOverScrollMode(2);
        setMotionEventSplittingEnabled(false);
        this.AubY = C56392yDr.copydefault(new Function0() { // from class: o.uzW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50016uzU.values(this.EZpvd);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.uzZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50016uzU.DbNXlk(this.KWHzl);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.uAa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50016uzU.AkhnZx(this.AEQbTJ);
            }
        });
        this.AuCTelauCTel = 5;
        this.gEmmrt = true;
        this.getNewProxyInstance = C55298xhM.dpInt$default(60, (android.content.Context) null, 1, (java.lang.Object) null);
        this.valueOf = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: o.uzU$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uzU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    static {
        java.lang.String simpleName = C50016uzU.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        AEQbTJ = simpleName;
    }

    private final C50015uzT djBIcL() {
        return (C50015uzT) this.AubY.getValue();
    }

    public static final C50015uzT values(C50016uzU c50016uzU) {
        return (C50015uzT) c50016uzU.findViewWithTag("sticky_layout");
    }

    public static final android.view.ViewGroup DbNXlk(C50016uzU c50016uzU) {
        return (android.view.ViewGroup) c50016uzU.findViewWithTag("header_tag");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.ViewGroup EZpvd() {
        return (android.view.ViewGroup) this.AhwBna.getValue();
    }

    public static final FragmentContainerView AkhnZx(C50016uzU c50016uzU) {
        return (FragmentContainerView) c50016uzU.findViewWithTag("container_tag");
    }

    private final FragmentContainerView OLrzqt() {
        return (FragmentContainerView) this.copydefault.getValue();
    }

    private final int gEmmrt() {
        return KWHzl();
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0160  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (this.gEmmrt && !this.DbNXlk && !this.AkhnZx) {
            if (AhwBna() || this.fetchVPNInfo) {
                pUU.KWHzl(AEQbTJ, "is playing anim now, operation forbidden!");
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.AuCTel = EZpvd().getMeasuredHeight();
                this.iwGUEr = 0;
                this.wlaJM = (int) motionEvent.getY();
                if (this.values) {
                    this.AuCTel -= this.getNewProxyInstance;
                }
                this.values = false;
                this.sSMYrx = 0;
            } else if (action == 1) {
                fetchVPNInfo();
                DbNXlk();
            } else if (action == 2) {
                int y = (int) motionEvent.getY();
                this.KWHzl = y;
                int i = y - this.ejfBZ;
                this.uzCIH = i;
                this.EZpvd = (int) (((double) i) * 0.25d);
                this.ejfBZ = y;
                this.fARcdN = y - this.wlaJM > 0;
                copydefault();
                if (this.fARcdN && !AhwBna() && getScrollY() == 0) {
                    this.djBIcL = true;
                    if (!this.DbNXlk && !this.AkhnZx && this.fJNWhG) {
                        isConnected();
                    }
                    java.lang.String str = AEQbTJ;
                    pUU.KWHzl(str, this.KWHzl - this.wlaJM > 0 ? "move down" : "move up");
                    InterfaceC49775uus interfaceC49775uus = this.zLjUOn;
                    if (interfaceC49775uus != null) {
                        interfaceC49775uus.OLrzqt(this.KWHzl - this.wlaJM > 0 ? 1 : -1, this.iwGUEr);
                    }
                    if (this.KWHzl != this.wlaJM && java.lang.Math.abs(this.uzCIH) > 0 && java.lang.Math.abs(this.uzCIH) < 200) {
                        C50015uzT c50015uzTDjBIcL = djBIcL();
                        ViewGroup.LayoutParams layoutParams = c50015uzTDjBIcL != null ? c50015uzTDjBIcL.getLayoutParams() : null;
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        int i2 = this.AuCTel - this.EZpvd;
                        this.AuCTel = i2;
                        if (marginLayoutParams != null) {
                            marginLayoutParams.topMargin = -i2;
                        }
                        C50015uzT c50015uzTDjBIcL2 = djBIcL();
                        if (c50015uzTDjBIcL2 != null) {
                            c50015uzTDjBIcL2.setLayoutParams(marginLayoutParams);
                        }
                        this.iwGUEr += this.EZpvd;
                    }
                    int i3 = this.getNewProxyInstance;
                    int i4 = i3 / 4;
                    int i5 = i4 * 3;
                    int i6 = i3 + i4;
                    int iDpInt$default = C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null) + i6;
                    pUU.KWHzl(str, "user realMove: " + this.iwGUEr);
                    int i7 = this.iwGUEr;
                    if (1 <= i7 && i7 < i5) {
                        this.AuCTelauCTel = 1;
                    } else if (i5 <= i7 && i7 < i6) {
                        this.AuCTelauCTel = 2;
                    } else if (i6 > i7 || i7 >= iDpInt$default) {
                        this.AuCTelauCTel = (iDpInt$default > i7 || i7 >= EZpvd().getMeasuredHeight()) ? 5 : 4;
                    } else {
                        this.AuCTelauCTel = 3;
                        InterfaceC49775uus interfaceC49775uus2 = this.zLjUOn;
                        if (interfaceC49775uus2 != null) {
                            interfaceC49775uus2.OLrzqt(true);
                        }
                    }
                    this.sSMYrx = this.iwGUEr;
                }
                if (!this.fARcdN && getScrollY() > 0) {
                    pUU.EZpvd(AEQbTJ, "user scroll up when scroll down,setting group to 0");
                    AkhnZx();
                    this.iwGUEr = 0;
                }
                if (!this.fARcdN && this.zsXlph) {
                    pUU.EZpvd(AEQbTJ, "user move when refresh, stop refresh now!");
                    OLrzqt(true);
                }
            } else if (action == 3) {
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private final void DbNXlk() {
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(this.sSMYrx), 0)) {
            return;
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        int iPx2dp$default = C55298xhM.px2dp$default(this.sSMYrx, (android.content.Context) null, 1, (java.lang.Object) null) / 10;
        intRef.element = iPx2dp$default;
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(iPx2dp$default), 13)) {
            intRef.element = 13;
        }
        C32866mlf.onEvent$default("BasicTrading_HalfKline_Header_Drag", (TrackChannel[]) null, new Function1() { // from class: o.uzR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50016uzU.EZpvd(intRef, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        this.sSMYrx = 0;
    }

    public static final Unit EZpvd(Ref.IntRef intRef, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, TypedValues.CycleType.S_WAVE_OFFSET, com.ibm.icu.text.DateFormat.DAY + intRef.element, false, 4, null);
        return Unit.INSTANCE;
    }

    private final void isConnected() {
        if (this.fJNWhG) {
            this.fJNWhG = false;
            android.view.ViewGroup viewGroupEZpvd = EZpvd();
            Intrinsics.checkNotNullExpressionValue(viewGroupEZpvd, "");
            viewGroupEZpvd.setVisibility(0);
            pUU.KWHzl(AEQbTJ, "recover headView to " + EZpvd().getMeasuredHeight());
            copydefault(-EZpvd().getMeasuredHeight());
        }
    }

    private final void AkhnZx() {
        if (this.fJNWhG) {
            return;
        }
        pUU.KWHzl(AEQbTJ, "user move up and setting group to 0");
        this.fJNWhG = true;
        post(new java.lang.Runnable() { // from class: o.uAf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C50016uzU.isConnected(this.KWHzl);
            }
        });
    }

    public static final void isConnected(C50016uzU c50016uzU) {
        android.view.ViewGroup viewGroupEZpvd = c50016uzU.EZpvd();
        Intrinsics.checkNotNullExpressionValue(viewGroupEZpvd, "");
        viewGroupEZpvd.setVisibility(8);
        c50016uzU.copydefault(0);
    }

    private final void fetchVPNInfo() {
        java.lang.String str = AEQbTJ;
        pUU.KWHzl(str, "onUserStopScroll realMove: " + this.iwGUEr);
        if (java.lang.Math.abs(this.iwGUEr) <= 0 || AhwBna()) {
            return;
        }
        this.iwGUEr = 0;
        pUU.KWHzl(str, "do move up action: " + this.AuCTelauCTel);
        int i = this.AuCTelauCTel;
        if (i == 2) {
            AEQbTJ();
        } else if (i == 3 || i == 4) {
            InterfaceC47981uAo.Application.openKline$default(this, null, 1, null);
        } else {
            EZpvd().post(new java.lang.Runnable() { // from class: o.uzS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C50016uzU.fetchVPNInfo(this.OLrzqt);
                }
            });
            InterfaceC49775uus interfaceC49775uus = this.zLjUOn;
            if (interfaceC49775uus != null) {
                interfaceC49775uus.copydefault(false);
            }
        }
        this.AuCTelauCTel = 5;
    }

    public static final void fetchVPNInfo(C50016uzU c50016uzU) {
        c50016uzU.copydefault(-c50016uzU.EZpvd().getMeasuredHeight());
        c50016uzU.AkhnZx();
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (gEmmrt() == 0) {
            super.onMeasure(i, i2);
            return;
        }
        try {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            C50015uzT c50015uzTDjBIcL = djBIcL();
            if (c50015uzTDjBIcL != null) {
                c50015uzTDjBIcL.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            AYXKKw();
        } catch (java.lang.Exception e) {
            xVM xvm = xVM.KWHzl;
            java.lang.String str = AEQbTJ + " onMeasure catch error";
            kotlin.Pair[] pairArr = new kotlin.Pair[1];
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("errMsg", message);
            xvm.AEQbTJ(str, C56424yEw.AYXKKw(pairArr));
        }
    }

    private final void AYXKKw() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt instanceof C50015uzT) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + gEmmrt(), 1073741824));
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (gEmmrt() > 0) {
            i2 = java.lang.Math.min(gEmmrt(), i2);
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void scrollTo(int i, int i2) {
        if (gEmmrt() > 0) {
            i2 = java.lang.Math.min(gEmmrt(), i2);
        }
        super.scrollTo(i, i2);
    }

    @Override // androidx.core.widget.NestedScrollView, androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NotNull android.view.View view, int i, int i2, @NotNull int[] iArr, int i3) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        if (gEmmrt() == 0) {
            super.onNestedPreScroll(view, i, i2, iArr, i3);
            return;
        }
        if (dispatchNestedPreScroll(i, i2, iArr, null, i3) || i2 <= 0 || getScrollY() >= gEmmrt()) {
            return;
        }
        this.hDKMBd = true;
        scrollBy(0, i2);
        iArr[1] = i2;
    }

    private final int KWHzl() {
        C50015uzT c50015uzTDjBIcL = djBIcL();
        int minimumHeight = c50015uzTDjBIcL != null ? c50015uzTDjBIcL.getMinimumHeight() : 0;
        if (minimumHeight > 0) {
            C50015uzT c50015uzTDjBIcL2 = djBIcL();
            int measuredHeight = (c50015uzTDjBIcL2 != null ? c50015uzTDjBIcL2.getMeasuredHeight() : 0) - minimumHeight;
            if (measuredHeight > 0) {
                return measuredHeight;
            }
            return 0;
        }
        FragmentContainerView fragmentContainerViewOLrzqt = OLrzqt();
        ActivityResultCaller fragment = fragmentContainerViewOLrzqt != null ? fragmentContainerViewOLrzqt.getFragment() : null;
        int iKWHzl = fragment instanceof InterfaceC49856uwT ? ((InterfaceC49856uwT) fragment).KWHzl() : 0;
        if (iKWHzl <= 0) {
            return 0;
        }
        FragmentContainerView fragmentContainerViewOLrzqt2 = OLrzqt();
        return (fragmentContainerViewOLrzqt2 != null ? fragmentContainerViewOLrzqt2.getTop() : 0) + iKWHzl;
    }

    @Override // androidx.core.widget.NestedScrollView, androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        this.hDKMBd = true;
        super.onNestedScroll(view, i, i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public boolean awakenScrollBars() {
        if (this.hDKMBd) {
            invalidate();
            return true;
        }
        return super.awakenScrollBars();
    }

    public static /* synthetic */ void doSecondaryGuide$default(C50016uzU c50016uzU, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        c50016uzU.KWHzl(i, i2, z);
    }

    private final void KWHzl(int i, int i2, boolean z) {
        android.animation.ValueAnimator valueAnimator = this.gHZMYf;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(i, i2);
        this.gHZMYf = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.setDuration(1000L);
        }
        android.animation.ValueAnimator valueAnimator2 = this.gHZMYf;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.uzX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator3) {
                    C50016uzU.copydefault(this.OLrzqt, valueAnimator3);
                }
            });
        }
        android.animation.ValueAnimator valueAnimator3 = this.gHZMYf;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new Activity(z, this));
        }
        android.animation.ValueAnimator valueAnimator4 = this.gHZMYf;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    public static final void copydefault(C50016uzU c50016uzU, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c50016uzU.copydefault(((java.lang.Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: o.uzU$Activity */
    public static final class Activity implements Animator.AnimatorListener {
        public final /* synthetic */ C50016uzU KWHzl;
        public final /* synthetic */ boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Activity(boolean z, C50016uzU c50016uzU) {
            this.OLrzqt = z;
            this.KWHzl = c50016uzU;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            InterfaceC49775uus interfaceC49775uus;
            Intrinsics.checkNotNullParameter(animator, "");
            if (!this.OLrzqt || (interfaceC49775uus = this.KWHzl.zLjUOn) == null) {
                return;
            }
            interfaceC49775uus.AEQbTJ();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            if (this.OLrzqt) {
                this.KWHzl.values = true;
                android.os.Handler handler = this.KWHzl.valueOf;
                final C50016uzU c50016uzU = this.KWHzl;
                handler.postDelayed(new java.lang.Runnable() { // from class: o.uAd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C50016uzU.Activity.EZpvd(c50016uzU);
                    }
                }, 1000L);
                return;
            }
            this.KWHzl.values = false;
            InterfaceC49775uus interfaceC49775uus = this.KWHzl.zLjUOn;
            if (interfaceC49775uus != null) {
                interfaceC49775uus.EZpvd();
            }
            Function0 function0 = this.KWHzl.AYXKKw;
            if (function0 != null) {
                function0.invoke();
            }
        }

        public static final void EZpvd(C50016uzU c50016uzU) {
            c50016uzU.values = false;
            C50016uzU.doSecondaryGuide$default(c50016uzU, (-c50016uzU.EZpvd().getMeasuredHeight()) + c50016uzU.getNewProxyInstance, -c50016uzU.EZpvd().getMeasuredHeight(), false, 4, null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            InterfaceC49775uus interfaceC49775uus = this.KWHzl.zLjUOn;
            if (interfaceC49775uus != null) {
                interfaceC49775uus.EZpvd();
            }
            Function0 function0 = this.KWHzl.AYXKKw;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.uzU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void animatorTo$default(C50016uzU c50016uzU, long j, int i, int i2, boolean z, Function0 function0, int i3, java.lang.Object obj) {
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
        c50016uzU.EZpvd(j2, i, i2, z2, function0);
    }

    private final void EZpvd(long j, int i, int i2, boolean z, Function0<Unit> function0) {
        android.animation.ValueAnimator valueAnimator = this.gHZMYf;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(i, i2);
        this.gHZMYf = valueAnimatorOfInt;
        if (z && valueAnimatorOfInt != null) {
            valueAnimatorOfInt.setDuration(j);
        }
        android.animation.ValueAnimator valueAnimator2 = this.gHZMYf;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new Application(function0));
        }
        android.animation.ValueAnimator valueAnimator3 = this.gHZMYf;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.uzV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator4) {
                    C50016uzU.OLrzqt(this.copydefault, valueAnimator4);
                }
            });
        }
        android.animation.ValueAnimator valueAnimator4 = this.gHZMYf;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    /* JADX INFO: renamed from: o.uzU$Application */
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

    public static final void OLrzqt(C50016uzU c50016uzU, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c50016uzU.copydefault(((java.lang.Integer) animatedValue).intValue());
    }

    private final void AEQbTJ() {
        this.zsXlph = true;
        InterfaceC49775uus interfaceC49775uus = this.zLjUOn;
        if (interfaceC49775uus != null) {
            interfaceC49775uus.KWHzl(true);
        }
        Function0<Unit> function0 = this.getFieldNames;
        if (function0 != null) {
            function0.invoke();
        }
        copydefault((-EZpvd().getMeasuredHeight()) + this.getNewProxyInstance);
    }

    @Override // o.InterfaceC47981uAo
    public void OLrzqt(boolean z) {
        if (this.zsXlph) {
            this.zsXlph = false;
            InterfaceC49775uus interfaceC49775uus = this.zLjUOn;
            if (interfaceC49775uus != null) {
                interfaceC49775uus.KWHzl(false);
            }
            copydefault(z ? 0 : -EZpvd().getMeasuredHeight());
            InterfaceC49775uus interfaceC49775uus2 = this.zLjUOn;
            if (interfaceC49775uus2 != null) {
                interfaceC49775uus2.copydefault(false);
            }
            AkhnZx();
        }
    }

    @Override // o.InterfaceC47981uAo
    public void AEQbTJ(final Function0<Unit> function0) {
        C49402unq.copydefault(this, "kline_state_change", C56423yEv.EZpvd(C56390yDp.OLrzqt("state", "open")), new java.lang.Class[0]);
        isConnected();
        this.DbNXlk = true;
        InterfaceC49775uus interfaceC49775uus = this.zLjUOn;
        if (interfaceC49775uus != null) {
            interfaceC49775uus.AEQbTJ(this.gEmmrt);
        }
        animatorTo$default(this, 0L, valueOf(), 0, false, new Function0() { // from class: o.uAb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50016uzU.OLrzqt(this.copydefault, function0);
            }
        }, 9, null);
    }

    public static final Unit OLrzqt(C50016uzU c50016uzU, Function0 function0) {
        InterfaceC49775uus interfaceC49775uus = c50016uzU.zLjUOn;
        if (interfaceC49775uus != null) {
            interfaceC49775uus.copydefault(true);
        }
        c50016uzU.fetchVPNInfo = false;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC47981uAo
    public void OLrzqt(boolean z, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C49402unq.copydefault(this, "kline_state_change", C56423yEv.EZpvd(C56390yDp.OLrzqt("state", EopTrackEvent.CLOSE)), new java.lang.Class[0]);
        this.DbNXlk = false;
        EZpvd(300L, valueOf(), -EZpvd().getMeasuredHeight(), z, new Function0() { // from class: o.uzY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50016uzU.AEQbTJ(this.OLrzqt, function0);
            }
        });
    }

    public static final Unit AEQbTJ(C50016uzU c50016uzU, Function0 function0) {
        InterfaceC49775uus interfaceC49775uus = c50016uzU.zLjUOn;
        if (interfaceC49775uus != null) {
            interfaceC49775uus.copydefault(false);
        }
        c50016uzU.copydefault(-(c50016uzU.EZpvd().getMeasuredHeight() + c50016uzU.getNewProxyInstance));
        c50016uzU.AkhnZx();
        Function0<Unit> function02 = c50016uzU.fIwbmz;
        if (function02 != null) {
            function02.invoke();
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    private final void copydefault(int i) {
        C50015uzT c50015uzTDjBIcL = djBIcL();
        ViewGroup.LayoutParams layoutParams = c50015uzTDjBIcL != null ? c50015uzTDjBIcL.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i;
            C50015uzT c50015uzTDjBIcL2 = djBIcL();
            if (c50015uzTDjBIcL2 != null) {
                c50015uzTDjBIcL2.setLayoutParams(marginLayoutParams);
            }
        }
    }

    private final int valueOf() {
        C50015uzT c50015uzTDjBIcL = djBIcL();
        ViewGroup.LayoutParams layoutParams = c50015uzTDjBIcL != null ? c50015uzTDjBIcL.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    private final void copydefault() {
        android.animation.ValueAnimator valueAnimator = this.gHZMYf;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.valueOf.removeCallbacksAndMessages(null);
    }

    private final boolean AhwBna() {
        android.animation.ValueAnimator valueAnimator = this.gHZMYf;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.gHZMYf;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.gHZMYf = null;
        this.zLjUOn = null;
        this.getFieldNames = null;
        this.isConnected = null;
        this.fIwbmz = null;
        this.AYXKKw = null;
    }
}
