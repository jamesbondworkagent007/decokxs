package com.okinc.tradingbot.impl.botDetail.ui;

import androidx.lifecycle.ViewModel;
import com.okinc.biz.TacticsType;
import com.okinc.tradingbot.impl.botDetail.ui.OverviewRingChartViewModel;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.DCACoinBalanceDto;
import com.okinc.unify_trade.biz.DCACurrentBalanceDto;
import com.okinc.unify_trade.biz.SpotDCADto;
import com.okinc.unify_trade.biz.SpotGridVo;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C33129mqd;
import o.C38307pTy;
import o.C54536xML;
import o.C56066xvm;
import o.pTB;
import o.uLP;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class OverviewRingChartViewModel extends ViewModel {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final StateFlow<TaskDescription> EZpvd;
    public final MutableStateFlow<TaskDescription> KWHzl;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TacticsType.values().length];
            try {
                iArr[TacticsType.TACTICS_GRDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TacticsType.TACTICS_SPOT_DCA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TaskDescription> KWHzl() {
        return this.EZpvd;
    }

    @yCM
    public OverviewRingChartViewModel() {
        MutableStateFlow<TaskDescription> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.botDetail.ui.OverviewRingChartViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void EZpvd(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        this.KWHzl.setValue(OLrzqt(tacticsData));
    }

    public final TaskDescription OLrzqt(final TacticsData tacticsData) {
        SpotGridVo spotGrid;
        SpotGridVo spotGrid2;
        DCACoinBalanceDto quoteCoin;
        DCACoinBalanceDto baseCoin;
        DCACoinBalanceDto quoteCoin2;
        DCACoinBalanceDto baseCoin2;
        SpotDCADto spotDca;
        TacticsType tacticsType = tacticsData.getTacticsType();
        int i = tacticsType == null ? -1 : StateListAnimator.AEQbTJ[tacticsType.ordinal()];
        String curQuoteFundRatio = null;
        if (i == 1) {
            String curBaseSz = tacticsData.getCurBaseSz();
            String curQuoteSz = tacticsData.getCurQuoteSz();
            BotVo bot = tacticsData.getBot();
            String curBaseFundRatio = (bot == null || (spotGrid2 = bot.getSpotGrid()) == null) ? null : spotGrid2.getCurBaseFundRatio();
            BotVo bot2 = tacticsData.getBot();
            if (bot2 != null && (spotGrid = bot2.getSpotGrid()) != null) {
                curQuoteFundRatio = spotGrid.getCurQuoteFundRatio();
            }
            return copydefault(curBaseSz, curQuoteSz, curBaseFundRatio, curQuoteFundRatio, new Function1() { // from class: o.uIs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OverviewRingChartViewModel.EZpvd(this.copydefault, (java.lang.String) obj);
                }
            });
        }
        if (i != 2) {
            return null;
        }
        BotVo bot3 = tacticsData.getBot();
        DCACurrentBalanceDto currentBalance = (bot3 == null || (spotDca = bot3.getSpotDca()) == null) ? null : spotDca.getCurrentBalance();
        String amount = (currentBalance == null || (baseCoin2 = currentBalance.getBaseCoin()) == null) ? null : baseCoin2.getAmount();
        String amount2 = (currentBalance == null || (quoteCoin2 = currentBalance.getQuoteCoin()) == null) ? null : quoteCoin2.getAmount();
        String ratio = (currentBalance == null || (baseCoin = currentBalance.getBaseCoin()) == null) ? null : baseCoin.getRatio();
        if (currentBalance != null && (quoteCoin = currentBalance.getQuoteCoin()) != null) {
            curQuoteFundRatio = quoteCoin.getRatio();
        }
        return copydefault(amount, amount2, ratio, curQuoteFundRatio, new Function1() { // from class: o.uIv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OverviewRingChartViewModel.KWHzl(this.AEQbTJ, tacticsData, (java.lang.String) obj);
            }
        });
    }

    public static final String EZpvd(OverviewRingChartViewModel overviewRingChartViewModel, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return overviewRingChartViewModel.EZpvd(str);
    }

    public static final String KWHzl(OverviewRingChartViewModel overviewRingChartViewModel, TacticsData tacticsData, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return overviewRingChartViewModel.AEQbTJ(tacticsData, str);
    }

    public final TaskDescription copydefault(String str, String str2, String str3, String str4, Function1<? super String, String> function1) {
        BigDecimal scale = C33129mqd.EZpvd(str3).setScale(4, RoundingMode.DOWN);
        String strGEmmrt = C33129mqd.gEmmrt(scale);
        boolean z = true;
        String strSubS$default = C33129mqd.subS$default(1, scale, null, null, null, 14, null);
        Pair<? extends String, ? extends String> pairEZpvd = uLP.EZpvd(function1.invoke(str == null ? "" : str), str == null ? "" : str);
        Pair<? extends String, ? extends String> pairEZpvd2 = uLP.EZpvd(function1.invoke(str2 == null ? "" : str2), str2 != null ? str2 : "");
        Pair<? extends String, ? extends String> pairEZpvd3 = uLP.EZpvd(AEQbTJ(strGEmmrt), strGEmmrt);
        Pair<? extends String, ? extends String> pairEZpvd4 = uLP.EZpvd(AEQbTJ(strSubS$default), strSubS$default);
        if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
            z = false;
        }
        return new TaskDescription(z, pairEZpvd, pairEZpvd2, pairEZpvd3, pairEZpvd4, null);
    }

    public final String AEQbTJ(String str) {
        return pTB.formatICUPercent$default(C33129mqd.EZpvd(str), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(2), null, Double.valueOf(100.0d), null, 20, null);
    }

    public final String AEQbTJ(TacticsData tacticsData, String str) {
        return C56066xvm.EZpvd.EZpvd(tacticsData.getInstId(), tacticsData.getInstType(), str, tacticsData.getTradeQuoteCcy(), new Function1() { // from class: o.uIr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OverviewRingChartViewModel.OLrzqt((C54536xML) obj);
            }
        });
    }

    public static final Unit OLrzqt(C54536xML c54536xML) {
        Intrinsics.checkNotNullParameter(c54536xML, "");
        c54536xML.AEQbTJ(true);
        c54536xML.EZpvd("4", "4");
        return Unit.INSTANCE;
    }

    public final String EZpvd(String str) {
        return pTB.formatICUNumber$default(C33129mqd.EZpvd(str), null, C38307pTy.Companion.AEQbTJ(4), null, null, 13, null);
    }

    public static final class TaskDescription {
        public final Pair<? extends String, ? extends String> AEQbTJ;
        public final Pair<? extends String, ? extends String> EZpvd;
        public final Pair<? extends String, ? extends String> KWHzl;
        public final boolean OLrzqt;
        public final Pair<? extends String, ? extends String> copydefault;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 boolean), (r2v0 kotlin.Pair), (r3v0 kotlin.Pair), (r4v0 kotlin.Pair), (r5v0 kotlin.Pair) A[MD:(boolean, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>):void (m)] call: com.okinc.tradingbot.impl.botDetail.ui.OverviewRingChartViewModel.TaskDescription.<init>(boolean, kotlin.Pair, kotlin.Pair, kotlin.Pair, kotlin.Pair):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(boolean z, Pair pair, Pair pair2, Pair pair3, Pair pair4, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, pair, pair2, pair3, pair4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.tradingbot.impl.botDetail.ui.OverviewRingChartViewModel$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-lkFnNS4$default, reason: not valid java name */
        public static /* synthetic */ TaskDescription m7086copylkFnNS4$default(TaskDescription taskDescription, boolean z, Pair pair, Pair pair2, Pair pair3, Pair pair4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = taskDescription.OLrzqt;
            }
            if ((i & 2) != 0) {
                pair = taskDescription.AEQbTJ;
            }
            Pair pair5 = pair;
            if ((i & 4) != 0) {
                pair2 = taskDescription.EZpvd;
            }
            Pair pair6 = pair2;
            if ((i & 8) != 0) {
                pair3 = taskDescription.copydefault;
            }
            Pair pair7 = pair3;
            if ((i & 16) != 0) {
                pair4 = taskDescription.KWHzl;
            }
            return taskDescription.AEQbTJ(z, pair5, pair6, pair7, pair4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(boolean z, @NotNull Pair<? extends String, ? extends String> pair, @NotNull Pair<? extends String, ? extends String> pair2, @NotNull Pair<? extends String, ? extends String> pair3, @NotNull Pair<? extends String, ? extends String> pair4) {
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(pair2, "");
            Intrinsics.checkNotNullParameter(pair3, "");
            Intrinsics.checkNotNullParameter(pair4, "");
            return new TaskDescription(z, pair, pair2, pair3, pair4, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Pair<? extends String, ? extends String> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Pair<? extends String, ? extends String> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Pair<? extends String, ? extends String> OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Pair<? extends String, ? extends String> copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.OLrzqt == taskDescription.OLrzqt && uLP.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ) && uLP.EZpvd(this.EZpvd, taskDescription.EZpvd) && uLP.EZpvd(this.copydefault, taskDescription.copydefault) && uLP.EZpvd(this.KWHzl, taskDescription.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((Boolean.hashCode(this.OLrzqt) * 31) + uLP.EZpvd(this.AEQbTJ)) * 31) + uLP.EZpvd(this.EZpvd)) * 31) + uLP.EZpvd(this.copydefault)) * 31) + uLP.EZpvd(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ChartUiModel(isEmpty=" + this.OLrzqt + ", baseCcySzDisplay=" + uLP.gEmmrt(this.AEQbTJ) + ", quoteCcySzDisplay=" + uLP.gEmmrt(this.EZpvd) + ", baseCcyRatioDisplay=" + uLP.gEmmrt(this.copydefault) + ", quoteCcyRatioDisplay=" + uLP.gEmmrt(this.KWHzl) + ")";
        }

        public TaskDescription(boolean z, Pair<? extends String, ? extends String> pair, Pair<? extends String, ? extends String> pair2, Pair<? extends String, ? extends String> pair3, Pair<? extends String, ? extends String> pair4) {
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(pair2, "");
            Intrinsics.checkNotNullParameter(pair3, "");
            Intrinsics.checkNotNullParameter(pair4, "");
            this.OLrzqt = z;
            this.AEQbTJ = pair;
            this.EZpvd = pair2;
            this.copydefault = pair3;
            this.KWHzl = pair4;
        }
    }
}
