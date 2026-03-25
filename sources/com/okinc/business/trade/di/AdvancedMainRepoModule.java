package com.okinc.business.trade.di;

import kotlin.jvm.internal.Intrinsics;
import o.C27640jyx;
import o.C28143kQm;
import o.C28147kQq;
import o.C28154kQx;
import o.C28155kQy;
import o.InterfaceC23225huH;
import o.InterfaceC23229huL;
import o.InterfaceC23234huQ;
import o.InterfaceC28146kQp;
import o.InterfaceC28150kQt;
import o.InterfaceC28152kQv;
import o.InterfaceC28153kQw;
import o.InterfaceC28156kQz;
import o.kQA;
import o.kQC;
import o.kQE;
import o.kYC;
import o.yCL;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMainRepoModule {
    public static final AdvancedMainRepoModule KWHzl = new AdvancedMainRepoModule();

    private AdvancedMainRepoModule() {
    }

    @yCR
    public final InterfaceC28150kQt copydefault(@NotNull InterfaceC23234huQ interfaceC23234huQ, @NotNull InterfaceC23225huH interfaceC23225huH) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        Intrinsics.checkNotNullParameter(interfaceC23225huH, "");
        return new C28147kQq(interfaceC23234huQ, interfaceC23225huH);
    }

    public final InterfaceC28156kQz KWHzl(@NotNull InterfaceC23234huQ interfaceC23234huQ, @NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        return new kQC(interfaceC23234huQ, kyc);
    }

    public final kQA EZpvd(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        return new kQE(interfaceC23234huQ);
    }

    public final InterfaceC28146kQp AEQbTJ(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        return new C28143kQm(interfaceC23234huQ);
    }

    public final InterfaceC28152kQv copydefault(@yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @yCL(AEQbTJ = "private_client") @NotNull C27640jyx c27640jyx2, @NotNull InterfaceC23234huQ interfaceC23234huQ, @NotNull InterfaceC23229huL interfaceC23229huL) {
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(c27640jyx2, "");
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        return new C28154kQx(c27640jyx, c27640jyx2, interfaceC23234huQ, interfaceC23229huL);
    }

    @yCR
    public final InterfaceC28153kQw EZpvd(@NotNull InterfaceC23225huH interfaceC23225huH) {
        Intrinsics.checkNotNullParameter(interfaceC23225huH, "");
        return new C28155kQy(interfaceC23225huH);
    }
}
