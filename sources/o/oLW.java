package o;

import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oLW {
    public static final oLW AEQbTJ = new oLW();

    private oLW() {
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        java.lang.String strOLrzqt;
        C54536xML c54536xMLDjBIcL;
        InterfaceC54577xNn interfaceC54577xNn;
        java.lang.String str5 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (str3.length() == 0) {
            return new kotlin.Pair<>("--", "");
        }
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) ? null : interfaceC54577xNn.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null) : null;
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(str2) : null;
        C54571xNh c54571xNhCreateTradeConverterWithIndex$default = (instFamily == null || abstractC54531xLwOLrzqt == null) ? null : AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
        if (c54571xNhCreateTradeConverterWithIndex$default == null || (strOLrzqt = c54571xNhCreateTradeConverterWithIndex$default.OLrzqt()) == null) {
            strOLrzqt = "";
        }
        if (c54571xNhCreateTradeConverterWithIndex$default != null) {
            c54571xNhCreateTradeConverterWithIndex$default.AhwBna(str4);
        }
        if (c54571xNhCreateTradeConverterWithIndex$default != null && (c54536xMLDjBIcL = c54571xNhCreateTradeConverterWithIndex$default.djBIcL(str3)) != null) {
            c54536xMLDjBIcL.djBIcL();
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "OPTION")) {
                c54536xMLDjBIcL.copydefault();
            }
            java.lang.String safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
            if (safeString$default != null) {
                str5 = safeString$default;
            }
        }
        return new kotlin.Pair<>(str5, strOLrzqt);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        java.lang.String str5 = "--";
        if (str3.length() == 0) {
            return new kotlin.Pair<>("--", "");
        }
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        BizInstrument suggestedInstrument$default = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) ? null : InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null);
        C54536xML c54536xMLKWHzl = KWHzl(suggestedInstrument$default, str3, Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null)));
        if (c54536xMLKWHzl != null && (c54536xMLCopydefault = c54536xMLKWHzl.copydefault()) != null && (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
            str5 = safeString$default;
        }
        return new kotlin.Pair<>(str5, str4);
    }

    public static /* synthetic */ C54536xML convertMarginPos$OKKLine_kline_impl$default(oLW olw, BizInstrument bizInstrument, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return olw.KWHzl(bizInstrument, str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C54536xML KWHzl(BizInstrument bizInstrument, @NotNull java.lang.String str, boolean z) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String tradeSymbol;
        java.lang.String instType;
        InterfaceC54577xNn interfaceC54577xNn;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) ? null : interfaceC54577xNn.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                instType = "";
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        if (z) {
            tradeSymbol = bizInstrument != null ? bizInstrument.getQuoteSymbol() : null;
        } else if (bizInstrument != null) {
            tradeSymbol = bizInstrument.getTradeSymbol();
        }
        java.lang.String instType2 = bizInstrument != null ? bizInstrument.getInstType() : null;
        if (Intrinsics.EZpvd((java.lang.Object) instType2, (java.lang.Object) "SPOT")) {
            xLL xll = abstractC54531xLwOLrzqt instanceof xLL ? (xLL) abstractC54531xLwOLrzqt : null;
            if (xll == null) {
                return null;
            }
            xMV xmvValueOf = xll.valueOf(bizInstrument.getInstFamily(), tradeSymbol != null ? tradeSymbol : "");
            if (xmvValueOf != null) {
                return xmvValueOf.copydefault(str);
            }
            return null;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) instType2, (java.lang.Object) "MARGIN")) {
            return null;
        }
        xLD xld = abstractC54531xLwOLrzqt instanceof xLD ? (xLD) abstractC54531xLwOLrzqt : null;
        if (xld == null) {
            return null;
        }
        xMV xmvValueOf2 = xld.valueOf(bizInstrument.getInstFamily(), tradeSymbol != null ? tradeSymbol : "");
        if (xmvValueOf2 != null) {
            return xmvValueOf2.copydefault(str);
        }
        return null;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        BizInstrument suggestedInstrument$default;
        java.lang.String profitSymbol;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        xMV xmvCreateSizeConverterWithIndex$default;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLDjBIcL;
        BizInstrument suggestedInstrument$default2;
        InterfaceC54577xNn interfaceC54577xNn;
        java.lang.String str4 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String str5 = "--";
        if (str3.length() == 0) {
            return new kotlin.Pair<>("--", "");
        }
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        java.lang.String safeString$default = null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) ? null : interfaceC54577xNn.OLrzqt();
        java.lang.String instFamily = (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default2 = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null)) == null) ? null : suggestedInstrument$default2.getInstFamily();
        if (instFamily != null) {
            if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str2)) != null && (xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null)) != null && (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(str3)) != null && (c54536xMLCopydefault2 = c54536xMLCopydefault.copydefault()) != null && (c54536xMLDjBIcL = c54536xMLCopydefault2.djBIcL()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
            }
            if (safeString$default != null) {
                str5 = safeString$default;
            }
        }
        if (interfaceC54581xNrOLrzqt != null && (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null)) != null && (profitSymbol = suggestedInstrument$default.getProfitSymbol()) != null) {
            str4 = profitSymbol;
        }
        return new kotlin.Pair<>(str5, str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        java.lang.String strGEmmrt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        InterfaceC54577xNn interfaceC54577xNn;
        java.lang.String str4 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String str5 = "--";
        if (str3.length() == 0) {
            return new kotlin.Pair<>("--", "");
        }
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) ? null : interfaceC54577xNn.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null) : null;
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str2)) == null) {
            c54536xMLCopydefault = null;
        } else {
            if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                instFamily = "";
            }
            xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default != null) {
                c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(str3);
            }
        }
        if (c54536xMLCopydefault != null && (strGEmmrt = c54536xMLCopydefault.gEmmrt()) != null) {
            str4 = strGEmmrt;
        }
        if (c54536xMLCopydefault != null && (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
            str5 = safeString$default;
        }
        return new kotlin.Pair<>(str5, str4);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        java.lang.String strGEmmrt;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.lang.String str5 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        java.lang.String str6 = "--";
        if (str4.length() == 0) {
            return new kotlin.Pair<>("--", "");
        }
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        BizInstrument suggestedInstrument$default = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) ? null : InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null);
        C54536xML c54536xMLKWHzl = KWHzl(suggestedInstrument$default, str4, Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null)));
        if (c54536xMLKWHzl != null && (strGEmmrt = c54536xMLKWHzl.gEmmrt()) != null) {
            str5 = strGEmmrt;
        }
        if (c54536xMLKWHzl != null && (c54536xMLCopydefault = c54536xMLKWHzl.copydefault()) != null && (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
            str6 = safeString$default;
        }
        return new kotlin.Pair<>(str6, str5);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "MARGIN")) {
            return copydefault(str, str2, str3, str4);
        }
        return copydefault(str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        C54536xML c54536xMLOLrzqt;
        C54536xML c54536xMLCopydefault;
        InterfaceC54577xNn interfaceC54577xNn;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        java.lang.String safeString$default = null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) ? null : interfaceC54577xNn.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null) : null;
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(str2) : null;
        if (abstractC54531xLwOLrzqt == null) {
            c54536xMLOLrzqt = null;
        } else {
            if (instFamily == null) {
                instFamily = "";
            }
            xMV xmvCreateProfitConverterWithIndex$default = AbstractC54531xLw.createProfitConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
            if (xmvCreateProfitConverterWithIndex$default != null) {
                c54536xMLOLrzqt = xmvCreateProfitConverterWithIndex$default.OLrzqt(str3);
            }
        }
        java.lang.String strGEmmrt = c54536xMLOLrzqt != null ? c54536xMLOLrzqt.gEmmrt() : null;
        if (str3.length() == 0) {
            return new kotlin.Pair<>("--", strGEmmrt != null ? strGEmmrt : "");
        }
        if (c54536xMLOLrzqt != null && (c54536xMLCopydefault = c54536xMLOLrzqt.copydefault()) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null);
        }
        return new kotlin.Pair<>(safeString$default != null ? safeString$default : "--", strGEmmrt != null ? strGEmmrt : "");
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        C54536xML c54536xMLCopydefault;
        java.lang.String safeString$default;
        java.lang.String strGEmmrt;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.lang.String str5 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        java.lang.String str6 = "--";
        if (str3.length() == 0) {
            return new kotlin.Pair<>("--", "");
        }
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        BizInstrument suggestedInstrument$default = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) ? null : InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null);
        C54536xML c54536xMLCopydefault2 = copydefault(suggestedInstrument$default, str3, Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null)));
        if (c54536xMLCopydefault2 != null && (strGEmmrt = c54536xMLCopydefault2.gEmmrt()) != null) {
            str5 = strGEmmrt;
        }
        if (c54536xMLCopydefault2 != null && (c54536xMLCopydefault = c54536xMLCopydefault2.copydefault()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) != null) {
            str6 = safeString$default;
        }
        return new kotlin.Pair<>(str6, str5);
    }

    public static /* synthetic */ C54536xML convertMarginPosWithNumber$OKKLine_kline_impl$default(oLW olw, BizInstrument bizInstrument, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return olw.copydefault(bizInstrument, str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C54536xML copydefault(BizInstrument bizInstrument, @NotNull java.lang.String str, boolean z) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String tradeSymbol;
        java.lang.String instType;
        InterfaceC54577xNn interfaceC54577xNn;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) ? null : interfaceC54577xNn.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                instType = "";
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        if (z) {
            tradeSymbol = bizInstrument != null ? bizInstrument.getQuoteSymbol() : null;
        } else if (bizInstrument != null) {
            tradeSymbol = bizInstrument.getTradeSymbol();
        }
        java.lang.String instType2 = bizInstrument != null ? bizInstrument.getInstType() : null;
        if (Intrinsics.EZpvd((java.lang.Object) instType2, (java.lang.Object) "SPOT")) {
            xLL xll = abstractC54531xLwOLrzqt instanceof xLL ? (xLL) abstractC54531xLwOLrzqt : null;
            if (xll == null) {
                return null;
            }
            xMV xmvValueOf = xll.valueOf(bizInstrument.getInstFamily(), tradeSymbol != null ? tradeSymbol : "");
            if (xmvValueOf != null) {
                return xmvValueOf.OLrzqt(str);
            }
            return null;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) instType2, (java.lang.Object) "MARGIN")) {
            return null;
        }
        xLD xld = abstractC54531xLwOLrzqt instanceof xLD ? (xLD) abstractC54531xLwOLrzqt : null;
        if (xld == null) {
            return null;
        }
        xMV xmvValueOf2 = xld.valueOf(bizInstrument.getInstFamily(), tradeSymbol != null ? tradeSymbol : "");
        if (xmvValueOf2 != null) {
            return xmvValueOf2.OLrzqt(str);
        }
        return null;
    }
}
