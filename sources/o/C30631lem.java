package o;

import com.airbnb.lottie.LottieAnimationView;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C30631lem;
import o.InterfaceC22278hcO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lem, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30631lem {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final C21667hHw AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public InterfaceC22278hcO EZpvd;
    public C30677lff KWHzl;
    public final androidx.fragment.app.Fragment OLrzqt;

    public C30631lem(@NotNull androidx.fragment.app.Fragment fragment, @NotNull C21667hHw c21667hHw) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(c21667hHw, "");
        this.OLrzqt = fragment;
        this.AEQbTJ = c21667hHw;
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.leq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30631lem.values(this.AEQbTJ);
            }
        });
        C22281hcR c22281hcR = c21667hHw.EZpvd;
        this.EZpvd = c22281hcR;
        if (c22281hcR != null) {
            c22281hcR.setStickScrollChangeListener(EZpvd());
        }
        c21667hHw.AYXKKw.setTag("header_tag");
    }

    /* JADX INFO: renamed from: o.lem$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lem.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.lem$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC22283hcT {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC22283hcT
        public void EZpvd(int i, int i2) {
            C30677lff c30677lff = C30631lem.this.KWHzl;
            if (c30677lff != null) {
                c30677lff.KWHzl(i2);
            }
        }

        @Override // o.InterfaceC22283hcT
        public void AEQbTJ(boolean z) {
            C30677lff c30677lff = C30631lem.this.KWHzl;
            if (c30677lff != null) {
                c30677lff.OLrzqt(z);
            }
        }

        @Override // o.InterfaceC22283hcT
        public void KWHzl(boolean z) {
            C30631lem c30631lem = C30631lem.this;
            InterfaceC22278hcO interfaceC22278hcO = c30631lem.EZpvd;
            c30631lem.copydefault((interfaceC22278hcO == null || interfaceC22278hcO.AEQbTJ()) ? z : true);
            C30677lff c30677lff = C30631lem.this.KWHzl;
            if (c30677lff != null) {
                final C30631lem c30631lem2 = C30631lem.this;
                c30677lff.copydefault(z, new Function0() { // from class: o.lev
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C30631lem.StateListAnimator.copydefault(c30631lem2);
                    }
                });
            }
        }

        public static final Unit copydefault(C30631lem c30631lem) {
            c30631lem.OLrzqt();
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC22283hcT
        public void copydefault(boolean z) {
            C30677lff c30677lff = C30631lem.this.KWHzl;
            if (c30677lff != null) {
                c30677lff.KWHzl(z);
            }
        }

        @Override // o.InterfaceC22283hcT
        public void OLrzqt(boolean z) {
            C30677lff c30677lff = C30631lem.this.KWHzl;
            if (c30677lff != null) {
                c30677lff.EZpvd(z);
            }
        }

        @Override // o.InterfaceC22283hcT
        public void KWHzl() {
            C30677lff c30677lff = C30631lem.this.KWHzl;
            if (c30677lff != null) {
                c30677lff.OLrzqt();
            }
        }

        @Override // o.InterfaceC22283hcT
        public void EZpvd() {
            C30677lff c30677lff = C30631lem.this.KWHzl;
            if (c30677lff != null) {
                c30677lff.EZpvd();
            }
        }
    }

    public final StateListAnimator EZpvd() {
        return (StateListAnimator) this.AYXKKw.getValue();
    }

    public static final StateListAnimator values(C30631lem c30631lem) {
        return c30631lem.new StateListAnimator();
    }

    public final void AEQbTJ() {
        copydefault();
    }

    public final void copydefault() {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = this.OLrzqt.getChildFragmentManager().findFragmentByTag(java.lang.String.valueOf(C56524yIo.AEQbTJ(C30677lff.class).valueOf()));
        this.KWHzl = fragmentFindFragmentByTag instanceof C30677lff ? (C30677lff) fragmentFindFragmentByTag : null;
        if (!C22416heu.valueOf()) {
            if (this.KWHzl != null && C23317hvu.getNewProxyInstance()) {
                this.AEQbTJ.AYXKKw.post(new java.lang.Runnable() { // from class: o.len
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C30631lem.djBIcL(this.EZpvd);
                    }
                });
            }
            InterfaceC22278hcO interfaceC22278hcO = this.EZpvd;
            copydefault((interfaceC22278hcO == null || interfaceC22278hcO.AEQbTJ()) ? C23317hvu.getNewProxyInstance() : true);
            return;
        }
        this.AEQbTJ.AYXKKw.post(new java.lang.Runnable() { // from class: o.leo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C30631lem.AkhnZx(this.OLrzqt);
            }
        });
        C23317hvu.fetchVPNInfo(false);
        copydefault(true);
        this.KWHzl = null;
    }

    public static final void djBIcL(final C30631lem c30631lem) {
        android.widget.FrameLayout frameLayoutAhwBna;
        C30677lff c30677lff = c30631lem.KWHzl;
        if (c30677lff != null && (frameLayoutAhwBna = c30677lff.AhwBna()) != null) {
            frameLayoutAhwBna.post(new java.lang.Runnable() { // from class: o.ler
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C30631lem.isConnected(this.OLrzqt);
                }
            });
        }
        C30677lff c30677lff2 = c30631lem.KWHzl;
        if (c30677lff2 != null) {
            c30677lff2.djBIcL();
        }
        C30677lff c30677lff3 = c30631lem.KWHzl;
        if (c30677lff3 != null) {
            c30677lff3.EZpvd(new Function0() { // from class: o.lep
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C30631lem.fetchVPNInfo(this.EZpvd);
                }
            });
        }
    }

    public static final void isConnected(C30631lem c30631lem) {
        InterfaceC22278hcO interfaceC22278hcO = c30631lem.EZpvd;
        if (interfaceC22278hcO != null) {
            interfaceC22278hcO.EZpvd();
        }
    }

    public static final Unit fetchVPNInfo(C30631lem c30631lem) {
        c30631lem.OLrzqt();
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(C30631lem c30631lem) {
        InterfaceC22278hcO interfaceC22278hcO = c30631lem.EZpvd;
        if (interfaceC22278hcO != null) {
            interfaceC22278hcO.copydefault();
        }
    }

    public final void copydefault(boolean z) {
        this.AEQbTJ.EZpvd.setEnableRefresh(z);
    }

    public final boolean KWHzl() {
        android.widget.FrameLayout frameLayoutAhwBna;
        C31699mAq c31699mAq;
        LottieAnimationView lottieAnimationViewCopydefault;
        C30677lff c30677lff = this.KWHzl;
        return (c30677lff == null || (frameLayoutAhwBna = c30677lff.AhwBna()) == null || (c31699mAq = (C31699mAq) frameLayoutAhwBna.findViewById(C23274hvD.Application.createFullyDrawnExecutor)) == null || (lottieAnimationViewCopydefault = c31699mAq.copydefault()) == null || !lottieAnimationViewCopydefault.isAnimating()) ? false : true;
    }

    public final void OLrzqt() {
        if (this.AEQbTJ.EZpvd.AhwBna().DbNXlk() == RefreshState.Refreshing) {
            pUU.KWHzl("AdvancedKLineHandler", "smartRefresh is refreshing, close forbidden!");
            return;
        }
        InterfaceC22278hcO interfaceC22278hcO = this.EZpvd;
        if (interfaceC22278hcO != null) {
            InterfaceC22278hcO.ActionBar.closePullDownPanel$default(interfaceC22278hcO, false, new Function0() { // from class: o.let
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C30631lem.AhwBna(this.KWHzl);
                }
            }, 1, null);
        }
        InterfaceC22278hcO interfaceC22278hcO2 = this.EZpvd;
        copydefault((interfaceC22278hcO2 == null || interfaceC22278hcO2.AEQbTJ()) ? false : true);
        C23317hvu.fetchVPNInfo(false);
    }

    public static final Unit AhwBna(C30631lem c30631lem) {
        C30677lff c30677lff = c30631lem.KWHzl;
        if (c30677lff != null) {
            c30677lff.AEQbTJ();
        }
        return Unit.INSTANCE;
    }
}
