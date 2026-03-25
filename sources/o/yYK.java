package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yYK {
    public static final C56929yXo AEQbTJ;
    public static final C56933yXs copydefault;

    static {
        C56933yXs c56933yXs = new C56933yXs("kotlin.jvm.JvmInline");
        copydefault = c56933yXs;
        AEQbTJ = C56929yXo.AEQbTJ.KWHzl(c56933yXs);
    }

    public static final boolean EZpvd(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        return (interfaceC56665yNu instanceof InterfaceC56658yNn) && (((InterfaceC56658yNn) interfaceC56665yNu).iwGUEr() instanceof yNL);
    }

    public static final boolean AEQbTJ(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        return (interfaceC56665yNu instanceof InterfaceC56658yNn) && (((InterfaceC56658yNn) interfaceC56665yNu).iwGUEr() instanceof yNR);
    }

    public static final boolean copydefault(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        return EZpvd(interfaceC56665yNu) || AEQbTJ(interfaceC56665yNu);
    }

    public static final AbstractC59233zdF AEQbTJ(@NotNull AbstractC59233zdF abstractC59233zdF) {
        yNL<AbstractC59242zdO> ynlEZpvd;
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        InterfaceC56663yNs interfaceC56663yNsOLrzqt = abstractC59233zdF.djBIcL().OLrzqt();
        InterfaceC56658yNn interfaceC56658yNn = interfaceC56663yNsOLrzqt instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56663yNsOLrzqt : null;
        if (interfaceC56658yNn == null || (ynlEZpvd = yZE.EZpvd(interfaceC56658yNn)) == null) {
            return null;
        }
        return (AbstractC59242zdO) ynlEZpvd.KWHzl();
    }

    public static final boolean OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        InterfaceC56663yNs interfaceC56663yNsOLrzqt = abstractC59233zdF.djBIcL().OLrzqt();
        if (interfaceC56663yNsOLrzqt != null) {
            return EZpvd(interfaceC56663yNsOLrzqt);
        }
        return false;
    }

    public static final boolean EZpvd(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        InterfaceC56663yNs interfaceC56663yNsOLrzqt = abstractC59233zdF.djBIcL().OLrzqt();
        if (interfaceC56663yNsOLrzqt != null) {
            return copydefault(interfaceC56663yNsOLrzqt);
        }
        return false;
    }

    public static final boolean KWHzl(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        InterfaceC56663yNs interfaceC56663yNsOLrzqt = abstractC59233zdF.djBIcL().OLrzqt();
        return (interfaceC56663yNsOLrzqt == null || !AEQbTJ(interfaceC56663yNsOLrzqt) || C59295zeO.copydefault.fIwbmz(abstractC59233zdF)) ? false : true;
    }

    public static final AbstractC59233zdF copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        AbstractC59233zdF abstractC59233zdFAEQbTJ = AEQbTJ(abstractC59233zdF);
        if (abstractC59233zdFAEQbTJ != null) {
            return TypeSubstitutor.OLrzqt(abstractC59233zdF).OLrzqt(abstractC59233zdFAEQbTJ, Variance.INVARIANT);
        }
        return null;
    }

    public static final boolean OLrzqt(@NotNull InterfaceC56657yNm interfaceC56657yNm) {
        Intrinsics.checkNotNullParameter(interfaceC56657yNm, "");
        if (interfaceC56657yNm instanceof InterfaceC56675yOd) {
            InterfaceC56676yOe interfaceC56676yOeFIwbmz = ((InterfaceC56675yOd) interfaceC56657yNm).fIwbmz();
            Intrinsics.checkNotNullExpressionValue(interfaceC56676yOeFIwbmz, "");
            if (AEQbTJ((yOC) interfaceC56676yOeFIwbmz)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean OLrzqt(@NotNull yOC yoc) {
        yNL<AbstractC59242zdO> ynlEZpvd;
        Intrinsics.checkNotNullParameter(yoc, "");
        if (yoc.djBIcL() == null) {
            InterfaceC56665yNu interfaceC56665yNuAuCTel = yoc.AuCTel();
            C56935yXu c56935yXuOLrzqt = null;
            InterfaceC56658yNn interfaceC56658yNn = interfaceC56665yNuAuCTel instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56665yNuAuCTel : null;
            if (interfaceC56658yNn != null && (ynlEZpvd = yZE.EZpvd(interfaceC56658yNn)) != null) {
                c56935yXuOLrzqt = ynlEZpvd.OLrzqt();
            }
            if (Intrinsics.EZpvd(c56935yXuOLrzqt, yoc.bR_())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean AEQbTJ(@NotNull yOC yoc) {
        yOA<AbstractC59242zdO> yoaIwGUEr;
        Intrinsics.checkNotNullParameter(yoc, "");
        if (yoc.djBIcL() == null) {
            InterfaceC56665yNu interfaceC56665yNuAuCTel = yoc.AuCTel();
            InterfaceC56658yNn interfaceC56658yNn = interfaceC56665yNuAuCTel instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56665yNuAuCTel : null;
            if (interfaceC56658yNn != null && (yoaIwGUEr = interfaceC56658yNn.iwGUEr()) != null) {
                C56935yXu c56935yXuBR_ = yoc.bR_();
                Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
                if (yoaIwGUEr.AEQbTJ(c56935yXuBR_)) {
                    return true;
                }
            }
        }
        return false;
    }
}
