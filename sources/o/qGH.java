package o;

import com.okinc.market.search.features.main.root.data.po.TradingStrategy;
import com.okinc.tradeapi.bean.RouteData;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qGH {
    public static final java.lang.String KWHzl(@NotNull TradingStrategy tradingStrategy) {
        Intrinsics.checkNotNullParameter(tradingStrategy, "");
        return "TradingStrategy" + tradingStrategy.getBizType() + tradingStrategy.getApy() + tradingStrategy.getStrategyType() + tradingStrategy.getInstName();
    }

    public static final java.lang.String AEQbTJ(@NotNull TradingStrategy tradingStrategy) {
        Intrinsics.checkNotNullParameter(tradingStrategy, "");
        return bizInstName$default(tradingStrategy, null, 1, null) + " " + OLrzqt(tradingStrategy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [51=6] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.String OLrzqt(@NotNull TradingStrategy tradingStrategy) {
        java.lang.String lowerCase;
        Intrinsics.checkNotNullParameter(tradingStrategy, "");
        java.lang.String strategyType = tradingStrategy.getStrategyType();
        if (strategyType != null) {
            lowerCase = strategyType.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        } else {
            lowerCase = null;
        }
        if (lowerCase == null) {
            return "";
        }
        switch (lowerCase.hashCode()) {
            case -1831183611:
                return !lowerCase.equals("spot_dca") ? "" : C33070mpX.AYXKKw(qZH.PendingIntent.zqTOFw);
            case -1574173039:
                return !lowerCase.equals("infinite_grid") ? "" : C33070mpX.AYXKKw(qZH.PendingIntent.sCB);
            case -1402017003:
                return !lowerCase.equals("contract_dca") ? "" : C33070mpX.AYXKKw(qZH.PendingIntent.zAEkPU);
            case -591806012:
                return !lowerCase.equals("moon_grid") ? "" : C33070mpX.AYXKKw(qZH.PendingIntent.zDUObI);
            case -512749997:
                return !lowerCase.equals("contract_grid") ? "" : C33070mpX.AYXKKw(qZH.PendingIntent.jh);
            case 3181382:
                return !lowerCase.equals("grid") ? "" : C33070mpX.AYXKKw(qZH.PendingIntent.DcMfJKDcMfJK);
            default:
                return "";
        }
    }

    public static final java.lang.String OLrzqt(java.lang.Integer num) {
        if (num == null || num.intValue() != 0) {
            if (num != null && num.intValue() == 1) {
                return "MARGIN";
            }
            if (num != null && num.intValue() == 2) {
                return "SWAP";
            }
            if (num != null && num.intValue() == 3) {
                return "FUTURES";
            }
            if (num != null && num.intValue() == 4) {
                return "OPTION";
            }
        }
        return "SPOT";
    }

    public static /* synthetic */ java.lang.String bizInstName$default(TradingStrategy tradingStrategy, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        return KWHzl(tradingStrategy, context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dc, code lost:
    
        if (r12 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010a, code lost:
    
        if (r12 == null) goto L58;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String KWHzl(@NotNull TradingStrategy tradingStrategy, android.content.Context context) {
        java.lang.String instName;
        Intrinsics.checkNotNullParameter(tradingStrategy, "");
        if (tradingStrategy.getInstName() == null) {
            return "";
        }
        java.lang.String bizType = tradingStrategy.getBizType();
        java.lang.String strOLrzqt = RouteData.Companion.OLrzqt(bizType != null ? java.lang.Integer.valueOf(C33129mqd.AhwBna(bizType)) : null);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(strOLrzqt) : null;
        switch (strOLrzqt.hashCode()) {
            case -2027980370:
                if (strOLrzqt.equals("MARGIN")) {
                    java.lang.String displayId = tradingStrategy.getDisplayId();
                    java.lang.String instName2 = (displayId == null || displayId.length() == 0) ? tradingStrategy.getInstName() : tradingStrategy.getDisplayId();
                    if (context == null || !C55296xhK.OLrzqt(context)) {
                        if (abstractC54531xLwOLrzqt != null) {
                            java.lang.String instName3 = tradingStrategy.getInstName();
                            if (instName3 == null) {
                                instName3 = "";
                            }
                            BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(instName3);
                            if (bizInstrumentValueOf != null) {
                                instName = bizInstrumentValueOf.getTradeSymbol() + "/" + bizInstrumentValueOf.getDisplayQuoteSymbol();
                            }
                            break;
                        }
                        if (instName2 == null) {
                            return "";
                        }
                        return instName2;
                    }
                    if (abstractC54531xLwOLrzqt != null) {
                        java.lang.String instName4 = tradingStrategy.getInstName();
                        if (instName4 == null) {
                            instName4 = "";
                        }
                        BizInstrument bizInstrumentValueOf2 = abstractC54531xLwOLrzqt.valueOf(instName4);
                        if (bizInstrumentValueOf2 != null) {
                            instName = bizInstrumentValueOf2.getDisplayQuoteSymbol() + "/" + bizInstrumentValueOf2.getTradeSymbol();
                        }
                        break;
                    }
                    if (instName2 == null) {
                        return "";
                    }
                    return instName2;
                }
                instName = tradingStrategy.getInstName();
                if (instName == null) {
                    return "";
                }
                return instName;
            case 2552066:
                if (!strOLrzqt.equals("SPOT")) {
                }
                return instName;
            case 2558355:
                if (strOLrzqt.equals("SWAP")) {
                    return C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, tradingStrategy.getInstName(), strOLrzqt, false, false, false, 24, null);
                }
                instName = tradingStrategy.getInstName();
                if (instName == null) {
                }
                return instName;
            case 214415088:
                if (strOLrzqt.equals("FUTURES")) {
                    C40381qTt c40381qTt = C40381qTt.copydefault;
                    java.lang.String instName5 = tradingStrategy.getInstName();
                    Intrinsics.checkNotNullExpressionValue(java.util.Locale.getDefault(), "");
                    return C40381qTt.getTitleByIdAndType$default(c40381qTt, instName5, strOLrzqt, !C38303pTu.KWHzl(r12), false, false, 24, null);
                }
                instName = tradingStrategy.getInstName();
                if (instName == null) {
                }
                return instName;
        }
    }
}
