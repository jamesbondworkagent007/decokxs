package o;

import com.okinc.localization.util.format.DisplaySign;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.botList.domain.model.LLMBotType;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.bot.AiBotDto;
import com.okinc.unify_trade.biz.bot.BacktestDto;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.biz.bot.BotStatus;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.bot.data.MpStgyCopyProfitChangeData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.list.CardStyle;
import com.okinc.unify_trade.bot.util.TacticsListButtonItem;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.C38307pTy;
import o.C48033uCm;
import o.C59462zhW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uJz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48235uJz {
    public static final C48235uJz EZpvd = new C48235uJz();
    public static final java.util.Map<java.lang.String, java.lang.String> OLrzqt = new LinkedHashMap();
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.uJz$Fragment */
    public final /* synthetic */ class Fragment {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LLMBotType.values().length];
            try {
                iArr[LLMBotType.LLM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[LLMBotType.Backtest.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[BotStatus.values().length];
            try {
                iArr2[BotStatus.Init.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[BotStatus.Running.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
        return OLrzqt;
    }

    private C48235uJz() {
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uJO EZpvd(final TacticsData tacticsData, final boolean z) {
        BotVo bot;
        AiBotDto ai;
        boolean z2;
        FragmentManager fragmentManager;
        BotCommon common;
        BotCommon common2;
        BacktestDto backtest;
        BacktestDto backtest2;
        if (tacticsData == null || (bot = tacticsData.getBot()) == null || (ai = bot.getAi()) == null) {
            return uJO.Companion.AEQbTJ();
        }
        if (C56066xvm.EZpvd.AEQbTJ() == null) {
            return uJO.Companion.AEQbTJ();
        }
        if (tacticsData.getHistory()) {
            z2 = true;
        } else {
            BotVo bot2 = tacticsData.getBot();
            if (((bot2 == null || (backtest2 = bot2.getBacktest()) == null) ? null : backtest2.getStatus()) != BotStatus.Completed) {
                BotVo bot3 = tacticsData.getBot();
                if (((bot3 == null || (backtest = bot3.getBacktest()) == null) ? null : backtest.getStatus()) != BotStatus.Failed) {
                    z2 = false;
                }
            }
        }
        BotVo bot4 = tacticsData.getBot();
        boolean z3 = (bot4 == null || (common2 = bot4.getCommon()) == null || !common2.isPinned() || z || z2) ? false : true;
        BotVo bot5 = tacticsData.getBot();
        BacktestDto backtest3 = bot5 != null ? bot5.getBacktest() : null;
        final LLMBotType lLMBotTypeOLrzqt = OLrzqt(backtest3);
        java.lang.String algoId = tacticsData.getAlgoId();
        java.lang.String orderType = tacticsData.getOrderType();
        java.lang.String instType = tacticsData.getInstType();
        java.util.List<java.lang.String> instIds = ai.getInstIds();
        BotVo bot6 = tacticsData.getBot();
        java.lang.String stgyName = (bot6 == null || (common = bot6.getCommon()) == null) ? null : common.getStgyName();
        if (stgyName == null) {
            stgyName = "";
        }
        Activity activity = new Activity(algoId, lLMBotTypeOLrzqt, orderType, instType, AEQbTJ(instIds, stgyName, lLMBotTypeOLrzqt), ai.getInstIds(), z, C55875xsG.copydefault.KWHzl(), z3);
        StateListAnimator stateListAnimator = new StateListAnimator(z2, tacticsData.getState(), tacticsData.getStopStateText(), tacticsData.getRunningDuration());
        if (lLMBotTypeOLrzqt == LLMBotType.Backtest) {
            java.lang.String startTime = backtest3 != null ? backtest3.getStartTime() : null;
            if (startTime == null) {
                startTime = "";
            }
            java.lang.String finishTime = backtest3 != null ? backtest3.getFinishTime() : null;
            if (finishTime == null) {
                finishTime = "";
            }
            fragmentManager = new FragmentManager(startTime, finishTime);
        } else {
            fragmentManager = new FragmentManager(java.lang.String.valueOf(tacticsData.getCTimeStamp()), tacticsData.getUTime());
        }
        return OLrzqt(activity, ai, stateListAnimator, fragmentManager, new TaskDescription(!z, KWHzl(tacticsData), ai.getTotalPnl(), ai.getTotalPnlRate()), backtest3 != null ? KWHzl(backtest3) : null, new Function0() { // from class: o.uJK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48235uJz.OLrzqt(lLMBotTypeOLrzqt, tacticsData, z);
            }
        });
    }

    public static final java.util.List OLrzqt(LLMBotType lLMBotType, TacticsData tacticsData, boolean z) {
        BacktestDto backtest;
        int i = Fragment.EZpvd[lLMBotType.ordinal()];
        if (i == 1) {
            return C48168uHm.EZpvd.AEQbTJ(tacticsData.getHistory(), z, tacticsData.getState());
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        C48168uHm c48168uHm = C48168uHm.EZpvd;
        BotVo bot = tacticsData.getBot();
        return c48168uHm.copydefault(z, (bot == null || (backtest = bot.getBacktest()) == null) ? null : backtest.getStatus());
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uJO copydefault(@NotNull final BizTradeStrategyInfo bizTradeStrategyInfo, final boolean z) {
        AiBotDto ai;
        boolean z2;
        FragmentManager fragmentManager;
        BacktestDto backtest;
        BacktestDto backtest2;
        BotCommon common;
        Intrinsics.checkNotNullParameter(bizTradeStrategyInfo, "");
        if (C56066xvm.EZpvd.AEQbTJ() == null) {
            return uJO.Companion.AEQbTJ();
        }
        BotVo botVo = bizTradeStrategyInfo.getBotVo();
        if (botVo == null || (ai = botVo.getAi()) == null) {
            return uJO.Companion.AEQbTJ();
        }
        BotVo botVo2 = bizTradeStrategyInfo.getBotVo();
        BacktestDto backtest3 = botVo2 != null ? botVo2.getBacktest() : null;
        LLMBotType lLMBotTypeOLrzqt = OLrzqt(backtest3);
        java.lang.String orderAlgoId = bizTradeStrategyInfo.getOrderAlgoId();
        java.lang.String orderInstType = bizTradeStrategyInfo.getOrderInstType();
        java.util.List<java.lang.String> instIds = ai.getInstIds();
        BotVo botVo3 = bizTradeStrategyInfo.getBotVo();
        java.lang.String stgyName = (botVo3 == null || (common = botVo3.getCommon()) == null) ? null : common.getStgyName();
        if (stgyName == null) {
            stgyName = "";
        }
        Activity activity = new Activity(orderAlgoId, lLMBotTypeOLrzqt, "ai_bot", orderInstType, AEQbTJ(instIds, stgyName, lLMBotTypeOLrzqt), ai.getInstIds(), z, CardStyle.DETAILED, false);
        BotVo botVo4 = bizTradeStrategyInfo.getBotVo();
        if (((botVo4 == null || (backtest2 = botVo4.getBacktest()) == null) ? null : backtest2.getStatus()) == BotStatus.Completed) {
            z2 = true;
        } else {
            BotVo botVo5 = bizTradeStrategyInfo.getBotVo();
            if (((botVo5 == null || (backtest = botVo5.getBacktest()) == null) ? null : backtest.getStatus()) != BotStatus.Failed) {
                z2 = false;
            }
        }
        StateListAnimator stateListAnimator = new StateListAnimator(z2, "", "", "");
        if (lLMBotTypeOLrzqt == LLMBotType.Backtest) {
            java.lang.String startTime = backtest3 != null ? backtest3.getStartTime() : null;
            if (startTime == null) {
                startTime = "";
            }
            java.lang.String finishTime = backtest3 != null ? backtest3.getFinishTime() : null;
            fragmentManager = new FragmentManager(startTime, finishTime != null ? finishTime : "");
        } else {
            fragmentManager = new FragmentManager(bizTradeStrategyInfo.getOrderCTime(), bizTradeStrategyInfo.getUTimeValue());
        }
        java.util.List<StrategyProfitResponse> ongoingProfitSnapshots = bizTradeStrategyInfo.getOngoingProfitSnapshots();
        java.util.List listAxsJAYsNCnLh = ongoingProfitSnapshots != null ? CollectionsKt___CollectionsKt.AxsJAYsNCnLh(ongoingProfitSnapshots) : null;
        if (listAxsJAYsNCnLh == null) {
            listAxsJAYsNCnLh = yDY.AhwBna();
        }
        return OLrzqt(activity, ai, stateListAnimator, fragmentManager, new TaskDescription(!z, listAxsJAYsNCnLh, ai.getTotalPnl(), ai.getTotalPnlRate()), backtest3 != null ? KWHzl(backtest3) : null, new Function0() { // from class: o.uJH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48235uJz.EZpvd(bizTradeStrategyInfo, z);
            }
        });
    }

    public static final java.util.List EZpvd(BizTradeStrategyInfo bizTradeStrategyInfo, boolean z) {
        BacktestDto backtest;
        C48168uHm c48168uHm = C48168uHm.EZpvd;
        BotVo botVo = bizTradeStrategyInfo.getBotVo();
        return c48168uHm.copydefault(z, (botVo == null || (backtest = botVo.getBacktest()) == null) ? null : backtest.getStatus());
    }

    public final uJO OLrzqt(Activity activity, AiBotDto aiBotDto, StateListAnimator stateListAnimator, FragmentManager fragmentManager, TaskDescription taskDescription, ActionBar actionBar, Function0<? extends java.util.List<TacticsListButtonItem>> function0) {
        uJQ ujq;
        uJQ ujq2;
        java.lang.String simpleDateTime$default;
        Application applicationAEQbTJ = AEQbTJ(aiBotDto);
        java.lang.String strKWHzl = activity.KWHzl();
        LLMBotType lLMBotTypeOLrzqt = activity.OLrzqt();
        java.lang.String strValueOf = activity.valueOf();
        CardStyle cardStyleCopydefault = activity.copydefault();
        boolean zAYXKKw = activity.AYXKKw();
        java.lang.String strEZpvd = activity.EZpvd();
        java.lang.String strAhwBna = activity.AhwBna();
        java.util.List<java.lang.String> listGEmmrt = activity.gEmmrt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        java.util.Iterator<T> it = listGEmmrt.iterator();
        while (it.hasNext()) {
            java.lang.String upperCase = o.TaskDescription.AEQbTJ((java.lang.String) it.next()).copydefault().toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            arrayList.add(C52684wUn.AEQbTJ(upperCase));
        }
        java.util.List<java.lang.String> listGEmmrt2 = activity.gEmmrt();
        boolean zCopydefault = stateListAnimator.copydefault();
        java.lang.String strKWHzl2 = stateListAnimator.KWHzl();
        java.lang.String strOLrzqt = stateListAnimator.OLrzqt();
        java.lang.String strEZpvd2 = stateListAnimator.EZpvd();
        java.util.List<TacticsListButtonItem> listInvoke = function0.invoke();
        java.lang.String investCcy = aiBotDto.getInvestCcy();
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairCopydefault = applicationAEQbTJ.copydefault();
        uJQ textProperties$default = C52694wUx.toTextProperties$default(taskDescription.AEQbTJ(), 0, new Function1() { // from class: o.uJJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48235uJz.valueOf((java.lang.String) obj);
            }
        }, 1, null);
        uJQ ujqOLrzqt = applicationAEQbTJ.OLrzqt();
        uJQ ujqAYXKKw = applicationAEQbTJ.AYXKKw();
        uJQ ujqValueOf = applicationAEQbTJ.valueOf();
        uJQ ujqDjBIcL = applicationAEQbTJ.djBIcL();
        uJQ ujqAhwBna = applicationAEQbTJ.AhwBna();
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairFetchVPNInfo = applicationAEQbTJ.fetchVPNInfo();
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairEZpvd = applicationAEQbTJ.EZpvd();
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairKWHzl = applicationAEQbTJ.KWHzl();
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairGEmmrt = applicationAEQbTJ.gEmmrt();
        uJI ujiAEQbTJ = applicationAEQbTJ.AEQbTJ();
        if (fragmentManager.OLrzqt().length() == 0) {
            ujq = textProperties$default;
            ujq2 = ujqOLrzqt;
            simpleDateTime$default = "--";
        } else {
            ujq = textProperties$default;
            ujq2 = ujqOLrzqt;
            simpleDateTime$default = pTA.formatSimpleDateTime$default(new Date(C33129mqd.valueOf(fragmentManager.OLrzqt())), null, 1, null);
        }
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairEZpvd2 = uLP.EZpvd(simpleDateTime$default, fragmentManager.OLrzqt());
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairEZpvd3 = uLP.EZpvd(fragmentManager.AEQbTJ().length() != 0 ? pTA.formatSimpleDateTime$default(new Date(C33129mqd.valueOf(fragmentManager.AEQbTJ())), null, 1, null) : "--", fragmentManager.AEQbTJ());
        java.lang.String strAEQbTJ = actionBar != null ? actionBar.AEQbTJ() : null;
        boolean zKWHzl = taskDescription.KWHzl();
        java.util.List<StrategyProfitResponse> listEZpvd = taskDescription.EZpvd();
        java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(activity.gEmmrt());
        return new uJO(strKWHzl, lLMBotTypeOLrzqt, strValueOf, cardStyleCopydefault, zAYXKKw, strEZpvd, strAhwBna, arrayList, listGEmmrt2, activity.AEQbTJ(), zCopydefault, strKWHzl2, strOLrzqt, strEZpvd2, listInvoke, investCcy, pairCopydefault, ujq, ujq2, ujqAYXKKw, ujqValueOf, ujqDjBIcL, ujqAhwBna, pairFetchVPNInfo, pairEZpvd, pairKWHzl, pairGEmmrt, ujiAEQbTJ, pairEZpvd2, pairEZpvd3, strAEQbTJ, zKWHzl, listEZpvd, new C48264uLa(str == null ? "" : str, activity.AhwBna(), aiBotDto.getInvestCcy(), "ai_bot", taskDescription.AEQbTJ(), false, activity.AYXKKw() ? 6 : 3, 32, null), taskDescription.OLrzqt(), actionBar != null ? actionBar.KWHzl() : null, null);
    }

    public static final java.lang.String valueOf(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTB.formatICUNumber$default(C33129mqd.EZpvd(str), null, C38307pTy.Companion.AEQbTJ(4), DisplaySign.EXCEPT_ZERO, null, 9, null);
    }

    /* JADX INFO: renamed from: o.uJz$Activity */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.util.List<java.lang.String> AhwBna;
        public final java.lang.String EZpvd;
        public final boolean KWHzl;
        public final CardStyle OLrzqt;
        public final LLMBotType copydefault;
        public final boolean djBIcL;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull java.lang.String str, @NotNull LLMBotType lLMBotType, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<java.lang.String> list, boolean z, @NotNull CardStyle cardStyle, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(lLMBotType, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(cardStyle, "");
            return new Activity(str, lLMBotType, str2, str3, str4, list, z, cardStyle, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LLMBotType OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CardStyle copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && this.copydefault == activity.copydefault && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) activity.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) activity.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && Intrinsics.EZpvd(this.AhwBna, activity.AhwBna) && this.djBIcL == activity.djBIcL && this.OLrzqt == activity.OLrzqt && this.KWHzl == activity.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + java.lang.Boolean.hashCode(this.djBIcL)) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MappingContext(id=" + this.AEQbTJ + ", botType=" + this.copydefault + ", orderType=" + this.valueOf + ", instType=" + this.AYXKKw + ", displayName=" + this.EZpvd + ", instIds=" + this.AhwBna + ", isFromDetailPage=" + this.djBIcL + ", displayStyle=" + this.OLrzqt + ", hasPinned=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.valueOf;
        }

        public Activity(@NotNull java.lang.String str, @NotNull LLMBotType lLMBotType, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<java.lang.String> list, boolean z, @NotNull CardStyle cardStyle, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(lLMBotType, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(cardStyle, "");
            this.AEQbTJ = str;
            this.copydefault = lLMBotType;
            this.valueOf = str2;
            this.AYXKKw = str3;
            this.EZpvd = str4;
            this.AhwBna = list;
            this.djBIcL = z;
            this.OLrzqt = cardStyle;
            this.KWHzl = z2;
        }
    }

    /* JADX INFO: renamed from: o.uJz$StateListAnimator */
    public static final class StateListAnimator {
        public static final ActionBar Companion = new ActionBar(null);
        public final java.lang.String AEQbTJ;
        public final boolean EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                str = stateListAnimator.KWHzl;
            }
            if ((i & 4) != 0) {
                str2 = stateListAnimator.OLrzqt;
            }
            if ((i & 8) != 0) {
                str3 = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.KWHzl(z, str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new StateListAnimator(z, str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.EZpvd == stateListAnimator.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((java.lang.Boolean.hashCode(this.EZpvd) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "StatusInfo(history=" + this.EZpvd + ", state=" + this.KWHzl + ", stopStateText=" + this.OLrzqt + ", runningDuration=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.EZpvd = z;
            this.KWHzl = str;
            this.OLrzqt = str2;
            this.AEQbTJ = str3;
        }

        /* JADX INFO: renamed from: o.uJz$StateListAnimator$ActionBar */
        public static final class ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uJz.StateListAnimator.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ActionBar() {
            }
        }
    }

    /* JADX INFO: renamed from: o.uJz$FragmentManager */
    public static final class FragmentManager {
        public final java.lang.String AEQbTJ;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fragmentManager.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = fragmentManager.AEQbTJ;
            }
            return fragmentManager.EZpvd(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new FragmentManager(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FragmentManager)) {
                return false;
            }
            FragmentManager fragmentManager = (FragmentManager) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) fragmentManager.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) fragmentManager.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TimeInfo(cTime=" + this.copydefault + ", uTime=" + this.AEQbTJ + ")";
        }

        public FragmentManager(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.AEQbTJ = str2;
        }
    }

    /* JADX INFO: renamed from: o.uJz$TaskDescription */
    public static final class TaskDescription {
        public final java.util.List<StrategyProfitResponse> AEQbTJ;
        public final boolean EZpvd;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uJz$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                list = taskDescription.AEQbTJ;
            }
            if ((i & 4) != 0) {
                str = taskDescription.copydefault;
            }
            if ((i & 8) != 0) {
                str2 = taskDescription.OLrzqt;
            }
            return taskDescription.AEQbTJ(z, list, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(boolean z, @NotNull java.util.List<StrategyProfitResponse> list, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new TaskDescription(z, list, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<StrategyProfitResponse> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.EZpvd == taskDescription.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) taskDescription.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((java.lang.Boolean.hashCode(this.EZpvd) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ChartInfo(showChart=" + this.EZpvd + ", profitList=" + this.AEQbTJ + ", totalPnl=" + this.copydefault + ", pnlRatio=" + this.OLrzqt + ")";
        }

        public TaskDescription(boolean z, @NotNull java.util.List<StrategyProfitResponse> list, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = z;
            this.AEQbTJ = list;
            this.copydefault = str;
            this.OLrzqt = str2;
        }
    }

    /* JADX INFO: renamed from: o.uJz$ActionBar */
    public static final class ActionBar {
        public final uJL OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, uJL ujl, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                ujl = actionBar.OLrzqt;
            }
            if ((i & 2) != 0) {
                str = actionBar.copydefault;
            }
            return actionBar.KWHzl(ujl, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uJL KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull uJL ujl, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(ujl, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(ujl, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "BacktestInfo(progress=" + this.OLrzqt + ", dateRange=" + this.copydefault + ")";
        }

        public ActionBar(@NotNull uJL ujl, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(ujl, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = ujl;
            this.copydefault = str;
        }
    }

    /* JADX INFO: renamed from: o.uJz$Application */
    public static final class Application {
        public final kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> AEQbTJ;
        public final uJQ AYXKKw;
        public final uJQ AhwBna;
        public final uJQ EZpvd;
        public final kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> KWHzl;
        public final uJI OLrzqt;
        public final kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> copydefault;
        public final uJQ djBIcL;
        public final kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> fetchVPNInfo;
        public final kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> gEmmrt;
        public final uJQ valueOf;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 kotlin.Pair)
  (r2v0 o.uJQ)
  (r3v0 o.uJQ)
  (r4v0 o.uJQ)
  (r5v0 o.uJQ)
  (r6v0 o.uJQ)
  (r7v0 kotlin.Pair)
  (r8v0 kotlin.Pair)
  (r9v0 kotlin.Pair)
  (r10v0 kotlin.Pair)
  (r11v0 o.uJI)
 A[MD:(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, o.uJQ, o.uJQ, o.uJQ, o.uJQ, o.uJQ, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, o.uJI):void (m)] call: o.uJz.Application.<init>(kotlin.Pair, o.uJQ, o.uJQ, o.uJQ, o.uJQ, o.uJQ, kotlin.Pair, kotlin.Pair, kotlin.Pair, kotlin.Pair, o.uJI):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(kotlin.Pair pair, uJQ ujq, uJQ ujq2, uJQ ujq3, uJQ ujq4, uJQ ujq5, kotlin.Pair pair2, kotlin.Pair pair3, kotlin.Pair pair4, kotlin.Pair pair5, uJI uji, DefaultConstructorMarker defaultConstructorMarker) {
            this(pair, ujq, ujq2, ujq3, ujq4, ujq5, pair2, pair3, pair4, pair5, uji);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uJI AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair, @NotNull uJQ ujq, @NotNull uJQ ujq2, @NotNull uJQ ujq3, @NotNull uJQ ujq4, @NotNull uJQ ujq5, @NotNull kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair2, @NotNull kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair3, @NotNull kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair4, @NotNull kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair5, @NotNull uJI uji) {
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(ujq, "");
            Intrinsics.checkNotNullParameter(ujq2, "");
            Intrinsics.checkNotNullParameter(ujq3, "");
            Intrinsics.checkNotNullParameter(ujq4, "");
            Intrinsics.checkNotNullParameter(ujq5, "");
            Intrinsics.checkNotNullParameter(pair2, "");
            Intrinsics.checkNotNullParameter(pair3, "");
            Intrinsics.checkNotNullParameter(pair4, "");
            Intrinsics.checkNotNullParameter(pair5, "");
            Intrinsics.checkNotNullParameter(uji, "");
            return new Application(pair, ujq, ujq2, ujq3, ujq4, ujq5, pair2, pair3, pair4, pair5, uji, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uJQ AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uJQ AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uJQ OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uJQ djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return uLP.EZpvd(this.AEQbTJ, application.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd) && Intrinsics.EZpvd(this.valueOf, application.valueOf) && Intrinsics.EZpvd(this.AhwBna, application.AhwBna) && Intrinsics.EZpvd(this.AYXKKw, application.AYXKKw) && Intrinsics.EZpvd(this.djBIcL, application.djBIcL) && uLP.EZpvd(this.fetchVPNInfo, application.fetchVPNInfo) && uLP.EZpvd(this.KWHzl, application.KWHzl) && uLP.EZpvd(this.copydefault, application.copydefault) && uLP.EZpvd(this.gEmmrt, application.gEmmrt) && Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> fetchVPNInfo() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((uLP.EZpvd(this.AEQbTJ) * 31) + this.EZpvd.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + uLP.EZpvd(this.fetchVPNInfo)) * 31) + uLP.EZpvd(this.KWHzl)) * 31) + uLP.EZpvd(this.copydefault)) * 31) + uLP.EZpvd(this.gEmmrt)) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MappedMetrics(investedAmount=" + uLP.gEmmrt(this.AEQbTJ) + ", realizedProfit=" + this.EZpvd + ", realizedProfitPercent=" + this.valueOf + ", unrealizedPnl=" + this.AhwBna + ", unrealizedPnlPercent=" + this.AYXKKw + ", totalApy=" + this.djBIcL + ", winRate=" + uLP.gEmmrt(this.fetchVPNInfo) + ", profitLoss=" + uLP.gEmmrt(this.KWHzl) + ", maxDrawdown=" + uLP.gEmmrt(this.copydefault) + ", sharpeRatio=" + uLP.gEmmrt(this.gEmmrt) + ", aiModel=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uJQ valueOf() {
            return this.AhwBna;
        }

        public Application(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair, uJQ ujq, uJQ ujq2, uJQ ujq3, uJQ ujq4, uJQ ujq5, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair2, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair3, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair4, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair5, uJI uji) {
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(ujq, "");
            Intrinsics.checkNotNullParameter(ujq2, "");
            Intrinsics.checkNotNullParameter(ujq3, "");
            Intrinsics.checkNotNullParameter(ujq4, "");
            Intrinsics.checkNotNullParameter(ujq5, "");
            Intrinsics.checkNotNullParameter(pair2, "");
            Intrinsics.checkNotNullParameter(pair3, "");
            Intrinsics.checkNotNullParameter(pair4, "");
            Intrinsics.checkNotNullParameter(pair5, "");
            Intrinsics.checkNotNullParameter(uji, "");
            this.AEQbTJ = pair;
            this.EZpvd = ujq;
            this.valueOf = ujq2;
            this.AhwBna = ujq3;
            this.AYXKKw = ujq4;
            this.djBIcL = ujq5;
            this.fetchVPNInfo = pair2;
            this.KWHzl = pair3;
            this.copydefault = pair4;
            this.gEmmrt = pair5;
            this.OLrzqt = uji;
        }
    }

    public final Application AEQbTJ(AiBotDto aiBotDto) {
        BigDecimal bigDecimalEZpvd;
        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(aiBotDto.getInvestAmount());
        C38307pTy.Application application = C38307pTy.Companion;
        C38307pTy c38307pTyAEQbTJ = application.AEQbTJ(4);
        RoundingMode roundingMode = RoundingMode.DOWN;
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairEZpvd = uLP.EZpvd(pTB.formatICUNumber$default(bigDecimalEZpvd2, roundingMode, c38307pTyAEQbTJ, null, null, 12, null), aiBotDto.getInvestAmount());
        java.lang.String iCUPercent$default = null;
        uJQ textProperties$default = C52694wUx.toTextProperties$default(aiBotDto.getRealizedPnl(), 0, new Function1() { // from class: o.uJA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48235uJz.gEmmrt((java.lang.String) obj);
            }
        }, 1, null);
        uJQ textProperties$default2 = C52694wUx.toTextProperties$default(aiBotDto.getRealizedPnlRate(), 0, new Function1() { // from class: o.uJE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48235uJz.isConnected((java.lang.String) obj);
            }
        }, 1, null);
        uJQ textProperties$default3 = C52694wUx.toTextProperties$default(aiBotDto.getUpl(), 0, new Function1() { // from class: o.uJF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48235uJz.AkhnZx((java.lang.String) obj);
            }
        }, 1, null);
        uJQ textProperties$default4 = C52694wUx.toTextProperties$default(aiBotDto.getUplRate(), 0, new Function1() { // from class: o.uJG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48235uJz.values((java.lang.String) obj);
            }
        }, 1, null);
        uJQ textProperties$default5 = C52694wUx.toTextProperties$default(aiBotDto.getTotalApy(), 0, new Function1() { // from class: o.uJC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48235uJz.fetchVPNInfo((java.lang.String) obj);
            }
        }, 1, null);
        BigDecimal bigDecimalEZpvd3 = C33129mqd.EZpvd(aiBotDto.getWinRate());
        C38307pTy c38307pTyAEQbTJ2 = application.AEQbTJ(2);
        java.lang.Double dValueOf = java.lang.Double.valueOf(100.0d);
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairEZpvd2 = uLP.EZpvd(pTB.formatICUPercent$default(bigDecimalEZpvd3, roundingMode, c38307pTyAEQbTJ2, null, dValueOf, null, 20, null), aiBotDto.getWinRate());
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairEZpvd3 = uLP.EZpvd(DbNXlk(aiBotDto.getProfitLossRatio()), aiBotDto.getProfitLossRatio());
        java.lang.String maxDrawDown = aiBotDto.getMaxDrawDown();
        if (maxDrawDown.length() <= 0) {
            maxDrawDown = null;
        }
        if (maxDrawDown != null && (bigDecimalEZpvd = C33129mqd.EZpvd(maxDrawDown)) != null) {
            iCUPercent$default = pTB.formatICUPercent$default(bigDecimalEZpvd, roundingMode, application.EZpvd(2), null, dValueOf, null, 20, null);
        }
        return new Application(pairEZpvd, textProperties$default, textProperties$default2, textProperties$default3, textProperties$default4, textProperties$default5, pairEZpvd2, pairEZpvd3, uLP.EZpvd(C50964veA.KWHzl(iCUPercent$default), aiBotDto.getMaxDrawDown()), uLP.EZpvd(pTB.formatICUNumber$default(C33129mqd.EZpvd(aiBotDto.getSharpeRatio()), roundingMode, application.AEQbTJ(2), null, null, 12, null), aiBotDto.getSharpeRatio()), new uJI(aiBotDto.getAiModel().getName(), copydefault(aiBotDto.getAiModel().getName(), aiBotDto.getAiModel().getIconUrl())), null);
    }

    public static final java.lang.String gEmmrt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTB.formatICUNumber$default(C33129mqd.EZpvd(str), null, C38307pTy.Companion.AEQbTJ(4), DisplaySign.EXCEPT_ZERO, null, 9, null);
    }

    public static final java.lang.String isConnected(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56033xvF.fmtBotPnlPercent$default(str, true, 0, 4, null);
    }

    public static final java.lang.String AkhnZx(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTB.formatICUNumber$default(C33129mqd.EZpvd(str), null, C38307pTy.Companion.AEQbTJ(4), DisplaySign.EXCEPT_ZERO, null, 9, null);
    }

    public static final java.lang.String values(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56033xvF.fmtBotPnlPercent$default(str, true, 0, 4, null);
    }

    public static final java.lang.String fetchVPNInfo(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTB.formatICUPercent$default(C33129mqd.EZpvd(str), RoundingMode.DOWN, C38307pTy.Companion.AEQbTJ(2), DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 16, null);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str2 != null && str2.length() != 0) {
            java.lang.String strAEQbTJ = C53418wlC.AEQbTJ(str2);
            OLrzqt.put(str, strAEQbTJ);
            return strAEQbTJ;
        }
        java.lang.String str3 = OLrzqt.get(str);
        return str3 == null ? "" : str3;
    }

    public final LLMBotType OLrzqt(java.lang.Object obj) {
        return obj != null ? LLMBotType.Backtest : LLMBotType.LLM;
    }

    public final java.lang.String AEQbTJ(java.util.List<java.lang.String> list) {
        return CollectionsKt___CollectionsKt.joinToString$default(list, ", ", null, null, 2, null, new Function1() { // from class: o.uJD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48235uJz.AhwBna((java.lang.String) obj);
            }
        }, 22, null);
    }

    public static final java.lang.CharSequence AhwBna(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String upperCase = o.TaskDescription.AEQbTJ(str).copydefault().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    public static /* synthetic */ java.lang.String resolveDisplayName$default(C48235uJz c48235uJz, java.util.List list, java.lang.String str, LLMBotType lLMBotType, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            lLMBotType = LLMBotType.LLM;
        }
        return c48235uJz.AEQbTJ(list, str, lLMBotType);
    }

    public final java.lang.String AEQbTJ(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str, @NotNull LLMBotType lLMBotType) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lLMBotType, "");
        if (str.length() > 0) {
            return str;
        }
        java.lang.String strAEQbTJ = AEQbTJ(list);
        int i = Fragment.EZpvd[lLMBotType.ordinal()];
        if (i == 1) {
            return C33069mpW.copydefault(C48033uCm.Fragment.dvKsVJ, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, strAEQbTJ)));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C33069mpW.copydefault(C48033uCm.Fragment.dNCPSb, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, strAEQbTJ)));
    }

    public final java.util.List<StrategyProfitResponse> KWHzl(TacticsData tacticsData) {
        if (C33129mqd.KWHzl((java.util.Collection) tacticsData.getProfitSnapshots())) {
            java.util.List<StrategyProfitResponse> profitSnapshots = tacticsData.getProfitSnapshots();
            if (profitSnapshots == null) {
                profitSnapshots = yDY.AhwBna();
            }
            return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(profitSnapshots);
        }
        MpStgyCopyProfitChangeData profitData = tacticsData.getProfitData();
        java.util.List<StrategyProfitResponse> profitList = profitData != null ? profitData.getProfitList() : null;
        if (profitList == null) {
            profitList = yDY.AhwBna();
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(profitList);
    }

    public final java.lang.String DbNXlk(java.lang.String str) {
        if (str.length() == 0) {
            return "--";
        }
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
        if (bigDecimalEZpvd.compareTo(BigDecimal.ZERO) <= 0) {
            return "--";
        }
        BigDecimal bigDecimal = BigDecimal.ONE;
        if (bigDecimalEZpvd.compareTo(bigDecimal) >= 0) {
            return pTB.formatICUNumber$default(bigDecimalEZpvd, RoundingMode.DOWN, C38307pTy.Companion.AEQbTJ(1), null, null, 12, null) + ":1";
        }
        RoundingMode roundingMode = RoundingMode.DOWN;
        BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimalEZpvd, 10, roundingMode);
        Intrinsics.copydefault(bigDecimalDivide);
        return "1:" + pTB.formatICUNumber$default(bigDecimalDivide, roundingMode, C38307pTy.Companion.AEQbTJ(1), null, null, 12, null);
    }

    public final ActionBar KWHzl(BacktestDto backtestDto) {
        java.lang.String startTime = backtestDto.getStartTime();
        if (startTime == null) {
            startTime = "";
        }
        java.lang.String finishTime = backtestDto.getFinishTime();
        if (finishTime == null) {
            finishTime = "";
        }
        BotStatus status = backtestDto.getStatus();
        int i = status == null ? -1 : Fragment.AEQbTJ[status.ordinal()];
        uJL ujlEZpvd = EZpvd(startTime, finishTime, (i == 1 || i == 2) ? C33129mqd.djBIcL(backtestDto.getProgress()) : 1.0f);
        java.lang.String virtualStartTime = backtestDto.getVirtualStartTime();
        if (virtualStartTime == null) {
            virtualStartTime = "";
        }
        java.lang.String virtualEndTime = backtestDto.getVirtualEndTime();
        return new ActionBar(ujlEZpvd, copydefault(virtualStartTime, virtualEndTime != null ? virtualEndTime : "", backtestDto.getStatus()));
    }

    public final uJL EZpvd(java.lang.String str, java.lang.String str2, float f) {
        C59462zhW.Activity activity = C59462zhW.OLrzqt;
        long jAEQbTJ = C59519zia.AEQbTJ(C33129mqd.valueOf(str2) - C33129mqd.valueOf(str), DurationUnit.MILLISECONDS);
        long jOLrzqt = C59462zhW.OLrzqt(jAEQbTJ, f);
        long jOLrzqt2 = C59462zhW.OLrzqt(jAEQbTJ, jOLrzqt);
        long jAhwBna = C59462zhW.AhwBna(jOLrzqt);
        double dAhwBna = C59462zhW.AhwBna(jOLrzqt2) / 60.0d;
        int iCopydefault = C56548yJl.copydefault((int) java.lang.Math.ceil(C59462zhW.DbNXlk(jOLrzqt2) / 60.0d), 1);
        int iAhwBna = C33129mqd.AhwBna(java.lang.Long.valueOf(jAhwBna));
        int iCopydefault2 = C56548yJl.copydefault((int) java.lang.Math.ceil(dAhwBna), 1);
        C38307pTy.Application application = C38307pTy.Companion;
        C38307pTy c38307pTyAEQbTJ = application.AEQbTJ(0);
        RoundingMode roundingMode = RoundingMode.UP;
        return new uJL(f, dAhwBna, iCopydefault, iAhwBna, pTB.formatICUNumber$default(java.lang.Integer.valueOf(iCopydefault2), roundingMode, c38307pTyAEQbTJ, null, null, 12, null), pTB.formatICUNumber$default(java.lang.Integer.valueOf(iCopydefault), roundingMode, application.AEQbTJ(0), null, null, 12, null), pTB.formatICUNumber$default(java.lang.Long.valueOf(jAhwBna), roundingMode, application.AEQbTJ(0), null, null, 12, null));
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, BotStatus botStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        long jValueOf = C33129mqd.valueOf(str);
        long jValueOf2 = C33129mqd.valueOf(str2);
        if (jValueOf == 0 || jValueOf2 == 0) {
            return "--";
        }
        java.lang.String simpleDate$default = pTA.formatSimpleDate$default(new Date(jValueOf), null, 1, null);
        java.lang.String simpleDate$default2 = pTA.formatSimpleDate$default(new Date(jValueOf2), null, 1, null);
        double dKWHzl = C56548yJl.KWHzl(java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(jValueOf2 - jValueOf) / 1440.0d, 1.0d);
        java.util.Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("startDate", simpleDate$default), C56390yDp.OLrzqt("endDate", simpleDate$default2), C56390yDp.OLrzqt("num", pTB.formatICUNumber$default(java.lang.Double.valueOf(dKWHzl), RoundingMode.UP, C38307pTy.Companion.EZpvd(0), null, null, 12, null)));
        if (botStatus == BotStatus.Completed) {
            return C33069mpW.copydefault(C48033uCm.Fragment.UeEOUB, mapGEmmrt);
        }
        return C33069mpW.copydefault(C48033uCm.Fragment.QVAiDq, mapGEmmrt);
    }
}
