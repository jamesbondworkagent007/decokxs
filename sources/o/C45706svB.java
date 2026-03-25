package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC33244msm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.svB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C45706svB {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC45723svf copydefault;

    @yCM
    public C45706svB(@NotNull InterfaceC45723svf interfaceC45723svf) {
        Intrinsics.checkNotNullParameter(interfaceC45723svf, "");
        this.copydefault = interfaceC45723svf;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.svy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45706svB.AEQbTJ();
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.svC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45706svB.OLrzqt();
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.svA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45706svB.djBIcL();
            }
        });
    }

    public static final InterfaceC33171mrS AEQbTJ() {
        return (InterfaceC33171mrS) C43251rlk.OLrzqt(InterfaceC33171mrS.class);
    }

    public final InterfaceC33171mrS AhwBna() {
        return (InterfaceC33171mrS) this.AEQbTJ.getValue();
    }

    public static final InterfaceC33171mrS OLrzqt() {
        return (InterfaceC33171mrS) C43251rlk.OLrzqt(InterfaceC33171mrS.class);
    }

    public final InterfaceC33171mrS valueOf() {
        return (InterfaceC33171mrS) this.EZpvd.getValue();
    }

    public static final InterfaceC31257lqc djBIcL() {
        return (InterfaceC31257lqc) C43251rlk.OLrzqt(InterfaceC31257lqc.class);
    }

    public final InterfaceC31257lqc AYXKKw() {
        return (InterfaceC31257lqc) this.OLrzqt.getValue();
    }

    /* JADX INFO: renamed from: o.svB$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.svB.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final boolean copydefault(boolean z, boolean z2) {
        pUU.copydefault("LiteHeroPage", "BottomNavigationEnableUseCase tab invoked with verifyCache=" + z);
        return gEmmrt() && AkhnZx() && AEQbTJ(z2) && EZpvd(z) && !fetchVPNInfo();
    }

    public final boolean gEmmrt() {
        boolean zAEQbTJ = C45726svi.KWHzl.AEQbTJ();
        pUU.copydefault("LiteHeroPage", "HeroABTestManager.shouldShowSimpleIA() = " + zAEQbTJ);
        return zAEQbTJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AkhnZx() {
        boolean z;
        InterfaceC33171mrS interfaceC33171mrSAhwBna = AhwBna();
        if (interfaceC33171mrSAhwBna != null) {
            z = interfaceC33171mrSAhwBna.ejfBZ();
        }
        pUU.copydefault("LiteHeroPage", "isLite = " + z);
        return z;
    }

    public final boolean AEQbTJ(boolean z) {
        StateFlow<AbstractC33244msm> stateFlowValues;
        if (!z) {
            return true;
        }
        InterfaceC33171mrS interfaceC33171mrSValueOf = valueOf();
        AbstractC33244msm value = (interfaceC33171mrSValueOf == null || (stateFlowValues = interfaceC33171mrSValueOf.values()) == null) ? null : stateFlowValues.getValue();
        pUU.copydefault("LiteHeroPage", "liteSubMode = " + value);
        return Intrinsics.EZpvd(value, AbstractC33244msm.Fragment.KWHzl);
    }

    public final boolean EZpvd(boolean z) {
        if (!z) {
            return true;
        }
        boolean z2 = this.copydefault.copydefault() != null;
        pUU.copydefault("LiteHeroPage", "HeroRepository.getCacheHero() != null = " + z2);
        return z2;
    }

    public final boolean fetchVPNInfo() {
        InterfaceC31257lqc interfaceC31257lqcAYXKKw = AYXKKw();
        boolean zOLrzqt = interfaceC31257lqcAYXKKw != null ? interfaceC31257lqcAYXKKw.OLrzqt() : false;
        pUU.KWHzl("LiteHeroPage", "paySimpleEnabled: " + zOLrzqt);
        return zOLrzqt;
    }
}
