package com.okinc.wallet.hardware.impl.onekey;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C57138yck;

/* JADX INFO: loaded from: classes12.dex */
public final class OneKeyManagerImpl$ensureDeviceReady$2$downloadJSBundle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ C57138yck this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneKeyManagerImpl$ensureDeviceReady$2$downloadJSBundle$1(C57138yck c57138yck, Continuation<? super OneKeyManagerImpl$ensureDeviceReady$2$downloadJSBundle$1> continuation) {
        super(2, continuation);
        this.this$0 = c57138yck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneKeyManagerImpl$ensureDeviceReady$2$downloadJSBundle$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((OneKeyManagerImpl$ensureDeviceReady$2$downloadJSBundle$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean zBooleanValue = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.this$0.valueOf()) {
                C57138yck c57138yck = this.this$0;
                this.label = 1;
                obj = c57138yck.KWHzl(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            return C56443yFo.KWHzl(zBooleanValue);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        zBooleanValue = ((Boolean) obj).booleanValue();
        return C56443yFo.KWHzl(zBooleanValue);
    }
}
