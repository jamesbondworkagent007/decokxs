package o;

import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xqD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55766xqD implements InterfaceC54501xKt<C55804xqp<StrategyDetailsResponse>, kotlin.Pair<? extends java.lang.String, ? extends java.lang.Integer>> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public kotlin.Pair<java.lang.String, java.lang.Integer> KWHzl(@NotNull C55804xqp<StrategyDetailsResponse> c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        java.lang.String strDivS$default = C33129mqd.divS$default(c55804xqp.copydefault().getTotalPnl(), c55804xqp.copydefault().getInvestment(), null, null, null, 14, null);
        return new kotlin.Pair<>(C56068xvo.copydefault.copydefault(strDivS$default, true), java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) C56033xvF.KWHzl(strDivS$default))));
    }
}
