package com.okinc.okrisk;

import com.okinc.okrisk.service.DidResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class OKRiskPayloadManager$sendConsolidatedReport$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DidResponse>, Object> {
    final /* synthetic */ Action $action;
    final /* synthetic */ String $did;
    final /* synthetic */ Payload $payload;
    final /* synthetic */ boolean $shouldForceRetry;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKRiskPayloadManager$sendConsolidatedReport$1$result$1(Payload payload, Action action, boolean z, String str, Continuation<? super OKRiskPayloadManager$sendConsolidatedReport$1$result$1> continuation) {
        super(2, continuation);
        this.$payload = payload;
        this.$action = action;
        this.$shouldForceRetry = z;
        this.$did = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKRiskPayloadManager$sendConsolidatedReport$1$result$1(this.$payload, this.$action, this.$shouldForceRetry, this.$did, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DidResponse> continuation) {
        return ((OKRiskPayloadManager$sendConsolidatedReport$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            OKRiskPayloadManager oKRiskPayloadManager = OKRiskPayloadManager.copydefault;
            Payload payload = this.$payload;
            Action action = this.$action;
            boolean z = this.$shouldForceRetry;
            String str = this.$did;
            this.label = 1;
            obj = oKRiskPayloadManager.copydefault(payload, action, z, str, this);
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
