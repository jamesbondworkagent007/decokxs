package o;

import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xqE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55767xqE implements InterfaceC54501xKt<java.util.List<? extends StrategyConfigInfo>, C55853xrl> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* bridge */ /* synthetic */ C55853xrl KWHzl(java.util.List<? extends StrategyConfigInfo> list) {
        return KWHzl2((java.util.List<StrategyConfigInfo>) list);
    }

    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
    public C55853xrl KWHzl2(@NotNull java.util.List<StrategyConfigInfo> list) {
        java.lang.String min;
        java.lang.String max;
        java.lang.String min2;
        java.lang.String max2;
        BotRangeConfig slPct;
        BotRangeConfig slPct2;
        BotRangeConfig tpPct;
        BotRangeConfig tpPct2;
        Intrinsics.checkNotNullParameter(list, "");
        StrategyConfigInfo strategyConfigInfo = (StrategyConfigInfo) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (strategyConfigInfo == null || (tpPct2 = strategyConfigInfo.getTpPct()) == null || (min = tpPct2.getMin()) == null) {
            min = "0.004";
        }
        if (strategyConfigInfo == null || (tpPct = strategyConfigInfo.getTpPct()) == null || (max = tpPct.getMax()) == null) {
            max = "100";
        }
        if (strategyConfigInfo == null || (slPct2 = strategyConfigInfo.getSlPct()) == null || (min2 = slPct2.getMin()) == null) {
            min2 = "0.005";
        }
        if (strategyConfigInfo == null || (slPct = strategyConfigInfo.getSlPct()) == null || (max2 = slPct.getMax()) == null) {
            max2 = "0.9999";
        }
        return new C55853xrl(min, max, min2, max2);
    }
}
