package com.okinc.business.market.features.holders.data;

import com.okinc.business.data.model.market.TokenHolderResponseData;
import com.okinc.network.okg.response.ResponseData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C26284jYt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23229huL;

/* JADX INFO: loaded from: classes7.dex */
public final class HolderRepositoryImpl$getTokenHolders$responseData$1 extends SuspendLambda implements Function1<Continuation<? super ResponseData<TokenHolderResponseData>>, Object> {
    final /* synthetic */ HashMap<String, String> $param;
    int label;
    final /* synthetic */ C26284jYt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolderRepositoryImpl$getTokenHolders$responseData$1(C26284jYt c26284jYt, HashMap<String, String> map, Continuation<? super HolderRepositoryImpl$getTokenHolders$responseData$1> continuation) {
        super(1, continuation);
        this.this$0 = c26284jYt;
        this.$param = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HolderRepositoryImpl$getTokenHolders$responseData$1(this.this$0, this.$param, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<TokenHolderResponseData>> continuation) {
        return ((HolderRepositoryImpl$getTokenHolders$responseData$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23229huL interfaceC23229huL = this.this$0.KWHzl;
            HashMap<String, String> map = this.$param;
            this.label = 1;
            obj = interfaceC23229huL.gEmmrt(map, this);
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
