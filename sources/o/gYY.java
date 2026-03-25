package o;

import com.okinc.business.dex.trade.core.domain.usecase.TradeStrategyHandlerKt$pollInternal$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes5.dex */
public final class gYY {
    public static final <T> Flow<T> EZpvd(long j, Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1) {
        return FlowKt.flow(new TradeStrategyHandlerKt$pollInternal$1(function1, j, null));
    }
}
