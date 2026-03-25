package o;

import com.okinc.biz.TradeType;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DigitInfoBean;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.manager.MarginModeManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55887xsS {
    public java.lang.String AEQbTJ;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.copydefault = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    public C55887xsS(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.copydefault = str2;
    }

    public final BizInstrument AhwBna() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            return InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, this.AEQbTJ, this.copydefault, null, null, 12, null);
        }
        return null;
    }

    public final java.lang.String valueOf() {
        BizInstrument bizInstrumentAhwBna = AhwBna();
        if (bizInstrumentAhwBna != null) {
            return bizInstrumentAhwBna.getInstFamily();
        }
        return null;
    }

    public final java.lang.String OLrzqt() {
        BizInstrument bizInstrumentAhwBna = AhwBna();
        if (bizInstrumentAhwBna != null) {
            return bizInstrumentAhwBna.getTradeSymbol();
        }
        return null;
    }

    public final java.lang.String AYXKKw() {
        BizInstrument bizInstrumentAhwBna = AhwBna();
        if (bizInstrumentAhwBna != null) {
            return bizInstrumentAhwBna.getDisplayQuoteSymbol();
        }
        return null;
    }

    public final java.lang.String DbNXlk() {
        BizInstrument bizInstrumentAhwBna = AhwBna();
        if (bizInstrumentAhwBna != null) {
            return bizInstrumentAhwBna.getQuoteSymbol();
        }
        return null;
    }

    public final void gEmmrt(java.lang.String str) {
        pUU.EZpvd("USDRename", "update UX SelectedTradeQuoteCcy: " + this.OLrzqt + " to " + str);
        this.OLrzqt = str;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentAhwBna = AhwBna();
        if (bizInstrumentAhwBna == null || !bizInstrumentAhwBna.isDisplayTradeReceive()) {
            return null;
        }
        return AEQbTJ(str);
    }

    public final boolean AuCTel() {
        BizInstrument bizInstrumentAhwBna = AhwBna();
        if (bizInstrumentAhwBna != null) {
            return bizInstrumentAhwBna.isDisplayTradeReceive();
        }
        return false;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        BizInstrument bizInstrumentAhwBna;
        Intrinsics.checkNotNullParameter(str, "");
        if (!yDY.gEmmrt("SPOT", "MARGIN").contains(this.AEQbTJ) || !yDY.gEmmrt("grid", "spot_dca", "smart_portfolio", "smart_iceberg", "recurring", "twap").contains(str) || (bizInstrumentAhwBna = AhwBna()) == null) {
            return null;
        }
        java.util.List<java.lang.String> tradeQuoteCcyList = bizInstrumentAhwBna.getTradeQuoteCcyList();
        pUU.EZpvd("USDRename", "getTradeQuoteCcy, " + bizInstrumentAhwBna.joinCcyRelevantToString());
        if (tradeQuoteCcyList != null && tradeQuoteCcyList.size() == 1) {
            pUU.EZpvd("USDRename", "getTradeQuoteCcy, tradeQuoteCcy selected: " + ((java.lang.Object) tradeQuoteCcyList.get(0)) + " ");
            return tradeQuoteCcyList.get(0);
        }
        pUU.EZpvd("USDRename", "getTradeQuoteCcy, selectedTradeQuoteCcy : " + this.OLrzqt + " ");
        return this.OLrzqt;
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        BizInstrument bizInstrumentAhwBna;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strAEQbTJ = AEQbTJ(str);
        if (strAEQbTJ == null || (bizInstrumentAhwBna = AhwBna()) == null || !bizInstrumentAhwBna.isDisplayTradeReceive()) {
            return null;
        }
        return strAEQbTJ;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strAEQbTJ = AEQbTJ(str);
        return (strAEQbTJ == null && (strAEQbTJ = DbNXlk()) == null) ? "" : strAEQbTJ;
    }

    public static /* synthetic */ java.lang.String getAvaCcy$default(C55887xsS c55887xsS, TradeType tradeType, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            bool = null;
        }
        return c55887xsS.OLrzqt(tradeType, z, str, str2, str3, bool);
    }

    public final java.lang.String OLrzqt(@NotNull TradeType tradeType, boolean z, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.Boolean bool) {
        java.lang.String marginMode$default;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        xOV xovEZpvd;
        MarginModeManager marginModeManagerIsConnected;
        java.lang.String instFamily;
        xOW newProxyInstance2;
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        java.lang.Boolean boolValueOf = (interfaceC54581xNrCopydefault == null || (newProxyInstance2 = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null) ? null : java.lang.Boolean.valueOf(newProxyInstance2.djBIcL());
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt2.isConnected()) == null) {
            marginMode$default = null;
        } else {
            BizInstrument bizInstrumentAhwBna = AhwBna();
            marginMode$default = MarginModeManager.getMarginMode$default(marginModeManagerIsConnected, (bizInstrumentAhwBna == null || (instFamily = bizInstrumentAhwBna.getInstFamily()) == null) ? "" : instFamily, this.AEQbTJ, null, false, AhwBna(), 12, null);
        }
        BizInstrument bizInstrumentAhwBna2 = AhwBna();
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(boolValueOf, bool2) && Intrinsics.EZpvd((java.lang.Object) marginMode$default, (java.lang.Object) "isolated") && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "MARGIN") && tradeType == TradeType.BUY_OPEN) {
            return copydefault(str3);
        }
        if (Intrinsics.EZpvd(boolValueOf, bool2) && Intrinsics.EZpvd((java.lang.Object) marginMode$default, (java.lang.Object) "isolated") && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "MARGIN") && tradeType == TradeType.SELL_CLOSE) {
            if (bizInstrumentAhwBna2 != null) {
                return bizInstrumentAhwBna2.getTradeSymbol();
            }
        } else {
            if (((Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "SPOT") && (interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt()) != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && (xovEZpvd = newProxyInstance.EZpvd()) != null && xovEZpvd.OLrzqt() && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "isolated")) || Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "MARGIN")) && !z) {
                return str2;
            }
            if (tradeType == TradeType.BUY_OPEN || (tradeType == TradeType.SELL_CLOSE && Intrinsics.EZpvd(bool, bool2))) {
                return copydefault(str3);
            }
            if (bizInstrumentAhwBna2 != null) {
                return bizInstrumentAhwBna2.getTradeSymbol();
            }
        }
        return null;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(@NotNull java.lang.String str, @NotNull TradeType tradeType, boolean z, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, boolean z2) {
        C54571xNh c54571xNhCreateAmtConvertForAvailableAmt$default;
        java.lang.String strJoinCcyRelevantToString;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        java.lang.String strOLrzqt = OLrzqt(tradeType, z, str2, str3, str4, java.lang.Boolean.valueOf(z2));
        java.lang.String str6 = this.AEQbTJ;
        java.lang.String safeString$default = null;
        if (Intrinsics.EZpvd((java.lang.Object) str6, (java.lang.Object) "SPOT")) {
            c54571xNhCreateAmtConvertForAvailableAmt$default = EZpvd(str, z2, strOLrzqt);
        } else {
            c54571xNhCreateAmtConvertForAvailableAmt$default = Intrinsics.EZpvd((java.lang.Object) str6, (java.lang.Object) "MARGIN") ? createAmtConvertForAvailableAmt$default(this, str, !Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) OLrzqt()), null, 4, null) : null;
        }
        if (c54571xNhCreateAmtConvertForAvailableAmt$default != null && (c54536xMLAYXKKw = c54571xNhCreateAmtConvertForAvailableAmt$default.AYXKKw(str)) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
        }
        kotlin.Pair<java.lang.String, java.lang.String> pair = new kotlin.Pair<>(safeString$default, str);
        java.lang.String str7 = this.AEQbTJ;
        BizInstrument bizInstrumentAhwBna = AhwBna();
        if (bizInstrumentAhwBna == null || (strJoinCcyRelevantToString = bizInstrumentAhwBna.joinCcyRelevantToString()) == null) {
            strJoinCcyRelevantToString = "bizInstrument is null";
        }
        pUU.EZpvd("USDRename", "ConvertAva " + str7 + ", available value with ccy, " + strJoinCcyRelevantToString + ", tradeQuoteCcy:" + str5 + ", formatted: " + ((java.lang.Object) pair.getFirst()));
        return pair;
    }

    public final C54571xNh EZpvd(java.lang.String str) {
        java.lang.String instFamily;
        java.lang.Object objAEQbTJ = AEQbTJ();
        xLF xlf = objAEQbTJ instanceof xLF ? (xLF) objAEQbTJ : null;
        if (xlf == null) {
            return null;
        }
        BizInstrument bizInstrumentAhwBna = AhwBna();
        if (bizInstrumentAhwBna == null || (instFamily = bizInstrumentAhwBna.getInstFamily()) == null) {
            instFamily = "";
        }
        return xlf.OLrzqt(instFamily, str);
    }

    public static /* synthetic */ C54571xNh createAmtConvertForAvailableAmt$default(C55887xsS c55887xsS, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return c55887xsS.EZpvd(str, z, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C54571xNh EZpvd(java.lang.String str, boolean z, java.lang.String str2) {
        java.lang.String strOLrzqt;
        BizInstrument bizInstrumentAhwBna = AhwBna();
        if (bizInstrumentAhwBna == null && (bizInstrumentAhwBna = C56059xvf.EZpvd.isConnected()) == null) {
            return null;
        }
        if (z) {
            strOLrzqt = DbNXlk();
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            if (str2 != null && str2.length() != 0) {
                strOLrzqt = str2;
            }
        } else {
            strOLrzqt = OLrzqt();
        }
        java.lang.String str3 = this.AEQbTJ;
        int iHashCode = str3.hashCode();
        if (iHashCode != 2552066) {
            if (iHashCode != 2558355) {
                return C54566xNc.OLrzqt(this.AEQbTJ, bizInstrumentAhwBna.getInstFamily(), z ? DbNXlk() : null);
            }
            return C54566xNc.OLrzqt(this.AEQbTJ, bizInstrumentAhwBna.getInstFamily(), z ? DbNXlk() : null);
        }
        if (str3.equals("SPOT")) {
            return EZpvd(strOLrzqt);
        }
        return C54797xVr.copydefault.KWHzl(bizInstrumentAhwBna.getInstId(), bizInstrumentAhwBna.getInstType(), str, z, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int values() {
        java.lang.String quoteDig;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(this.AEQbTJ)) == null) {
            quoteDig = null;
        } else {
            BizInstrument bizInstrumentAhwBna = AhwBna();
            if (bizInstrumentAhwBna == null || (instFamily = bizInstrumentAhwBna.getInstFamily()) == null) {
                instFamily = "";
            }
            IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(instFamily);
            if (idxConfigAkhnZx != null) {
                quoteDig = idxConfigAkhnZx.getQuoteDig();
            }
        }
        if (quoteDig == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) quoteDig)) {
            return 8;
        }
        return C33129mqd.AhwBna(quoteDig);
    }

    public final DigitInfoBean isConnected() {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        DigitInfoBean digitInfoBean = new DigitInfoBean(null, null, 0, 7, null);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(this.AEQbTJ)) != null) {
            java.lang.String strEZpvd = abstractC54531xLwOLrzqt.EZpvd(AhwBna());
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            digitInfoBean.setSign(strEZpvd);
            java.lang.String strDjBIcL = abstractC54531xLwOLrzqt.djBIcL(AhwBna());
            if (strDjBIcL == null) {
                strDjBIcL = "";
            }
            digitInfoBean.setSymbol(strDjBIcL);
            java.lang.String strValueOf = valueOf();
            digitInfoBean.setDigit(C33129mqd.AhwBna(abstractC54531xLwOLrzqt.fIwbmz(strValueOf != null ? strValueOf : "")));
        }
        return digitInfoBean;
    }

    public static /* synthetic */ C54571xNh createAmtConvert$default(C55887xsS c55887xsS, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return c55887xsS.OLrzqt(str, z);
    }

    public final C54571xNh OLrzqt(java.lang.String str, boolean z) {
        if (yDY.gEmmrt("FUTURES", "SWAP").contains(this.AEQbTJ)) {
            java.lang.String str2 = this.AEQbTJ;
            java.lang.String strValueOf = valueOf();
            if (strValueOf == null) {
                strValueOf = "";
            }
            return C54566xNc.OLrzqt(str2, strValueOf, z ? DbNXlk() : null);
        }
        return C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, this.copydefault, this.AEQbTJ, str, z, null, 16, null);
    }

    public final xMS copydefault() {
        return C54797xVr.copydefault.AEQbTJ(this.copydefault, this.AEQbTJ);
    }

    public final xMV KWHzl() {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(this.AEQbTJ)) == null) {
            return null;
        }
        BizInstrument bizInstrumentAhwBna = AhwBna();
        if (bizInstrumentAhwBna == null || (instFamily = bizInstrumentAhwBna.getInstFamily()) == null) {
            instFamily = "";
        }
        return AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
    }

    public final AbstractC54531xLw AEQbTJ() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            return interfaceC54581xNrOLrzqt.OLrzqt(this.AEQbTJ);
        }
        return null;
    }

    public final java.lang.String fetchVPNInfo() {
        BizInstrument bizInstrumentAhwBna;
        java.lang.String strDjBIcL;
        AbstractC54531xLw abstractC54531xLwAEQbTJ = AEQbTJ();
        return (abstractC54531xLwAEQbTJ == null || (bizInstrumentAhwBna = AhwBna()) == null || (strDjBIcL = abstractC54531xLwAEQbTJ.djBIcL(bizInstrumentAhwBna)) == null) ? "" : strDjBIcL;
    }

    public final java.lang.String ejfBZ() {
        BizInstrument bizInstrumentAhwBna;
        java.lang.String strDjBIcL;
        AbstractC54531xLw abstractC54531xLwAEQbTJ = AEQbTJ();
        return (abstractC54531xLwAEQbTJ == null || (bizInstrumentAhwBna = AhwBna()) == null || (strDjBIcL = abstractC54531xLwAEQbTJ.djBIcL(bizInstrumentAhwBna)) == null) ? "" : strDjBIcL;
    }

    public final DigitInfoBean EZpvd() {
        BizInstrument bizInstrumentAhwBna;
        java.lang.String sign;
        xOW newProxyInstance;
        DigitInfoBean digitInfoBean = new DigitInfoBean(null, null, 0, 7, null);
        AbstractC54531xLw abstractC54531xLwAEQbTJ = AEQbTJ();
        if (abstractC54531xLwAEQbTJ != null && (bizInstrumentAhwBna = AhwBna()) != null) {
            if (yDY.gEmmrt("FUTURES", "SWAP").contains(bizInstrumentAhwBna.getInstType())) {
                if (bizInstrumentAhwBna.isPositiveContract()) {
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                    if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.iwGUEr()), (java.lang.Object) "2")) {
                        TradeCoinInfo tradeCoinInfo = abstractC54531xLwAEQbTJ.fetchVPNInfo().get(bizInstrumentAhwBna.getTradeSymbol());
                        if (tradeCoinInfo == null || (sign = tradeCoinInfo.getSign()) == null) {
                            sign = "";
                        }
                        digitInfoBean.setSign(sign);
                        digitInfoBean.setSymbol(bizInstrumentAhwBna.getTradeSymbol());
                        IdxConfig idxConfigAkhnZx = abstractC54531xLwAEQbTJ.AkhnZx(bizInstrumentAhwBna.getInstFamily());
                        digitInfoBean.setDigit(C33129mqd.AhwBna(idxConfigAkhnZx != null ? idxConfigAkhnZx.getContractDig() : null));
                    } else {
                        KWHzl(digitInfoBean, abstractC54531xLwAEQbTJ, bizInstrumentAhwBna);
                    }
                } else {
                    digitInfoBean.setSign(C33070mpX.AYXKKw(C55688xof.Application.RgaQzq));
                    digitInfoBean.setSymbol(C33070mpX.AYXKKw(C55688xof.Application.RgaQzq));
                    java.lang.String strFARcdN = abstractC54531xLwAEQbTJ.fARcdN(bizInstrumentAhwBna.getInstFamily());
                    digitInfoBean.setDigit(strFARcdN != null ? C33129mqd.AhwBna(strFARcdN) : C33129mqd.AhwBna("0"));
                }
            } else {
                KWHzl(digitInfoBean, abstractC54531xLwAEQbTJ, bizInstrumentAhwBna);
            }
        }
        return digitInfoBean;
    }

    public static final void KWHzl(DigitInfoBean digitInfoBean, AbstractC54531xLw abstractC54531xLw, BizInstrument bizInstrument) {
        java.lang.String strAEQbTJ = abstractC54531xLw.AEQbTJ(bizInstrument);
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        digitInfoBean.setSign(strAEQbTJ);
        java.lang.String strOLrzqt = abstractC54531xLw.OLrzqt(bizInstrument);
        digitInfoBean.setSymbol(strOLrzqt != null ? strOLrzqt : "");
        digitInfoBean.setDigit(C33129mqd.AhwBna(abstractC54531xLw.djBIcL(bizInstrument.getInstFamily())));
    }

    public final boolean fJNWhG() {
        MarginModeManager marginModeManagerIsConnected;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String currentMarginMode$default = null;
        if (interfaceC54581xNrOLrzqt != null && (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) != null) {
            currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, AhwBna(), 1, null);
        }
        return Intrinsics.EZpvd((java.lang.Object) currentMarginMode$default, (java.lang.Object) "cross");
    }

    public final boolean fARcdN() {
        MarginModeManager marginModeManagerIsConnected;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String currentMarginMode$default = null;
        if (interfaceC54581xNrOLrzqt != null && (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) != null) {
            currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, AhwBna(), 1, null);
        }
        return Intrinsics.EZpvd((java.lang.Object) currentMarginMode$default, (java.lang.Object) "isolated");
    }
}
