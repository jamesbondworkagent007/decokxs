package o;

import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.bot.BotRecommendDetailItem;
import com.okinc.unify_trade.biz.bot.FontStyleBean;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.bot.config.AiBackTestCycle;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.SpotDcaRiskModeData;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xKw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54504xKw implements InterfaceC54501xKt<java.util.List<? extends SmartRecommendResp>, java.util.List<? extends SmartRecommendResp>> {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [47=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final java.lang.String OLrzqt(SmartRecommendResp smartRecommendResp, java.lang.String str) {
        java.lang.String userRiskMode;
        if (str != null) {
            switch (str.hashCode()) {
                case -1831183611:
                    if (str.equals("spot_dca")) {
                        StgyParam stgyParam = smartRecommendResp.getStgyParam();
                        userRiskMode = stgyParam != null ? stgyParam.getUserRiskMode() : null;
                        return Intrinsics.EZpvd((java.lang.Object) userRiskMode, (java.lang.Object) SpotDcaRiskModeData.MODERATE.getMode()) ? C33070mpX.AYXKKw(C55688xof.Application.DPVBvL) : Intrinsics.EZpvd((java.lang.Object) userRiskMode, (java.lang.Object) SpotDcaRiskModeData.AGGRESSIVE.getMode()) ? C33070mpX.AYXKKw(C55688xof.Application.IKQXqd) : C33070mpX.AYXKKw(C55688xof.Application.onProviderEnabled);
                    }
                    break;
                case -1574173039:
                    if (str.equals("infinite_grid")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.gFTCsA);
                    }
                    break;
                case -1402017003:
                    if (str.equals("contract_dca")) {
                        StgyParam stgyParam2 = smartRecommendResp.getStgyParam();
                        java.lang.String userRiskMode2 = stgyParam2 != null ? stgyParam2.getUserRiskMode() : null;
                        if (Intrinsics.EZpvd((java.lang.Object) userRiskMode2, (java.lang.Object) SpotDcaRiskModeData.MODERATE.getMode())) {
                            StgyParam stgyParam3 = smartRecommendResp.getStgyParam();
                            return Intrinsics.EZpvd((java.lang.Object) (stgyParam3 != null ? stgyParam3.getDirection() : null), (java.lang.Object) "long") ? C33070mpX.AYXKKw(C55688xof.Application.QOeQqh) : C33070mpX.AYXKKw(C55688xof.Application.DzOuPm);
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) userRiskMode2, (java.lang.Object) SpotDcaRiskModeData.AGGRESSIVE.getMode())) {
                            StgyParam stgyParam4 = smartRecommendResp.getStgyParam();
                            return Intrinsics.EZpvd((java.lang.Object) (stgyParam4 != null ? stgyParam4.getDirection() : null), (java.lang.Object) "long") ? C33070mpX.AYXKKw(C55688xof.Application.zlzhuY) : C33070mpX.AYXKKw(C55688xof.Application.DsfknC);
                        }
                        StgyParam stgyParam5 = smartRecommendResp.getStgyParam();
                        return Intrinsics.EZpvd((java.lang.Object) (stgyParam5 != null ? stgyParam5.getDirection() : null), (java.lang.Object) "long") ? C33070mpX.AYXKKw(C55688xof.Application.onStatusChanged) : C33070mpX.AYXKKw(C55688xof.Application.onProviderDisabled);
                    }
                    break;
                case -512749997:
                    if (str.equals("contract_grid")) {
                        StgyParam stgyParam6 = smartRecommendResp.getStgyParam();
                        userRiskMode = stgyParam6 != null ? stgyParam6.getDirection() : null;
                        return Intrinsics.EZpvd((java.lang.Object) userRiskMode, (java.lang.Object) "long") ? C33070mpX.AYXKKw(C55688xof.Application.DAgZj) : Intrinsics.EZpvd((java.lang.Object) userRiskMode, (java.lang.Object) "short") ? C33070mpX.AYXKKw(C55688xof.Application.setProfilesSinceInitCount) : C33070mpX.AYXKKw(C55688xof.Application.OKSWiw);
                    }
                    break;
                case 3181382:
                    if (str.equals("grid")) {
                        StgyParam stgyParam7 = smartRecommendResp.getStgyParam();
                        userRiskMode = stgyParam7 != null ? stgyParam7.getDuration() : null;
                        if (Intrinsics.EZpvd((java.lang.Object) userRiskMode, (java.lang.Object) AiBackTestCycle.DUR_7.getMode())) {
                            return C33070mpX.AYXKKw(C55688xof.Application.hPlhRW) + " - " + C33070mpX.AYXKKw(C55688xof.Application.OxbLUn);
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) userRiskMode, (java.lang.Object) AiBackTestCycle.DUR_30.getMode())) {
                            return C33070mpX.AYXKKw(C55688xof.Application.adwzgZ) + " - " + C33070mpX.AYXKKw(C55688xof.Application.gdLjtZ);
                        }
                        return C33070mpX.AYXKKw(C55688xof.Application.HrMTQN) + " - " + C33070mpX.AYXKKw(C55688xof.Application.DVmcag);
                    }
                    break;
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [115=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.util.List<BotRecommendDetailItem> KWHzl(SmartRecommendResp smartRecommendResp, java.lang.String str) {
        DcaTriggerParam dcaTriggerParam;
        java.lang.String str2;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        java.lang.String str3;
        java.lang.String safeString$default2;
        java.lang.String safeString$default3;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLDjBIcL3;
        java.lang.String safeString$default4;
        java.lang.String safeString$default5;
        C54536xML c54536xMLIsConnected2;
        C54536xML c54536xMLDjBIcL4;
        C54536xML c54536xMLIsConnected3;
        C54536xML c54536xMLDjBIcL5;
        StgyParam stgyParam = smartRecommendResp.getStgyParam();
        if (stgyParam == null) {
            return yDY.AhwBna();
        }
        java.lang.String instType = smartRecommendResp.getInstType();
        if (instType == null) {
            instType = "";
        }
        java.lang.String instId = smartRecommendResp.getInstId();
        if (instId == null) {
            instId = "";
        }
        C55887xsS c55887xsS = new C55887xsS(instType, instId);
        if (str != null) {
            switch (str.hashCode()) {
                case -1831183611:
                    if (str.equals("spot_dca")) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.QIZEnU);
                        xMR xmr = xMR.copydefault;
                        java.lang.String pnlRatio = smartRecommendResp.getPnlRatio();
                        arrayList.add(new BotRecommendDetailItem(strAYXKKw, xMR.formatPercentWithSymbol$default(xmr, pnlRatio == null ? "" : pnlRatio, 0, 0, null, 14, null), C33070mpX.AYXKKw(C55688xof.Application.describeContents), 0, new FontStyleBean(java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) smartRecommendResp.getPnlRatio())), java.lang.Integer.valueOf(C32113mPz.Dialog.QKVWgx)), 8, (DefaultConstructorMarker) null));
                        arrayList.add(new BotRecommendDetailItem("", "", (java.lang.String) null, 0, (FontStyleBean) null, 28, (DefaultConstructorMarker) null));
                        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.QXDzTk);
                        GridStartTriggerType.Application application = GridStartTriggerType.Companion;
                        java.util.List<DcaTriggerParam> triggerParams = stgyParam.getTriggerParams();
                        arrayList.add(new BotRecommendDetailItem(strAYXKKw2, application.copydefault((triggerParams == null || (dcaTriggerParam = (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(triggerParams)) == null) ? null : dcaTriggerParam.getTriggerStrategy()), (java.lang.String) null, 0, (FontStyleBean) null, 28, (DefaultConstructorMarker) null));
                        arrayList.add(new BotRecommendDetailItem(C33070mpX.AYXKKw(C55688xof.Application.htlTjW), xmr.copydefault("1") + ":" + xMR.formatRoundToFixed$default(xmr, C56045xvR.KWHzl.AEQbTJ(stgyParam.getInitOrdPct(), stgyParam.getMaxSafetyOrds(), stgyParam.getVolMult()), 0, 2, null), C33070mpX.AYXKKw(C55688xof.Application.UrRBLY), 0, (FontStyleBean) null, 24, (DefaultConstructorMarker) null));
                        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.spnCvw);
                        java.lang.String maxSafetyOrds = stgyParam.getMaxSafetyOrds();
                        if (maxSafetyOrds == null) {
                            maxSafetyOrds = "";
                        }
                        arrayList.add(new BotRecommendDetailItem(strAYXKKw3, xmr.copydefault(maxSafetyOrds), (java.lang.String) null, 0, (FontStyleBean) null, 28, (DefaultConstructorMarker) null));
                        java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.DGOPHZ);
                        java.lang.String tpPct = stgyParam.getTpPct();
                        arrayList.add(new BotRecommendDetailItem(strAYXKKw4, xMR.formatPercent$default(xmr, tpPct == null ? "" : tpPct, 0, null, 6, null), C33070mpX.AYXKKw(C55688xof.Application.aHXSQp), 0, (FontStyleBean) null, 24, (DefaultConstructorMarker) null));
                        return arrayList;
                    }
                    break;
                case -1574173039:
                    if (str.equals("infinite_grid")) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.String str4 = C33070mpX.AYXKKw(C55688xof.Application.DjwCMv) + " (" + c55887xsS.DbNXlk() + ")";
                        xMS xmsCopydefault = c55887xsS.copydefault();
                        if (xmsCopydefault == null) {
                            str2 = "";
                        } else {
                            java.lang.String minPx = stgyParam.getMinPx();
                            if (minPx == null) {
                                minPx = "";
                            }
                            C54536xML c54536xMLAYXKKw = xmsCopydefault.AYXKKw(minPx);
                            if (c54536xMLAYXKKw != null && (c54536xMLIsConnected = c54536xMLAYXKKw.isConnected()) != null && (c54536xMLDjBIcL = c54536xMLIsConnected.djBIcL()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
                                str2 = safeString$default;
                            }
                        }
                        arrayList2.add(new BotRecommendDetailItem(str4, str2, (java.lang.String) null, 0, (FontStyleBean) null, 28, (DefaultConstructorMarker) null));
                        xMR xmr2 = xMR.copydefault;
                        java.lang.String perGridProfitRatio = stgyParam.getPerGridProfitRatio();
                        arrayList2.add(new BotRecommendDetailItem(C33070mpX.AYXKKw(C55688xof.Application.registerForActivityResultlambda1), xMR.formatPercent$default(xmr2, perGridProfitRatio == null ? "" : perGridProfitRatio, 0, RoundingMode.DOWN, 2, null), (java.lang.String) null, 0, (FontStyleBean) null, 28, (DefaultConstructorMarker) null));
                        return arrayList2;
                    }
                    break;
                case -1402017003:
                    if (str.equals("contract_dca")) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C55688xof.Application.QIZEnU);
                        xMR xmr3 = xMR.copydefault;
                        java.lang.String pnlRatio2 = smartRecommendResp.getPnlRatio();
                        arrayList3.add(new BotRecommendDetailItem(strAYXKKw5, xMR.formatPercentWithSymbol$default(xmr3, pnlRatio2 == null ? "" : pnlRatio2, 0, 0, null, 14, null), C33070mpX.AYXKKw(C55688xof.Application.describeContents), 0, new FontStyleBean(java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) smartRecommendResp.getPnlRatio())), java.lang.Integer.valueOf(C32113mPz.Dialog.QKVWgx)), 8, (DefaultConstructorMarker) null));
                        java.lang.String direction = stgyParam.getDirection();
                        int riseUpColor$default = Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "long") ? C33512mxp.getRiseUpColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null) : Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "short") ? C33512mxp.getFallDownColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null) : C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn);
                        java.lang.String direction2 = stgyParam.getDirection();
                        if (direction2 == null) {
                            direction2 = "";
                        }
                        java.lang.String strAhwBna = C56033xvF.AhwBna(direction2);
                        java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen1invokeinlinedonDispose1);
                        str3 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAhwBna) ? "" : "-";
                        java.lang.String lever = stgyParam.getLever();
                        if (lever == null) {
                            lever = "";
                        }
                        arrayList3.add(new BotRecommendDetailItem(strAYXKKw6, strAhwBna + str3 + C56033xvF.getBotLever$default(lever, false, 2, null), (java.lang.String) null, 0, new FontStyleBean(java.lang.Integer.valueOf(riseUpColor$default), java.lang.Integer.valueOf(C32113mPz.Dialog.OcIXYQ)), 12, (DefaultConstructorMarker) null));
                        arrayList3.add(new BotRecommendDetailItem(C33070mpX.AYXKKw(C55688xof.Application.DFbvW), xmr3.copydefault("1") + ":" + xMR.formatRoundToFixed$default(xmr3, C56045xvR.KWHzl.AEQbTJ(stgyParam.getInitOrdPct(), stgyParam.getMaxSafetyOrds(), stgyParam.getVolMult()), 0, 2, null), C33070mpX.AYXKKw(C55688xof.Application.svhCHd), 0, (FontStyleBean) null, 24, (DefaultConstructorMarker) null));
                        java.lang.String strAYXKKw7 = C33070mpX.AYXKKw(C55688xof.Application.OijiEz);
                        java.lang.String maxSafetyOrds2 = stgyParam.getMaxSafetyOrds();
                        if (maxSafetyOrds2 == null) {
                            maxSafetyOrds2 = "";
                        }
                        arrayList3.add(new BotRecommendDetailItem(strAYXKKw7, xmr3.copydefault(maxSafetyOrds2), (java.lang.String) null, 0, (FontStyleBean) null, 28, (DefaultConstructorMarker) null));
                        java.lang.String strAYXKKw8 = C33070mpX.AYXKKw(C55688xof.Application.zDGrpR);
                        java.lang.String tpPct2 = stgyParam.getTpPct();
                        arrayList3.add(new BotRecommendDetailItem(strAYXKKw8, xMR.formatPercent$default(xmr3, tpPct2 == null ? "" : tpPct2, 0, null, 6, null), C33070mpX.AYXKKw(C55688xof.Application.GCXiNH), 0, (FontStyleBean) null, 24, (DefaultConstructorMarker) null));
                        return arrayList3;
                    }
                    break;
                case -512749997:
                    if (str.equals("contract_grid")) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.String strAYXKKw9 = C33070mpX.AYXKKw(C55688xof.Application.QIZEnU);
                        xMR xmr4 = xMR.copydefault;
                        java.lang.String pnlRatio3 = smartRecommendResp.getPnlRatio();
                        arrayList4.add(new BotRecommendDetailItem(strAYXKKw9, xMR.formatPercentWithSymbol$default(xmr4, pnlRatio3 == null ? "" : pnlRatio3, 0, 0, null, 14, null), C33070mpX.AYXKKw(C55688xof.Application.describeContents), 0, new FontStyleBean(java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) smartRecommendResp.getPnlRatio())), java.lang.Integer.valueOf(C32113mPz.Dialog.QKVWgx)), 8, (DefaultConstructorMarker) null));
                        java.lang.String direction3 = stgyParam.getDirection();
                        int riseUpColor$default2 = Intrinsics.EZpvd((java.lang.Object) direction3, (java.lang.Object) "long") ? C33512mxp.getRiseUpColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null) : Intrinsics.EZpvd((java.lang.Object) direction3, (java.lang.Object) "short") ? C33512mxp.getFallDownColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null) : C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn);
                        java.lang.String direction4 = stgyParam.getDirection();
                        if (direction4 == null) {
                            direction4 = "";
                        }
                        java.lang.String strAhwBna2 = C56033xvF.AhwBna(direction4);
                        java.lang.String strAYXKKw10 = C33070mpX.AYXKKw(C55688xof.Application.cancelPendingInputEvents);
                        str3 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAhwBna2) ? "" : "-";
                        java.lang.String lever2 = stgyParam.getLever();
                        if (lever2 == null) {
                            lever2 = "";
                        }
                        arrayList4.add(new BotRecommendDetailItem(strAYXKKw10, strAhwBna2 + str3 + C56033xvF.getBotLever$default(lever2, false, 2, null), (java.lang.String) null, 0, new FontStyleBean(java.lang.Integer.valueOf(riseUpColor$default2), java.lang.Integer.valueOf(C32113mPz.Dialog.OcIXYQ)), 12, (DefaultConstructorMarker) null));
                        AbstractC54531xLw abstractC54531xLwAEQbTJ = c55887xsS.AEQbTJ();
                        if (abstractC54531xLwAEQbTJ == null) {
                            safeString$default2 = "";
                        } else {
                            java.lang.String strValueOf = c55887xsS.valueOf();
                            if (strValueOf == null) {
                                strValueOf = "";
                            }
                            xMS xmsGEmmrt = abstractC54531xLwAEQbTJ.gEmmrt(strValueOf);
                            if (xmsGEmmrt != null) {
                                java.lang.String minPx2 = stgyParam.getMinPx();
                                if (minPx2 == null) {
                                    minPx2 = "";
                                }
                                C54536xML c54536xMLAYXKKw2 = xmsGEmmrt.AYXKKw(minPx2);
                                if (c54536xMLAYXKKw2 == null || (c54536xMLDjBIcL3 = c54536xMLAYXKKw2.djBIcL()) == null || (safeString$default2 = C54536xML.toSafeString$default(c54536xMLDjBIcL3, false, 1, null)) == null) {
                                }
                            }
                        }
                        AbstractC54531xLw abstractC54531xLwAEQbTJ2 = c55887xsS.AEQbTJ();
                        if (abstractC54531xLwAEQbTJ2 == null) {
                            safeString$default3 = "";
                        } else {
                            java.lang.String strValueOf2 = c55887xsS.valueOf();
                            if (strValueOf2 == null) {
                                strValueOf2 = "";
                            }
                            xMS xmsGEmmrt2 = abstractC54531xLwAEQbTJ2.gEmmrt(strValueOf2);
                            if (xmsGEmmrt2 != null) {
                                java.lang.String maxPx = stgyParam.getMaxPx();
                                if (maxPx == null) {
                                    maxPx = "";
                                }
                                C54536xML c54536xMLAYXKKw3 = xmsGEmmrt2.AYXKKw(maxPx);
                                if (c54536xMLAYXKKw3 == null || (c54536xMLDjBIcL2 = c54536xMLAYXKKw3.djBIcL()) == null || (safeString$default3 = C54536xML.toSafeString$default(c54536xMLDjBIcL2, false, 1, null)) == null) {
                                }
                            }
                        }
                        arrayList4.add(new BotRecommendDetailItem(C33070mpX.AYXKKw(C55688xof.Application.getCallerContract) + " (" + c55887xsS.DbNXlk() + ")", C33069mpW.copydefault(C55688xof.Application.addOnNewIntentListener, C56424yEw.gEmmrt(C56390yDp.OLrzqt("minLevel", safeString$default2), C56390yDp.OLrzqt("maxLevel", safeString$default3))), (java.lang.String) null, 0, (FontStyleBean) null, 28, (DefaultConstructorMarker) null));
                        java.lang.String downToMax$default = xMR.formatDownToMax$default(xmr4, C33129mqd.mulS$default(stgyParam.getPerMinProfitRate(), 100, null, null, null, 14, null), 0, 2, null);
                        java.lang.String downToMax$default2 = xMR.formatDownToMax$default(xmr4, C33129mqd.mulS$default(stgyParam.getPerMaxProfitRate(), 100, null, null, null, 14, null), 0, 2, null);
                        java.lang.String strAYXKKw11 = C33070mpX.AYXKKw(C55688xof.Application.registerForActivityResultlambda1);
                        if (!Intrinsics.EZpvd((java.lang.Object) downToMax$default, (java.lang.Object) downToMax$default2)) {
                            downToMax$default = C33069mpW.copydefault(C55688xof.Application.set, C56424yEw.gEmmrt(C56390yDp.OLrzqt("pctRangeOne", downToMax$default), C56390yDp.OLrzqt("pctRangeTwo", downToMax$default2)));
                        }
                        arrayList4.add(new BotRecommendDetailItem(strAYXKKw11, downToMax$default, (java.lang.String) null, 0, (FontStyleBean) null, 28, (DefaultConstructorMarker) null));
                        java.lang.String strAYXKKw12 = C33070mpX.AYXKKw(C55688xof.Application.getCallerInput);
                        java.lang.String gridNum = stgyParam.getGridNum();
                        arrayList4.add(new BotRecommendDetailItem(strAYXKKw12, xmr4.copydefault(gridNum == null ? "" : gridNum), (java.lang.String) null, 0, (FontStyleBean) null, 28, (DefaultConstructorMarker) null));
                        return arrayList4;
                    }
                    break;
                case 3181382:
                    if (str.equals("grid")) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.String strAYXKKw13 = C33070mpX.AYXKKw(C55688xof.Application.RatingCompatStarStyle);
                        xMR xmr5 = xMR.copydefault;
                        java.lang.String pnlRatio4 = smartRecommendResp.getPnlRatio();
                        arrayList5.add(new BotRecommendDetailItem(strAYXKKw13, xMR.formatPercentWithSymbol$default(xmr5, pnlRatio4 == null ? "" : pnlRatio4, 0, 0, null, 14, null), C33070mpX.AYXKKw(C55688xof.Application.describeContents), 0, new FontStyleBean(java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) smartRecommendResp.getPnlRatio())), java.lang.Integer.valueOf(C32113mPz.Dialog.QKVWgx)), 8, (DefaultConstructorMarker) null));
                        java.lang.String downToMax$default3 = xMR.formatDownToMax$default(xmr5, C33129mqd.mulS$default(stgyParam.getPerMinProfitRate(), 100, null, null, null, 14, null), 0, 2, null);
                        java.lang.String downToMax$default4 = xMR.formatDownToMax$default(xmr5, C33129mqd.mulS$default(stgyParam.getPerMaxProfitRate(), 100, null, null, null, 14, null), 0, 2, null);
                        java.lang.String strAYXKKw14 = C33070mpX.AYXKKw(C55688xof.Application.registerForActivityResultlambda1);
                        if (!Intrinsics.EZpvd((java.lang.Object) downToMax$default3, (java.lang.Object) downToMax$default4)) {
                            downToMax$default3 = C33069mpW.copydefault(C55688xof.Application.set, C56424yEw.gEmmrt(C56390yDp.OLrzqt("pctRangeOne", downToMax$default3), C56390yDp.OLrzqt("pctRangeTwo", downToMax$default4)));
                        }
                        arrayList5.add(new BotRecommendDetailItem(strAYXKKw14, downToMax$default3, (java.lang.String) null, 0, new FontStyleBean((java.lang.Integer) null, java.lang.Integer.valueOf(C32113mPz.Dialog.hDKMBd), 1, (DefaultConstructorMarker) null), 12, (DefaultConstructorMarker) null));
                        xMS xmsCopydefault2 = c55887xsS.copydefault();
                        if (xmsCopydefault2 == null) {
                            safeString$default4 = "";
                        } else {
                            java.lang.String minPx3 = stgyParam.getMinPx();
                            if (minPx3 == null) {
                                minPx3 = "";
                            }
                            C54536xML c54536xMLAYXKKw4 = xmsCopydefault2.AYXKKw(minPx3);
                            if (c54536xMLAYXKKw4 == null || (c54536xMLIsConnected3 = c54536xMLAYXKKw4.isConnected()) == null || (c54536xMLDjBIcL5 = c54536xMLIsConnected3.djBIcL()) == null || (safeString$default4 = C54536xML.toSafeString$default(c54536xMLDjBIcL5, false, 1, null)) == null) {
                            }
                        }
                        xMS xmsCopydefault3 = c55887xsS.copydefault();
                        if (xmsCopydefault3 == null) {
                            safeString$default5 = "";
                        } else {
                            java.lang.String maxPx2 = stgyParam.getMaxPx();
                            if (maxPx2 == null) {
                                maxPx2 = "";
                            }
                            C54536xML c54536xMLAYXKKw5 = xmsCopydefault3.AYXKKw(maxPx2);
                            if (c54536xMLAYXKKw5 == null || (c54536xMLIsConnected2 = c54536xMLAYXKKw5.isConnected()) == null || (c54536xMLDjBIcL4 = c54536xMLIsConnected2.djBIcL()) == null || (safeString$default5 = C54536xML.toSafeString$default(c54536xMLDjBIcL4, false, 1, null)) == null) {
                            }
                        }
                        arrayList5.add(new BotRecommendDetailItem(C33070mpX.AYXKKw(C55688xof.Application.getCallerContract) + " (" + c55887xsS.DbNXlk() + ")", C33069mpW.copydefault(C55688xof.Application.addOnNewIntentListener, C56424yEw.gEmmrt(C56390yDp.OLrzqt("minLevel", safeString$default4), C56390yDp.OLrzqt("maxLevel", safeString$default5))), (java.lang.String) null, 0, (FontStyleBean) null, 28, (DefaultConstructorMarker) null));
                        java.lang.String strAYXKKw15 = C33070mpX.AYXKKw(C55688xof.Application.getCallerInput);
                        java.lang.String gridNum2 = stgyParam.getGridNum();
                        arrayList5.add(new BotRecommendDetailItem(strAYXKKw15, xmr5.copydefault(gridNum2 == null ? "" : gridNum2), (java.lang.String) null, 0, (FontStyleBean) null, 28, (DefaultConstructorMarker) null));
                        return arrayList5;
                    }
                    break;
            }
        }
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.util.List<SmartRecommendResp> KWHzl(@NotNull java.util.List<SmartRecommendResp> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (SmartRecommendResp smartRecommendResp : list) {
            smartRecommendResp.setRecommendTitle(OLrzqt(smartRecommendResp, smartRecommendResp.getAlgoOrdType()));
            smartRecommendResp.setDetailItems(KWHzl(smartRecommendResp, smartRecommendResp.getAlgoOrdType()));
            arrayList.add(smartRecommendResp);
        }
        return arrayList;
    }
}
