package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.bot.config.AiBackTestCycle;
import com.okinc.unify_trade.bot.config.ContractDcaStopLossType;
import com.okinc.unify_trade.bot.config.ContractDcaTriggerType;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.data.BotParamColorItemData;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xuU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55995xuU {
    public static final C55995xuU copydefault = new C55995xuU();

    private C55995xuU() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xuU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.List getParams$default(C55995xuU c55995xuU, SmartRecommendResp smartRecommendResp, android.os.Parcelable parcelable, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return c55995xuU.copydefault(smartRecommendResp, parcelable, (Function1<? super java.lang.String, java.lang.String>) function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [36=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.util.List<java.lang.Object> copydefault(@NotNull SmartRecommendResp smartRecommendResp, @NotNull android.os.Parcelable parcelable, Function1<? super java.lang.String, java.lang.String> function1) {
        Intrinsics.checkNotNullParameter(smartRecommendResp, "");
        Intrinsics.checkNotNullParameter(parcelable, "");
        java.lang.String algoOrdType = smartRecommendResp.getAlgoOrdType();
        if (algoOrdType != null) {
            switch (algoOrdType.hashCode()) {
                case -1831183611:
                    if (algoOrdType.equals("spot_dca")) {
                        return EZpvd((DcaOrderReq) parcelable);
                    }
                    break;
                case -1402017003:
                    if (algoOrdType.equals("contract_dca")) {
                        return copydefault((DcaOrderReq) parcelable);
                    }
                    break;
                case -512749997:
                    if (algoOrdType.equals("contract_grid")) {
                        return KWHzl(smartRecommendResp, (ContractGridReq) parcelable);
                    }
                    break;
                case 3181382:
                    if (algoOrdType.equals("grid")) {
                        return copydefault(smartRecommendResp, (GridReq) parcelable, function1);
                    }
                    break;
            }
        }
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xuU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.List buildGridParams$default(C55995xuU c55995xuU, SmartRecommendResp smartRecommendResp, GridReq gridReq, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return c55995xuU.copydefault(smartRecommendResp, gridReq, (Function1<? super java.lang.String, java.lang.String>) function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<java.lang.Object> copydefault(SmartRecommendResp smartRecommendResp, GridReq gridReq, Function1<? super java.lang.String, java.lang.String> function1) {
        java.lang.String strAYXKKw;
        java.lang.String str;
        java.lang.String strAYXKKw2;
        java.lang.String strInvoke;
        java.lang.String strInvoke2;
        java.lang.String perMaxProfitRate;
        java.lang.String perMinProfitRate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.UCQKYV), C33070mpX.AYXKKw(C55688xof.Application.onSetShuffleMode), null, null, false, false, null, java.lang.Integer.valueOf(C52761wXj.TaskDescription.iPSTqm), null, true, 0, 0, 0, 0, 15484, null));
        arrayList.add(new C55848xrg(C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null), C33070mpX.copydefault(C52761wXj.Activity.aBDePw), 0, 0, true, 12, null));
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.QIZEnU);
        xMR xmr = xMR.copydefault;
        java.lang.String pnlRatio = smartRecommendResp.getPnlRatio();
        arrayList.add(new BotParamItemData(strAYXKKw3, xMR.formatPercentWithSymbol$default(xmr, pnlRatio == null ? "" : pnlRatio, 0, 0, null, 14, null), null, null, false, false, null, null, null, false, 0, C56033xvF.OLrzqt((java.lang.Object) smartRecommendResp.getPnlRatio()), 0, 0, 14332, null));
        java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.sJPPOI);
        StgyParam stgyParam = smartRecommendResp.getStgyParam();
        java.lang.String duration = stgyParam != null ? stgyParam.getDuration() : null;
        if (Intrinsics.EZpvd((java.lang.Object) duration, (java.lang.Object) AiBackTestCycle.DUR_7.getMode())) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.OxbLUn);
        } else {
            strAYXKKw = Intrinsics.EZpvd((java.lang.Object) duration, (java.lang.Object) AiBackTestCycle.DUR_30.getMode()) ? C33070mpX.AYXKKw(C55688xof.Application.gdLjtZ) : C33070mpX.AYXKKw(C55688xof.Application.DVmcag);
        }
        arrayList.add(new BotParamItemData(strAYXKKw4, strAYXKKw, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        StgyParam stgyParam2 = smartRecommendResp.getStgyParam();
        java.lang.String str2 = (stgyParam2 == null || (perMinProfitRate = stgyParam2.getPerMinProfitRate()) == null) ? "" : perMinProfitRate;
        RoundingMode roundingMode = RoundingMode.DOWN;
        java.lang.String percent$default = xMR.formatPercent$default(xmr, str2, 0, roundingMode, 2, null);
        StgyParam stgyParam3 = smartRecommendResp.getStgyParam();
        java.lang.String percent$default2 = xMR.formatPercent$default(xmr, (stgyParam3 == null || (perMaxProfitRate = stgyParam3.getPerMaxProfitRate()) == null) ? "" : perMaxProfitRate, 0, roundingMode, 2, null);
        java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C55688xof.Application.registerForActivityResultlambda1);
        if (!Intrinsics.EZpvd((java.lang.Object) percent$default, (java.lang.Object) percent$default2)) {
            percent$default = percent$default + "-" + percent$default2;
        }
        arrayList.add(new BotParamItemData(strAYXKKw5, percent$default, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        gridReq.getInstId();
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.setPlaybackState), (function1 == null || (strInvoke2 = function1.invoke(gridReq.getMinPx())) == null) ? "" : strInvoke2, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.setDisplayShowCustomEnabled), (function1 == null || (strInvoke = function1.invoke(gridReq.getMaxPx())) == null) ? "" : strInvoke, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.lang.String runType = gridReq.getRunType();
        if (Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "1")) {
            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.setPlaybackToRemote);
        } else {
            if (!Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "2")) {
                str = "--";
                arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.removeOnMenuVisibilityListener), str, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerInput), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) gridReq.getGridNum()) ? "--" : xMR.formatDownToMax$default(xmr, gridReq.getGridNum(), 0, 2, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                return arrayList;
            }
            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.setQueue);
        }
        str = strAYXKKw2;
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.removeOnMenuVisibilityListener), str, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerInput), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) gridReq.getGridNum()) ? "--" : xMR.formatDownToMax$default(xmr, gridReq.getGridNum(), 0, 2, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x02d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<java.lang.Object> KWHzl(SmartRecommendResp smartRecommendResp, ContractGridReq contractGridReq) {
        java.lang.String duration;
        java.lang.String direction;
        java.lang.String lever;
        java.lang.String direction2;
        java.lang.String strAYXKKw;
        java.lang.String str;
        java.lang.String strAYXKKw2;
        java.lang.String perMaxProfitRate;
        java.lang.String perMinProfitRate;
        java.lang.String duration2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.UCQKYV), C33070mpX.AYXKKw(C55688xof.Application.onSetShuffleMode), null, null, false, false, null, java.lang.Integer.valueOf(C52761wXj.TaskDescription.iPSTqm), null, true, 0, 0, 0, 0, 15484, null));
        arrayList.add(new C55848xrg(C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null), C33070mpX.copydefault(C52761wXj.Activity.aBDePw), 0, 0, true, 12, null));
        StgyParam stgyParam = smartRecommendResp.getStgyParam();
        if (stgyParam == null || (duration = stgyParam.getDuration()) == null) {
            duration = "";
        }
        java.lang.String strCopydefault = C33069mpW.copydefault(C55688xof.Application.RcvFxC, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, duration)));
        xMR xmr = xMR.copydefault;
        java.lang.String pnlRatio = smartRecommendResp.getPnlRatio();
        arrayList.add(new BotParamItemData(strCopydefault, xMR.formatPercentWithSymbol$default(xmr, pnlRatio == null ? "" : pnlRatio, 0, 0, null, 14, null), null, null, false, false, null, null, null, false, 0, C56033xvF.OLrzqt((java.lang.Object) smartRecommendResp.getPnlRatio()), 0, 0, 14332, null));
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.getNewProxyInstance);
        java.lang.String maxDrawdown = smartRecommendResp.getMaxDrawdown();
        arrayList.add(new BotParamItemData(strAYXKKw3, xMR.formatPercentWithSymbol$default(xmr, maxDrawdown == null ? "" : maxDrawdown, 0, 0, null, 14, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        StgyParam stgyParam2 = smartRecommendResp.getStgyParam();
        if (stgyParam2 == null || (direction = stgyParam2.getDirection()) == null) {
            direction = "";
        }
        java.lang.String strAhwBna = C56033xvF.AhwBna(direction);
        java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.sVvuFk);
        java.lang.String str2 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAhwBna) ? "" : " | ";
        StgyParam stgyParam3 = smartRecommendResp.getStgyParam();
        if (stgyParam3 == null || (lever = stgyParam3.getLever()) == null) {
            lever = "";
        }
        java.lang.String str3 = strAhwBna + str2 + C56033xvF.getBotLever$default(lever, false, 2, null);
        StgyParam stgyParam4 = smartRecommendResp.getStgyParam();
        if (stgyParam4 == null || (direction2 = stgyParam4.getDirection()) == null) {
            direction2 = "";
        }
        arrayList.add(new BotParamItemData(strAYXKKw4, str3, null, null, false, false, null, null, null, false, 0, C56033xvF.getContractGridSideColor$default(direction2, false, 2, null), 0, 0, 14332, null));
        java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C55688xof.Application.sJPPOI);
        StgyParam stgyParam5 = smartRecommendResp.getStgyParam();
        int iAhwBna = (stgyParam5 == null || (duration2 = stgyParam5.getDuration()) == null) ? 0 : C33129mqd.AhwBna(duration2);
        if (7 <= iAhwBna && iAhwBna < 21) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.OxbLUn);
        } else if (30 <= iAhwBna && iAhwBna < 61) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.gdLjtZ);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.DVmcag);
        }
        arrayList.add(new BotParamItemData(strAYXKKw5, strAYXKKw, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        StgyParam stgyParam6 = smartRecommendResp.getStgyParam();
        java.lang.String str4 = (stgyParam6 == null || (perMinProfitRate = stgyParam6.getPerMinProfitRate()) == null) ? "" : perMinProfitRate;
        RoundingMode roundingMode = RoundingMode.DOWN;
        java.lang.String percent$default = xMR.formatPercent$default(xmr, str4, 0, roundingMode, 2, null);
        StgyParam stgyParam7 = smartRecommendResp.getStgyParam();
        java.lang.String percent$default2 = xMR.formatPercent$default(xmr, (stgyParam7 == null || (perMaxProfitRate = stgyParam7.getPerMaxProfitRate()) == null) ? "" : perMaxProfitRate, 0, roundingMode, 2, null);
        java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C55688xof.Application.registerForActivityResultlambda1);
        if (!Intrinsics.EZpvd((java.lang.Object) percent$default, (java.lang.Object) percent$default2)) {
            percent$default = percent$default + "-" + percent$default2;
        }
        arrayList.add(new BotParamItemData(strAYXKKw6, percent$default, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.lang.String instId = contractGridReq.getInstId();
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.setPlaybackState), C56033xvF.getBotPrice$default("SWAP", instId, contractGridReq.getMinPx(), true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.setDisplayShowCustomEnabled), C56033xvF.getBotPrice$default("SWAP", instId, contractGridReq.getMaxPx(), true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.lang.String runType = contractGridReq.getRunType();
        if (Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "1")) {
            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.setPlaybackToRemote);
        } else {
            if (!Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "2")) {
                str = "--";
                arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.removeOnMenuVisibilityListener), str, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerInput), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) contractGridReq.getGridNum()) ? "--" : xMR.formatDownToMax$default(xmr, contractGridReq.getGridNum(), 0, 2, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
                return arrayList;
            }
            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.setQueue);
        }
        str = strAYXKKw2;
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.removeOnMenuVisibilityListener), str, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerInput), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) contractGridReq.getGridNum()) ? "--" : xMR.formatDownToMax$default(xmr, contractGridReq.getGridNum(), 0, 2, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        return arrayList;
    }

    public final java.util.List<java.lang.Object> EZpvd(DcaOrderReq dcaOrderReq) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.UCQKYV), C33070mpX.AYXKKw(C55688xof.Application.onSetShuffleMode), null, null, false, false, null, java.lang.Integer.valueOf(C52761wXj.TaskDescription.iPSTqm), null, true, 0, 0, 0, 0, 15484, null));
        arrayList.add(new C55848xrg(C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null), C33070mpX.copydefault(C52761wXj.Activity.aBDePw), 0, 0, true, 12, null));
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.QXDzTk), C33070mpX.AYXKKw(GridStartTriggerType.INSTANT.getDesc()), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.htlTjW);
        xMR xmr = xMR.copydefault;
        arrayList.add(new BotParamItemData(strAYXKKw, xmr.copydefault("1") + ":" + xMR.formatRoundToFixed$default(xmr, C56045xvR.KWHzl.AEQbTJ(dcaOrderReq.getInitOrdPct(), dcaOrderReq.getMaxSafetyOrds(), dcaOrderReq.getVolMult()), 0, 2, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.spnCvw);
        java.lang.String maxSafetyOrds = dcaOrderReq.getMaxSafetyOrds();
        if (maxSafetyOrds == null) {
            maxSafetyOrds = "";
        }
        arrayList.add(new BotParamItemData(strAYXKKw2, xmr.copydefault(maxSafetyOrds), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.zblBkD);
        java.lang.String pxSteps = dcaOrderReq.getPxSteps();
        arrayList.add(new BotParamItemData(strAYXKKw3, xMR.formatPercent$default(xmr, pxSteps == null ? "" : pxSteps, 0, null, 6, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.DGOPHZ);
        java.lang.String tpPct = dcaOrderReq.getTpPct();
        arrayList.add(new BotParamItemData(strAYXKKw4, xMR.formatPercent$default(xmr, tpPct == null ? "" : tpPct, 0, null, 6, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C55688xof.Application.call);
        java.lang.String pxStepsMult = dcaOrderReq.getPxStepsMult();
        if (pxStepsMult == null) {
            pxStepsMult = "";
        }
        arrayList.add(new BotParamItemData(strAYXKKw5, xMR.formatDownToFixed$default(xmr, pxStepsMult, 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C55688xof.Application.fdOvFl);
        java.lang.String volMult = dcaOrderReq.getVolMult();
        if (volMult == null) {
            volMult = "";
        }
        arrayList.add(new BotParamItemData(strAYXKKw6, xMR.formatDownToFixed$default(xmr, volMult, 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        if (C33129mqd.OLrzqt((java.lang.CharSequence) dcaOrderReq.getSlPct())) {
            java.lang.String strAYXKKw7 = C33070mpX.AYXKKw(C55688xof.Application.run);
            java.lang.String slPct = dcaOrderReq.getSlPct();
            arrayList.add(new BotParamItemData(strAYXKKw7, xMR.formatPercent$default(xmr, slPct == null ? "" : slPct, 0, null, 6, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        }
        return arrayList;
    }

    public final java.util.List<java.lang.Object> copydefault(DcaOrderReq dcaOrderReq) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.UCQKYV), C33070mpX.AYXKKw(C55688xof.Application.onSetShuffleMode), null, null, false, false, null, java.lang.Integer.valueOf(C52761wXj.TaskDescription.iPSTqm), null, true, 0, 0, 0, 0, 15484, null));
        arrayList.add(new C55848xrg(C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null), C33070mpX.copydefault(C52761wXj.Activity.aBDePw), 0, 0, true, 12, null));
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.geAOna);
        java.lang.String direction = dcaOrderReq.getDirection();
        if (direction == null) {
            direction = "";
        }
        java.lang.String strAhwBna = C56033xvF.AhwBna(direction);
        java.lang.String direction2 = dcaOrderReq.getDirection();
        if (direction2 == null) {
            direction2 = "";
        }
        arrayList.add(new BotParamColorItemData(strAYXKKw, strAhwBna, C56033xvF.getContractGridSideColor$default(direction2, false, 2, null), 0, 0.0f, 0, null, null, 248, null));
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.aBDePw);
        java.lang.String lever = dcaOrderReq.getLever();
        if (lever == null) {
            lever = "";
        }
        java.lang.String botLever$default = C56033xvF.getBotLever$default(lever, false, 2, null);
        java.lang.String direction3 = dcaOrderReq.getDirection();
        if (direction3 == null) {
            direction3 = "";
        }
        arrayList.add(new BotParamColorItemData(strAYXKKw2, botLever$default, C56033xvF.getContractGridSideColor$default(direction3, false, 2, null), 0, 0.0f, 0, null, null, 248, null));
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.QXDzTk), C33070mpX.AYXKKw(ContractDcaTriggerType.INSTANT.getShowMode()), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.DFbvW);
        xMR xmr = xMR.copydefault;
        arrayList.add(new BotParamItemData(strAYXKKw3, "1:" + xMR.formatRoundToFixed$default(xmr, C56045xvR.KWHzl.AEQbTJ(dcaOrderReq.getInitOrdPct(), dcaOrderReq.getMaxSafetyOrds(), dcaOrderReq.getVolMult()), 0, 2, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.OijiEz);
        java.lang.String maxSafetyOrds = dcaOrderReq.getMaxSafetyOrds();
        if (maxSafetyOrds == null) {
            maxSafetyOrds = "";
        }
        arrayList.add(new BotParamItemData(strAYXKKw4, xmr.copydefault(maxSafetyOrds), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.lang.String strAYXKKw5 = Intrinsics.EZpvd((java.lang.Object) dcaOrderReq.getDirection(), (java.lang.Object) "long") ? C33070mpX.AYXKKw(C55688xof.Application.gqOnQv) : C33070mpX.AYXKKw(C55688xof.Application.hfdhUn);
        java.lang.String pxSteps = dcaOrderReq.getPxSteps();
        arrayList.add(new BotParamItemData(strAYXKKw5, xMR.formatPercent$default(xmr, pxSteps == null ? "" : pxSteps, 0, null, 6, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C55688xof.Application.zDGrpR);
        java.lang.String tpPct = dcaOrderReq.getTpPct();
        arrayList.add(new BotParamItemData(strAYXKKw6, xMR.formatPercent$default(xmr, tpPct == null ? "" : tpPct, 0, null, 6, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.lang.String strAYXKKw7 = C33070mpX.AYXKKw(C55688xof.Application.dPkBzA);
        java.lang.String pxStepsMult = dcaOrderReq.getPxStepsMult();
        if (pxStepsMult == null) {
            pxStepsMult = "";
        }
        arrayList.add(new BotParamItemData(strAYXKKw7, xMR.formatDownToFixed$default(xmr, pxStepsMult, 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.lang.String strAYXKKw8 = C33070mpX.AYXKKw(C55688xof.Application.hdpuIA);
        java.lang.String volMult = dcaOrderReq.getVolMult();
        if (volMult == null) {
            volMult = "";
        }
        arrayList.add(new BotParamItemData(strAYXKKw8, xMR.formatDownToFixed$default(xmr, volMult, 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        if (C33129mqd.OLrzqt((java.lang.CharSequence) dcaOrderReq.getSlPct())) {
            java.lang.String strAYXKKw9 = C33070mpX.AYXKKw(C55688xof.Application.zEHIKV);
            java.lang.String strAEQbTJ = ContractDcaStopLossType.Companion.AEQbTJ(dcaOrderReq.getSlMode());
            java.lang.String slPct = dcaOrderReq.getSlPct();
            arrayList.add(new BotParamItemData(strAYXKKw9, strAEQbTJ + xMR.formatPercent$default(xmr, slPct == null ? "" : slPct, 0, null, 6, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        }
        return arrayList;
    }
}
