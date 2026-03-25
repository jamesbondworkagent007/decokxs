package o;

import com.okinc.market.ext.UpDownColor;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qTq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40378qTq {
    public static final C41787qxR OLrzqt(@NotNull TickersData tickersData) {
        Intrinsics.checkNotNullParameter(tickersData, "");
        kotlin.Pair pairCalApplies$default = C55692xoj.calApplies$default(C55692xoj.KWHzl, tickersData.getLast(), tickersData.getOpen24h(), tickersData.getSodUtc0(), tickersData.getSodUtc8(), false, 16, null);
        double dDoubleValue = ((java.lang.Number) pairCalApplies$default.component1()).doubleValue();
        return new C41787qxR(tickersData, UpDownColor.Companion.AEQbTJ(new BigDecimal(java.lang.String.valueOf(dDoubleValue))), pTF.KWHzl.AEQbTJ((java.lang.String) pairCalApplies$default.component2()), tickersData.getLast().length() == 0 ? "--" : pTB.formatLocalized$default(tickersData.getLast(), null, 1, null), dDoubleValue, tickersData.getLast());
    }
}
