package o;

import com.okinc.biz.TacticsType;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.ShareData;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wtf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53871wtf implements InterfaceC54501xKt<java.util.List<? extends TickersData>, TacticsData> {
    public StrategyPendingListResp copydefault;

    /* JADX INFO: renamed from: o.wtf$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TacticsType.values().length];
            try {
                iArr[TacticsType.TACTICS_GRDE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TacticsType.TACTICS_CONTRACT_GRID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TacticsType.TACTICS_CONTRACT_DCA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull StrategyPendingListResp strategyPendingListResp) {
        Intrinsics.checkNotNullParameter(strategyPendingListResp, "");
        this.copydefault = strategyPendingListResp;
    }

    public final StrategyPendingListResp EZpvd() {
        StrategyPendingListResp strategyPendingListResp = this.copydefault;
        if (strategyPendingListResp != null) {
            return strategyPendingListResp;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public TacticsData KWHzl(@NotNull java.util.List<TickersData> list) {
        kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl;
        kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault;
        Intrinsics.checkNotNullParameter(list, "");
        TickersData tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull(list);
        java.lang.String last = tickersData != null ? tickersData.getLast() : null;
        java.lang.String str = last != null ? last : "";
        StrategyPendingListResp strategyPendingListRespEZpvd = EZpvd();
        boolean z = Intrinsics.EZpvd((java.lang.Object) strategyPendingListRespEZpvd.getState(), (java.lang.Object) "canceled") || Intrinsics.EZpvd((java.lang.Object) strategyPendingListRespEZpvd.getState(), (java.lang.Object) "order_failed") || Intrinsics.EZpvd((java.lang.Object) strategyPendingListRespEZpvd.getState(), (java.lang.Object) "stopped");
        TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(strategyPendingListRespEZpvd.getOrderType());
        if (tacticsTypeAEQbTJ == null) {
            tacticsTypeAEQbTJ = TacticsType.TACTICS_GRDE;
        }
        TacticsType tacticsType = tacticsTypeAEQbTJ;
        java.lang.String strAEQbTJ = C56033xvF.AEQbTJ(strategyPendingListRespEZpvd.getInstType(), strategyPendingListRespEZpvd.getInstId());
        int[] iArr = StateListAnimator.copydefault;
        int i = iArr[tacticsType.ordinal()];
        if (i == 1 || i == 2) {
            pairKWHzl = C55959xtl.Companion.KWHzl(strategyPendingListRespEZpvd.getArbitrageNum(), str);
        } else if (i == 3) {
            pairKWHzl = C55951xtd.Companion.EZpvd(strategyPendingListRespEZpvd.getCompletedCycles());
        } else {
            pairKWHzl = C56390yDp.OLrzqt(null, null);
        }
        java.lang.String strComponent1 = pairKWHzl.component1();
        java.lang.String strComponent2 = pairKWHzl.component2();
        int i2 = iArr[tacticsType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            pairCopydefault = C55959xtl.Companion.copydefault(strAEQbTJ, strategyPendingListRespEZpvd.getInstType(), strategyPendingListRespEZpvd.getInstId(), strategyPendingListRespEZpvd.getMinPx(), strategyPendingListRespEZpvd.getMaxPx());
        } else {
            pairCopydefault = C56390yDp.OLrzqt(null, null);
        }
        java.lang.String strComponent12 = pairCopydefault.component1();
        java.lang.String strComponent22 = pairCopydefault.component2();
        java.lang.String instId = EZpvd().getInstId();
        java.lang.String instType = EZpvd().getInstType();
        java.lang.String algoId = EZpvd().getAlgoId();
        java.lang.String strSubS$default = C33129mqd.subS$default(java.lang.String.valueOf(java.lang.System.currentTimeMillis()), EZpvd().getCTime(), null, null, null, 14, null);
        ShareData shareData = new ShareData(null, C33129mqd.divS$default(strategyPendingListRespEZpvd.getTotalPnl(), strategyPendingListRespEZpvd.getInvestment(), null, null, null, 14, null), null, strategyPendingListRespEZpvd.getTotalPnl(), strAEQbTJ, strComponent1, strComponent2, strComponent12, strComponent22, null, null, null, null, null, null, 32261, null);
        java.lang.String direction = strategyPendingListRespEZpvd.getDirection();
        java.lang.String coinTitle$default = C56033xvF.getCoinTitle$default(EZpvd().getInstType(), EZpvd().getInstId(), z, null, null, 24, null);
        return new TacticsData(strategyPendingListRespEZpvd.getOrderType(), algoId, instType, instId, null, null, z, coinTitle$default, tacticsType, 0, C54797xVr.getCorrectShowLeverageWithSymbol$default(C54797xVr.copydefault, strategyPendingListRespEZpvd.getLever(), false, "", null, false, 26, null), null, 0L, null, null, null, null, null, shareData, null, null, C56033xvF.getCoinTitle$default(strategyPendingListRespEZpvd.getInstType(), strategyPendingListRespEZpvd.getInstId(), false, null, null, 28, null) + " " + C56033xvF.iwGUEr(strategyPendingListRespEZpvd.getOrderType()), direction, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "3", null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, strSubS$default, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -6555088, Integer.MAX_VALUE, -1, -1, -33, 3, null);
    }
}
