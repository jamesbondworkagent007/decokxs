package o;

import com.okinc.business.dex.tee.domain.model.Rules;
import com.okinc.business.dex.trade.copytrading.edit.ui.widget.autosell.data.CopyTradingAutoSellStrategy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class gUR {
    public static final java.util.List<Rules> KWHzl(@NotNull java.util.List<? extends CopyTradingAutoSellStrategy> list) {
        Rules rules;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (CopyTradingAutoSellStrategy copyTradingAutoSellStrategy : list) {
            if (copyTradingAutoSellStrategy instanceof CopyTradingAutoSellStrategy.TakeProfit) {
                CopyTradingAutoSellStrategy.TakeProfit takeProfit = (CopyTradingAutoSellStrategy.TakeProfit) copyTradingAutoSellStrategy;
                rules = new Rules(1, takeProfit.AhwBna(), takeProfit.KWHzl());
            } else {
                if (!(copyTradingAutoSellStrategy instanceof CopyTradingAutoSellStrategy.StopLoss)) {
                    throw new NoWhenBranchMatchedException();
                }
                CopyTradingAutoSellStrategy.StopLoss stopLoss = (CopyTradingAutoSellStrategy.StopLoss) copyTradingAutoSellStrategy;
                rules = new Rules(2, C23313hvq.mulCheckS$default(stopLoss.valueOf(), -1, null, null, null, 14, null), stopLoss.KWHzl());
            }
            arrayList.add(rules);
        }
        return arrayList;
    }
}
