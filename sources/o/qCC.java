package o;

import com.okinc.core.util.SPUtils;
import com.okinc.market.search.features.main.root.data.po.TradingStrategy;
import com.okinc.tradeapi.framework.constant.TradeKey;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qCC implements InterfaceC39921qCs<TradingStrategy> {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public java.util.ArrayList<TradingStrategy> KWHzl = new java.util.ArrayList<>();

    public qCC() {
        java.util.ArrayList arrayList = SPUtils.getArrayList("trading_strategy_history_trader", TradingStrategy.class);
        arrayList = arrayList == null ? new java.util.ArrayList() : arrayList;
        if (arrayList.size() != 0) {
            this.KWHzl.addAll(arrayList);
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qCC.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.util.List<TradingStrategy> KWHzl() {
        java.lang.Boolean boolGEmmrt;
        xND xndAEQbTJ = ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).AEQbTJ();
        return (xndAEQbTJ == null || (boolGEmmrt = xndAEQbTJ.gEmmrt()) == null || !boolGEmmrt.booleanValue()) ? yDY.AhwBna() : this.KWHzl;
    }

    public void OLrzqt(@NotNull TradingStrategy tradingStrategy) {
        Intrinsics.checkNotNullParameter(tradingStrategy, "");
        if (!this.KWHzl.contains(tradingStrategy)) {
            this.KWHzl.add(0, tradingStrategy);
        } else {
            this.KWHzl.remove(tradingStrategy);
            this.KWHzl.add(0, tradingStrategy);
        }
        copydefault();
    }

    public void OLrzqt() {
        this.KWHzl.clear();
        SPUtils.put("trading_strategy_history_trader", this.KWHzl);
    }

    public void copydefault() {
        SPUtils.put("trading_strategy_history_trader", CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) this.KWHzl, 20));
    }
}
