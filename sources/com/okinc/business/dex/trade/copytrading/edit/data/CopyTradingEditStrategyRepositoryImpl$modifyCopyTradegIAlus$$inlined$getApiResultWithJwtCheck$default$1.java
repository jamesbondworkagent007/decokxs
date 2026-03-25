package com.okinc.business.dex.trade.copytrading.edit.data;

import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingStrategy;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonElement;
import o.C19869gSi;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23234huQ;

/* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.edit.data.CopyTradingEditStrategyRepositoryImpl$modifyCopyTrade-gIAlu-s$$inlined$getApiResultWithJwtCheck$default$1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingEditStrategyRepositoryImpl$modifyCopyTradegIAlus$$inlined$getApiResultWithJwtCheck$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<JsonElement>>, Object> {
    final /* synthetic */ CopyTradingStrategy $strategy$inlined;
    int label;
    final /* synthetic */ C19869gSi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyRepositoryImpl$modifyCopyTradegIAlus$$inlined$getApiResultWithJwtCheck$default$1(Continuation continuation, C19869gSi c19869gSi, CopyTradingStrategy copyTradingStrategy) {
        super(2, continuation);
        this.this$0 = c19869gSi;
        this.$strategy$inlined = copyTradingStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingEditStrategyRepositoryImpl$modifyCopyTradegIAlus$$inlined$getApiResultWithJwtCheck$default$1(continuation, this.this$0, this.$strategy$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<JsonElement>> continuation) {
        return ((CopyTradingEditStrategyRepositoryImpl$modifyCopyTradegIAlus$$inlined$getApiResultWithJwtCheck$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23234huQ interfaceC23234huQ = this.this$0.valueOf;
            CopyTradingStrategy copyTradingStrategy = this.$strategy$inlined;
            this.label = 1;
            obj = interfaceC23234huQ.KWHzl(copyTradingStrategy, this);
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
