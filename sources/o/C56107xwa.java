package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.SmartArbPlanLeg;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;

/* JADX INFO: renamed from: o.xwa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56107xwa {
    public static final TacticsInsideItemData gEmmrt(SmartArbPlanLeg smartArbPlanLeg, BizInstrument bizInstrument) {
        java.lang.String displayQuoteSymbol;
        java.lang.String displayQuoteSymbol2 = bizInstrument != null ? bizInstrument.getDisplayQuoteSymbol() : null;
        java.lang.String str = "";
        if (displayQuoteSymbol2 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) displayQuoteSymbol2)) {
            if (bizInstrument != null && (displayQuoteSymbol = bizInstrument.getDisplayQuoteSymbol()) != null) {
                str = displayQuoteSymbol;
            }
            str = " (" + str + ")";
        }
        return new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.playFromUri) + str, djBIcL(smartArbPlanLeg, bizInstrument), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
    }

    public static final TacticsInsideItemData AkhnZx(SmartArbPlanLeg smartArbPlanLeg, BizInstrument bizInstrument) {
        java.lang.String str;
        java.lang.String displayQuoteSymbol = bizInstrument != null ? bizInstrument.getDisplayQuoteSymbol() : null;
        if (displayQuoteSymbol == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) displayQuoteSymbol)) {
            str = "";
        } else {
            str = " (" + (bizInstrument != null ? bizInstrument.getDisplayQuoteSymbol() : null) + ")";
        }
        return new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.prepareFromSearch) + str, djBIcL(smartArbPlanLeg, bizInstrument), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
    }

    public static final java.lang.String djBIcL(SmartArbPlanLeg smartArbPlanLeg, BizInstrument bizInstrument) {
        java.lang.String amt = smartArbPlanLeg != null ? smartArbPlanLeg.getAmt() : null;
        if (amt == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) amt)) {
            return "--";
        }
        java.lang.String displayQuoteSymbol = bizInstrument != null ? bizInstrument.getDisplayQuoteSymbol() : null;
        java.lang.String str = displayQuoteSymbol == null ? "" : displayQuoteSymbol;
        java.lang.String amt2 = smartArbPlanLeg != null ? smartArbPlanLeg.getAmt() : null;
        return C56033xvF.fmtBotValueBySymbol$default(str, amt2 == null ? "" : amt2, RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null);
    }

    public static final TacticsInsideItemData AhwBna(SmartArbPlanLeg smartArbPlanLeg, BizInstrument bizInstrument) {
        java.lang.String displayQuoteSymbol;
        java.lang.String avgPx;
        java.lang.String instId;
        java.lang.String instType;
        java.lang.String str = "";
        java.lang.String botPrice$default = C56033xvF.getBotPrice$default((smartArbPlanLeg == null || (instType = smartArbPlanLeg.getInstType()) == null) ? "" : instType, (smartArbPlanLeg == null || (instId = smartArbPlanLeg.getInstId()) == null) ? "" : instId, (smartArbPlanLeg == null || (avgPx = smartArbPlanLeg.getAvgPx()) == null) ? "" : avgPx, false, false, null, null, 120, null);
        java.lang.String displayQuoteSymbol2 = bizInstrument != null ? bizInstrument.getDisplayQuoteSymbol() : null;
        if (displayQuoteSymbol2 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) displayQuoteSymbol2)) {
            if (bizInstrument != null && (displayQuoteSymbol = bizInstrument.getDisplayQuoteSymbol()) != null) {
                str = displayQuoteSymbol;
            }
            str = " (" + str + ")";
        }
        java.lang.String str2 = C33070mpX.AYXKKw(C55688xof.Application.fromMediaItemList) + str;
        java.lang.String avgPx2 = smartArbPlanLeg != null ? smartArbPlanLeg.getAvgPx() : null;
        if (avgPx2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) avgPx2)) {
            botPrice$default = "--";
        }
        return new TacticsInsideItemData(str2, botPrice$default, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
    }

    public static final TacticsInsideItemData isConnected(SmartArbPlanLeg smartArbPlanLeg, BizInstrument bizInstrument) {
        java.lang.String avgPx;
        java.lang.String instId;
        java.lang.String instType;
        java.lang.String str = "";
        java.lang.String botPrice$default = C56033xvF.getBotPrice$default((smartArbPlanLeg == null || (instType = smartArbPlanLeg.getInstType()) == null) ? "" : instType, (smartArbPlanLeg == null || (instId = smartArbPlanLeg.getInstId()) == null) ? "" : instId, (smartArbPlanLeg == null || (avgPx = smartArbPlanLeg.getAvgPx()) == null) ? "" : avgPx, false, false, null, null, 120, null);
        java.lang.String displayQuoteSymbol = bizInstrument != null ? bizInstrument.getDisplayQuoteSymbol() : null;
        if (displayQuoteSymbol != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) displayQuoteSymbol)) {
            str = " (" + (bizInstrument != null ? bizInstrument.getDisplayQuoteSymbol() : null) + ")";
        }
        java.lang.String str2 = C33070mpX.AYXKKw(C55688xof.Application.fromMediaItemList) + str;
        java.lang.String avgPx2 = smartArbPlanLeg != null ? smartArbPlanLeg.getAvgPx() : null;
        if (avgPx2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) avgPx2)) {
            botPrice$default = "--";
        }
        return new TacticsInsideItemData(str2, botPrice$default, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final TacticsInsideItemData EZpvd(SmartArbPlanLeg smartArbPlanLeg, java.lang.String str) {
        java.lang.String str2;
        java.lang.String stakePos;
        java.lang.String instId;
        java.lang.String instType;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.PickVisualMediaRequestBuilder);
        java.lang.String str3 = C33129mqd.OLrzqt((java.lang.CharSequence) str) ? str : null;
        if (str3 != null) {
            str2 = " (" + str3 + ")";
            if (str2 == null) {
                str2 = "";
            }
        }
        java.lang.String str4 = strAYXKKw + str2;
        java.lang.String botAmount$default = C33129mqd.AEQbTJ(smartArbPlanLeg != null ? smartArbPlanLeg.getStakePos() : null, 0) ? C56033xvF.getBotAmount$default((smartArbPlanLeg == null || (instType = smartArbPlanLeg.getInstType()) == null) ? "" : instType, (smartArbPlanLeg == null || (instId = smartArbPlanLeg.getInstId()) == null) ? "" : instId, (smartArbPlanLeg == null || (stakePos = smartArbPlanLeg.getStakePos()) == null) ? "" : stakePos, null, false, null, 56, null) : null;
        return new TacticsInsideItemData(str4, botAmount$default == null ? C33070mpX.AYXKKw(C55688xof.Application.getResultContract) : botAmount$default, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final TacticsInsideItemData AEQbTJ(SmartArbPlanLeg smartArbPlanLeg, java.lang.String str) {
        java.lang.String str2;
        java.lang.String instType;
        java.lang.String instId;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.PickVisualMediaRequestBuilder);
        java.lang.String str3 = C33129mqd.OLrzqt((java.lang.CharSequence) str) ? str : null;
        if (str3 != null) {
            str2 = " (" + str3 + ")";
            if (str2 == null) {
                str2 = "";
            }
        }
        java.lang.String strAEQbTJ = AEQbTJ(smartArbPlanLeg);
        if (smartArbPlanLeg == null || (instType = smartArbPlanLeg.getInstType()) == null) {
            instType = "";
        }
        if (smartArbPlanLeg == null || (instId = smartArbPlanLeg.getInstId()) == null) {
            instId = "";
        }
        java.lang.String str4 = strAYXKKw + str2;
        java.lang.String botAmount$default = C33129mqd.AEQbTJ(strAEQbTJ, 0) ? C56033xvF.getBotAmount$default(instType, instId, strAEQbTJ, null, false, null, 56, null) : null;
        return new TacticsInsideItemData(str4, botAmount$default == null ? "--" : botAmount$default, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
    }

    public static final java.lang.String AEQbTJ(SmartArbPlanLeg smartArbPlanLeg) {
        return C33129mqd.addS$default(smartArbPlanLeg != null ? smartArbPlanLeg.getStakePos() : null, smartArbPlanLeg != null ? smartArbPlanLeg.getStakeReward() : null, null, null, null, 14, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final TacticsInsideItemData valueOf(SmartArbPlanLeg smartArbPlanLeg, BizInstrument bizInstrument) {
        java.lang.String displayQuoteSymbol;
        java.lang.String posCcy;
        java.lang.String pos;
        java.lang.String instId;
        java.lang.String instType;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.PickVisualMediaRequestBuilder);
        java.lang.String str = "";
        java.lang.String botAmount$default = C56033xvF.getBotAmount$default((smartArbPlanLeg == null || (instType = smartArbPlanLeg.getInstType()) == null) ? "" : instType, (smartArbPlanLeg == null || (instId = smartArbPlanLeg.getInstId()) == null) ? "" : instId, (smartArbPlanLeg == null || (pos = smartArbPlanLeg.getPos()) == null) ? "" : pos, (smartArbPlanLeg == null || (posCcy = smartArbPlanLeg.getPosCcy()) == null) ? "" : posCcy, false, null, 48, null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (smartArbPlanLeg != null ? smartArbPlanLeg.getPosCcy() : null))) {
            displayQuoteSymbol = smartArbPlanLeg != null ? smartArbPlanLeg.getPosCcy() : null;
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) (smartArbPlanLeg != null ? smartArbPlanLeg.getSide() : null), (java.lang.Object) "buy")) {
                if (bizInstrument != null) {
                    displayQuoteSymbol = bizInstrument.getTradeSymbol();
                }
            } else if (bizInstrument != null) {
                displayQuoteSymbol = bizInstrument.getDisplayQuoteSymbol();
            }
        }
        if (displayQuoteSymbol != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) displayQuoteSymbol)) {
            str = " (" + displayQuoteSymbol + ")";
        }
        java.lang.String str2 = strAYXKKw + str;
        java.lang.String pos2 = smartArbPlanLeg != null ? smartArbPlanLeg.getPos() : null;
        if (pos2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) pos2)) {
            botAmount$default = "--";
        }
        return new TacticsInsideItemData(str2, botAmount$default, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final TacticsInsideItemData values(SmartArbPlanLeg smartArbPlanLeg, BizInstrument bizInstrument) {
        java.lang.String instType;
        java.lang.String instFamily;
        java.lang.String marginDig;
        java.lang.String pos;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        IdxConfig idxConfigAkhnZx;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.PickVisualMediaRequestBuilder);
        java.lang.String str = "";
        if (bizInstrument != null && bizInstrument.isPositiveContract()) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(bizInstrument.getInstType())) != null && (idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(bizInstrument.getInstFamily())) != null) {
                marginDig = idxConfigAkhnZx.getContractDig();
            }
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 == null) {
                marginDig = null;
            } else {
                if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                    instType = "";
                }
                AbstractC54531xLw abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt2.OLrzqt(instType);
                if (abstractC54531xLwOLrzqt2 != null) {
                    if (bizInstrument == null || (instFamily = bizInstrument.getInstFamily()) == null) {
                        instFamily = "";
                    }
                    IdxConfig idxConfigAkhnZx2 = abstractC54531xLwOLrzqt2.AkhnZx(instFamily);
                    if (idxConfigAkhnZx2 != null) {
                        marginDig = idxConfigAkhnZx2.getMarginDig();
                    }
                }
            }
        }
        xMR xmr = xMR.copydefault;
        if (smartArbPlanLeg == null || (pos = smartArbPlanLeg.getPos()) == null) {
            pos = "";
        }
        java.lang.String strCopydefault = xmr.copydefault(pos, marginDig != null ? C33129mqd.AhwBna(marginDig) : 8);
        java.lang.String tradeSymbol = bizInstrument != null ? bizInstrument.getTradeSymbol() : null;
        if (tradeSymbol != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tradeSymbol)) {
            str = " (" + (bizInstrument != null ? bizInstrument.getTradeSymbol() : null) + ")";
        }
        java.lang.String str2 = strAYXKKw + str;
        java.lang.String pos2 = smartArbPlanLeg != null ? smartArbPlanLeg.getPos() : null;
        if (pos2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) pos2)) {
            strCopydefault = "--";
        }
        return new TacticsInsideItemData(str2, strCopydefault, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
    }
}
