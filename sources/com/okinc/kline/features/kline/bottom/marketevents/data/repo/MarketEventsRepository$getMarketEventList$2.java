package com.okinc.kline.features.kline.bottom.marketevents.data.repo;

import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventReq;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventResp;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C36126oQf;
import o.C36130oQj;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketEventsRepository$getMarketEventList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MarketEventResp>, Object> {
    final /* synthetic */ MarketEventReq $req;
    int label;
    final /* synthetic */ C36130oQj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketEventsRepository$getMarketEventList$2(C36130oQj c36130oQj, MarketEventReq marketEventReq, Continuation<? super MarketEventsRepository$getMarketEventList$2> continuation) {
        super(2, continuation);
        this.this$0 = c36130oQj;
        this.$req = marketEventReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketEventsRepository$getMarketEventList$2(this.this$0, this.$req, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MarketEventResp> continuation) {
        return ((MarketEventsRepository$getMarketEventList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C36126oQf c36126oQf = this.this$0.EZpvd;
            MarketEventReq marketEventReq = this.$req;
            this.label = 1;
            obj = c36126oQf.KWHzl(marketEventReq, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) ((ResponseData) obj).getData();
        if (list != null) {
            return (MarketEventResp) CollectionsKt___CollectionsKt.firstOrNull(list);
        }
        return null;
    }
}
