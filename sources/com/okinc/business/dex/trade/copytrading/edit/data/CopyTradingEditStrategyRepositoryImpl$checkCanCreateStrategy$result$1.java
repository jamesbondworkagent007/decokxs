package com.okinc.business.dex.trade.copytrading.edit.data;

import com.okinc.business.dex.trade.copytrading.edit.data.model.CanCreateStrategyRequest;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonElement;
import o.C19869gSi;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23234huQ;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$result$1 extends SuspendLambda implements Function1<Continuation<? super ResponseData<JsonElement>>, Object> {
    final /* synthetic */ String $chainId;
    int label;
    final /* synthetic */ C19869gSi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$result$1(C19869gSi c19869gSi, String str, Continuation<? super CopyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$result$1> continuation) {
        super(1, continuation);
        this.this$0 = c19869gSi;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CopyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$result$1(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<JsonElement>> continuation) {
        return ((CopyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$result$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23234huQ interfaceC23234huQ = this.this$0.valueOf;
            CanCreateStrategyRequest canCreateStrategyRequest = new CanCreateStrategyRequest(this.this$0.AYXKKw.KWHzl(), this.$chainId);
            this.label = 1;
            obj = interfaceC23234huQ.OLrzqt(canCreateStrategyRequest, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
