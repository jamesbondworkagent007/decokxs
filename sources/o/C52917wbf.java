package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.dialog.BotSmartArbiTradeTabType;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter.SmartArbiPreviewViewModel;
import com.okinc.unify_trade.biz.ArbInvestDetailsItems;
import com.okinc.unify_trade.biz.ArbitrageCostVo;
import com.okinc.unify_trade.biz.ArbitrageGainVo;
import com.okinc.unify_trade.biz.ArbitrageInfoResponse;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.CostVo;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.EstimatedApyVo;
import com.okinc.unify_trade.biz.EstimatedClosePnlVo;
import com.okinc.unify_trade.biz.EstimatedStakingVo;
import com.okinc.unify_trade.biz.GainVo;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.LmtOrderNumber;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.SmartArbListItem;
import com.okinc.unify_trade.biz.SmartArbPlanLeg;
import com.okinc.unify_trade.biz.SmartArbitrageVo;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingParam;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.bot.data.SmartArbProfitsInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wbf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52917wbf extends AbstractC49945uyC<uZC, SmartArbiPreviewViewModel> {
    public EntrySignalOrderAmtParam AhwBna;
    public boolean AkhnZx;
    public C47976uAj<BotSmartArbiTradeTabType> DbNXlk;
    public wYF djBIcL;
    public java.lang.String gEmmrt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public final int AYXKKw = C48033uCm.Activity.DeEinT;
    public java.lang.String KWHzl = "";
    public java.lang.String valueOf = "";
    public java.lang.String copydefault = "";
    public java.lang.String OLrzqt = "";

    public static final boolean KWHzl(android.view.View view) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.AYXKKw;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX INFO: renamed from: o.wbf$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wbf.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX WARN: Removed duplicated region for block: B:88:0x0135  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ArbitrageInfoResponse KWHzl(@NotNull BotVo botVo, TacticsData tacticsData) {
            ArbitrageTotalPnlInfo arbitrageTotalPnlInfo;
            java.util.ArrayList arrayList;
            java.lang.String str;
            SmartArbProfitsInfo smartArbProfitsInfo;
            SmartArbProfitsInfo smartArbProfitsInfo2;
            ProfitDetailResponse autoStakingProfit;
            SmartArbProfitsInfo smartArbProfitsInfo3;
            ProfitDetailResponse autoStakingProfit2;
            ProfitDetailResponse quote;
            SmartArbProfitsInfo smartArbProfitsInfo4;
            ProfitDetailResponse autoStakingProfit3;
            SmartArbProfitsInfo smartArbProfitsInfo5;
            SmartArbProfitsInfo smartArbProfitsInfo6;
            SmartArbProfitsInfo smartArbProfitsInfo7;
            ProfitDetailResponse stakingProfit;
            SmartArbProfitsInfo smartArbProfitsInfo8;
            ProfitDetailResponse stakingProfit2;
            ProfitDetailResponse quote2;
            SmartArbProfitsInfo smartArbProfitsInfo9;
            ProfitDetailResponse stakingProfit3;
            java.util.ArrayList<SmartArbListItem> arbList;
            SmartArbListItem smartArbListItem;
            java.util.ArrayList<SmartArbPlanLeg> planLeg;
            java.lang.Object next;
            java.util.ArrayList<SmartArbListItem> arbList2;
            SmartArbListItem smartArbListItem2;
            java.util.ArrayList<SmartArbPlanLeg> planLeg2;
            java.util.List<SmartArbPlanLeg> listAhwBna;
            Intrinsics.checkNotNullParameter(botVo, "");
            java.lang.String totalAmt = tacticsData != null ? tacticsData.getTotalAmt() : null;
            java.lang.String str2 = totalAmt == null ? "" : totalAmt;
            if (tacticsData == null || (arbitrageTotalPnlInfo = tacticsData.getArbitrageTotalPnlInfo()) == null) {
                arbitrageTotalPnlInfo = new ArbitrageTotalPnlInfo((java.lang.String) null, (java.lang.String) null, (ArbitrageGainVo) null, (ArbitrageCostVo) null, (java.lang.String) null, (java.lang.String) null, 63, (DefaultConstructorMarker) null);
            }
            ArbitrageTotalPnlInfo arbitrageTotalPnlInfo2 = arbitrageTotalPnlInfo;
            if (tacticsData == null || (arbList2 = tacticsData.getArbList()) == null || (smartArbListItem2 = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList2)) == null || (planLeg2 = smartArbListItem2.getPlanLeg()) == null || (listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) planLeg2, 2)) == null) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
                for (SmartArbPlanLeg smartArbPlanLeg : listAhwBna) {
                    arrayList.add(new ArbInvestDetailsItems(smartArbPlanLeg != null ? smartArbPlanLeg.getInstType() : null, smartArbPlanLeg != null ? smartArbPlanLeg.getAmt() : null, smartArbPlanLeg != null ? smartArbPlanLeg.getLever() : null));
                }
            }
            java.util.List listAhwBna2 = arrayList == null ? yDY.AhwBna() : arrayList;
            SmartArbitrageVo smartArbitrage = botVo.getSmartArbitrage();
            java.lang.String enlargedAmt = smartArbitrage != null ? smartArbitrage.getEnlargedAmt() : null;
            java.lang.String str3 = enlargedAmt == null ? "" : enlargedAmt;
            SmartArbitrageVo smartArbitrage2 = botVo.getSmartArbitrage();
            java.lang.String interestDebt = smartArbitrage2 != null ? smartArbitrage2.getInterestDebt() : null;
            java.lang.String str4 = interestDebt == null ? "" : interestDebt;
            if (tacticsData == null || (arbList = tacticsData.getArbList()) == null || (smartArbListItem = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList)) == null || (planLeg = smartArbListItem.getPlanLeg()) == null) {
                str = "";
            } else {
                java.util.Iterator<T> it = planLeg.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    SmartArbPlanLeg smartArbPlanLeg2 = (SmartArbPlanLeg) next;
                    if (Intrinsics.EZpvd((java.lang.Object) smartArbPlanLeg2.getInstType(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) smartArbPlanLeg2.getInstType(), (java.lang.Object) "MARGIN")) {
                        break;
                    }
                }
                SmartArbPlanLeg smartArbPlanLeg3 = (SmartArbPlanLeg) next;
                if (smartArbPlanLeg3 != null) {
                    java.lang.String strAEQbTJ = C56107xwa.AEQbTJ(smartArbPlanLeg3);
                    java.lang.String instType = smartArbPlanLeg3.getInstType();
                    java.lang.String str5 = instType == null ? "" : instType;
                    java.lang.String instId = smartArbPlanLeg3.getInstId();
                    java.lang.String botAmount$default = C56033xvF.getBotAmount$default(str5, instId == null ? "" : instId, strAEQbTJ, null, false, null, 56, null);
                    if (!C33129mqd.AEQbTJ(strAEQbTJ, 0)) {
                        botAmount$default = null;
                    }
                    if (botAmount$default == null) {
                        botAmount$default = "";
                    }
                    str = botAmount$default;
                }
            }
            java.lang.String estimated = (tacticsData == null || (smartArbProfitsInfo9 = tacticsData.getSmartArbProfitsInfo()) == null || (stakingProfit3 = smartArbProfitsInfo9.getStakingProfit()) == null) ? null : stakingProfit3.getEstimated();
            java.lang.String str6 = estimated == null ? "" : estimated;
            java.lang.String ccy = (tacticsData == null || (smartArbProfitsInfo8 = tacticsData.getSmartArbProfitsInfo()) == null || (stakingProfit2 = smartArbProfitsInfo8.getStakingProfit()) == null || (quote2 = stakingProfit2.getQuote()) == null) ? null : quote2.getCcy();
            java.lang.String str7 = ccy == null ? "" : ccy;
            java.lang.String ccy2 = (tacticsData == null || (smartArbProfitsInfo7 = tacticsData.getSmartArbProfitsInfo()) == null || (stakingProfit = smartArbProfitsInfo7.getStakingProfit()) == null) ? null : stakingProfit.getCcy();
            java.lang.String str8 = ccy2 == null ? "" : ccy2;
            java.lang.String stakePosUsdt = (tacticsData == null || (smartArbProfitsInfo6 = tacticsData.getSmartArbProfitsInfo()) == null) ? null : smartArbProfitsInfo6.getStakePosUsdt();
            EstimatedStakingVo estimatedStakingVo = new EstimatedStakingVo(str, str6, str7, str8, stakePosUsdt == null ? "" : stakePosUsdt);
            java.lang.String autoStakingPos = (tacticsData == null || (smartArbProfitsInfo5 = tacticsData.getSmartArbProfitsInfo()) == null) ? null : smartArbProfitsInfo5.getAutoStakingPos();
            java.lang.String str9 = autoStakingPos == null ? "" : autoStakingPos;
            java.lang.String estimated2 = (tacticsData == null || (smartArbProfitsInfo4 = tacticsData.getSmartArbProfitsInfo()) == null || (autoStakingProfit3 = smartArbProfitsInfo4.getAutoStakingProfit()) == null) ? null : autoStakingProfit3.getEstimated();
            java.lang.String str10 = estimated2 == null ? "" : estimated2;
            java.lang.String ccy3 = (tacticsData == null || (smartArbProfitsInfo3 = tacticsData.getSmartArbProfitsInfo()) == null || (autoStakingProfit2 = smartArbProfitsInfo3.getAutoStakingProfit()) == null || (quote = autoStakingProfit2.getQuote()) == null) ? null : quote.getCcy();
            java.lang.String str11 = ccy3 == null ? "" : ccy3;
            java.lang.String ccy4 = (tacticsData == null || (smartArbProfitsInfo2 = tacticsData.getSmartArbProfitsInfo()) == null || (autoStakingProfit = smartArbProfitsInfo2.getAutoStakingProfit()) == null) ? null : autoStakingProfit.getCcy();
            java.lang.String str12 = ccy4 == null ? "" : ccy4;
            java.lang.String autoStakingPosUsdt = (tacticsData == null || (smartArbProfitsInfo = tacticsData.getSmartArbProfitsInfo()) == null) ? null : smartArbProfitsInfo.getAutoStakingPosUsdt();
            EstimatedStakingVo estimatedStakingVo2 = new EstimatedStakingVo(str9, str10, str11, str12, autoStakingPosUsdt == null ? "" : autoStakingPosUsdt);
            java.lang.String strValueOf = java.lang.String.valueOf(tacticsData != null ? java.lang.Boolean.valueOf(tacticsData.getDisplayMinPaybackDays()) : null);
            java.lang.String highestApyPeriod = tacticsData != null ? tacticsData.getHighestApyPeriod() : null;
            java.lang.String str13 = highestApyPeriod == null ? "" : highestApyPeriod;
            SmartArbitrageVo smartArbitrage3 = botVo.getSmartArbitrage();
            java.util.List<EstimatedApyVo> estimatedApyList = smartArbitrage3 != null ? smartArbitrage3.getEstimatedApyList() : null;
            if (estimatedApyList == null) {
                estimatedApyList = yDY.AhwBna();
            }
            java.util.List<EstimatedApyVo> list = estimatedApyList;
            SmartArbitrageVo smartArbitrage4 = botVo.getSmartArbitrage();
            CostVo openCost = smartArbitrage4 != null ? smartArbitrage4.getOpenCost() : null;
            GainVo gainVo = new GainVo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 7, (DefaultConstructorMarker) null);
            SmartArbitrageVo smartArbitrage5 = botVo.getSmartArbitrage();
            CostVo openCost2 = smartArbitrage5 != null ? smartArbitrage5.getOpenCost() : null;
            SmartArbitrageVo smartArbitrage6 = botVo.getSmartArbitrage();
            EstimatedClosePnlVo estimatedClosePnlVo = new EstimatedClosePnlVo("", gainVo, "", openCost2, smartArbitrage6 != null ? smartArbitrage6.getCloseCost() : null);
            SmartArbitrageVo smartArbitrage7 = botVo.getSmartArbitrage();
            CostVo closeCost = smartArbitrage7 != null ? smartArbitrage7.getCloseCost() : null;
            SmartArbitrageVo smartArbitrage8 = botVo.getSmartArbitrage();
            return new ArbitrageInfoResponse("", "", str2, "", "", "", arbitrageTotalPnlInfo2, "", listAhwBna2, str3, str4, estimatedStakingVo, estimatedStakingVo2, "", strValueOf, str13, (java.util.List) list, openCost, estimatedClosePnlVo, closeCost, smartArbitrage8 != null ? smartArbitrage8.getOpenCost() : null, (java.lang.String) null, (java.lang.String) null, false, 14680064, (DefaultConstructorMarker) null);
        }

        public final boolean EZpvd(@NotNull BotVo botVo, TacticsData tacticsData) {
            kotlin.Pair pairOLrzqt;
            AutoEarnStakingParam autoStaking;
            Intrinsics.checkNotNullParameter(botVo, "");
            java.lang.String status = null;
            java.lang.String instType = tacticsData != null ? tacticsData.getInstType() : null;
            if (instType == null) {
                instType = "";
            }
            java.lang.String instId = tacticsData != null ? tacticsData.getInstId() : null;
            if (instId == null) {
                instId = "";
            }
            java.lang.String strAEQbTJ = C56033xvF.AEQbTJ(instType, instId);
            BotCommon common = botVo.getCommon();
            if ((common != null ? common.getAutoStaking() : null) != null && botVo.getShouldShowAutoStake()) {
                BotCommon common2 = botVo.getCommon();
                AutoEarnStakingParam autoStaking2 = common2 != null ? common2.getAutoStaking() : null;
                java.lang.String totalProfit = autoStaking2 != null ? autoStaking2.getTotalProfit() : null;
                if (totalProfit == null) {
                    totalProfit = "";
                }
                java.lang.String status2 = autoStaking2 != null ? autoStaking2.getStatus() : null;
                java.lang.String instId2 = tacticsData != null ? tacticsData.getInstId() : null;
                java.lang.String str = instId2 == null ? "" : instId2;
                java.lang.String instType2 = tacticsData != null ? tacticsData.getInstType() : null;
                pairOLrzqt = C55884xsP.formatAutoStake$default(totalProfit, status2, str, instType2 == null ? "" : instType2, strAEQbTJ, null, 32, null);
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(null, 0);
            }
            java.lang.String str2 = (java.lang.String) pairOLrzqt.component1();
            ((java.lang.Number) pairOLrzqt.component2()).intValue();
            BotCommon common3 = botVo.getCommon();
            if (common3 != null && (autoStaking = common3.getAutoStaking()) != null) {
                status = autoStaking.getStatus();
            }
            return C33129mqd.OLrzqt((java.lang.CharSequence) str2) && !Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) "default") && C33129mqd.OLrzqt((java.lang.CharSequence) status);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean OLrzqt(@NotNull BotVo botVo, TacticsData tacticsData) {
            java.lang.String totalProfit;
            BotCommon common;
            AutoEarnStakingParam autoEarn;
            AutoEarnStakingParam autoEarn2;
            Intrinsics.checkNotNullParameter(botVo, "");
            BotCommon common2 = botVo.getCommon();
            java.lang.String status = (common2 == null || (autoEarn2 = common2.getAutoEarn()) == null) ? null : autoEarn2.getStatus();
            if (botVo.getShouldShowAutoEarn()) {
                BotCommon common3 = botVo.getCommon();
                if ((common3 != null ? common3.getAutoEarn() : null) != null && (common = botVo.getCommon()) != null && (autoEarn = common.getAutoEarn()) != null) {
                    totalProfit = autoEarn.getTotalProfit();
                }
            } else {
                totalProfit = null;
            }
            return C56068xvo.copydefault.copydefault(totalProfit, status, tacticsData != null ? java.lang.Boolean.valueOf(tacticsData.getHistory()) : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r83v0, types: [java.util.List] */
        public final StrategyConfigInfo copydefault(@NotNull BotVo botVo, TacticsData tacticsData) {
            java.util.ArrayList arrayListCopydefault;
            BotVo bot;
            SmartArbitrageVo smartArbitrage;
            ProfitDetailResponse autoStakingProfit;
            ProfitDetailResponse quote;
            BotVo bot2;
            BotCommon common;
            AutoEarnStakingParam autoEarn;
            BotVo bot3;
            SmartArbitrageVo smartArbitrage2;
            ProfitDetailResponse autoStakingProfit2;
            BotVo bot4;
            SmartArbitrageVo smartArbitrage3;
            ProfitDetailResponse autoStakingProfit3;
            Intrinsics.checkNotNullParameter(botVo, "");
            java.lang.Object objCopydefault = null;
            if (OLrzqt(botVo, tacticsData)) {
                AutoEarnStakingConfig[] autoEarnStakingConfigArr = new AutoEarnStakingConfig[1];
                java.lang.String totalProfit = (tacticsData == null || (bot2 = tacticsData.getBot()) == null || (common = bot2.getCommon()) == null || (autoEarn = common.getAutoEarn()) == null) ? null : autoEarn.getTotalProfit();
                java.lang.String str = totalProfit == null ? "" : totalProfit;
                java.lang.String ccy = (tacticsData == null || (bot = tacticsData.getBot()) == null || (smartArbitrage = bot.getSmartArbitrage()) == null || (autoStakingProfit = smartArbitrage.getAutoStakingProfit()) == null || (quote = autoStakingProfit.getQuote()) == null) ? null : quote.getCcy();
                autoEarnStakingConfigArr[0] = new AutoEarnStakingConfig("0", "0", str, ccy == null ? "" : ccy, false);
                arrayListCopydefault = yDY.copydefault(autoEarnStakingConfigArr);
            } else {
                arrayListCopydefault = null;
            }
            if (EZpvd(botVo, tacticsData)) {
                AutoEarnStakingConfig[] autoEarnStakingConfigArr2 = new AutoEarnStakingConfig[1];
                java.lang.String apy = (tacticsData == null || (bot4 = tacticsData.getBot()) == null || (smartArbitrage3 = bot4.getSmartArbitrage()) == null || (autoStakingProfit3 = smartArbitrage3.getAutoStakingProfit()) == null) ? null : autoStakingProfit3.getApy();
                java.lang.String str2 = apy == null ? "" : apy;
                if (tacticsData != null && (bot3 = tacticsData.getBot()) != null && (smartArbitrage2 = bot3.getSmartArbitrage()) != null && (autoStakingProfit2 = smartArbitrage2.getAutoStakingProfit()) != null) {
                    objCopydefault = autoStakingProfit2.getCcy();
                }
                autoEarnStakingConfigArr2[0] = new AutoEarnStakingConfig("0", "0", str2, objCopydefault == null ? "" : objCopydefault, false);
                objCopydefault = yDY.copydefault(autoEarnStakingConfigArr2);
            }
            return new StrategyConfigInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (LmtOrderNumber) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnConfig) null, (java.lang.String) null, (java.util.List) arrayListCopydefault, (java.util.List) objCopydefault, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 100351, (DefaultConstructorMarker) null);
        }

        public final C52917wbf KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, boolean z, boolean z2, boolean z3, java.lang.Float f, boolean z4, boolean z5, java.lang.String str9, StrategyDetailsResponse strategyDetailsResponse, ArbitrageInfoResponse arbitrageInfoResponse, StrategyConfigInfo strategyConfigInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            C52917wbf c52917wbf = new C52917wbf();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("bot_inst_id", str);
            bundle.putString("bot_inst_type", str2);
            bundle.putString("inst_family_params", str3);
            bundle.putString("algoId", str4);
            bundle.putString("unit_params", str5);
            bundle.putString("total_amt_params", str6);
            bundle.putString("from_params", str7);
            bundle.putString("query_scene_params", str8);
            bundle.putBoolean("is_leverage_supported_params", z);
            bundle.putBoolean("is_leverage_selected_params", z2);
            bundle.putBoolean("is_leverage_params", z3);
            bundle.putFloat("leverage_principal_params", f != null ? f.floatValue() : 1.0f);
            bundle.putBoolean("is_stake_supported_params", z4);
            bundle.putBoolean("is_staking_params", z5);
            bundle.putString("spread_ratio_params", str9);
            bundle.putParcelable("bot_detail_params", strategyDetailsResponse);
            bundle.putParcelable("multi_min_amount_item_params", arbitrageInfoResponse);
            bundle.putParcelable("strategy_config_info_params", strategyConfigInfo);
            c52917wbf.setArguments(bundle);
            return c52917wbf;
        }
    }

    /* JADX INFO: renamed from: o.wbf$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C52917wbf AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C52917wbf c52917wbf) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c52917wbf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.wbf$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C52917wbf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C52917wbf c52917wbf) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c52917wbf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.ejfBZ();
            }
        }
    }

    /* JADX INFO: renamed from: o.wbf$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C52917wbf KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52917wbf c52917wbf) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c52917wbf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.fIwbmz();
            }
        }
    }

    /* JADX INFO: renamed from: o.wbf$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C52917wbf EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C52917wbf c52917wbf) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c52917wbf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.ejfBZ();
            }
        }
    }

    @Override // o.AbstractC49945uyC, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.gEmmrt = arguments != null ? arguments.getString("query_scene_params") : null;
        android.os.Bundle arguments2 = getArguments();
        this.KWHzl = arguments2 != null ? arguments2.getString("inst_id_params") : null;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(5);
        wxq.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.aeJQwa));
        wxq.KWHzl().setVisibility(8);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setDividerVisibility(false);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new TaskDescription(imageViewKWHzl, 1000L, this));
    }

    private final boolean fJNWhG() {
        return Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) "open");
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.djBIcL = wyf;
        if (fJNWhG()) {
            wyf.setType(14);
            wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0));
            wyf.setSecondaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.OqhRBMiKdSzF));
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setEnabled(true);
            }
            C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setOKDSType(259);
            }
            C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
            if (c52794wYpCopydefault3 != null) {
                c52794wYpCopydefault3.setOnClickListener(new Application(c52794wYpCopydefault3, 1000L, this));
            }
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setOKDSType(260);
            }
            C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ2 != null) {
                c52794wYpAEQbTJ2.setOnClickListener(new ActionBar(c52794wYpAEQbTJ2, 1000L, this));
                return;
            }
            return;
        }
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ));
        wyf.setOnClickListener(new Activity(wyf, 1000L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fIwbmz() {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            Unit unit = Unit.INSTANCE;
            supportFragmentManager.setFragmentResult("preview_close_order", bundle);
        }
        dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        isConnected();
        fARcdN();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final void isConnected() {
        android.os.Bundle arguments = getArguments();
        this.KWHzl = arguments != null ? arguments.getString("bot_inst_id") : null;
        android.os.Bundle arguments2 = getArguments();
        this.valueOf = arguments2 != null ? arguments2.getString("bot_inst_type") : null;
        android.os.Bundle arguments3 = getArguments();
        this.copydefault = arguments3 != null ? arguments3.getString("algoId") : null;
        android.os.Bundle arguments4 = getArguments();
        this.OLrzqt = arguments4 != null ? arguments4.getString(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) : null;
        android.os.Bundle arguments5 = getArguments();
        this.AkhnZx = arguments5 != null ? arguments5.getBoolean(OtcExtraKeys.MODE) : false;
        android.os.Bundle arguments6 = getArguments();
        this.AhwBna = arguments6 != null ? (EntrySignalOrderAmtParam) arguments6.getParcelable("data") : null;
    }

    private final void fARcdN() {
        AuCTel();
    }

    public final java.util.List<BotSmartArbiTradeTabType> copydefault() {
        return yDY.gEmmrt(BotSmartArbiTradeTabType.POSITION, BotSmartArbiTradeTabType.PROFITLOSS);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void AuCTel() {
        uZC uzcValues = values();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        java.util.List<BotSmartArbiTradeTabType> listCopydefault = copydefault();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        C47976uAj<BotSmartArbiTradeTabType> c47976uAj = new C47976uAj<>(childFragmentManager, listCopydefault, lifecycle, C56390yDp.OLrzqt(OLrzqt().EZpvd(), getArguments()));
        this.DbNXlk = c47976uAj;
        uzcValues.EZpvd.setAdapter(c47976uAj);
        uzcValues.EZpvd.setUserInputEnabled(false);
        android.view.View childAt = uzcValues.EZpvd.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
        ViewPager2 viewPager2 = uzcValues.EZpvd;
        android.os.Bundle arguments = getArguments();
        viewPager2.setCurrentItem(Intrinsics.EZpvd((java.lang.Object) (arguments != null ? arguments.getString("from_params") : null), (java.lang.Object) "from_pnl") ? 1 : 0, false);
        new TabLayoutMediator(uzcValues.KWHzl, uzcValues.EZpvd, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.wbh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C52917wbf.OLrzqt(this.copydefault, tab, i);
            }
        }).attach();
    }

    public static final void OLrzqt(C52917wbf c52917wbf, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.wbd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C52917wbf.KWHzl(view);
            }
        });
        BotSmartArbiTradeTabType botSmartArbiTradeTabType = c52917wbf.copydefault().get(i);
        tab.setText(BotSmartArbiTradeTabType.Companion.KWHzl(botSmartArbiTradeTabType));
        tab.setContentDescription(botSmartArbiTradeTabType.name() + "Tab");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ejfBZ() {
        dismissAllowingStateLoss();
    }
}
