package o;

import com.okinc.biz.TacticsType;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55892xsX implements InterfaceC54501xKt<C55804xqp<java.util.List<? extends StrategyOrderBillDetailsResponse>>, java.util.ArrayList<DetailsData>> {
    public java.lang.String EZpvd;
    public java.lang.String KWHzl = "";
    public final java.util.List<java.lang.String> OLrzqt = yDY.gEmmrt("recurring", "smart_iceberg", "twap");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* bridge */ /* synthetic */ java.util.ArrayList<DetailsData> KWHzl(C55804xqp<java.util.List<? extends StrategyOrderBillDetailsResponse>> c55804xqp) {
        return KWHzl2((C55804xqp<java.util.List<StrategyOrderBillDetailsResponse>>) c55804xqp);
    }

    public final java.lang.String OLrzqt() {
        java.lang.String str = this.EZpvd;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0afa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0cba  */
    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.ArrayList<DetailsData> KWHzl2(@NotNull C55804xqp<java.util.List<StrategyOrderBillDetailsResponse>> c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        java.util.ArrayList<DetailsData> arrayList = new java.util.ArrayList<>();
        java.util.List<StrategyOrderBillDetailsResponse> listCopydefault = c55804xqp.copydefault();
        java.lang.String strOLrzqt = OLrzqt();
        java.lang.String str = "--";
        if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "0")) {
            java.lang.String str2 = this.KWHzl;
            if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "smart_iceberg")) {
                if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "signal_bot")) {
                    for (StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse : listCopydefault) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.String strAEQbTJ = C56033xvF.AEQbTJ(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId());
                        java.lang.String botAmountUnit$default = C56033xvF.getBotAmountUnit$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getCtVal(), null, 8, null);
                        arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getThemedContext) + " (" + strAEQbTJ + ")", Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getOrdType(), (java.lang.Object) "market") ? C33070mpX.AYXKKw(C55688xof.Application.createFullyDrawnExecutor) : C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityKt) + " (" + botAmountUnit$default + ")", C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getSz(), strategyOrderBillDetailsResponse.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateAndPutInMap) + " (" + strAEQbTJ + ")", C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getAvgPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateSHA256) + " (" + botAmountUnit$default + ")", C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getAccFillSz(), strategyOrderBillDetailsResponse.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.hOMIpD), C33070mpX.AYXKKw(Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getReduceOnly(), (java.lang.Object) "true") ? C55688xof.Application.AlertController3 : C55688xof.Application.onScroll), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        java.lang.String ordType = strategyOrderBillDetailsResponse.getOrdType();
                        java.lang.String instId = strategyOrderBillDetailsResponse.getInstId();
                        java.lang.String instType = strategyOrderBillDetailsResponse.getInstType();
                        java.lang.String algoId = strategyOrderBillDetailsResponse.getAlgoId();
                        java.lang.String ordId = strategyOrderBillDetailsResponse.getOrdId();
                        java.lang.String coinTitle$default = C56033xvF.getCoinTitle$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), false, null, null, 28, null);
                        TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(this.KWHzl);
                        if (tacticsTypeAEQbTJ == null) {
                            tacticsTypeAEQbTJ = TacticsType.TACTICS_SIGNAL_BOT;
                        }
                        arrayList.add(new DetailsData(ordType, instId, instType, algoId, ordId, coinTitle$default, false, tacticsTypeAEQbTJ, C56033xvF.AYXKKw(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getSide(), strategyOrderBillDetailsResponse.getPosSide()).getFirst(), C56033xvF.fJNWhG(strategyOrderBillDetailsResponse.getTdMode()), strategyOrderBillDetailsResponse.getLever(), pTA.format$default(new Date(C33129mqd.valueOf(strategyOrderBillDetailsResponse.getCTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null), arrayList2, "", true, C56033xvF.OLrzqt(C56033xvF.AYXKKw(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getSide(), strategyOrderBillDetailsResponse.getPosSide()).getSecond().booleanValue()), C56033xvF.EZpvd(C56033xvF.AYXKKw(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getSide(), strategyOrderBillDetailsResponse.getPosSide()).getSecond().booleanValue()), null, null, null, null, false, null, 8257536, null));
                    }
                } else {
                    for (StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse2 : listCopydefault) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.String strAhwBna = C56033xvF.AhwBna(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getInstId(), strategyOrderBillDetailsResponse2.getDisplayId());
                        java.lang.String strEZpvd = C56033xvF.EZpvd(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getInstId(), strategyOrderBillDetailsResponse2.getCtVal());
                        arrayList3.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateAndPutInMap) + " (" + strAhwBna + ")", C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getInstId(), strategyOrderBillDetailsResponse2.getAvgPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList3.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getThemedContext) + " (" + strAhwBna + ")", C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getInstId(), strategyOrderBillDetailsResponse2.getPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList3.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateSHA256) + " (" + strEZpvd + ")", C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getInstId(), strategyOrderBillDetailsResponse2.getAccFillSz(), strategyOrderBillDetailsResponse2.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList3.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityKt) + " (" + strEZpvd + ")", C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getInstId(), strategyOrderBillDetailsResponse2.getSz(), strategyOrderBillDetailsResponse2.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList3.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setContentdefault), OLrzqt(strategyOrderBillDetailsResponse2.getState()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        java.lang.String ordType2 = strategyOrderBillDetailsResponse2.getOrdType();
                        java.lang.String instId2 = strategyOrderBillDetailsResponse2.getInstId();
                        java.lang.String instType2 = strategyOrderBillDetailsResponse2.getInstType();
                        java.lang.String algoId2 = strategyOrderBillDetailsResponse2.getAlgoId();
                        java.lang.String ordId2 = strategyOrderBillDetailsResponse2.getOrdId();
                        java.lang.String coinTitle$default2 = C56033xvF.getCoinTitle$default(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getInstId(), false, null, strategyOrderBillDetailsResponse2.getDisplayId(), 12, null);
                        TacticsType tacticsTypeAEQbTJ2 = TacticsType.Companion.AEQbTJ(this.KWHzl);
                        if (tacticsTypeAEQbTJ2 == null) {
                            tacticsTypeAEQbTJ2 = TacticsType.TACTICS_GRDE;
                        }
                        arrayList.add(new DetailsData(ordType2, instId2, instType2, algoId2, ordId2, coinTitle$default2, false, tacticsTypeAEQbTJ2, C56033xvF.AYXKKw(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getSide(), strategyOrderBillDetailsResponse2.getPosSide()).getFirst(), C56033xvF.fJNWhG(strategyOrderBillDetailsResponse2.getTdMode()), strategyOrderBillDetailsResponse2.getLever(), pTA.format$default(new Date(C33129mqd.valueOf(strategyOrderBillDetailsResponse2.getCTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null), arrayList3, "", true, C56033xvF.OLrzqt(C56033xvF.AYXKKw(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getSide(), strategyOrderBillDetailsResponse2.getPosSide()).getSecond().booleanValue()), C56033xvF.EZpvd(C56033xvF.AYXKKw(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getSide(), strategyOrderBillDetailsResponse2.getPosSide()).getSecond().booleanValue()), null, null, null, null, false, null, 8257536, null));
                    }
                }
            } else {
                for (StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse3 : listCopydefault) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.String strAhwBna2 = C56033xvF.AhwBna(strategyOrderBillDetailsResponse3.getInstType(), strategyOrderBillDetailsResponse3.getInstId(), strategyOrderBillDetailsResponse3.getDisplayId());
                    java.lang.String strEZpvd2 = C56033xvF.EZpvd(strategyOrderBillDetailsResponse3.getInstType(), strategyOrderBillDetailsResponse3.getInstId(), strategyOrderBillDetailsResponse3.getCtVal());
                    arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isShowing), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyOrderBillDetailsResponse3.getCTime()) ? str : pTA.format$default(new Date(C33129mqd.valueOf(strategyOrderBillDetailsResponse3.getCTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateAndPutInMap) + " (" + strAhwBna2 + ")", C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse3.getInstType(), strategyOrderBillDetailsResponse3.getInstId(), strategyOrderBillDetailsResponse3.getAvgPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getThemedContext) + " (" + strAhwBna2 + ")", C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse3.getInstType(), strategyOrderBillDetailsResponse3.getInstId(), strategyOrderBillDetailsResponse3.getPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateSHA256) + " (" + strEZpvd2 + ")", C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse3.getInstType(), strategyOrderBillDetailsResponse3.getInstId(), strategyOrderBillDetailsResponse3.getAccFillSz(), strategyOrderBillDetailsResponse3.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setButtonPanelLayoutHint) + " (" + strEZpvd2 + ")", C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse3.getInstType(), strategyOrderBillDetailsResponse3.getInstId(), strategyOrderBillDetailsResponse3.getSz(), strategyOrderBillDetailsResponse3.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    java.lang.String strCopydefault = C56033xvF.copydefault(strategyOrderBillDetailsResponse3.getInstType(), strategyOrderBillDetailsResponse3.getInstId(), "", strategyOrderBillDetailsResponse3.getSide(), strategyOrderBillDetailsResponse3);
                    java.lang.String str3 = str;
                    arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DMb) + " (" + strCopydefault + ")", C56033xvF.getBotFee$default(strategyOrderBillDetailsResponse3.getInstType(), strategyOrderBillDetailsResponse3.getInstId(), EZpvd(strategyOrderBillDetailsResponse3.getInstType(), strategyOrderBillDetailsResponse3.getInstId(), strategyOrderBillDetailsResponse3.getSide(), strategyOrderBillDetailsResponse3.getMgnCcy(), strategyOrderBillDetailsResponse3.getBaseFee(), strategyOrderBillDetailsResponse3.getQuoteFee(), strategyOrderBillDetailsResponse3.getFee()), strCopydefault, false, 16, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    java.lang.String ordType3 = strategyOrderBillDetailsResponse3.getOrdType();
                    java.lang.String instId3 = strategyOrderBillDetailsResponse3.getInstId();
                    java.lang.String instType3 = strategyOrderBillDetailsResponse3.getInstType();
                    java.lang.String algoId3 = strategyOrderBillDetailsResponse3.getAlgoId();
                    java.lang.String ordId3 = strategyOrderBillDetailsResponse3.getOrdId();
                    java.lang.String coinTitle$default3 = C56033xvF.getCoinTitle$default(strategyOrderBillDetailsResponse3.getInstType(), strategyOrderBillDetailsResponse3.getInstId(), false, null, strategyOrderBillDetailsResponse3.getDisplayId(), 12, null);
                    TacticsType tacticsTypeAEQbTJ3 = TacticsType.Companion.AEQbTJ(this.KWHzl);
                    if (tacticsTypeAEQbTJ3 == null) {
                        tacticsTypeAEQbTJ3 = TacticsType.TACTICS_SMART_ICEBERG;
                    }
                    arrayList.add(new DetailsData(ordType3, instId3, instType3, algoId3, ordId3, coinTitle$default3, false, tacticsTypeAEQbTJ3, "", "", "", "", arrayList4, "", false, 0, 0, null, null, null, null, false, null, 8257536, null));
                    str = str3;
                }
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "1")) {
            java.lang.String str4 = this.KWHzl;
            int iHashCode = str4.hashCode();
            if (iHashCode == -1216369070) {
                if (!str4.equals("smart_portfolio")) {
                    while (r13.hasNext()) {
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                if (iHashCode != -1148661171) {
                    if (iHashCode == 1165749981 && str4.equals("recurring")) {
                        for (StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse4 : listCopydefault) {
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.String strAhwBna3 = C56033xvF.AhwBna(strategyOrderBillDetailsResponse4.getInstType(), strategyOrderBillDetailsResponse4.getInstId(), strategyOrderBillDetailsResponse4.getDisplayId());
                            java.lang.String strTakeNonBlankTradeQuoteCcy = strategyOrderBillDetailsResponse4.takeNonBlankTradeQuoteCcy();
                            if (strTakeNonBlankTradeQuoteCcy == null) {
                                strTakeNonBlankTradeQuoteCcy = strAhwBna3;
                            }
                            arrayList5.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateAndPutInMap), C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse4.getInstType(), strategyOrderBillDetailsResponse4.getInstId(), strategyOrderBillDetailsResponse4.getAvgPx(), false, false, null, null, 120, null) + " " + strAhwBna3, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            arrayList5.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnWhen), C56033xvF.fmtBotValueBySymbol$default(strAhwBna3, C33129mqd.mulS$default(strategyOrderBillDetailsResponse4.getAccFillSz(), strategyOrderBillDetailsResponse4.getAvgPx(), null, null, null, 14, null), RoundingMode.UP, false, null, false, strategyOrderBillDetailsResponse4.getInstType(), strategyOrderBillDetailsResponse4.getInstId(), null, null, null, 1848, null) + " " + strTakeNonBlankTradeQuoteCcy, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            java.lang.String algoOrdType = strategyOrderBillDetailsResponse4.getAlgoOrdType();
                            java.lang.String instId4 = strategyOrderBillDetailsResponse4.getInstId();
                            java.lang.String instType4 = strategyOrderBillDetailsResponse4.getInstType();
                            java.lang.String algoId4 = strategyOrderBillDetailsResponse4.getAlgoId();
                            java.lang.String ordId4 = strategyOrderBillDetailsResponse4.getOrdId();
                            java.lang.String coinTitle$default4 = C56033xvF.getCoinTitle$default(strategyOrderBillDetailsResponse4.getInstType(), strategyOrderBillDetailsResponse4.getInstId(), false, null, strategyOrderBillDetailsResponse4.getDisplayId(), 12, null);
                            TacticsType tacticsTypeAEQbTJ4 = TacticsType.Companion.AEQbTJ(this.KWHzl);
                            if (tacticsTypeAEQbTJ4 == null) {
                                tacticsTypeAEQbTJ4 = TacticsType.TACTICS_GRDE;
                            }
                            arrayList.add(new DetailsData(algoOrdType, instId4, instType4, algoId4, ordId4, coinTitle$default4, true, tacticsTypeAEQbTJ4, C56033xvF.ejfBZ(strategyOrderBillDetailsResponse4.getSide()).getFirst(), "", "", pTA.format$default(new Date(C33129mqd.valueOf(strategyOrderBillDetailsResponse4.getCTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null), arrayList5, "", false, C56033xvF.OLrzqt(C56033xvF.ejfBZ(strategyOrderBillDetailsResponse4.getSide()).getSecond().booleanValue()), C56033xvF.EZpvd(C56033xvF.ejfBZ(strategyOrderBillDetailsResponse4.getSide()).getSecond().booleanValue()), null, null, OLrzqt(strategyOrderBillDetailsResponse4.getState()), null, false, null, 7733248, null));
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                } else if (str4.equals("smart_iceberg")) {
                    for (StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse5 : listCopydefault) {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        java.lang.String strAhwBna4 = C56033xvF.AhwBna(strategyOrderBillDetailsResponse5.getInstType(), strategyOrderBillDetailsResponse5.getInstId(), strategyOrderBillDetailsResponse5.getDisplayId());
                        java.lang.String strEZpvd3 = C56033xvF.EZpvd(strategyOrderBillDetailsResponse5.getInstType(), strategyOrderBillDetailsResponse5.getInstId(), strategyOrderBillDetailsResponse5.getCtVal());
                        java.lang.String cTime = strategyOrderBillDetailsResponse5.getCTime();
                        java.lang.String str5 = (cTime == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) cTime)) ? "--" : pTA.format$default(new Date(C33129mqd.valueOf(strategyOrderBillDetailsResponse5.getCTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null);
                        java.lang.String uTime = strategyOrderBillDetailsResponse5.getUTime();
                        java.lang.String str6 = (uTime == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) uTime)) ? "--" : pTA.format$default(new Date(C33129mqd.valueOf(strategyOrderBillDetailsResponse5.getUTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null);
                        arrayList6.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isShowing), str5, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList6.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.hide), str6, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList6.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateAndPutInMap) + " (" + strAhwBna4 + ")", C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse5.getInstType(), strategyOrderBillDetailsResponse5.getInstId(), strategyOrderBillDetailsResponse5.getAvgPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList6.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getThemedContext) + " (" + strAhwBna4 + ")", C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse5.getInstType(), strategyOrderBillDetailsResponse5.getInstId(), strategyOrderBillDetailsResponse5.getPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList6.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateSHA256) + " (" + strEZpvd3 + ")", C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse5.getInstType(), strategyOrderBillDetailsResponse5.getInstId(), strategyOrderBillDetailsResponse5.getAccFillSz(), strategyOrderBillDetailsResponse5.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList6.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setButtonPanelLayoutHint) + " (" + strEZpvd3 + ")", C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse5.getInstType(), strategyOrderBillDetailsResponse5.getInstId(), strategyOrderBillDetailsResponse5.getSz(), strategyOrderBillDetailsResponse5.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        java.lang.String strCopydefault2 = C56033xvF.copydefault(strategyOrderBillDetailsResponse5.getInstType(), strategyOrderBillDetailsResponse5.getInstId(), "", strategyOrderBillDetailsResponse5.getSide(), strategyOrderBillDetailsResponse5);
                        arrayList6.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DMb) + " (" + strCopydefault2 + ")", C56033xvF.getBotFee$default(strategyOrderBillDetailsResponse5.getInstType(), strategyOrderBillDetailsResponse5.getInstId(), EZpvd(strategyOrderBillDetailsResponse5.getInstType(), strategyOrderBillDetailsResponse5.getInstId(), strategyOrderBillDetailsResponse5.getSide(), strategyOrderBillDetailsResponse5.getMgnCcy(), strategyOrderBillDetailsResponse5.getBaseFee(), strategyOrderBillDetailsResponse5.getQuoteFee(), strategyOrderBillDetailsResponse5.getFee()), strCopydefault2, false, 16, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        java.lang.String ordType4 = strategyOrderBillDetailsResponse5.getOrdType();
                        java.lang.String instId5 = strategyOrderBillDetailsResponse5.getInstId();
                        java.lang.String instType5 = strategyOrderBillDetailsResponse5.getInstType();
                        java.lang.String algoId5 = strategyOrderBillDetailsResponse5.getAlgoId();
                        java.lang.String ordId5 = strategyOrderBillDetailsResponse5.getOrdId();
                        java.lang.String coinTitle$default5 = C56033xvF.getCoinTitle$default(strategyOrderBillDetailsResponse5.getInstType(), strategyOrderBillDetailsResponse5.getInstId(), false, null, strategyOrderBillDetailsResponse5.getDisplayId(), 12, null);
                        TacticsType tacticsTypeAEQbTJ5 = TacticsType.Companion.AEQbTJ(this.KWHzl);
                        if (tacticsTypeAEQbTJ5 == null) {
                            tacticsTypeAEQbTJ5 = TacticsType.TACTICS_SMART_ICEBERG;
                        }
                        arrayList.add(new DetailsData(ordType4, instId5, instType5, algoId5, ordId5, coinTitle$default5, false, tacticsTypeAEQbTJ5, "", "", "", "", arrayList6, "", false, 0, 0, null, null, null, null, false, null, 8257536, null));
                    }
                    Unit unit3 = Unit.INSTANCE;
                }
                for (StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse6 : listCopydefault) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.String strAhwBna5 = C56033xvF.AhwBna(strategyOrderBillDetailsResponse6.getInstType(), strategyOrderBillDetailsResponse6.getInstId(), strategyOrderBillDetailsResponse6.getDisplayId());
                    java.lang.String strEZpvd4 = C56033xvF.EZpvd(strategyOrderBillDetailsResponse6.getInstType(), strategyOrderBillDetailsResponse6.getInstId(), strategyOrderBillDetailsResponse6.getCtVal());
                    arrayList7.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateAndPutInMap) + " (" + strAhwBna5 + ")", C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse6.getInstType(), strategyOrderBillDetailsResponse6.getInstId(), strategyOrderBillDetailsResponse6.getAvgPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    arrayList7.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getThemedContext) + " (" + strAhwBna5 + ")", C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse6.getInstType(), strategyOrderBillDetailsResponse6.getInstId(), strategyOrderBillDetailsResponse6.getPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    arrayList7.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateSHA256) + " (" + strEZpvd4 + ")", C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse6.getInstType(), strategyOrderBillDetailsResponse6.getInstId(), strategyOrderBillDetailsResponse6.getAccFillSz(), strategyOrderBillDetailsResponse6.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    arrayList7.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityKt) + " (" + strEZpvd4 + ")", C56033xvF.getBotAmount$default(strategyOrderBillDetailsResponse6.getInstType(), strategyOrderBillDetailsResponse6.getInstId(), strategyOrderBillDetailsResponse6.getSz(), strategyOrderBillDetailsResponse6.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    if (!Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse6.getInstType(), (java.lang.Object) "SPOT")) {
                        arrayList7.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getActivityResultRegistry) + " (" + C56066xvm.EZpvd.KWHzl(strategyOrderBillDetailsResponse6.getInstId(), strategyOrderBillDetailsResponse6.getInstType(), strategyOrderBillDetailsResponse6.getPnlCcy()) + ")", C56033xvF.getBotPnl$default(strategyOrderBillDetailsResponse6.getInstId(), strategyOrderBillDetailsResponse6.getInstType(), strategyOrderBillDetailsResponse6.getPnl(), null, false, false, null, false, null, null, null, 2040, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    }
                    java.lang.String strCopydefault3 = C56033xvF.copydefault(strategyOrderBillDetailsResponse6.getInstType(), strategyOrderBillDetailsResponse6.getInstId(), "", strategyOrderBillDetailsResponse6.getSide(), strategyOrderBillDetailsResponse6);
                    arrayList7.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DMb) + " (" + strCopydefault3 + ")", C56033xvF.getBotFee$default(strategyOrderBillDetailsResponse6.getInstType(), strategyOrderBillDetailsResponse6.getInstId(), EZpvd(strategyOrderBillDetailsResponse6.getInstType(), strategyOrderBillDetailsResponse6.getInstId(), strategyOrderBillDetailsResponse6.getSide(), strategyOrderBillDetailsResponse6.getMgnCcy(), strategyOrderBillDetailsResponse6.getBaseFee(), strategyOrderBillDetailsResponse6.getQuoteFee(), this.OLrzqt.contains(this.KWHzl) ? strategyOrderBillDetailsResponse6.getFee() : null), strCopydefault3, false, 16, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    java.lang.String ordType5 = strategyOrderBillDetailsResponse6.getOrdType();
                    java.lang.String instId6 = strategyOrderBillDetailsResponse6.getInstId();
                    java.lang.String instType6 = strategyOrderBillDetailsResponse6.getInstType();
                    java.lang.String algoId6 = strategyOrderBillDetailsResponse6.getAlgoId();
                    java.lang.String ordId6 = strategyOrderBillDetailsResponse6.getOrdId();
                    java.lang.String coinTitle$default6 = C56033xvF.getCoinTitle$default(strategyOrderBillDetailsResponse6.getInstType(), strategyOrderBillDetailsResponse6.getInstId(), false, null, strategyOrderBillDetailsResponse6.getDisplayId(), 12, null);
                    TacticsType tacticsTypeAEQbTJ6 = TacticsType.Companion.AEQbTJ(this.KWHzl);
                    if (tacticsTypeAEQbTJ6 == null) {
                        tacticsTypeAEQbTJ6 = TacticsType.TACTICS_GRDE;
                    }
                    arrayList.add(new DetailsData(ordType5, instId6, instType6, algoId6, ordId6, coinTitle$default6, false, tacticsTypeAEQbTJ6, C56033xvF.AYXKKw(strategyOrderBillDetailsResponse6.getInstType(), strategyOrderBillDetailsResponse6.getSide(), strategyOrderBillDetailsResponse6.getPosSide()).getFirst(), C56033xvF.fJNWhG(strategyOrderBillDetailsResponse6.getTdMode()), strategyOrderBillDetailsResponse6.getLever(), pTA.format$default(new Date(C33129mqd.valueOf(strategyOrderBillDetailsResponse6.getCTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null), arrayList7, "", false, C56033xvF.OLrzqt(C56033xvF.AYXKKw(strategyOrderBillDetailsResponse6.getInstType(), strategyOrderBillDetailsResponse6.getSide(), strategyOrderBillDetailsResponse6.getPosSide()).getSecond().booleanValue()), C56033xvF.EZpvd(C56033xvF.AYXKKw(strategyOrderBillDetailsResponse6.getInstType(), strategyOrderBillDetailsResponse6.getSide(), strategyOrderBillDetailsResponse6.getPosSide()).getSecond().booleanValue()), null, null, null, null, false, null, 8257536, null));
                }
                Unit unit4 = Unit.INSTANCE;
            }
        }
        return arrayList;
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        return C55957xtj.EZpvd(str);
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        BizInstrument suggestedInstrument$default;
        if (str7 != null && str7.length() != 0) {
            return str7;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN")) {
            if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "buy")) {
                return str5;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "sell")) {
                return "";
            }
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) ((interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str, str2, null, null, 12, null)) == null) ? null : suggestedInstrument$default.getTradeSymbol()))) {
                return str5;
            }
        }
        return str6;
    }
}
