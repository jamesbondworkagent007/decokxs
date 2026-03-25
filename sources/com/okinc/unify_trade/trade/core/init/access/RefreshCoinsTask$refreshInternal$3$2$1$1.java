package com.okinc.unify_trade.trade.core.init.access;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import o.C54611xOu;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.xNQ;

/* JADX INFO: loaded from: classes12.dex */
public final class RefreshCoinsTask$refreshInternal$3$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ xNQ $coinInfoProvider;
    final /* synthetic */ CompletableDeferred<Boolean> $deferred;
    final /* synthetic */ ResponseData<ArrayList<TradeCoinInfo>> $resp;
    int label;
    final /* synthetic */ C54611xOu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshCoinsTask$refreshInternal$3$2$1$1(C54611xOu c54611xOu, ResponseData<ArrayList<TradeCoinInfo>> responseData, xNQ xnq, CompletableDeferred<Boolean> completableDeferred, Continuation<? super RefreshCoinsTask$refreshInternal$3$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c54611xOu;
        this.$resp = responseData;
        this.$coinInfoProvider = xnq;
        this.$deferred = completableDeferred;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RefreshCoinsTask$refreshInternal$3$2$1$1(this.this$0, this.$resp, this.$coinInfoProvider, this.$deferred, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RefreshCoinsTask$refreshInternal$3$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                try {
                    pUU.KWHzl("RefreshCoinsTask", "start map data");
                    xNQ.TaskDescription taskDescription = this.this$0.EZpvd;
                    ArrayList<TradeCoinInfo> data = this.$resp.getData();
                    if (data == null) {
                        data = new ArrayList<>();
                    }
                    xNQ.Activity activityOLrzqt = taskDescription.OLrzqt(data);
                    pUU.KWHzl("RefreshCoinsTask", "end map data");
                    this.$coinInfoProvider.OLrzqt(activityOLrzqt);
                    this.$deferred.complete(C56443yFo.KWHzl(true));
                } catch (Exception e) {
                    pUU.AEQbTJ("RefreshCoinsTask", "map data error", e);
                    this.$deferred.complete(C56443yFo.KWHzl(false));
                }
                this.this$0.OLrzqt = null;
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.this$0.OLrzqt = null;
                throw th;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
