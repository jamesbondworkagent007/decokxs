package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pkx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC39051pkx implements InterfaceC39005pkD {
    public androidx.fragment.app.Fragment AEQbTJ;
    public boolean AYXKKw;
    public final java.util.ArrayList<Function1<android.view.View, Unit>> AhwBna;
    public final java.lang.String AkhnZx;
    public C39041pkn<AbstractC39034pkg> EZpvd;
    public FragmentActivity KWHzl;
    public final boolean OLrzqt;
    public final C58216yxB copydefault;
    public android.view.View djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC39051pkx() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C39041pkn<AbstractC39034pkg> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AYXKKw() {
        return this.AkhnZx;
    }

    public final void DbNXlk() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FragmentActivity EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(android.view.View view) {
        this.djBIcL = view;
    }

    public abstract void KWHzl(@NotNull android.view.View view, android.os.Bundle bundle);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(androidx.fragment.app.Fragment fragment) {
        this.AEQbTJ = fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(FragmentActivity fragmentActivity) {
        this.KWHzl = fragmentActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(C39041pkn<AbstractC39034pkg> c39041pkn) {
        this.EZpvd = c39041pkn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        this.AYXKKw = z;
    }

    public final void fetchVPNInfo() {
    }

    public void gEmmrt() {
    }

    public final void isConnected() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public androidx.fragment.app.Fragment valueOf() {
        return this.AEQbTJ;
    }

    public final void values() {
    }

    public AbstractC39051pkx(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.pkB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC39051pkx.OLrzqt(this.KWHzl);
            }
        });
        this.copydefault = new C58216yxB();
        this.AhwBna = new java.util.ArrayList<>(2);
        this.OLrzqt = true;
        this.AkhnZx = getClass().getName() + ":" + str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:27) call: o.pkx.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ AbstractC39051pkx(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public static final C39002pkA OLrzqt(AbstractC39051pkx abstractC39051pkx) {
        return new C39002pkA(abstractC39051pkx);
    }

    public final C39002pkA AhwBna() {
        return (C39002pkA) this.gEmmrt.getValue();
    }

    public final LifecycleOwner KWHzl() {
        C39041pkn<AbstractC39034pkg> c39041pknAEQbTJ = AEQbTJ();
        if (c39041pknAEQbTJ != null) {
            return c39041pknAEQbTJ.AEQbTJ();
        }
        return null;
    }

    public static /* synthetic */ void setContentView$default(AbstractC39051pkx abstractC39051pkx, android.view.View view, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setContentView");
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        abstractC39051pkx.OLrzqt(view, bundle);
    }

    public void OLrzqt(@NotNull final android.view.View view, final android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        if (AEQbTJ() == null) {
            return;
        }
        EZpvd(view);
        if (OLrzqt()) {
            OLrzqt(view);
        }
        AhwBna().OLrzqt(new Function0() { // from class: o.pkw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC39051pkx.OLrzqt(this.EZpvd, view, bundle);
            }
        });
    }

    public static final Unit OLrzqt(AbstractC39051pkx abstractC39051pkx, android.view.View view, android.os.Bundle bundle) {
        abstractC39051pkx.KWHzl(view, bundle);
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        C39041pkn<AbstractC39034pkg> c39041pknAEQbTJ;
        C39047pkt c39047pktEZpvd;
        gEmmrt();
        this.copydefault.OLrzqt();
        this.AhwBna.clear();
        FragmentActivity fragmentActivityEZpvd = EZpvd();
        if ((!(fragmentActivityEZpvd != null && fragmentActivityEZpvd.isChangingConfigurations())) && (c39041pknAEQbTJ = AEQbTJ()) != null && (c39047pktEZpvd = c39041pknAEQbTJ.EZpvd()) != null) {
            c39047pktEZpvd.KWHzl(AYXKKw());
        }
        djBIcL();
    }

    public final void djBIcL() {
        if (!this.valueOf) {
            EZpvd(null);
        }
        copydefault(false);
        KWHzl((androidx.fragment.app.Fragment) null);
        OLrzqt((FragmentActivity) null);
        OLrzqt((C39041pkn<AbstractC39034pkg>) null);
    }

    public final void OLrzqt(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        java.util.Iterator<T> it = this.AhwBna.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(view);
        }
        this.AhwBna.clear();
    }
}
