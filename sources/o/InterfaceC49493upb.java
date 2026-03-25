package o;

import com.okinc.biz.TradeType;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.tradeapi.bean.PositionAddTpslBean;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.StrategyMoveOrderReq;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.biz.subscribe.TradeOrderData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.upb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49493upb extends InterfaceC43217rlC {
    xDB AEQbTJ(@NotNull TradeOrderData tradeOrderData, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2);

    C54313xDu AEQbTJ(@NotNull BizTradeStrategyInfo bizTradeStrategyInfo, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2);

    InterfaceC58217yxC AEQbTJ(@NotNull TradeAllOrderApi tradeAllOrderApi, @NotNull java.lang.Object obj, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2, @NotNull android.app.Activity activity);

    boolean AEQbTJ(@NotNull TradePositionManager.PositionItem positionItem);

    void EZpvd(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull TradeAllOrderApi tradeAllOrderApi, @NotNull TradeAllOrderApi tradeAllOrderApi2, Function1<? super java.lang.Integer, Unit> function1);

    void EZpvd(@NotNull androidx.fragment.app.Fragment fragment, @NotNull BizInstrument bizInstrument, @NotNull java.lang.String str);

    void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull android.content.Context context, @NotNull TradePositionManager.PositionItem positionItem, @NotNull Function1<? super StrategyMoveOrderReq, Unit> function1, @NotNull Function0<Unit> function0, Function1<? super java.lang.Integer, Unit> function12);

    void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull TradePositionManager.PositionItem positionItem, @NotNull java.lang.String str, java.lang.String str2, Function1<? super java.lang.Integer, Unit> function1);

    void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull BizInstrument bizInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull TradeType tradeType, Function1<? super java.lang.Integer, Unit> function1);

    java.lang.String KWHzl(@NotNull java.lang.String str);

    java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    xDB KWHzl(@NotNull TradeOrderData tradeOrderData, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2);

    void KWHzl(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str);

    void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull TradePositionManager.PositionItem positionItem, @NotNull PositionAddTpslBean positionAddTpslBean, Function1<? super java.lang.Integer, Unit> function1);

    void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull BizInstrument bizInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull TradeType tradeType, Function1<? super java.lang.Integer, Unit> function1, boolean z);

    java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Function1<? super androidx.fragment.app.Fragment, Unit> function1, @NotNull Continuation<? super androidx.fragment.app.Fragment> continuation);

    java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull Function1<? super androidx.fragment.app.Fragment, Unit> function1, @NotNull Continuation<? super androidx.fragment.app.Fragment> continuation);

    xDB OLrzqt(@NotNull TradeOrderData tradeOrderData, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2);

    C54313xDu OLrzqt(@NotNull BizTradeStrategyInfo bizTradeStrategyInfo, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2);

    androidx.fragment.app.Fragment copydefault(@NotNull BizInstrument bizInstrument, @NotNull java.lang.String str, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2, @NotNull Function1<? super java.lang.Boolean, Unit> function1, Function1<? super java.lang.Integer, Unit> function12, Function2<? super java.lang.String, ? super java.lang.String, Unit> function22, Function1<? super C49423uoK, Unit> function13, java.lang.String str2, java.lang.String str3, boolean z, @NotNull java.lang.String str4, java.lang.String str5);

    xDB copydefault(@NotNull TradeOrderData tradeOrderData, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2);
}
