package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinWatchInstrument;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xUD {
    public static final AbstractC54531xLw KWHzl(@NotNull java.lang.String str) {
        AbstractC54531xLw abstractC54531xLwDjBIcL;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwDjBIcL = interfaceC54581xNrOLrzqt.djBIcL(str)) != null && AbstractC54531xLw.isInitFun$default(abstractC54531xLwDjBIcL, false, 1, null)) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null) {
                return interfaceC54581xNrOLrzqt2.djBIcL(str);
            }
            return null;
        }
        return InterfaceC54763xUk.Companion.copydefault().KWHzl(str);
    }

    public static final AbstractC54531xLw AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        AbstractC54531xLw abstractC54531xLwDjBIcL = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.djBIcL(str) : null;
        return (abstractC54531xLwDjBIcL == null || !AbstractC54531xLw.isInitFun$default(abstractC54531xLwDjBIcL, false, 1, null) || abstractC54531xLwDjBIcL.zLjUOn()) ? InterfaceC54763xUk.Companion.copydefault().KWHzl(str) : abstractC54531xLwDjBIcL;
    }

    public static /* synthetic */ BizInstrument getWatchMarketInstrument$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return KWHzl(str, str2, str3, str4, z);
    }

    public static final BizInstrument KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
        FutureInstrument futureInstrumentValueOf;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC54531xLw abstractC54531xLwKWHzl = KWHzl(str);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES") && C33129mqd.OLrzqt((java.lang.CharSequence) str3) && C33129mqd.OLrzqt((java.lang.CharSequence) str4)) {
            boolean z2 = abstractC54531xLwKWHzl instanceof xLC;
            if (z2) {
            }
            xLC xlc = z2 ? (xLC) abstractC54531xLwKWHzl : null;
            if (xlc != null) {
                Intrinsics.copydefault((java.lang.Object) str3);
                Intrinsics.copydefault((java.lang.Object) str4);
                futureInstrumentValueOf = xlc.valueOf(str3, str4);
            } else {
                futureInstrumentValueOf = null;
            }
            pUU.KWHzl("getWatchMarketInstrument", "remove watch list " + (futureInstrumentValueOf != null ? futureInstrumentValueOf.getInstId() : null) + " " + (futureInstrumentValueOf != null ? futureInstrumentValueOf.getAlias() : null));
            return futureInstrumentValueOf;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "COIN")) {
            if (abstractC54531xLwKWHzl != null) {
                return abstractC54531xLwKWHzl.valueOf(str2);
            }
            return null;
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        TradeCoinInfo tradeCoinInfoAhwBna = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.AhwBna(str2) : null;
        if (tradeCoinInfoAhwBna == null) {
            return null;
        }
        if (z) {
            if (Intrinsics.EZpvd((java.lang.Object) tradeCoinInfoAhwBna.getTradeCoin(), (java.lang.Object) "1")) {
                return new CoinWatchInstrument(str2, "COIN");
            }
            return null;
        }
        return new CoinWatchInstrument(str2, "COIN");
    }

    public static /* synthetic */ CountDownInfo getCountDownInfo$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "SPOT";
        }
        return AEQbTJ(str, str2);
    }

    public static final CountDownInfo AEQbTJ(@NotNull java.lang.String str, java.lang.String str2) {
        AbstractC54531xLw abstractC54531xLwKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        if ((Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SWAP")) && (abstractC54531xLwKWHzl = KWHzl(str2)) != null) {
            return abstractC54531xLwKWHzl.values(str);
        }
        return null;
    }
}
