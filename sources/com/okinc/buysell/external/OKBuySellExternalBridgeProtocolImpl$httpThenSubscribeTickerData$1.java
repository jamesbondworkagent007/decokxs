package com.okinc.buysell.external;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import o.C31677lzy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C31677lzy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$1(C31677lzy c31677lzy, Continuation<? super OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$1> continuation) {
        super(continuation);
        this.this$0 = c31677lzy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((LifecycleOwner) null, (List<String>) null, false, (Continuation<? super Flow<? extends Map<String, TickersData>>>) this);
    }
}
