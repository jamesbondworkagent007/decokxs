package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.kline.data.KLineTradeSubIndicatorBean;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pox, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39263pox extends AbstractC39006pkE {
    public final void KWHzl(@NotNull final LifecycleOwner lifecycleOwner, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, final int i, java.lang.Integer num, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str.length() == 0 || str2.length() == 0) {
            return;
        }
        C33527myD.subscribeOnIO$default(C58156yvv.EZpvd(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).getFutureSubIndicators(str, str2, i, num, str3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), lifecycleOwner), new Function1() { // from class: o.poy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39263pox.KWHzl((java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.poz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39263pox.copydefault(str2, lifecycleOwner, str, str3, i, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, LifecycleOwner lifecycleOwner, java.lang.String str2, java.lang.String str3, int i, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        KLineTradeSubIndicatorBean kLineTradeSubIndicatorBean = (KLineTradeSubIndicatorBean) responseData.getData();
        if (kLineTradeSubIndicatorBean != null) {
            C37979pHu.AEQbTJ.KWHzl(lifecycleOwner, str, str2, str3, i, kLineTradeSubIndicatorBean);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        Objects.toString(th);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [80=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list, java.lang.String str, java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (str != null) {
            java.lang.Integer numKWHzl = KWHzl(str2 == null ? "" : str2, str);
            if (numKWHzl != null) {
                int iIntValue = numKWHzl.intValue();
                java.lang.String str3 = "";
                for (java.lang.String str4 : list) {
                    switch (str4.hashCode()) {
                        case -2040464843:
                            if (str4.equals("LSAcco")) {
                                str3 = ((java.lang.Object) str3) + "eliteLSAccountRatio,";
                            }
                            break;
                        case 2522:
                            if (str4.equals("OI")) {
                                str3 = ((java.lang.Object) str3) + "oi,";
                            }
                            break;
                        case 63511234:
                            if (str4.equals("BSVol")) {
                                str3 = ((java.lang.Object) str3) + "takerBuySellVol,";
                            }
                            break;
                        case 72740685:
                            if (str4.equals("LSPos")) {
                                str3 = ((java.lang.Object) str3) + "eliteLSOIRatio,";
                            }
                            break;
                        case 1185755844:
                            if (str4.equals("LSRatio")) {
                                str3 = ((java.lang.Object) str3) + "LSAccountRatio,";
                            }
                            break;
                    }
                }
                if (str3.length() == 0) {
                    return;
                }
                C48914uef c48914uef = C48914uef.EZpvd;
                if (c48914uef.OLrzqt(str2) == 2 || c48914uef.OLrzqt(str2) == 3) {
                    KWHzl(lifecycleOwner, str, str3, iIntValue, 1440, C37980pHv.OLrzqt.AEQbTJ(i));
                }
            }
        }
    }

    public final java.lang.Integer KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        BizInstrument suggestedInstrument$default;
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        xOW newProxyInstance;
        java.lang.String strOLrzqt;
        InterfaceC49425uoM interfaceC49425uoM2;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3;
        xOW newProxyInstance2;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC49425uoM interfaceC49425uoM3 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM3 != null) {
            TradeKey tradeKey = TradeKey.MANAGER;
            InterfaceC54577xNn interfaceC54577xNn3 = (InterfaceC54577xNn) interfaceC49425uoM3.KWHzl(tradeKey);
            if (interfaceC54577xNn3 != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn3.OLrzqt()) != null && (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str, str2, null, null, 12, null)) != null) {
                if (!Intrinsics.EZpvd((java.lang.Object) suggestedInstrument$default.getInstType(), (java.lang.Object) "SWAP") && !Intrinsics.EZpvd((java.lang.Object) suggestedInstrument$default.getInstType(), (java.lang.Object) "FUTURES")) {
                    return null;
                }
                if (!suggestedInstrument$default.isPositiveContract() ? !((interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(tradeKey)) == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn.OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null || (strOLrzqt = newProxyInstance.OLrzqt()) == null) : !((interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(tradeKey)) == null || (interfaceC54581xNrOLrzqt3 = interfaceC54577xNn2.OLrzqt()) == null || (newProxyInstance2 = interfaceC54581xNrOLrzqt3.getNewProxyInstance()) == null || (strOLrzqt = newProxyInstance2.iwGUEr()) == null)) {
                    str3 = strOLrzqt;
                }
                return java.lang.Integer.valueOf(C33129mqd.AhwBna(str3));
            }
        }
        return null;
    }
}
