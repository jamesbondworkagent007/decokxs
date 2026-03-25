package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yNz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56670yNz {
    public static final InterfaceC56658yNn EZpvd(@NotNull yNP ynp, @NotNull C56933yXs c56933yXs, @NotNull yQV yqv) {
        InterfaceC59098zad interfaceC59098zadOcIXYQ;
        Intrinsics.checkNotNullParameter(ynp, "");
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        if (c56933yXs.AEQbTJ()) {
            return null;
        }
        InterfaceC56663yNs interfaceC56663yNsEZpvd = ynp.copydefault(c56933yXs.EZpvd()).EZpvd().EZpvd(c56933yXs.OLrzqt(), yqv);
        InterfaceC56658yNn interfaceC56658yNn = interfaceC56663yNsEZpvd instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56663yNsEZpvd : null;
        if (interfaceC56658yNn != null) {
            return interfaceC56658yNn;
        }
        InterfaceC56658yNn interfaceC56658yNnEZpvd = EZpvd(ynp, c56933yXs.EZpvd(), yqv);
        InterfaceC56663yNs interfaceC56663yNsEZpvd2 = (interfaceC56658yNnEZpvd == null || (interfaceC59098zadOcIXYQ = interfaceC56658yNnEZpvd.OcIXYQ()) == null) ? null : interfaceC59098zadOcIXYQ.EZpvd(c56933yXs.OLrzqt(), yqv);
        if (interfaceC56663yNsEZpvd2 instanceof InterfaceC56658yNn) {
            return (InterfaceC56658yNn) interfaceC56663yNsEZpvd2;
        }
        return null;
    }

    public static final boolean AEQbTJ(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        return interfaceC56665yNu.AuCTel() instanceof yNW;
    }

    public static final InterfaceC56663yNs KWHzl(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        InterfaceC56665yNu interfaceC56665yNuAuCTel = interfaceC56665yNu.AuCTel();
        if (interfaceC56665yNuAuCTel != null && !(interfaceC56665yNu instanceof yNW)) {
            if (!AEQbTJ(interfaceC56665yNuAuCTel)) {
                return KWHzl(interfaceC56665yNuAuCTel);
            }
            if (interfaceC56665yNuAuCTel instanceof InterfaceC56663yNs) {
                return (InterfaceC56663yNs) interfaceC56665yNuAuCTel;
            }
        }
        return null;
    }

    public static final boolean OLrzqt(@NotNull yNG yng) {
        AbstractC59242zdO abstractC59242zdOBQ_;
        AbstractC59233zdF abstractC59233zdFIsConnected;
        AbstractC59233zdF abstractC59233zdFGEmmrt;
        Intrinsics.checkNotNullParameter(yng, "");
        InterfaceC56665yNu interfaceC56665yNuAuCTel = yng.AuCTel();
        InterfaceC56658yNn interfaceC56658yNn = interfaceC56665yNuAuCTel instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56665yNuAuCTel : null;
        if (interfaceC56658yNn == null) {
            return false;
        }
        InterfaceC56658yNn interfaceC56658yNn2 = yYK.copydefault(interfaceC56658yNn) ? interfaceC56658yNn : null;
        if (interfaceC56658yNn2 == null || (abstractC59242zdOBQ_ = interfaceC56658yNn2.bQ_()) == null || (abstractC59233zdFIsConnected = C59336zfC.isConnected(abstractC59242zdOBQ_)) == null || (abstractC59233zdFGEmmrt = yng.gEmmrt()) == null || !Intrinsics.EZpvd(yng.bR_(), C59423zgk.DbNXlk)) {
            return false;
        }
        if ((!C59336zfC.AEQbTJ(abstractC59233zdFGEmmrt) && !C59336zfC.AhwBna(abstractC59233zdFGEmmrt)) || yng.fetchVPNInfo().size() != 1) {
            return false;
        }
        AbstractC59233zdF abstractC59233zdFUzCIH = yng.fetchVPNInfo().get(0).uzCIH();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
        return Intrinsics.EZpvd(C59336zfC.isConnected(abstractC59233zdFUzCIH), abstractC59233zdFIsConnected) && yng.OLrzqt().isEmpty() && yng.djBIcL() == null;
    }
}
