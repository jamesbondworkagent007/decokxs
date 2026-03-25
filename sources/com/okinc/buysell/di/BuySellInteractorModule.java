package com.okinc.buysell.di;

import kotlin.jvm.internal.Intrinsics;
import o.C30232lQt;
import o.C30272lSf;
import o.C30287lSu;
import o.C3634Ape;
import o.C3722ArM;
import o.C3738Arc;
import o.C3740Are;
import o.C3763AsA;
import o.C3766AsD;
import o.C3833AtR;
import o.C3835AtT;
import o.C3879AuK;
import o.C3882AuN;
import o.InterfaceC3752Arq;
import o.InterfaceC3849Ath;
import o.InterfaceC3910Auq;
import o.InterfaceC3950Ave;
import o.lIX;
import o.lzE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellInteractorModule {
    public static final BuySellInteractorModule EZpvd = new BuySellInteractorModule();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC3910Auq AEQbTJ(@NotNull C30272lSf c30272lSf) {
        Intrinsics.checkNotNullParameter(c30272lSf, "");
        return c30272lSf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC3950Ave EZpvd(@NotNull C30287lSu c30287lSu) {
        Intrinsics.checkNotNullParameter(c30287lSu, "");
        return c30287lSu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC3752Arq OLrzqt(@NotNull lIX lix) {
        Intrinsics.checkNotNullParameter(lix, "");
        return lix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC3849Ath OLrzqt(@NotNull C30232lQt c30232lQt) {
        Intrinsics.checkNotNullParameter(c30232lQt, "");
        return c30232lQt;
    }

    private BuySellInteractorModule() {
    }

    public final lzE KWHzl() {
        return new lzE();
    }

    public final C3634Ape copydefault() {
        return C3722ArM.createBscQuickConvertInteractor();
    }

    public final C3833AtR AEQbTJ(@NotNull InterfaceC3910Auq interfaceC3910Auq) {
        Intrinsics.checkNotNullParameter(interfaceC3910Auq, "");
        return C3722ArM.createRecurringBuyPlanListInteractor(new C3835AtT(interfaceC3910Auq));
    }

    public final C3879AuK AEQbTJ(@NotNull InterfaceC3950Ave interfaceC3950Ave) {
        Intrinsics.checkNotNullParameter(interfaceC3950Ave, "");
        return C3722ArM.createRecurringBuyPlanOrderListInteractor(new C3882AuN(interfaceC3950Ave));
    }

    public final C3766AsD KWHzl(@NotNull InterfaceC3849Ath interfaceC3849Ath) {
        Intrinsics.checkNotNullParameter(interfaceC3849Ath, "");
        return C3722ArM.createRecurringBuyPlanDetailInteractor(new C3763AsA(interfaceC3849Ath));
    }

    public final C3738Arc copydefault(@NotNull InterfaceC3752Arq interfaceC3752Arq) {
        Intrinsics.checkNotNullParameter(interfaceC3752Arq, "");
        return C3722ArM.createBuySellOrderDetailInteractor(new C3740Are(interfaceC3752Arq));
    }
}
