package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pFJ {
    public static final pFJ AEQbTJ = new pFJ();

    private pFJ() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, AbstractC54531xLw abstractC54531xLw, java.lang.String str4, java.lang.String str5) {
        xMW xmwKWHzl;
        C54536xML c54536xMLAYXKKw;
        java.lang.String strOLrzqt;
        C54536xML c54536xMLKWHzl;
        xMW xmwKWHzl2;
        C54536xML c54536xMLAYXKKw2;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (abstractC54531xLw == null || str4 == null || str5 == null) {
            return "";
        }
        BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(str4);
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        ValuationCurrencyData value = (interfaceC49425uoM == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn2.OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null) ? null : mutableLiveDataBG_.getValue();
        if (value != null) {
            value.getIsoCode();
        }
        InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        InterfaceC54581xNr interfaceC54581xNrCopydefault = (interfaceC49425uoM2 == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) == null) ? null : interfaceC54577xNn.copydefault();
        switch (str5.hashCode()) {
            case -2027980370:
                if (!str5.equals("MARGIN")) {
                    return "";
                }
                if (interfaceC54581xNrCopydefault != null || (c54536xMLKWHzl = interfaceC54581xNrCopydefault.KWHzl("USDT", str3)) == null || (strOLrzqt = c54536xMLKWHzl.OLrzqt(2, java.lang.Boolean.FALSE, RoundingMode.HALF_UP)) == null) {
                    return "";
                }
                return strOLrzqt;
            case -1956807563:
                if (!str5.equals("OPTION")) {
                    return "";
                }
                java.lang.String strMulS$default = C33129mqd.mulS$default(C33129mqd.mulS$default(str2, bizInstrumentValueOf != null ? bizInstrumentValueOf.getFutureContractVal() : null, null, null, null, 14, null), bizInstrumentValueOf != null ? bizInstrumentValueOf.getFutureMult() : null, null, null, null, 14, null);
                if (strMulS$default == null) {
                    strMulS$default = "";
                }
                if (interfaceC54581xNrCopydefault == null || (xmwKWHzl = interfaceC54581xNrCopydefault.KWHzl()) == null || (c54536xMLAYXKKw = xmwKWHzl.AYXKKw(strMulS$default)) == null || (strOLrzqt = c54536xMLAYXKKw.OLrzqt(2, java.lang.Boolean.FALSE, RoundingMode.HALF_UP)) == null) {
                    return "";
                }
                return strOLrzqt;
            case 2552066:
                if (!str5.equals("SPOT")) {
                    return "";
                }
                return interfaceC54581xNrCopydefault != null ? "" : "";
            case 2558355:
                if (!str5.equals("SWAP")) {
                    return "";
                }
                if (interfaceC54581xNrCopydefault != null || (xmwKWHzl2 = interfaceC54581xNrCopydefault.KWHzl()) == null || (c54536xMLAYXKKw2 = xmwKWHzl2.AYXKKw(str3)) == null || (strOLrzqt = c54536xMLAYXKKw2.OLrzqt(2, java.lang.Boolean.FALSE, RoundingMode.HALF_UP)) == null) {
                    return "";
                }
                return strOLrzqt;
            case 214415088:
                if (!str5.equals("FUTURES")) {
                    return "";
                }
                return interfaceC54581xNrCopydefault != null ? "" : "";
            default:
                return "";
        }
    }
}
