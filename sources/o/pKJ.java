package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pKJ extends C43265rly {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.pKQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return pKJ.copydefault();
        }
    });

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return false;
    }

    public final pMY OLrzqt() {
        return (pMY) this.KWHzl.getValue();
    }

    public static final pMY copydefault() {
        return (pMY) C58114yvF.OLrzqt(C43246rlf.OLrzqt.valueOf(), pMY.class);
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(pKL.class, C56392yDr.copydefault(new Function0() { // from class: o.pKU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pKJ.DbNXlk(this.AEQbTJ);
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC43294rma.class, C56392yDr.copydefault(new Function0() { // from class: o.pKT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pKJ.fARcdN(this.OLrzqt);
            }
        }));
        interfaceC43253rlm.EZpvd(pKE.class, C56392yDr.copydefault(new Function0() { // from class: o.pKV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pKJ.fJNWhG(this.AEQbTJ);
            }
        }));
        interfaceC43253rlm.EZpvd(pKD.class, C56392yDr.copydefault(new Function0() { // from class: o.pKS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pKJ.fIwbmz(this.KWHzl);
            }
        }));
    }

    public static final pKL DbNXlk(pKJ pkj) {
        return pkj.OLrzqt().fdOvFl();
    }

    public static final InterfaceC43294rma fARcdN(pKJ pkj) {
        return pkj.OLrzqt().UlJrfe();
    }

    public static final C38075pLh fJNWhG(pKJ pkj) {
        return pkj.OLrzqt().igXuih();
    }

    public static final pKD fIwbmz(pKJ pkj) {
        return pkj.OLrzqt().htlTjW();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        interfaceC43299rmf.EZpvd(mMP.class, C56392yDr.copydefault(new Function0() { // from class: o.pKW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pKJ.fetchVPNInfo(this.KWHzl);
            }
        }));
    }

    public static final pPJ fetchVPNInfo(pKJ pkj) {
        return pkj.OLrzqt().fjfviF();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        interfaceC43237rlW.EZpvd(pLT.OLrzqt(), C56392yDr.copydefault(new Function0() { // from class: o.pKP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pKJ.AhwBna(this.OLrzqt);
            }
        }));
        interfaceC43237rlW.EZpvd(pLZ.OLrzqt(), C56392yDr.copydefault(new Function0() { // from class: o.pKN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pKJ.values(this.OLrzqt);
            }
        }));
        interfaceC43237rlW.EZpvd(pLN.copydefault(), C56392yDr.copydefault(new Function0() { // from class: o.pKO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pKJ.isConnected(this.KWHzl);
            }
        }));
        interfaceC43237rlW.copydefault(pLO.copydefault(), C56392yDr.copydefault(new Function0() { // from class: o.pKR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pKJ.AkhnZx(this.copydefault);
            }
        }));
    }

    public static final pLR AhwBna(pKJ pkj) {
        return pkj.OLrzqt().aUsmxb();
    }

    public static final pLV values(pKJ pkj) {
        return pkj.OLrzqt().fERRXa();
    }

    public static final pLL isConnected(pKJ pkj) {
        return pkj.OLrzqt().USBtdM();
    }

    public static final pLM AkhnZx(pKJ pkj) {
        return pkj.OLrzqt().dUDNAs();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onLaunchComplete() {
        super.onLaunchComplete();
        OLrzqt().htlTjW().OLrzqt();
    }
}
