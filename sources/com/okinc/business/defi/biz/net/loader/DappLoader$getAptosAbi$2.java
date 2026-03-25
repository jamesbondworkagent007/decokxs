package com.okinc.business.defi.biz.net.loader;

import com.okinc.business.defi.biz.net.api.DappApiService;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C13926dbm;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class DappLoader$getAptosAbi$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<String>>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ String $chainIndex;
    int label;
    final /* synthetic */ C13926dbm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DappLoader$getAptosAbi$2(C13926dbm c13926dbm, String str, String str2, Continuation<? super DappLoader$getAptosAbi$2> continuation) {
        super(2, continuation);
        this.this$0 = c13926dbm;
        this.$address = str;
        this.$chainIndex = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DappLoader$getAptosAbi$2(this.this$0, this.$address, this.$chainIndex, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<String>> continuation) {
        return ((DappLoader$getAptosAbi$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            DappApiService dappApiServiceAEQbTJ = this.this$0.AEQbTJ();
            String str = this.$address;
            String str2 = this.$chainIndex;
            this.label = 1;
            obj = DappApiService.StateListAnimator.getAptosAbi$default(dappApiServiceAEQbTJ, str, str2, null, null, this, 12, null);
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
