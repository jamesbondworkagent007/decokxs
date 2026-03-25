package com.okinc.tradingbot.impl.strategy.dialog.ui;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.constant.TacticsForbiddenFunctions;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.util.TacticsListButtonItem;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C48168uHm;
import o.C53809wsW;
import o.C55688xof;
import o.C55875xsG;
import o.C55998xuX;
import o.C56390yDp;
import o.C56403yEb;
import o.C56423yEv;
import o.pUU;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotMoreOperatorPresenter extends AbsPresenter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotMoreOperatorPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [52=11] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x07d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<C53809wsW> OLrzqt(@NotNull TacticsData tacticsData, boolean z) {
        BotCommon common;
        List<TacticsListButtonItem> extraOperatorList;
        boolean z2;
        String str;
        String strAYXKKw;
        List<TacticsListButtonItem> extraOperatorList2;
        List<TacticsListButtonItem> extraOperatorList3;
        Intrinsics.checkNotNullParameter(tacticsData, "");
        ArrayList arrayList = new ArrayList();
        String orderType = tacticsData.getOrderType();
        int size = 0;
        switch (orderType.hashCode()) {
            case -1831183611:
                if (orderType.equals("spot_dca")) {
                    arrayList.addAll(C48168uHm.EZpvd.KWHzl(tacticsData, z));
                }
                break;
            case -1418042064:
                if (orderType.equals("ai_bot")) {
                    arrayList.addAll(C48168uHm.EZpvd.AEQbTJ(tacticsData));
                }
                break;
            case -1402017003:
                if (orderType.equals("contract_dca")) {
                    arrayList.addAll(C48168uHm.EZpvd.copydefault(tacticsData, z));
                }
                break;
            case -1216369070:
                if (orderType.equals("smart_portfolio")) {
                    List<TacticsListButtonItem> extraOperatorList4 = tacticsData.getExtraOperatorList();
                    if (extraOperatorList4 != null) {
                        for (TacticsListButtonItem tacticsListButtonItem : extraOperatorList4) {
                            arrayList.add(new C53809wsW(tacticsListButtonItem.AEQbTJ(), tacticsListButtonItem.EZpvd(), null, null, null, null, 60, null));
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
                break;
            case -1148661171:
                if (orderType.equals("smart_iceberg") && (extraOperatorList = tacticsData.getExtraOperatorList()) != null) {
                    for (TacticsListButtonItem tacticsListButtonItem2 : extraOperatorList) {
                        arrayList.add(new C53809wsW(tacticsListButtonItem2.AEQbTJ(), tacticsListButtonItem2.EZpvd(), null, null, null, null, 60, null));
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                break;
            case -1086683216:
                if (orderType.equals("signal_bot")) {
                    List<TacticsListButtonItem> extraOperatorList5 = tacticsData.getExtraOperatorList();
                    if (extraOperatorList5 != null) {
                        for (TacticsListButtonItem tacticsListButtonItem3 : extraOperatorList5) {
                            arrayList.add(new C53809wsW(tacticsListButtonItem3.AEQbTJ(), tacticsListButtonItem3.EZpvd(), null, null, null, null, 60, null));
                        }
                        Unit unit3 = Unit.INSTANCE;
                    }
                    arrayList.add(new C53809wsW("strategy_button_edit_trading_pairs", false, null, null, null, null, 62, null));
                    if (z) {
                        arrayList.add(new C53809wsW("strategy_button_adjust_margin", false, null, null, null, null, 62, null));
                        arrayList.add(new C53809wsW("strategy_button_tpsl", false, null, null, null, null, 62, null));
                    } else {
                        arrayList.add(new C53809wsW("strategy_button_tpsl", false, null, null, null, null, 62, null));
                        arrayList.add(new C53809wsW("strategy_button_stop", false, null, null, null, null, 62, null));
                    }
                }
                break;
            case -557961837:
                if (orderType.equals("smart_arbitrage")) {
                }
                break;
            case -512749997:
                if (orderType.equals("contract_grid")) {
                    if (Intrinsics.EZpvd((Object) tacticsData.getCopyType(), (Object) "2")) {
                        List<TacticsListButtonItem> extraOperatorList6 = tacticsData.getExtraOperatorList();
                        if (extraOperatorList6 != null) {
                            for (TacticsListButtonItem tacticsListButtonItem4 : extraOperatorList6) {
                                arrayList.add(new C53809wsW(tacticsListButtonItem4.AEQbTJ(), tacticsListButtonItem4.EZpvd(), null, null, null, null, 60, null));
                            }
                            Unit unit4 = Unit.INSTANCE;
                        }
                    } else {
                        if (Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "pending_signal") || Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "running")) {
                            boolean zIsFunctionForbidden = tacticsData.isFunctionForbidden(TacticsForbiddenFunctions.EditParameters);
                            arrayList.add(new C53809wsW("strategy_edit_price_range", !zIsFunctionForbidden, zIsFunctionForbidden ? C33070mpX.AYXKKw(C55688xof.Application.HrFqwD) : "", null, null, null, 56, null));
                        }
                        TacticsVoucherInfo voucherInfo = tacticsData.getVoucherInfo();
                        boolean z3 = voucherInfo != null && voucherInfo.getHasVoucher();
                        if (Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "pending_signal") || Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "no_close_position")) {
                            arrayList.add(new C53809wsW("strategy_button_adjust_margin", false, null, null, null, null, 62, null));
                        }
                        if (Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "pending_signal") || Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "running")) {
                            List<Integer> strategyTags = tacticsData.getStrategyTags();
                            if (strategyTags == null) {
                                strategyTags = yDY.AhwBna();
                            }
                            boolean zContains = strategyTags.contains(0);
                            if (strategyTags.isEmpty()) {
                                z2 = false;
                                boolean z4 = (zContains || z2 || tacticsData.isFunctionForbidden(TacticsForbiddenFunctions.IncreasePosition)) ? false : true;
                                if (!z3) {
                                    strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.HrFqwD);
                                } else if (zContains) {
                                    strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.OStAOF);
                                } else if (z2) {
                                    strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.idLUrz);
                                } else {
                                    str = "";
                                    arrayList.add(new C53809wsW("strategy_button_add_investment", z4, str, null, null, null, 56, null));
                                    arrayList.add(new C53809wsW("strategy_button_adjust_withdrawal", true, null, null, null, null, 60, null));
                                }
                                str = strAYXKKw;
                                arrayList.add(new C53809wsW("strategy_button_add_investment", z4, str, null, null, null, 56, null));
                                arrayList.add(new C53809wsW("strategy_button_adjust_withdrawal", true, null, null, null, null, 60, null));
                            } else {
                                Iterator<T> it = strategyTags.iterator();
                                while (it.hasNext()) {
                                    if (TacticsUiConst.Activity.copydefault.EZpvd().contains(Integer.valueOf(((Number) it.next()).intValue()))) {
                                        z2 = true;
                                        if (zContains) {
                                            if (!z3) {
                                            }
                                            str = strAYXKKw;
                                            arrayList.add(new C53809wsW("strategy_button_add_investment", z4, str, null, null, null, 56, null));
                                            arrayList.add(new C53809wsW("strategy_button_adjust_withdrawal", true, null, null, null, null, 60, null));
                                        }
                                    }
                                }
                                z2 = false;
                                if (zContains) {
                                }
                            }
                        }
                        if (!Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "no_close_position")) {
                            if (AEQbTJ(tacticsData)) {
                                arrayList.add(new C53809wsW("strategy_modify_start_condition", false, null, null, null, null, 62, null));
                            }
                            arrayList.add(new C53809wsW("strategy_modify_stop_condition", copydefault(tacticsData), null, null, null, null, 60, null));
                        }
                        if (tacticsData.isTriggerContainsWebHook()) {
                            arrayList.add(new C53809wsW("strategy_button_trading_view_signal", false, null, null, null, null, 62, null));
                        }
                        arrayList.add(new C53809wsW("strategy_button_tpsl", !tacticsData.isFunctionForbidden(TacticsForbiddenFunctions.Tpsl), z3 ? C33070mpX.AYXKKw(C55688xof.Application.HrFqwD) : "", null, null, null, 56, null));
                        arrayList.add(new C53809wsW("strategy_button_recreate", false, null, null, null, null, 62, null));
                        if (!Intrinsics.EZpvd((Object) tacticsData.getDirection(), (Object) "neutral")) {
                            arrayList.add(new C53809wsW("reverse_bot", false, null, null, null, null, 62, null));
                        }
                        arrayList.add(new C53809wsW("view_on_kline", false, null, null, null, null, 62, null));
                        if (!Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "no_close_position")) {
                            arrayList.add(new C53809wsW("strategy_button_stop", false, null, null, null, null, 62, null));
                        }
                        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((C53809wsW) it2.next()).OLrzqt());
                        }
                        List<TacticsListButtonItem> extraOperatorList7 = tacticsData.getExtraOperatorList();
                        if (extraOperatorList7 != null) {
                            for (TacticsListButtonItem tacticsListButtonItem5 : extraOperatorList7) {
                                if (!arrayList2.contains(tacticsListButtonItem5.AEQbTJ())) {
                                    arrayList.add(0, new C53809wsW(tacticsListButtonItem5.AEQbTJ(), tacticsListButtonItem5.EZpvd(), null, null, null, null, 60, null));
                                }
                            }
                            Unit unit5 = Unit.INSTANCE;
                        }
                    }
                }
                break;
            case 3181382:
                if (orderType.equals("grid")) {
                    if (Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "grid")) {
                        if (Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "pause")) {
                            BotVo bot = tacticsData.getBot();
                            boolean zEZpvd = Intrinsics.EZpvd((Object) (bot != null ? bot.getCompliancePauseDisplayType() : null), (Object) "compliancePause");
                            BotVo bot2 = tacticsData.getBot();
                            arrayList.add(new C53809wsW("resume", !zEZpvd, Intrinsics.EZpvd((Object) (bot2 != null ? bot2.getCompliancePauseDisplayType() : null), (Object) "compliancePause") ? C33070mpX.AYXKKw(C55688xof.Application.getPlaybackSpeed) : "", null, null, null, 56, null));
                        }
                        if (!EZpvd(tacticsData)) {
                            TacticsVoucherInfo voucherInfo2 = tacticsData.getVoucherInfo();
                            if (voucherInfo2 != null && voucherInfo2.getHasVoucher()) {
                                arrayList.add(new C53809wsW("pause", EZpvd(tacticsData), C33070mpX.AYXKKw(C55688xof.Application.HrFqwD), null, null, null, 56, null));
                            }
                        } else if (OLrzqt(tacticsData)) {
                            arrayList.add(new C53809wsW("pause", OLrzqt(tacticsData), null, null, null, null, 60, null));
                        }
                    }
                    List<TacticsListButtonItem> extraOperatorList8 = tacticsData.getExtraOperatorList();
                    if (extraOperatorList8 != null) {
                        for (TacticsListButtonItem tacticsListButtonItem6 : extraOperatorList8) {
                            arrayList.add(new C53809wsW(tacticsListButtonItem6.AEQbTJ(), tacticsListButtonItem6.EZpvd(), Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "pause") ? C33070mpX.AYXKKw(C55688xof.Application.getBitmap) : "", null, tacticsData.getState(), null, 40, null));
                        }
                        Unit unit6 = Unit.INSTANCE;
                    }
                    if (Intrinsics.EZpvd((Object) tacticsData.getCopyType(), (Object) "2")) {
                        Unit unit7 = Unit.INSTANCE;
                    } else {
                        if (Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "grid")) {
                            boolean zIsFunctionForbidden2 = tacticsData.isFunctionForbidden(TacticsForbiddenFunctions.WithdrawProfits);
                            arrayList.add(new C53809wsW("strategy_button_adjust_withdrawal", !zIsFunctionForbidden2, zIsFunctionForbidden2 ? C33070mpX.AYXKKw(C55688xof.Application.HrFqwD) : "", null, null, null, 56, null));
                            boolean zOLrzqt = C33129mqd.OLrzqt((CharSequence) tacticsData.getSourceCcy());
                            boolean zIsFunctionForbidden3 = tacticsData.isFunctionForbidden(TacticsForbiddenFunctions.EditParameters);
                            if (!zOLrzqt && !Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "pending_signal")) {
                                arrayList.add(new C53809wsW("strategy_edit_price_range", !zIsFunctionForbidden3, zIsFunctionForbidden3 ? Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "pause") ? C33070mpX.AYXKKw(C55688xof.Application.getBitmap) : C33070mpX.AYXKKw(C55688xof.Application.HrFqwD) : "", null, null, null, 56, null));
                            }
                            boolean zIsFunctionForbidden4 = tacticsData.isFunctionForbidden(TacticsForbiddenFunctions.ModifySimpleEarn);
                            if (tacticsData.getShouldShowEarn()) {
                                arrayList.add(new C53809wsW("modify_active_grid_range", !zIsFunctionForbidden4, zIsFunctionForbidden4 ? C33070mpX.AYXKKw(C55688xof.Application.HrFqwD) : "", null, null, null, 56, null));
                            }
                        }
                        if (AEQbTJ(tacticsData)) {
                            arrayList.add(new C53809wsW("strategy_modify_start_condition", false, null, null, null, null, 62, null));
                        }
                        if (Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "grid")) {
                            arrayList.add(new C53809wsW("strategy_modify_stop_condition", copydefault(tacticsData), null, null, null, null, 60, null));
                        }
                        if (tacticsData.isTriggerContainsWebHook()) {
                            arrayList.add(new C53809wsW("strategy_button_trading_view_signal", false, null, null, null, null, 62, null));
                        }
                        boolean zIsFunctionForbidden5 = tacticsData.isFunctionForbidden(TacticsForbiddenFunctions.Tpsl);
                        arrayList.add(new C53809wsW("strategy_button_tpsl", !zIsFunctionForbidden5, zIsFunctionForbidden5 ? C33070mpX.AYXKKw(C55688xof.Application.HrFqwD) : "", null, null, null, 56, null));
                        if (!C55998xuX.copydefault.KWHzl().contains(tacticsData.getOrderType())) {
                            arrayList.add(new C53809wsW("strategy_button_recreate", false, null, null, null, null, 62, null));
                        }
                        arrayList.add(new C53809wsW("view_on_kline", false, null, null, null, null, 62, null));
                        arrayList.add(new C53809wsW("strategy_button_stop", false, null, null, null, null, 62, null));
                    }
                }
                break;
            case 3573234:
                if (orderType.equals("twap") && (extraOperatorList2 = tacticsData.getExtraOperatorList()) != null) {
                    for (TacticsListButtonItem tacticsListButtonItem7 : extraOperatorList2) {
                        arrayList.add(new C53809wsW(tacticsListButtonItem7.AEQbTJ(), tacticsListButtonItem7.EZpvd(), null, null, null, null, 60, null));
                    }
                    Unit unit8 = Unit.INSTANCE;
                }
                break;
            case 1165749981:
                if (orderType.equals("recurring")) {
                    if (!tacticsData.getHistory()) {
                        boolean z5 = !(Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "stopping") || Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "stopped"));
                        arrayList.add(new C53809wsW("recurring_invest_more", z5, null, null, null, null, 60, null));
                        arrayList.add(new C53809wsW("recurring_modify_amount", z5, null, null, null, null, 60, null));
                        arrayList.add(new C53809wsW("recurring_modify_frequency", z5, null, null, null, null, 60, null));
                        arrayList.add(new C53809wsW("recurring_modify_price_range", z5, null, null, null, null, 60, null));
                    }
                    List<TacticsListButtonItem> extraOperatorList9 = tacticsData.getExtraOperatorList();
                    if (extraOperatorList9 != null) {
                        for (TacticsListButtonItem tacticsListButtonItem8 : extraOperatorList9) {
                            arrayList.add(new C53809wsW(tacticsListButtonItem8.AEQbTJ(), tacticsListButtonItem8.EZpvd(), null, null, null, null, 60, null));
                        }
                        Unit unit9 = Unit.INSTANCE;
                    }
                }
                break;
            case 1485620813:
                if (orderType.equals("dcd_bot") && (extraOperatorList3 = tacticsData.getExtraOperatorList()) != null) {
                    for (TacticsListButtonItem tacticsListButtonItem9 : extraOperatorList3) {
                        arrayList.add(new C53809wsW(tacticsListButtonItem9.AEQbTJ(), tacticsListButtonItem9.EZpvd(), null, null, null, null, 60, null));
                    }
                    Unit unit10 = Unit.INSTANCE;
                }
                break;
        }
        if (!z && !tacticsData.getHistory()) {
            BotVo bot3 = tacticsData.getBot();
            if ((bot3 != null ? bot3.getBacktest() : null) == null) {
                BotVo bot4 = tacticsData.getBot();
                if (bot4 == null || (common = bot4.getCommon()) == null || !common.isPinned()) {
                    arrayList.add(0, new C53809wsW("pin", C55875xsG.copydefault.copydefault() < 5, C33069mpW.copydefault(C55688xof.Application.viewModels, C56423yEv.EZpvd(C56390yDp.OLrzqt("max", "5"))), null, null, null, 56, null));
                } else {
                    arrayList.add(0, new C53809wsW("un_pin", true, null, null, null, null, 60, null));
                }
            }
        }
        if (!tacticsData.getHistory() && !Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "ai_bot")) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    size = -1;
                } else if (!Intrinsics.EZpvd((Object) ((C53809wsW) it3.next()).OLrzqt(), (Object) "strategy_button_stop")) {
                    size++;
                }
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, new C53809wsW("edit_name", true, null, null, null, null, 60, null));
        }
        return arrayList;
    }

    public final boolean AEQbTJ(TacticsData tacticsData) {
        SignParamItem signParamItem;
        Object next;
        if (!Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "pending_signal")) {
            return false;
        }
        List<SignParamItem> signParams = tacticsData.getSignParams();
        if (signParams != null) {
            Iterator<T> it = signParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((SignParamItem) next).getTriggerAction(), (Object) TtmlNode.START)) {
                    break;
                }
            }
            signParamItem = (SignParamItem) next;
        } else {
            signParamItem = null;
        }
        return Intrinsics.EZpvd((Object) (signParamItem != null ? signParamItem.getIndicator() : null), (Object) GridStartTriggerType.PRICE.getMode());
    }

    public final boolean copydefault(TacticsData tacticsData) {
        Object next;
        List<SignParamItem> signParams = tacticsData.getSignParams();
        if (signParams != null) {
            Iterator<T> it = signParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((SignParamItem) next).getTriggerAction(), (Object) "stop")) {
                    break;
                }
            }
        }
        return (Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "no_close_position") || Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "stopping") || Intrinsics.EZpvd((Object) tacticsData.getGridState(), (Object) "stop_delay_trigger") || !StringsKt__StringsKt.fARcdN((CharSequence) tacticsData.getSourceCcy())) ? false : true;
    }

    public final boolean EZpvd(TacticsData tacticsData) {
        boolean zIsFunctionForbidden = tacticsData.isFunctionForbidden(TacticsForbiddenFunctions.PauseBot);
        pUU.copydefault("getPauseEnable  isPauseBotForbidden=" + zIsFunctionForbidden);
        return !zIsFunctionForbidden;
    }

    public final boolean OLrzqt(TacticsData tacticsData) {
        boolean zIsFunctionForbidden = tacticsData.isFunctionForbidden(TacticsForbiddenFunctions.PauseBot);
        boolean zEZpvd = Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "running");
        TrailingConfig trailingDownConfig = tacticsData.getTrailingDownConfig();
        return (zIsFunctionForbidden || !zEZpvd || (trailingDownConfig != null && trailingDownConfig.getEnabled() && C33129mqd.OLrzqt((CharSequence) tacticsData.getTrailingDownFund())) || (C33129mqd.AEQbTJ(tacticsData.getProfitSharingRatio(), "0") && Intrinsics.EZpvd((Object) tacticsData.getCopyType(), (Object) "2")) || C33129mqd.OLrzqt((CharSequence) tacticsData.getSourceCcy())) ? false : true;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
