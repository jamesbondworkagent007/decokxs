package com.okinc.business.market.features.scanner.surge.signal.repo;

import com.okinc.business.market.features.scanner.surge.signal.data.SurgeSignalGemsData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C29293kqs;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;

/* JADX INFO: loaded from: classes7.dex */
public final class SurgeSignalRepositoryImpl$getSignalGems$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<SurgeSignalGemsData>>, Object> {
    final /* synthetic */ String $chainId;
    int label;
    final /* synthetic */ C29293kqs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeSignalRepositoryImpl$getSignalGems$2(C29293kqs c29293kqs, String str, Continuation<? super SurgeSignalRepositoryImpl$getSignalGems$2> continuation) {
        super(1, continuation);
        this.this$0 = c29293kqs;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SurgeSignalRepositoryImpl$getSignalGems$2(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<SurgeSignalGemsData>> continuation) {
        return ((SurgeSignalRepositoryImpl$getSignalGems$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.copydefault;
            String str = this.$chainId;
            this.label = 1;
            obj = interfaceC27595jyE.AYXKKw(str, this);
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
