package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35748oCf {
    public final InterfaceC33171mrS AEQbTJ;
    public final InterfaceC31257lqc EZpvd;

    @yCM
    public C35748oCf(@NotNull InterfaceC33171mrS interfaceC33171mrS, @yCL(AEQbTJ = "IMWeb3PayService") InterfaceC31257lqc interfaceC31257lqc) {
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        this.AEQbTJ = interfaceC33171mrS;
        this.EZpvd = interfaceC31257lqc;
    }

    public final boolean KWHzl() {
        InterfaceC31257lqc interfaceC31257lqc = this.EZpvd;
        if (interfaceC31257lqc != null) {
            return interfaceC31257lqc.AEQbTJ();
        }
        return false;
    }
}
