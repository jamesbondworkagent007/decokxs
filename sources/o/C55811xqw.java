package o;

import androidx.core.view.PointerIconCompat;
import com.okinc.biz.TacticsType;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.BotAggregatedInfoBean;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.GridStatistics;
import com.okinc.unify_trade.biz.LossInsuranceBean;
import com.okinc.unify_trade.biz.bot.EarnParam;
import com.okinc.unify_trade.biz.bot.RecommendParam;
import com.okinc.unify_trade.biz.bot.RecommendedParamsDto;
import com.okinc.unify_trade.biz.bot.SignParam;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.biz.bot.StrategyStatistics;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.bot.TriggerParam;
import com.okinc.unify_trade.biz.bot.VoucherInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xqw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55811xqw {

    /* JADX INFO: renamed from: o.xqw$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TacticsType.values().length];
            try {
                iArr[TacticsType.TACTICS_CONTRACT_DCA.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TacticsType.TACTICS_CONTRACT_GRID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TacticsType.TACTICS_GRDE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    public static final BotAggregatedInfoBean OLrzqt(@NotNull RecommendedParamsDto recommendedParamsDto, @NotNull TacticsType tacticsType) {
        java.util.List listAhwBna;
        StgyParam stgyParam;
        java.util.List<TriggerParam> triggerParams;
        java.util.List listAhwBna2;
        java.util.List<SignParam> signParams;
        java.util.ArrayList arrayList;
        java.util.List<SignParam> signParams2;
        EarnParam earnParam;
        EarnParam earnParam2;
        EarnParam earnParam3;
        EarnParam earnParam4;
        Intrinsics.checkNotNullParameter(recommendedParamsDto, "");
        Intrinsics.checkNotNullParameter(tacticsType, "");
        int i = Activity.AEQbTJ[tacticsType.ordinal()];
        if (i == 1) {
            RecommendParam recommendParam = recommendedParamsDto.getRecommendParam();
            java.lang.String lever = recommendParam != null ? recommendParam.getLever() : null;
            java.lang.String str = lever == null ? "" : lever;
            RecommendParam recommendParam2 = recommendedParamsDto.getRecommendParam();
            java.lang.String direction = recommendParam2 != null ? recommendParam2.getDirection() : null;
            java.lang.String str2 = direction == null ? "" : direction;
            RecommendParam recommendParam3 = recommendedParamsDto.getRecommendParam();
            java.lang.String initOrdPct = recommendParam3 != null ? recommendParam3.getInitOrdPct() : null;
            java.lang.String str3 = initOrdPct == null ? "" : initOrdPct;
            RecommendParam recommendParam4 = recommendedParamsDto.getRecommendParam();
            java.lang.String maxSafetyOrds = recommendParam4 != null ? recommendParam4.getMaxSafetyOrds() : null;
            java.lang.String str4 = maxSafetyOrds == null ? "" : maxSafetyOrds;
            RecommendParam recommendParam5 = recommendedParamsDto.getRecommendParam();
            java.lang.String tpPct = recommendParam5 != null ? recommendParam5.getTpPct() : null;
            java.lang.String str5 = tpPct == null ? "" : tpPct;
            RecommendParam recommendParam6 = recommendedParamsDto.getRecommendParam();
            java.lang.String pxSteps = recommendParam6 != null ? recommendParam6.getPxSteps() : null;
            java.lang.String str6 = pxSteps == null ? "" : pxSteps;
            RecommendParam recommendParam7 = recommendedParamsDto.getRecommendParam();
            boolean reserveFunds = recommendParam7 != null ? recommendParam7.getReserveFunds() : false;
            RecommendParam recommendParam8 = recommendedParamsDto.getRecommendParam();
            java.lang.String pxStepsMult = recommendParam8 != null ? recommendParam8.getPxStepsMult() : null;
            java.lang.String str7 = pxStepsMult == null ? "" : pxStepsMult;
            RecommendParam recommendParam9 = recommendedParamsDto.getRecommendParam();
            java.lang.String slPct = recommendParam9 != null ? recommendParam9.getSlPct() : null;
            java.lang.String str8 = slPct == null ? "" : slPct;
            RecommendParam recommendParam10 = recommendedParamsDto.getRecommendParam();
            java.lang.String userRiskMode = recommendParam10 != null ? recommendParam10.getUserRiskMode() : null;
            java.lang.String str9 = userRiskMode == null ? "" : userRiskMode;
            RecommendParam recommendParam11 = recommendedParamsDto.getRecommendParam();
            if (recommendParam11 == null || (triggerParams = recommendParam11.getTriggerParams()) == null) {
                listAhwBna = yDY.AhwBna();
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(triggerParams, 10));
                for (TriggerParam triggerParam : triggerParams) {
                    arrayList2.add(new DcaTriggerParam(triggerParam.getTriggerAction(), triggerParam.getTriggerStrategy(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PointerIconCompat.TYPE_GRAB, (DefaultConstructorMarker) null));
                }
                listAhwBna = arrayList2;
            }
            RecommendParam recommendParam12 = recommendedParamsDto.getRecommendParam();
            java.lang.String slMode = recommendParam12 != null ? recommendParam12.getSlMode() : null;
            java.lang.String str10 = slMode == null ? "" : slMode;
            RecommendParam recommendParam13 = recommendedParamsDto.getRecommendParam();
            java.lang.String pnlRatio = recommendParam13 != null ? recommendParam13.getPnlRatio() : null;
            java.lang.String str11 = pnlRatio == null ? "" : pnlRatio;
            RecommendParam recommendParam14 = recommendedParamsDto.getRecommendParam();
            java.lang.String volMult = recommendParam14 != null ? recommendParam14.getVolMult() : null;
            stgyParam = new StgyParam((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str, (java.lang.String) null, str2, (java.lang.String) null, str3, str4, str5, str6, reserveFunds, volMult == null ? "" : volMult, str7, str8, (java.lang.String) null, (java.lang.String) null, str9, (java.lang.String) null, listAhwBna, str10, str11, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, (SmartEarnParam) null, (java.lang.String) null, -1070858241, 65506, (DefaultConstructorMarker) null);
        } else if (i == 2) {
            RecommendParam recommendParam15 = recommendedParamsDto.getRecommendParam();
            java.lang.String instId = recommendParam15 != null ? recommendParam15.getInstId() : null;
            java.lang.String str12 = instId == null ? "" : instId;
            RecommendParam recommendParam16 = recommendedParamsDto.getRecommendParam();
            java.lang.String instType = recommendParam16 != null ? recommendParam16.getInstType() : null;
            java.lang.String str13 = instType == null ? "" : instType;
            RecommendParam recommendParam17 = recommendedParamsDto.getRecommendParam();
            java.lang.String gridNum = recommendParam17 != null ? recommendParam17.getGridNum() : null;
            java.lang.String str14 = gridNum == null ? "" : gridNum;
            RecommendParam recommendParam18 = recommendedParamsDto.getRecommendParam();
            java.lang.String minPx = recommendParam18 != null ? recommendParam18.getMinPx() : null;
            java.lang.String str15 = minPx == null ? "" : minPx;
            RecommendParam recommendParam19 = recommendedParamsDto.getRecommendParam();
            java.lang.String maxPx = recommendParam19 != null ? recommendParam19.getMaxPx() : null;
            java.lang.String str16 = maxPx == null ? "" : maxPx;
            RecommendParam recommendParam20 = recommendedParamsDto.getRecommendParam();
            java.lang.String runType = recommendParam20 != null ? recommendParam20.getRunType() : null;
            java.lang.String str17 = runType == null ? "" : runType;
            RecommendParam recommendParam21 = recommendedParamsDto.getRecommendParam();
            java.lang.String direction2 = recommendParam21 != null ? recommendParam21.getDirection() : null;
            java.lang.String str18 = direction2 == null ? "" : direction2;
            RecommendParam recommendParam22 = recommendedParamsDto.getRecommendParam();
            java.lang.String lever2 = recommendParam22 != null ? recommendParam22.getLever() : null;
            java.lang.String str19 = lever2 == null ? "" : lever2;
            RecommendParam recommendParam23 = recommendedParamsDto.getRecommendParam();
            java.lang.String ordType = recommendParam23 != null ? recommendParam23.getOrdType() : null;
            java.lang.String str20 = ordType == null ? "" : ordType;
            RecommendParam recommendParam24 = recommendedParamsDto.getRecommendParam();
            java.lang.String sz = recommendParam24 != null ? recommendParam24.getSz() : null;
            java.lang.String str21 = sz == null ? "" : sz;
            RecommendParam recommendParam25 = recommendedParamsDto.getRecommendParam();
            java.lang.String slTriggerPx = recommendParam25 != null ? recommendParam25.getSlTriggerPx() : null;
            java.lang.String str22 = slTriggerPx == null ? "" : slTriggerPx;
            RecommendParam recommendParam26 = recommendedParamsDto.getRecommendParam();
            java.lang.String tpTriggerPx = recommendParam26 != null ? recommendParam26.getTpTriggerPx() : null;
            java.lang.String str23 = tpTriggerPx == null ? "" : tpTriggerPx;
            RecommendParam recommendParam27 = recommendedParamsDto.getRecommendParam();
            java.lang.String tpRatio = recommendParam27 != null ? recommendParam27.getTpRatio() : null;
            java.lang.String str24 = tpRatio == null ? "" : tpRatio;
            RecommendParam recommendParam28 = recommendedParamsDto.getRecommendParam();
            java.lang.String slRatio = recommendParam28 != null ? recommendParam28.getSlRatio() : null;
            java.lang.String str25 = slRatio == null ? "" : slRatio;
            RecommendParam recommendParam29 = recommendedParamsDto.getRecommendParam();
            boolean basePos = recommendParam29 != null ? recommendParam29.getBasePos() : false;
            RecommendParam recommendParam30 = recommendedParamsDto.getRecommendParam();
            if (recommendParam30 == null || (signParams = recommendParam30.getSignParams()) == null) {
                listAhwBna2 = yDY.AhwBna();
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(signParams, 10));
                for (SignParam signParam : signParams) {
                    arrayList3.add(new AdvancedTriggerSign(signParam.getTriggerAction(), signParam.getIndicator(), signParam.getTriggerStrategy(), signParam.getTriggerPx(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, signParam.getStopType(), (java.lang.String) null, 3056, (DefaultConstructorMarker) null));
                }
                listAhwBna2 = arrayList3;
            }
            RecommendParam recommendParam31 = recommendedParamsDto.getRecommendParam();
            java.lang.String pnlRatio2 = recommendParam31 != null ? recommendParam31.getPnlRatio() : null;
            stgyParam = new StgyParam((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str13, (java.lang.String) null, str20, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, str15, str16, str14, (java.lang.String) null, (java.lang.String) null, str17, str19, (java.lang.String) null, str18, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, pnlRatio2 == null ? "" : pnlRatio2, str12, str21, str22, str23, (TpSlTriggerParamReqResp) null, str24, str25, basePos, listAhwBna2, (SmartEarnParam) null, (java.lang.String) null, -1470625, 49679, (DefaultConstructorMarker) null);
        } else if (i == 3) {
            RecommendParam recommendParam32 = recommendedParamsDto.getRecommendParam();
            boolean enabled = (recommendParam32 == null || (earnParam4 = recommendParam32.getEarnParam()) == null) ? false : earnParam4.getEnabled();
            RecommendParam recommendParam33 = recommendedParamsDto.getRecommendParam();
            java.lang.String earnMinLimit = (recommendParam33 == null || (earnParam3 = recommendParam33.getEarnParam()) == null) ? null : earnParam3.getEarnMinLimit();
            java.lang.String str26 = earnMinLimit == null ? "" : earnMinLimit;
            RecommendParam recommendParam34 = recommendedParamsDto.getRecommendParam();
            java.lang.String earnMaxLimit = (recommendParam34 == null || (earnParam2 = recommendParam34.getEarnParam()) == null) ? null : earnParam2.getEarnMaxLimit();
            java.lang.String str27 = earnMaxLimit == null ? "" : earnMaxLimit;
            RecommendParam recommendParam35 = recommendedParamsDto.getRecommendParam();
            SmartEarnParam smartEarnParam = new SmartEarnParam(enabled, str26, str27, (java.lang.String) null, (recommendParam35 == null || (earnParam = recommendParam35.getEarnParam()) == null) ? null : earnParam.getEarnType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 2024, (DefaultConstructorMarker) null);
            RecommendParam recommendParam36 = recommendedParamsDto.getRecommendParam();
            java.lang.String gridNum2 = recommendParam36 != null ? recommendParam36.getGridNum() : null;
            java.lang.String str28 = gridNum2 == null ? "" : gridNum2;
            RecommendParam recommendParam37 = recommendedParamsDto.getRecommendParam();
            java.lang.String instId2 = recommendParam37 != null ? recommendParam37.getInstId() : null;
            java.lang.String str29 = instId2 == null ? "" : instId2;
            RecommendParam recommendParam38 = recommendedParamsDto.getRecommendParam();
            java.lang.String instType2 = recommendParam38 != null ? recommendParam38.getInstType() : null;
            java.lang.String str30 = instType2 == null ? "" : instType2;
            RecommendParam recommendParam39 = recommendedParamsDto.getRecommendParam();
            java.lang.String maxPx2 = recommendParam39 != null ? recommendParam39.getMaxPx() : null;
            java.lang.String str31 = maxPx2 == null ? "" : maxPx2;
            RecommendParam recommendParam40 = recommendedParamsDto.getRecommendParam();
            java.lang.String minPx2 = recommendParam40 != null ? recommendParam40.getMinPx() : null;
            java.lang.String str32 = minPx2 == null ? "" : minPx2;
            RecommendParam recommendParam41 = recommendedParamsDto.getRecommendParam();
            java.lang.String ordType2 = recommendParam41 != null ? recommendParam41.getOrdType() : null;
            java.lang.String str33 = ordType2 == null ? "" : ordType2;
            RecommendParam recommendParam42 = recommendedParamsDto.getRecommendParam();
            java.lang.String pnlRatio3 = recommendParam42 != null ? recommendParam42.getPnlRatio() : null;
            java.lang.String str34 = pnlRatio3 == null ? "" : pnlRatio3;
            RecommendParam recommendParam43 = recommendedParamsDto.getRecommendParam();
            java.lang.String runType2 = recommendParam43 != null ? recommendParam43.getRunType() : null;
            java.lang.String str35 = runType2 == null ? "" : runType2;
            RecommendParam recommendParam44 = recommendedParamsDto.getRecommendParam();
            if (recommendParam44 == null || (signParams2 = recommendParam44.getSignParams()) == null) {
                arrayList = null;
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(signParams2, 10));
                for (SignParam signParam2 : signParams2) {
                    java.lang.String authToken = signParam2.getAuthToken();
                    java.lang.String delaySeconds = signParam2.getDelaySeconds();
                    arrayList4.add(new AdvancedTriggerSign(signParam2.getTriggerAction(), signParam2.getIndicator(), signParam2.getTriggerStrategy(), signParam2.getTriggerPx(), delaySeconds, signParam2.getTimePeriod(), signParam2.getTimeframe(), signParam2.getTriggerCond(), signParam2.getOversoldThold(), signParam2.getThold(), signParam2.getStopType(), authToken));
                }
                arrayList = arrayList4;
            }
            RecommendParam recommendParam45 = recommendedParamsDto.getRecommendParam();
            java.lang.String quoteSz = recommendParam45 != null ? recommendParam45.getQuoteSz() : null;
            stgyParam = new StgyParam((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str30, (java.lang.String) null, str33, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, str32, str31, str28, (java.lang.String) null, (java.lang.String) null, str35, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, str34, str29, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) arrayList, smartEarnParam, quoteSz == null ? "" : quoteSz, -159905, 8143, (DefaultConstructorMarker) null);
        } else {
            stgyParam = new StgyParam((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, (SmartEarnParam) null, (java.lang.String) null, -1, 65535, (DefaultConstructorMarker) null);
        }
        StrategyStatistics strategyStatistics = recommendedParamsDto.getStrategyStatistics();
        java.lang.String totalAssets = strategyStatistics != null ? strategyStatistics.getTotalAssets() : null;
        if (totalAssets == null) {
            totalAssets = "";
        }
        StrategyStatistics strategyStatistics2 = recommendedParamsDto.getStrategyStatistics();
        java.lang.String totalUserCount = strategyStatistics2 != null ? strategyStatistics2.getTotalUserCount() : null;
        if (totalUserCount == null) {
            totalUserCount = "";
        }
        GridStatistics gridStatistics = new GridStatistics(totalAssets, totalUserCount);
        VoucherInfo voucherInfo = recommendedParamsDto.getVoucherInfo();
        boolean voucherVisible = voucherInfo != null ? voucherInfo.getVoucherVisible() : false;
        VoucherInfo voucherInfo2 = recommendedParamsDto.getVoucherInfo();
        java.lang.String voucherStatus = voucherInfo2 != null ? voucherInfo2.getVoucherStatus() : null;
        java.lang.String str36 = voucherStatus == null ? "" : voucherStatus;
        VoucherInfo voucherInfo3 = recommendedParamsDto.getVoucherInfo();
        java.lang.String batchNo = voucherInfo3 != null ? voucherInfo3.getBatchNo() : null;
        java.lang.String str37 = batchNo == null ? "" : batchNo;
        VoucherInfo voucherInfo4 = recommendedParamsDto.getVoucherInfo();
        java.lang.String amount = voucherInfo4 != null ? voucherInfo4.getAmount() : null;
        java.lang.String str38 = amount == null ? "" : amount;
        VoucherInfo voucherInfo5 = recommendedParamsDto.getVoucherInfo();
        java.lang.String unit = voucherInfo5 != null ? voucherInfo5.getUnit() : null;
        java.lang.String str39 = unit == null ? "" : unit;
        VoucherInfo voucherInfo6 = recommendedParamsDto.getVoucherInfo();
        java.lang.String expireTime = voucherInfo6 != null ? voucherInfo6.getExpireTime() : null;
        java.lang.String str40 = expireTime == null ? "" : expireTime;
        VoucherInfo voucherInfo7 = recommendedParamsDto.getVoucherInfo();
        boolean claimed = voucherInfo7 != null ? voucherInfo7.getClaimed() : false;
        VoucherInfo voucherInfo8 = recommendedParamsDto.getVoucherInfo();
        return new BotAggregatedInfoBean(stgyParam, gridStatistics, new LossInsuranceBean(voucherVisible, str36, str37, str38, str39, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str40, (java.lang.String) null, 0L, (java.util.List) null, (java.util.List) null, claimed, voucherInfo8 != null ? voucherInfo8.getVoucherType() : null, (ArbitrageTotalPnlInfo) null, (java.lang.Integer) null, (java.lang.String) null, 949216, (DefaultConstructorMarker) null), recommendedParamsDto.getEligibleInstIds());
    }
}
