package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarEconomicTypeVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarTokenUnlockTypeVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.qir, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41018qir extends C40512qYp {
    public final Function2<java.lang.Integer, TradingCalendarEconomicTypeVo, Unit> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C41018qir() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarEconomicTypeVo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41018qir(Function2<? super java.lang.Integer, ? super TradingCalendarEconomicTypeVo, Unit> function2) {
        this.EZpvd = function2;
        register(TradingCalendarEconomicTypeVo.class, new C40992qiR(function2));
        register(TradingCalendarTokenUnlockTypeVo.class, new C40994qiT());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function2) : (r1v0 kotlin.jvm.functions.Function2))
 A[MD:(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarEconomicTypeVo, kotlin.Unit>):void (m)] (LINE:9) call: o.qir.<init>(kotlin.jvm.functions.Function2):void type: THIS */
    public /* synthetic */ C41018qir(Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function2);
    }
}
