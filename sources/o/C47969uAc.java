package o;

import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uAc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C47969uAc extends C33546myW implements NestedScrollingChild3, NestedScrollingParent3 {
    public final InterfaceC56387yDm AYXKKw;
    public float AhwBna;
    public final java.lang.String OLrzqt;
    public boolean copydefault;
    public int djBIcL;
    public final int fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public boolean isConnected;
    public float valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C47969uAc(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:21) call: o.uAc.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C47969uAc(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47969uAc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = "TradeNestedSRL";
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.uAh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47969uAc.AEQbTJ(this.EZpvd);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.uAi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47969uAc.EZpvd(this.KWHzl);
            }
        });
        this.fetchVPNInfo = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        setNestedScrollingEnabled(true);
    }

    public static final NestedScrollingChildHelper AEQbTJ(C47969uAc c47969uAc) {
        return new NestedScrollingChildHelper(c47969uAc);
    }

    private final NestedScrollingChildHelper values() {
        return (NestedScrollingChildHelper) this.AYXKKw.getValue();
    }

    public static final NestedScrollingParentHelper EZpvd(C47969uAc c47969uAc) {
        return new NestedScrollingParentHelper(c47969uAc);
    }

    private final NestedScrollingParentHelper ejfBZ() {
        return (NestedScrollingParentHelper) this.gEmmrt.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.AhwBna = motionEvent.getX();
            this.valueOf = motionEvent.getY();
            this.copydefault = false;
        } else if (actionMasked == 1) {
            this.copydefault = false;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
            }
        } else if (!this.copydefault && KWHzl()) {
            float x = motionEvent.getX();
            float f = this.AhwBna;
            float y = motionEvent.getY() - this.valueOf;
            boolean z = java.lang.Math.abs(y) > java.lang.Math.abs(x - f);
            boolean z2 = y > ((float) this.fetchVPNInfo);
            if (z && z2) {
                this.copydefault = true;
                pUU.EZpvd(this.OLrzqt, "G" + this.djBIcL + " touch: block refresh intercept (outerHidden=true, dy=" + y + ")");
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (this.copydefault) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // o.C57869yqZ, android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        values().setNestedScrollingEnabled(z);
    }

    @Override // o.C57869yqZ, android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return values().isNestedScrollingEnabled();
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        return values().startNestedScroll(i, i2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        values().stopNestedScroll(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i) {
        return values().hasNestedScrollingParent(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return values().dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return values().dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, @NotNull int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr2, "");
        values().dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NotNull android.view.View view, @NotNull android.view.View view2, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        boolean z = (i & 2) != 0;
        if (z) {
            this.djBIcL++;
            this.isConnected = false;
            pUU.EZpvd(this.OLrzqt, "onStartNestedScroll: target=" + view2.getClass().getSimpleName() + ", axes=" + i);
        }
        return z || super.onStartNestedScroll(view, view2, i);
    }

    @Override // o.C57869yqZ, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(@NotNull android.view.View view, @NotNull android.view.View view2, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NotNull android.view.View view, @NotNull android.view.View view2, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        pUU.EZpvd(this.OLrzqt, "onNestedScrollAccepted: axes=" + i);
        ejfBZ().onNestedScrollAccepted(view, view2, i, i2);
        startNestedScroll(i, i2);
        super.onNestedScrollAccepted(view, view2, i);
    }

    @Override // o.C57869yqZ, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(@NotNull android.view.View view, @NotNull android.view.View view2, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        ejfBZ().onStopNestedScroll(view, i);
        stopNestedScroll(i);
        super.onStopNestedScroll(view);
        if (i == 1 && this.isConnected && !view.canScrollVertically(-1)) {
            InterfaceC47973uAg interfaceC47973uAgEZpvd = EZpvd();
            if (interfaceC47973uAgEZpvd != null) {
                interfaceC47973uAgEZpvd.KWHzl(true);
            }
            pUU.EZpvd(this.OLrzqt, "G" + this.djBIcL + " stop: requestShowOuterHeader (NON_TOUCH atTop)");
        }
    }

    @Override // o.C57869yqZ, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        onStopNestedScroll(view, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NotNull android.view.View view, int i, int i2, @NotNull int[] iArr, int i3) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        pUU.EZpvd(this.OLrzqt, "G" + this.djBIcL + " pre: target=" + view.getClass().getSimpleName() + ", dy=" + i2 + ", type=" + i3);
        if (i2 < 0) {
            this.isConnected = true;
        }
        int[] iArr2 = new int[2];
        dispatchNestedPreScroll(i, i2, iArr2, null, i3);
        iArr[0] = iArr2[0];
        int i4 = iArr2[1];
        iArr[1] = i4;
        if (i4 < i2) {
            int[] iArr3 = new int[2];
            super.onNestedPreScroll(view, i, i2 - i4, iArr3);
            iArr[0] = iArr[0] + iArr3[0];
            int i5 = iArr[1] + iArr3[1];
            iArr[1] = i5;
            pUU.EZpvd(this.OLrzqt, "G" + this.djBIcL + " pre: parentY=" + iArr2[1] + ", srlY=" + iArr3[1] + ", totalY=" + i5);
            return;
        }
        pUU.EZpvd(this.OLrzqt, "G" + this.djBIcL + " pre: parentY=" + iArr2[1] + ", srlSkipped");
    }

    @Override // o.C57869yqZ, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(@NotNull android.view.View view, int i, int i2, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, @NotNull int[] iArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        if (i4 < 0) {
            this.isConnected = true;
        }
        int[] iArr2 = new int[2];
        dispatchNestedScroll(i, i2, i3, i4, null, i5, iArr2);
        int i6 = iArr2[0];
        int i7 = i4 - iArr2[1];
        int[] iArr3 = new int[2];
        boolean z2 = i5 == 1 && i7 < 0;
        if (z2) {
            z = z2;
        } else {
            z = z2;
            super.onNestedScroll(view, i, i2, i3 - i6, i7);
        }
        iArr[0] = iArr[0] + iArr2[0] + iArr3[0];
        iArr[1] = iArr[1] + iArr2[1] + iArr3[1];
        pUU.EZpvd(this.OLrzqt, "G" + this.djBIcL + " scroll: target=" + view.getClass().getSimpleName() + ", dyUnc=" + i4 + ", type=" + i5 + ", parentY=" + iArr2[1] + ", remainY=" + i7 + ", skipSrl=" + z);
    }

    /* JADX DEBUG: Possible override for method o.myW.EZpvd()I */
    public final InterfaceC47973uAg EZpvd() {
        for (java.lang.Object parent = getParent(); parent instanceof android.view.View; parent = ((android.view.View) parent).getParent()) {
            if (parent instanceof InterfaceC47973uAg) {
                return (InterfaceC47973uAg) parent;
            }
        }
        return null;
    }

    public final boolean KWHzl() {
        InterfaceC47973uAg interfaceC47973uAgEZpvd = EZpvd();
        return interfaceC47973uAgEZpvd != null && interfaceC47973uAgEZpvd.AEQbTJ();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(view, "");
        onNestedScroll(view, i, i2, i3, i4, i5, new int[2]);
    }

    @Override // o.C57869yqZ, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(@NotNull android.view.View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(view, "");
        onNestedScroll(view, i, i2, i3, i4, 0);
    }
}
