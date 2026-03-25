package o;

import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.SignalSortProfitData;
import com.okinc.tradingbot.impl.strategy.bean.SignalProfitCard;
import com.okinc.tradingbot.impl.strategy.dataMapper.SignalProfitRange;
import com.okinc.unify_trade.biz.CoinPairProfit;
import com.okinc.unify_trade.biz.SignalProfits;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53874wti implements InterfaceC54501xKt<java.util.List<? extends SignalProfits>, SignalProfitCard> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final SignalProfitRange EZpvd;
    public SignalProfits OLrzqt;

    public C53874wti(@NotNull SignalProfitRange signalProfitRange) {
        Intrinsics.checkNotNullParameter(signalProfitRange, "");
        this.EZpvd = signalProfitRange;
        this.OLrzqt = new SignalProfits(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: o.wti$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wti.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public SignalProfitCard KWHzl(@NotNull java.util.List<SignalProfits> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        SignalProfits signalProfits = (SignalProfits) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (signalProfits == null) {
            signalProfits = new SignalProfits(null, null, null, null, 15, null);
        }
        this.OLrzqt = signalProfits;
        java.util.List<CoinPairProfit> instProfits = signalProfits.getInstProfits();
        if (instProfits != null) {
            for (CoinPairProfit coinPairProfit : instProfits) {
                if (coinPairProfit.getInstId().length() > 0 && coinPairProfit.getInstType().length() > 0) {
                    java.lang.String titleByIdAndType$default = C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, coinPairProfit.getInstId(), coinPairProfit.getInstType(), false, false, 12, null);
                    xMR xmr = xMR.copydefault;
                    java.lang.String instMaxDrawdown = coinPairProfit.getInstMaxDrawdown();
                    RoundingMode roundingMode = RoundingMode.DOWN;
                    arrayList.add(new SignalSortProfitData(titleByIdAndType$default, xMR.formatPercent$default(xmr, instMaxDrawdown, 0, roundingMode, 2, null), xMR.formatPercentWithSymbol$default(xmr, coinPairProfit.getInstBacktestProfitRate(), 0, 0, roundingMode, 6, null), C56033xvF.OLrzqt((java.lang.Object) coinPairProfit.getInstBacktestProfitRate())));
                }
            }
        }
        SignalProfits signalProfits2 = this.OLrzqt;
        SignalProfitRange.TaskDescription taskDescription = SignalProfitRange.Companion;
        java.lang.String strOLrzqt = taskDescription.OLrzqt(this.EZpvd);
        java.lang.String strKWHzl = taskDescription.KWHzl(this.EZpvd);
        xMR xmr2 = xMR.copydefault;
        java.lang.String backtestProfitRate = this.OLrzqt.getBacktestProfitRate();
        java.lang.String percentWithSymbol$default = xMR.formatPercentWithSymbol$default(xmr2, backtestProfitRate == null ? "" : backtestProfitRate, 0, 0, RoundingMode.DOWN, 6, null);
        java.lang.String backtestProfitRate2 = this.OLrzqt.getBacktestProfitRate();
        return new SignalProfitCard(signalProfits2, strOLrzqt, strKWHzl, percentWithSymbol$default, C56033xvF.OLrzqt((java.lang.Object) (backtestProfitRate2 != null ? backtestProfitRate2 : "")), arrayList, C33129mqd.AEQbTJ(this.OLrzqt.getTotalCount(), 5));
    }
}
