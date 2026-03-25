package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.SwapInstrument;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xNc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54566xNc {
    public static /* synthetic */ C54571xNh createStrategyTradeConverter$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return OLrzqt(str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C54571xNh OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String ctValCcy;
        C54571xNh c54571xNh;
        C54564xNa c54564xNa;
        xOW newProxyInstance;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP")) {
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str)) == null) {
                return null;
            }
            BizInstrument bizInstrumentDbNXlk = abstractC54531xLwOLrzqt.DbNXlk(str2);
            if (bizInstrumentDbNXlk != null && !bizInstrumentDbNXlk.isPositiveContract()) {
                IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(str2);
                c54564xNa = new C54564xNa(idxConfigAkhnZx != null ? idxConfigAkhnZx.getSheetDig() : null);
            } else {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
                if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrOLrzqt2 == null || (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null) ? null : newProxyInstance.iwGUEr()), (java.lang.Object) "1")) {
                    IdxConfig idxConfigAkhnZx2 = abstractC54531xLwOLrzqt.AkhnZx(str2);
                    c54564xNa = new C54564xNa(idxConfigAkhnZx2 != null ? idxConfigAkhnZx2.getSheetDig() : null);
                } else {
                    IdxConfig idxConfigAkhnZx3 = abstractC54531xLwOLrzqt.AkhnZx(str2);
                    if (bizInstrumentDbNXlk == null) {
                        ctValCcy = null;
                    } else if (bizInstrumentDbNXlk instanceof SwapInstrument) {
                        ctValCcy = ((SwapInstrument) bizInstrumentDbNXlk).getCtValCcy();
                    } else {
                        ctValCcy = bizInstrumentDbNXlk instanceof FutureInstrument ? ((FutureInstrument) bizInstrumentDbNXlk).getCtValCcy() : "";
                    }
                    java.lang.String contractDig = idxConfigAkhnZx3 != null ? idxConfigAkhnZx3.getContractDig() : null;
                    xMZ xmz = new xMZ();
                    xmz.AEQbTJ(ctValCcy == null ? "" : ctValCcy, contractDig == null ? "" : contractDig, true, idxConfigAkhnZx3 != null ? idxConfigAkhnZx3.getSheetDig() : null, bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getLotSize() : null);
                    c54571xNh = xmz;
                    if (bizInstrumentDbNXlk != null) {
                        return c54571xNh;
                    }
                    c54571xNh.valueOf(bizInstrumentDbNXlk.getFutureContractVal());
                    c54571xNh.AEQbTJ(bizInstrumentDbNXlk.getFutureMult());
                    return c54571xNh;
                }
            }
            c54571xNh = c54564xNa;
            if (bizInstrumentDbNXlk != null) {
            }
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt3 == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt3.OLrzqt(str)) == null) {
                return null;
            }
            return abstractC54531xLwOLrzqt2.AhwBna(str2, str3);
        }
    }
}
