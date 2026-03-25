package o;

import com.okinc.biz.TradeType;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.manager.MarginModeManager;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xVq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54796xVq {
    public static final C54796xVq AEQbTJ = new C54796xVq();

    private C54796xVq() {
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        xMV xmvCreateSizeConverterWithIndex$default;
        xMV xmvCreateSizeConverterWithIndex$default2;
        java.lang.String safeString$default;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLAuCTel;
        java.lang.String safeString$default2;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAuCTel2;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String instFamily;
        java.lang.String instFamily2;
        java.lang.String str4 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(str2) : null;
        if (abstractC54531xLwOLrzqt != null) {
            BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str3);
            if (bizInstrumentValueOf == null || (instFamily2 = bizInstrumentValueOf.getInstFamily()) == null) {
                instFamily2 = "";
            }
            xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily2, null, 2, null);
        } else {
            xmvCreateSizeConverterWithIndex$default = null;
        }
        if (abstractC54531xLwOLrzqt != null) {
            BizInstrument bizInstrumentValueOf2 = abstractC54531xLwOLrzqt.valueOf(str3);
            if (bizInstrumentValueOf2 == null || (instFamily = bizInstrumentValueOf2.getInstFamily()) == null) {
                instFamily = "";
            }
            xmvCreateSizeConverterWithIndex$default2 = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
        } else {
            xmvCreateSizeConverterWithIndex$default2 = null;
        }
        if (xmvCreateSizeConverterWithIndex$default == null || (c54536xMLCopydefault2 = xmvCreateSizeConverterWithIndex$default.copydefault(str)) == null || (c54536xMLDjBIcL = c54536xMLCopydefault2.djBIcL()) == null || (c54536xMLAuCTel2 = c54536xMLDjBIcL.AuCTel()) == null || (c54536xMLFetchVPNInfo = c54536xMLAuCTel2.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) {
            safeString$default = "";
        }
        if (xmvCreateSizeConverterWithIndex$default2 != null && (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default2.copydefault(str)) != null && (c54536xMLAuCTel = c54536xMLCopydefault.AuCTel()) != null && (safeString$default2 = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null)) != null) {
            str4 = safeString$default2;
        }
        return new kotlin.Pair<>(safeString$default, str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v4, types: [o.xNh] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.okinc.unify_trade.biz.BizInstrument] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.lang.String, java.lang.String> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull TradeType tradeType, boolean z, @NotNull java.lang.String str4, java.lang.String str5, boolean z2) {
        java.lang.Boolean bool;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        TradeType tradeType2;
        java.lang.String str9;
        java.lang.String marginMode$default;
        java.lang.String tradeSymbol;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        xOV xovEZpvd;
        ?? CreateAmtConvertor$default;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54536xML c54536xMLAYXKKw2;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo2;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        MarginModeManager marginModeManagerIsConnected;
        java.lang.String instFamily2;
        xOW newProxyInstance2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        java.lang.Boolean boolValueOf = (interfaceC54581xNrCopydefault == null || (newProxyInstance2 = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null) ? null : java.lang.Boolean.valueOf(newProxyInstance2.djBIcL());
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt2 != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, str3, str2, null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt3 == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt3.isConnected()) == null) {
            bool = boolValueOf;
            str6 = null;
            str7 = "";
            str8 = str4;
            tradeType2 = tradeType;
            str9 = str3;
            marginMode$default = null;
        } else {
            if (suggestedInstrument$default == null || (instFamily2 = suggestedInstrument$default.getInstFamily()) == null) {
                instFamily2 = "";
            }
            bool = boolValueOf;
            java.lang.String str10 = instFamily2;
            str6 = null;
            str7 = "";
            str8 = str4;
            tradeType2 = tradeType;
            BizInstrument bizInstrument = suggestedInstrument$default;
            str9 = str3;
            marginMode$default = MarginModeManager.getMarginMode$default(marginModeManagerIsConnected, str10, str3, null, false, bizInstrument, 12, null);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt4 = c54589xNz.OLrzqt();
        ?? ValueOf = (interfaceC54581xNrOLrzqt4 == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt4.OLrzqt(str9)) == null) ? str6 : abstractC54531xLwOLrzqt2.valueOf(str2);
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(bool, bool2) && Intrinsics.EZpvd((java.lang.Object) marginMode$default, (java.lang.Object) "isolated") && Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) "MARGIN") && tradeType2 == TradeType.BUY_OPEN) {
            if (ValueOf != 0) {
                tradeSymbol = ValueOf.getQuoteSymbol();
            }
        } else if (Intrinsics.EZpvd(bool, bool2) && Intrinsics.EZpvd((java.lang.Object) marginMode$default, (java.lang.Object) "isolated") && Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) "MARGIN") && tradeType2 == TradeType.SELL_CLOSE) {
            if (ValueOf != 0) {
                tradeSymbol = ValueOf.getTradeSymbol();
            }
        } else if (((Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) "SPOT") && (interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt()) != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && (xovEZpvd = newProxyInstance.EZpvd()) != null && xovEZpvd.OLrzqt() && Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "isolated")) || Intrinsics.EZpvd((java.lang.Object) str9, (java.lang.Object) "MARGIN")) && !z) {
            tradeSymbol = str5;
        } else if (tradeType2 == TradeType.BUY_OPEN) {
            tradeSymbol = ValueOf != 0 ? ValueOf.getQuoteSymbol() : str6;
        } else if (ValueOf != 0) {
            tradeSymbol = ValueOf.getTradeSymbol();
        }
        if (tradeSymbol != null) {
            if (Intrinsics.EZpvd((java.lang.Object) tradeSymbol, (java.lang.Object) (ValueOf != 0 ? ValueOf.getQuoteSymbol() : str6))) {
                java.lang.String str11 = str6;
                C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str2, str3, null, true, null, 20, null);
                return new kotlin.Pair<>((c54571xNhCreateAmtConvertor$default == null || (c54536xMLAYXKKw2 = c54571xNhCreateAmtConvertor$default.AYXKKw(str)) == null || (c54536xMLDjBIcL2 = c54536xMLAYXKKw2.djBIcL()) == null || (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL2.fetchVPNInfo()) == null) ? str11 : C54536xML.toSafeString$default(c54536xMLFetchVPNInfo2, false, 1, str11), str);
            }
        }
        java.lang.String str12 = str9;
        java.lang.String str13 = str6;
        if (z2) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt5 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt5 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt5.OLrzqt(str12)) == null) {
                CreateAmtConvertor$default = str13;
            } else {
                if (ValueOf != 0 && (instFamily = ValueOf.getInstFamily()) != null) {
                    str7 = instFamily;
                }
                CreateAmtConvertor$default = abstractC54531xLwOLrzqt.AEQbTJ(str7);
            }
        } else {
            CreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str2, str3, null, false, null, 28, null);
        }
        return new kotlin.Pair<>((CreateAmtConvertor$default == 0 || (c54536xMLAYXKKw = CreateAmtConvertor$default.AYXKKw(str)) == null || (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null) ? str13 : C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, str13), str);
    }

    public static /* synthetic */ kotlin.Pair convertDerivativeAvaTrade$default(C54796xVq c54796xVq, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        return c54796xVq.copydefault(str, str2, str3, str4);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        int iHashCode = str3.hashCode();
        if (iHashCode != -1956807563) {
            if (iHashCode != 2558355) {
                if (iHashCode == 214415088 && str3.equals("FUTURES")) {
                    return KWHzl(str, str2, str3, str4);
                }
            } else if (str3.equals("SWAP")) {
                return KWHzl(str, str2, str3, str4);
            }
        } else if (str3.equals("OPTION")) {
            return KWHzl(str, str2, str3);
        }
        return new kotlin.Pair<>("", "");
    }

    public static /* synthetic */ kotlin.Pair convertSpotAvaTrade$default(C54796xVq c54796xVq, TradeType tradeType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, boolean z, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            z = false;
        }
        return c54796xVq.KWHzl(tradeType, str, str2, str3, bool, z);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(@NotNull TradeType tradeType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Boolean bool, boolean z) {
        C54796xVq c54796xVq;
        BizInstrument suggestedInstrument$default;
        C54571xNh c54571xNhCreateAmtConvertor$default;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54536xML c54536xMLAYXKKw2;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo2;
        C54536xML c54536xMLAYXKKw3;
        C54536xML c54536xMLDjBIcL3;
        C54536xML c54536xMLFetchVPNInfo3;
        java.lang.String str4 = "";
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String safeString$default = null;
        if (interfaceC54581xNrOLrzqt != null) {
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str3, str2, null, null, 12, null);
            c54796xVq = this;
        } else {
            c54796xVq = this;
            suggestedInstrument$default = null;
        }
        if (c54796xVq.EZpvd(suggestedInstrument$default) && Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "MARGIN") && tradeType == TradeType.SELL_CLOSE) {
            C54571xNh c54571xNhCreateAmtConvertor$default2 = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str2, str3, null, true, null, 20, null);
            if (c54571xNhCreateAmtConvertor$default2 != null && (c54536xMLAYXKKw3 = c54571xNhCreateAmtConvertor$default2.AYXKKw(str)) != null && (c54536xMLDjBIcL3 = c54536xMLAYXKKw3.djBIcL()) != null && (c54536xMLFetchVPNInfo3 = c54536xMLDjBIcL3.fetchVPNInfo()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo3, false, 1, null);
            }
            return new kotlin.Pair<>(safeString$default, str);
        }
        if (tradeType != TradeType.BUY_OPEN && (bool == null || !Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE))) {
            C54571xNh c54571xNhCreateAmtConvertor$default3 = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str2, str3, null, true, null, 20, null);
            if (c54571xNhCreateAmtConvertor$default3 != null && (c54536xMLAYXKKw2 = c54571xNhCreateAmtConvertor$default3.AYXKKw(str)) != null && (c54536xMLDjBIcL2 = c54536xMLAYXKKw2.djBIcL()) != null && (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL2.fetchVPNInfo()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo2, false, 1, null);
            }
            return new kotlin.Pair<>(safeString$default, str);
        }
        if (z) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(str3)) == null) {
                c54571xNhCreateAmtConvertor$default = null;
            } else {
                if (suggestedInstrument$default != null && (instFamily = suggestedInstrument$default.getInstFamily()) != null) {
                    str4 = instFamily;
                }
                c54571xNhCreateAmtConvertor$default = abstractC54531xLwOLrzqt.AEQbTJ(str4);
            }
        } else {
            c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str2, str3, null, false, null, 28, null);
        }
        if (c54571xNhCreateAmtConvertor$default != null && (c54536xMLAYXKKw = c54571xNhCreateAmtConvertor$default.AYXKKw(str)) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
        }
        return new kotlin.Pair<>(safeString$default, str);
    }

    public final boolean EZpvd(BizInstrument bizInstrument) {
        MarginModeManager marginModeManagerIsConnected;
        xOW newProxyInstance;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        java.lang.String currentMarginMode$default = null;
        java.lang.Boolean boolValueOf = (interfaceC54581xNrCopydefault == null || (newProxyInstance = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null) ? null : java.lang.Boolean.valueOf(newProxyInstance.djBIcL());
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) != null) {
            currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, bizInstrument, 1, null);
        }
        return Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.TRUE) && Intrinsics.EZpvd((java.lang.Object) currentMarginMode$default, (java.lang.Object) "isolated");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d A[PHI: r14
  0x001d: PHI (r14v1 java.lang.String) = (r14v0 java.lang.String), (r14v8 java.lang.String) binds: [B:3:0x0003, B:8:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String str5;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default;
        java.lang.String str6 = "";
        if (str4 != null) {
            str5 = str4;
        } else {
            xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
            str4 = value != null ? value.AYXKKw() : null;
            if (str4 == null) {
                str5 = "";
            }
        }
        C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str2, str3, str5, false, null, 24, null);
        C54536xML c54536xMLDjBIcL2 = c54571xNhCreateAmtConvertor$default != null ? c54571xNhCreateAmtConvertor$default.djBIcL(str) : null;
        if (c54536xMLDjBIcL2 != null && (c54536xMLDjBIcL = c54536xMLDjBIcL2.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) != null) {
            str6 = safeString$default;
        }
        return new kotlin.Pair<>(str6, str);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String safeString$default;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str2, str3, null, false, null, 28, null);
        C54536xML c54536xMLDjBIcL2 = c54571xNhCreateAmtConvertor$default != null ? c54571xNhCreateAmtConvertor$default.djBIcL(str) : null;
        if (c54536xMLDjBIcL2 == null || (c54536xMLDjBIcL = c54536xMLDjBIcL2.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) {
            safeString$default = "";
        }
        return new kotlin.Pair<>(safeString$default, str);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33129mqd.mulS$default(str2, str, null, null, null, 14, null);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return xMR.formatContractAmount$default(xMR.copydefault, C33129mqd.mulS$default(str2, str, null, null, null, 14, null), bizInstrument, false, z ? RoundingMode.HALF_DOWN : RoundingMode.DOWN, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull TradeType tradeType, boolean z, @NotNull java.lang.String str4, java.lang.String str5) {
        java.lang.String tradeSymbol;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        xOV xovEZpvd;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLAYXKKw2;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo2;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        xOW newProxyInstance2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        java.lang.String safeString$default = null;
        java.lang.Boolean boolValueOf = (interfaceC54581xNrCopydefault == null || (newProxyInstance2 = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null) ? null : java.lang.Boolean.valueOf(newProxyInstance2.djBIcL());
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        BizInstrument bizInstrumentValueOf = (interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(str3)) == null) ? null : abstractC54531xLwOLrzqt.valueOf(str2);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(boolValueOf, bool) && Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "isolated") && Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "MARGIN") && tradeType == TradeType.BUY_OPEN) {
            if (bizInstrumentValueOf != null) {
                tradeSymbol = bizInstrumentValueOf.getQuoteSymbol();
            }
        } else if (Intrinsics.EZpvd(boolValueOf, bool) && Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "isolated") && Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "MARGIN") && tradeType == TradeType.SELL_CLOSE) {
            if (bizInstrumentValueOf != null) {
                tradeSymbol = bizInstrumentValueOf.getTradeSymbol();
            }
        } else if (((Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "SPOT") && (interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt()) != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && (xovEZpvd = newProxyInstance.EZpvd()) != null && xovEZpvd.OLrzqt() && Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "isolated")) || Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "MARGIN")) && !z) {
            tradeSymbol = str5;
        } else if (tradeType == TradeType.BUY_OPEN) {
            tradeSymbol = bizInstrumentValueOf != null ? bizInstrumentValueOf.getQuoteSymbol() : null;
        } else if (bizInstrumentValueOf != null) {
            tradeSymbol = bizInstrumentValueOf.getTradeSymbol();
        }
        if (tradeSymbol != null) {
            if (Intrinsics.EZpvd((java.lang.Object) tradeSymbol, (java.lang.Object) (bizInstrumentValueOf != null ? bizInstrumentValueOf.getQuoteSymbol() : null))) {
                C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str2, str3, null, true, null, 20, null);
                if (c54571xNhCreateAmtConvertor$default != null && (c54536xMLAYXKKw2 = c54571xNhCreateAmtConvertor$default.AYXKKw(str)) != null && (c54536xMLDjBIcL2 = c54536xMLAYXKKw2.djBIcL()) != null && (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL2.fetchVPNInfo()) != null) {
                    safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo2, false, 1, null);
                }
                return new kotlin.Pair<>(safeString$default, str);
            }
        }
        C54571xNh c54571xNhCreateAmtConvertor$default2 = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str2, str3, null, false, null, 28, null);
        if (c54571xNhCreateAmtConvertor$default2 != null && (c54536xMLAYXKKw = c54571xNhCreateAmtConvertor$default2.AYXKKw(str)) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
        }
        return new kotlin.Pair<>(safeString$default, str);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(@NotNull TradeType tradeType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Boolean bool, @NotNull java.lang.String str4) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLAYXKKw2;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo2;
        C54536xML c54536xMLAYXKKw3;
        C54536xML c54536xMLDjBIcL3;
        C54536xML c54536xMLFetchVPNInfo3;
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        java.lang.String safeString$default = null;
        if (Intrinsics.EZpvd((interfaceC54581xNrCopydefault == null || (newProxyInstance = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null) ? null : java.lang.Boolean.valueOf(newProxyInstance.djBIcL()), java.lang.Boolean.TRUE) && Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "isolated") && Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "MARGIN") && tradeType == TradeType.SELL_CLOSE) {
            C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str2, str3, null, true, null, 20, null);
            if (c54571xNhCreateAmtConvertor$default != null && (c54536xMLAYXKKw3 = c54571xNhCreateAmtConvertor$default.AYXKKw(str)) != null && (c54536xMLDjBIcL3 = c54536xMLAYXKKw3.djBIcL()) != null && (c54536xMLFetchVPNInfo3 = c54536xMLDjBIcL3.fetchVPNInfo()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo3, false, 1, null);
            }
            return new kotlin.Pair<>(safeString$default, str);
        }
        if (tradeType == TradeType.BUY_OPEN || (bool != null && Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE))) {
            C54571xNh c54571xNhCreateAmtConvertor$default2 = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str2, str3, null, false, null, 28, null);
            if (c54571xNhCreateAmtConvertor$default2 != null && (c54536xMLAYXKKw = c54571xNhCreateAmtConvertor$default2.AYXKKw(str)) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
            }
            return new kotlin.Pair<>(safeString$default, str);
        }
        C54571xNh c54571xNhCreateAmtConvertor$default3 = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str2, str3, null, true, null, 20, null);
        if (c54571xNhCreateAmtConvertor$default3 != null && (c54536xMLAYXKKw2 = c54571xNhCreateAmtConvertor$default3.AYXKKw(str)) != null && (c54536xMLDjBIcL2 = c54536xMLAYXKKw2.djBIcL()) != null && (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL2.fetchVPNInfo()) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo2, false, 1, null);
        }
        return new kotlin.Pair<>(safeString$default, str);
    }

    public static /* synthetic */ kotlin.Pair convertSpotAvaQuoteCcy$default(C54796xVq c54796xVq, java.lang.String str, java.lang.String str2, java.lang.String str3, TradeType tradeType, java.lang.String str4, boolean z, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            z = false;
        }
        return c54796xVq.EZpvd(str, str2, str3, tradeType, str4, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.lang.String, java.lang.String> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull TradeType tradeType, java.lang.String str4, boolean z) {
        java.lang.String tradeSymbol;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C54571xNh c54571xNhAhwBna;
        java.lang.String instFamily;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        java.lang.String instFamily2;
        java.lang.String str5 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String safeString$default = null;
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str3, str2, null, null, 12, null) : null;
        if (tradeType == TradeType.BUY_OPEN) {
            tradeSymbol = (str4 == null || str4.length() == 0) ? suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null : str4;
        } else if (suggestedInstrument$default != null) {
            tradeSymbol = suggestedInstrument$default.getTradeSymbol();
        }
        if (z) {
            if (Intrinsics.EZpvd((java.lang.Object) tradeSymbol, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null))) {
                if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt.OLrzqt(str3)) != null) {
                    if (suggestedInstrument$default != null && (instFamily2 = suggestedInstrument$default.getInstFamily()) != null) {
                        str5 = instFamily2;
                    }
                    c54571xNhAhwBna = abstractC54531xLwOLrzqt2.AEQbTJ(str5);
                }
            }
        } else if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str3)) == null) {
            c54571xNhAhwBna = null;
        } else {
            if (suggestedInstrument$default != null && (instFamily = suggestedInstrument$default.getInstFamily()) != null) {
                str5 = instFamily;
            }
            c54571xNhAhwBna = abstractC54531xLwOLrzqt.AhwBna(str5, tradeSymbol);
        }
        if (c54571xNhAhwBna != null && (c54536xMLAYXKKw = c54571xNhAhwBna.AYXKKw(str)) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
        }
        return new kotlin.Pair<>(safeString$default, str);
    }

    public static /* synthetic */ kotlin.Pair convertSpotMaxSizeQuoteCcy$default(C54796xVq c54796xVq, java.lang.String str, java.lang.String str2, java.lang.String str3, TradeType tradeType, java.lang.String str4, boolean z, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            z = false;
        }
        return c54796xVq.KWHzl(str, str2, str3, tradeType, str4, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull TradeType tradeType, java.lang.String str4, boolean z) {
        java.lang.String quoteSymbol;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C54571xNh c54571xNhAhwBna;
        java.lang.String instFamily;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        java.lang.String instFamily2;
        java.lang.String str5 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String safeString$default = null;
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str3, str2, null, null, 12, null) : null;
        if (tradeType == TradeType.BUY_OPEN) {
            quoteSymbol = suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null;
        } else if (str4 != null && str4.length() != 0) {
            quoteSymbol = str4;
        } else if (suggestedInstrument$default != null) {
            quoteSymbol = suggestedInstrument$default.getQuoteSymbol();
        }
        if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "SPOT") && z) {
            if (Intrinsics.EZpvd((java.lang.Object) quoteSymbol, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null))) {
                if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt.OLrzqt(str3)) != null) {
                    if (suggestedInstrument$default != null && (instFamily2 = suggestedInstrument$default.getInstFamily()) != null) {
                        str5 = instFamily2;
                    }
                    c54571xNhAhwBna = abstractC54531xLwOLrzqt2.AEQbTJ(str5);
                }
            }
        } else if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str3)) == null) {
            c54571xNhAhwBna = null;
        } else {
            if (suggestedInstrument$default != null && (instFamily = suggestedInstrument$default.getInstFamily()) != null) {
                str5 = instFamily;
            }
            c54571xNhAhwBna = abstractC54531xLwOLrzqt.AhwBna(str5, quoteSymbol);
        }
        if (c54571xNhAhwBna != null && (c54536xMLAYXKKw = c54571xNhAhwBna.AYXKKw(str)) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
        }
        return new kotlin.Pair<>(safeString$default, str);
    }
}
