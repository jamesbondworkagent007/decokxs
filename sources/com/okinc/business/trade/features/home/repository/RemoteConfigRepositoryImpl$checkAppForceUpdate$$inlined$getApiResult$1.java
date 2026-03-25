package com.okinc.business.trade.features.home.repository;

import com.okinc.business.trade.features.home.domain.model.SingleForceUpdateState;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28246kUh;

/* JADX INFO: loaded from: classes7.dex */
public final class RemoteConfigRepositoryImpl$checkAppForceUpdate$$inlined$getApiResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<SingleForceUpdateState>>, Object> {
    int label;
    final /* synthetic */ RemoteConfigRepositoryImpl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigRepositoryImpl$checkAppForceUpdate$$inlined$getApiResult$1(Continuation continuation, RemoteConfigRepositoryImpl remoteConfigRepositoryImpl) {
        super(2, continuation);
        this.this$0 = remoteConfigRepositoryImpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RemoteConfigRepositoryImpl$checkAppForceUpdate$$inlined$getApiResult$1(continuation, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<SingleForceUpdateState>> continuation) {
        return ((RemoteConfigRepositoryImpl$checkAppForceUpdate$$inlined$getApiResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC28246kUh interfaceC28246kUh = this.this$0.EZpvd;
            this.label = 1;
            obj = interfaceC28246kUh.copydefault(this);
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
