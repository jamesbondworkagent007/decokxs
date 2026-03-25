package o;

import com.okinc.biz.TacticsType;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import java.util.Date;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55969xtv implements InterfaceC54501xKt<C55804xqp<java.util.List<? extends StrategyPositionResponse>>, java.util.ArrayList<DetailsData>> {
    public StrategyDetailsResponse EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(StrategyDetailsResponse strategyDetailsResponse) {
        this.EZpvd = strategyDetailsResponse;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* synthetic */ java.util.ArrayList<DetailsData> KWHzl(C55804xqp<java.util.List<? extends StrategyPositionResponse>> c55804xqp) {
        return copydefault((C55804xqp<java.util.List<StrategyPositionResponse>>) c55804xqp);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.ArrayList<DetailsData> copydefault(@NotNull C55804xqp<java.util.List<StrategyPositionResponse>> c55804xqp) {
        java.util.ArrayList<TacticsInsideItemData> arrayListAEQbTJ;
        java.lang.String tradeSymbol;
        java.lang.String completedCycles;
        java.lang.String state;
        java.lang.String algoId;
        java.lang.String orderType;
        java.lang.String instType;
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        java.util.ArrayList<DetailsData> arrayList = new java.util.ArrayList<>();
        for (StrategyPositionResponse strategyPositionResponse : c55804xqp.copydefault()) {
            StrategyDetailsResponse strategyDetailsResponse = this.EZpvd;
            java.lang.String orderType2 = strategyDetailsResponse != null ? strategyDetailsResponse.getOrderType() : null;
            if (orderType2 == null) {
                arrayListAEQbTJ = AEQbTJ(strategyPositionResponse);
            } else {
                int iHashCode = orderType2.hashCode();
                if (iHashCode != -1148661171) {
                    if (iHashCode != -1086683216) {
                        if (iHashCode == -512749997 && orderType2.equals("contract_grid")) {
                            arrayListAEQbTJ = KWHzl(strategyPositionResponse);
                        }
                    } else if (orderType2.equals("signal_bot")) {
                        arrayListAEQbTJ = OLrzqt(strategyPositionResponse);
                    }
                } else if (orderType2.equals("smart_iceberg")) {
                    arrayListAEQbTJ = copydefault(strategyPositionResponse);
                }
            }
            java.util.ArrayList<TacticsInsideItemData> arrayList2 = arrayListAEQbTJ;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null) {
                tradeSymbol = "";
            } else {
                StrategyDetailsResponse strategyDetailsResponse2 = this.EZpvd;
                java.lang.String str = (strategyDetailsResponse2 == null || (instType = strategyDetailsResponse2.getInstType()) == null) ? "" : instType;
                StrategyDetailsResponse strategyDetailsResponse3 = this.EZpvd;
                BizInstrument suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str, strategyDetailsResponse3 != null ? strategyDetailsResponse3.getInstId() : null, null, null, 12, null);
                if (suggestedInstrument$default == null || (tradeSymbol = suggestedInstrument$default.getTradeSymbol()) == null) {
                }
            }
            java.util.List listGEmmrt = yDY.gEmmrt("smart_iceberg", "twap");
            StrategyDetailsResponse strategyDetailsResponse4 = this.EZpvd;
            java.lang.String lever = CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), strategyDetailsResponse4 != null ? strategyDetailsResponse4.getOrderType() : null) ? "" : strategyPositionResponse.getLever();
            java.util.List listGEmmrt2 = yDY.gEmmrt("smart_iceberg", "twap");
            StrategyDetailsResponse strategyDetailsResponse5 = this.EZpvd;
            java.lang.String strAEQbTJ = CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt2), strategyDetailsResponse5 != null ? strategyDetailsResponse5.getOrderType() : null) ? "" : C56033xvF.AEQbTJ(strategyPositionResponse.getInstType(), tradeSymbol, strategyPositionResponse.getPosCcy(), strategyPositionResponse.getPosSide(), strategyPositionResponse.getPos());
            java.util.List listGEmmrt3 = yDY.gEmmrt("smart_iceberg", "twap");
            StrategyDetailsResponse strategyDetailsResponse6 = this.EZpvd;
            java.lang.String coinTitle$default = CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt3), strategyDetailsResponse6 != null ? strategyDetailsResponse6.getOrderType() : null) ? "" : C56033xvF.getCoinTitle$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), false, null, null, 28, null);
            java.util.List listGEmmrt4 = yDY.gEmmrt("smart_iceberg", "twap");
            StrategyDetailsResponse strategyDetailsResponse7 = this.EZpvd;
            java.lang.String str2 = CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt4), strategyDetailsResponse7 != null ? strategyDetailsResponse7.getOrderType() : null) ? "" : pTA.format$default(new Date(C33129mqd.valueOf(strategyPositionResponse.getCTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null);
            StrategyDetailsResponse strategyDetailsResponse8 = this.EZpvd;
            java.lang.String str3 = (strategyDetailsResponse8 == null || (orderType = strategyDetailsResponse8.getOrderType()) == null) ? "" : orderType;
            java.lang.String instId = strategyPositionResponse.getInstId();
            java.lang.String instType2 = strategyPositionResponse.getInstType();
            StrategyDetailsResponse strategyDetailsResponse9 = this.EZpvd;
            java.lang.String str4 = (strategyDetailsResponse9 == null || (algoId = strategyDetailsResponse9.getAlgoId()) == null) ? "" : algoId;
            TacticsType.TaskDescription taskDescription = TacticsType.Companion;
            StrategyDetailsResponse strategyDetailsResponse10 = this.EZpvd;
            TacticsType tacticsTypeAEQbTJ = taskDescription.AEQbTJ(strategyDetailsResponse10 != null ? strategyDetailsResponse10.getOrderType() : null);
            if (tacticsTypeAEQbTJ == null) {
                tacticsTypeAEQbTJ = TacticsType.TACTICS_GRDE;
            }
            TacticsType tacticsType = tacticsTypeAEQbTJ;
            java.lang.String strFJNWhG = C56033xvF.fJNWhG(strategyPositionResponse.getMgnMode());
            java.lang.String adl = strategyPositionResponse.getAdl();
            int iOLrzqt = C56033xvF.OLrzqt(EZpvd(strategyPositionResponse));
            int iEZpvd = C56033xvF.EZpvd(EZpvd(strategyPositionResponse));
            java.lang.String adl2 = strategyPositionResponse.getAdl();
            StrategyDetailsResponse strategyDetailsResponse11 = this.EZpvd;
            java.lang.String str5 = (strategyDetailsResponse11 == null || (state = strategyDetailsResponse11.getState()) == null) ? "" : state;
            StrategyDetailsResponse strategyDetailsResponse12 = this.EZpvd;
            arrayList.add(new DetailsData(str3, instId, instType2, str4, "", coinTitle$default, false, tacticsType, strAEQbTJ, strFJNWhG, lever, str2, arrayList2, adl, false, iOLrzqt, iEZpvd, adl2, strategyPositionResponse, str5, (strategyDetailsResponse12 == null || (completedCycles = strategyDetailsResponse12.getCompletedCycles()) == null) ? "" : completedCycles, false, null, 6291456, null));
        }
        return arrayList;
    }

    public final java.util.ArrayList<TacticsInsideItemData> KWHzl(StrategyPositionResponse strategyPositionResponse) {
        java.util.ArrayList<TacticsInsideItemData> arrayList = new java.util.ArrayList<>();
        TacticsInsideItemData tacticsInsideItemData = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setMediaType) + "(" + C56033xvF.getBotAmountUnit$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), "", null, 8, null) + ")", C56033xvF.getBotAmount$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getPos(), "", false, null, 48, null), null, 0, 0, 0, 0, 0, null, TacticsUiConst.BotListSubItemType.BotSubPosition.KWHzl, null, null, null, null, null, null, null, 130556, null);
        java.lang.String str = C33070mpX.AYXKKw(C55688xof.Application.PickVisualMediaRequestKt) + "(" + C56033xvF.AEQbTJ(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId()) + ")";
        java.lang.String botPrice$default = C56033xvF.getBotPrice$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getAvgPx(), false, false, null, null, 120, null);
        TacticsUiConst.BotListSubItemType.BotSubTip.Default r17 = TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl;
        TacticsInsideItemData tacticsInsideItemData2 = new TacticsInsideItemData(str, botPrice$default, C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi24CallbackProxy), 0, 0, 0, 0, 0, null, r17, null, null, null, null, null, null, null, 130552, null);
        TacticsInsideItemData tacticsInsideItemData3 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getActivityResultRegistry) + "(" + C56033xvF.KWHzl(strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getMgnCcy()) + ")", C56033xvF.getBotPnl$default(strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getUpl(), null, false, false, null, false, null, null, null, 2040, null), C33070mpX.AYXKKw(C55688xof.Application.toKeyCode), C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getUpl(), null, 8, null)), 0, 0, 0, 0, null, r17, null, null, null, null, null, null, null, 130544, null);
        TacticsInsideItemData tacticsInsideItemData4 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.AnimatorRes), C56033xvF.fmtBotPnlPercent$default(strategyPositionResponse.getUplRatio(), true, 0, 4, null), C33070mpX.AYXKKw(C55688xof.Application.getActiveQueueItemId), C56033xvF.OLrzqt((java.lang.Object) C56033xvF.KWHzl(strategyPositionResponse.getUplRatio())), 0, 0, 0, 0, null, r17, null, null, null, null, null, null, null, 130544, null);
        TacticsInsideItemData tacticsInsideItemData5 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultCallerLauncherresultContract21), C56033xvF.copydefault(strategyPositionResponse.getMgnRatio()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        TacticsInsideItemData tacticsInsideItemData6 = new TacticsInsideItemData(C33069mpW.copydefault(C55688xof.Application.sRzUNh, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", C56033xvF.AEQbTJ(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId())))), C56033xvF.getBotPrice$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getLiqPx(), false, false, null, null, 120, null), C33070mpX.AYXKKw(C55688xof.Application.ParcelableVolumeInfo1), 0, 0, 0, 0, 0, null, r17, null, null, null, null, null, null, null, 130552, null);
        TacticsInsideItemData tacticsInsideItemData7 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.HJWChPdNQGVJ) + "(" + C56033xvF.AEQbTJ(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId()) + ")", C56033xvF.getBotPrice$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getMarkPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        arrayList.add(tacticsInsideItemData3);
        arrayList.add(new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null));
        arrayList.add(tacticsInsideItemData4);
        arrayList.add(tacticsInsideItemData);
        arrayList.add(tacticsInsideItemData5);
        arrayList.add(tacticsInsideItemData2);
        arrayList.add(tacticsInsideItemData7);
        arrayList.add(tacticsInsideItemData6);
        return arrayList;
    }

    public final java.util.ArrayList<TacticsInsideItemData> copydefault(StrategyPositionResponse strategyPositionResponse) {
        java.lang.String strCopydefault;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String strCopydefault2;
        xOW newProxyInstance;
        java.util.ArrayList<TacticsInsideItemData> arrayList = new java.util.ArrayList<>();
        if (Intrinsics.EZpvd((java.lang.Object) strategyPositionResponse.getInstType(), (java.lang.Object) "MARGIN") || Intrinsics.EZpvd((java.lang.Object) strategyPositionResponse.getInstType(), (java.lang.Object) "SPOT")) {
            strCopydefault = C56033xvF.copydefault(strategyPositionResponse.getPos(), strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getPosCcy());
        } else {
            strCopydefault = C56033xvF.getBotAmount$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getPos(), "", false, null, 48, null);
        }
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.PickVisualMediaRequestBuilder) + "(" + C56033xvF.AEQbTJ(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), "", strategyPositionResponse.getPosCcy()) + ")", strCopydefault, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrCopydefault == null || (newProxyInstance = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null) ? null : newProxyInstance.AuCTelauCTel()), (java.lang.Object) "long_short_mode")) {
            if (Intrinsics.EZpvd((java.lang.Object) strategyPositionResponse.getInstType(), (java.lang.Object) "MARGIN") || Intrinsics.EZpvd((java.lang.Object) strategyPositionResponse.getInstType(), (java.lang.Object) "SPOT")) {
                strCopydefault2 = C56033xvF.copydefault(strategyPositionResponse.getAvailPos(), strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getPosCcy());
            } else {
                strCopydefault2 = C56033xvF.getBotAmount$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getAvailPos(), "", false, null, 48, null);
            }
            java.lang.String str3 = strCopydefault2;
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setShowHideAnimationEnabled);
            str2 = "";
            java.lang.String strAEQbTJ = C56033xvF.AEQbTJ(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), str2, strategyPositionResponse.getPosCcy());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(strAYXKKw);
            sb.append("(");
            sb.append(strAEQbTJ);
            str = ")";
            sb.append(str);
            arrayList.add(new TacticsInsideItemData(sb.toString(), str3, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        } else {
            str = ")";
            str2 = "";
        }
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.PickVisualMediaRequestKt) + "(" + C56033xvF.AEQbTJ(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId()) + str, C56033xvF.getBotPrice$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getAvgPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getActivityResultRegistry) + "(" + C56033xvF.KWHzl(strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getCcy()) + str, C56033xvF.getBotPnl$default(strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getUpl(), null, false, false, null, false, null, null, null, 2040, null), null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getUpl(), null, 8, null)), 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131060, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.AnimatorRes), C56033xvF.fmtBotPnlPercent$default(strategyPositionResponse.getUplRatio(), true, 0, 4, null), null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.KWHzl(strategyPositionResponse.getUplRatio())), 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131060, null));
        java.lang.String str4 = C33070mpX.AYXKKw(C55688xof.Application.PickVisualMediaRequestdefault) + "(" + C56033xvF.OLrzqt(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getCcy()) + str;
        java.lang.String strOLrzqt = C56033xvF.OLrzqt(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getMargin(), strategyPositionResponse.getCcy());
        arrayList.add(new TacticsInsideItemData(str4, strOLrzqt == null ? str2 : strOLrzqt, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultCallerLauncherresultContract21), C56033xvF.copydefault(strategyPositionResponse.getMgnRatio()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        return arrayList;
    }

    public final java.util.ArrayList<TacticsInsideItemData> OLrzqt(StrategyPositionResponse strategyPositionResponse) {
        java.lang.String strCopydefault;
        java.lang.String strAEQbTJ = C56033xvF.AEQbTJ(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), "", strategyPositionResponse.getPosCcy());
        java.lang.String strAEQbTJ2 = C56033xvF.AEQbTJ(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId());
        java.lang.String strKWHzl = C56033xvF.KWHzl(strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getCcy());
        java.util.ArrayList<TacticsInsideItemData> arrayList = new java.util.ArrayList<>();
        if (Intrinsics.EZpvd((java.lang.Object) strategyPositionResponse.getInstType(), (java.lang.Object) "MARGIN") || Intrinsics.EZpvd((java.lang.Object) strategyPositionResponse.getInstType(), (java.lang.Object) "SPOT")) {
            strCopydefault = C56033xvF.copydefault(strategyPositionResponse.getPos(), strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getPosCcy());
        } else {
            strCopydefault = C56033xvF.getBotAmount$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getPos(), "", false, null, 48, null);
        }
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.PickVisualMediaRequestBuilder) + "(" + strAEQbTJ + ")", strCopydefault, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.PickVisualMediaRequestKt) + "(" + strAEQbTJ2 + ")", C56033xvF.getBotPrice$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getAvgPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getActivityResultRegistry) + "(" + strKWHzl + ")", C56033xvF.getBotPnl$default(strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getUpl(), null, false, false, null, false, null, null, null, 2040, null), null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getUpl(), null, 8, null)), 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131060, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.AnimatorRes), C56033xvF.fmtBotPnlPercent$default(strategyPositionResponse.getUplRatio(), true, 0, 4, null), null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.KWHzl(strategyPositionResponse.getUplRatio())), 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131060, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultCallerLauncherresultContract21), C56033xvF.copydefault(strategyPositionResponse.getMgnRatio()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi21QueueItem) + "(" + strAEQbTJ2 + ")", C56033xvF.getBotPrice$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getLiqPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.HJWChPdNQGVJ), C56033xvF.getBotPrice$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getMarkPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setDrawerSlideAnimationEnabled), xMR.copydefault.copydefault(strategyPositionResponse.getLast()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        return arrayList;
    }

    public final java.util.ArrayList<TacticsInsideItemData> AEQbTJ(StrategyPositionResponse strategyPositionResponse) {
        java.lang.String strCopydefault;
        java.lang.String strCopydefault2;
        java.util.ArrayList<TacticsInsideItemData> arrayList = new java.util.ArrayList<>();
        if (Intrinsics.EZpvd((java.lang.Object) strategyPositionResponse.getInstType(), (java.lang.Object) "MARGIN") || Intrinsics.EZpvd((java.lang.Object) strategyPositionResponse.getInstType(), (java.lang.Object) "SPOT")) {
            strCopydefault = C56033xvF.copydefault(strategyPositionResponse.getPos(), strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getPosCcy());
        } else {
            strCopydefault = C56033xvF.getBotAmount$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getPos(), "", false, null, 48, null);
        }
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setMediaType) + "(" + C56033xvF.AEQbTJ(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), "", strategyPositionResponse.getPosCcy()) + ")", strCopydefault, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        if (Intrinsics.EZpvd((java.lang.Object) strategyPositionResponse.getInstType(), (java.lang.Object) "MARGIN") || Intrinsics.EZpvd((java.lang.Object) strategyPositionResponse.getInstType(), (java.lang.Object) "SPOT")) {
            strCopydefault2 = C56033xvF.copydefault(strategyPositionResponse.getAvailPos(), strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getPosCcy());
        } else {
            strCopydefault2 = C56033xvF.getBotAmount$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getAvailPos(), "", false, null, 48, null);
        }
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setShowHideAnimationEnabled) + "(" + C56033xvF.AEQbTJ(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), "", strategyPositionResponse.getPosCcy()) + ")", strCopydefault2, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.PickVisualMediaRequestKt) + "(" + C56033xvF.AEQbTJ(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId()) + ")", C56033xvF.getBotPrice$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getAvgPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getActivityResultRegistry) + "(" + C56033xvF.KWHzl(strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getMgnCcy()) + ")", C56033xvF.getBotPnl$default(strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getUpl(), null, false, false, null, false, null, null, null, 2040, null), null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getUpl(), null, 8, null)), 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131060, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.AnimatorRes), C56033xvF.fmtBotPnlPercent$default(strategyPositionResponse.getUplRatio(), true, 0, 4, null), null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.KWHzl(strategyPositionResponse.getUplRatio())), 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131060, null));
        java.lang.String str = C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContract) + "(" + C56033xvF.OLrzqt(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getMgnCcy()) + ")";
        java.lang.String strOLrzqt = C56033xvF.OLrzqt(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getImr(), strategyPositionResponse.getMgnCcy());
        arrayList.add(new TacticsInsideItemData(str, strOLrzqt == null ? "" : strOLrzqt, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultCallerLauncherresultContract21), C56033xvF.copydefault(strategyPositionResponse.getMgnRatio()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        return arrayList;
    }

    private final boolean EZpvd(StrategyPositionResponse strategyPositionResponse) {
        java.lang.String posSide = strategyPositionResponse.getPosSide();
        if (Intrinsics.EZpvd((java.lang.Object) posSide, (java.lang.Object) "long")) {
            return true;
        }
        if (Intrinsics.EZpvd((java.lang.Object) posSide, (java.lang.Object) "short")) {
            return false;
        }
        return C33129mqd.AEQbTJ(strategyPositionResponse.getPos(), 0);
    }
}
