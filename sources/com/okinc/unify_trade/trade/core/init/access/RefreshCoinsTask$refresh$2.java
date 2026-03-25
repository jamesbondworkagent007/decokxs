package com.okinc.unify_trade.trade.core.init.access;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C54611xOu;
import o.C56391yDq;
import o.C56442yFn;
import o.xNQ;

/* JADX INFO: loaded from: classes12.dex */
public final class RefreshCoinsTask$refresh$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ xNQ $coinInfoProvider;
    int label;
    final /* synthetic */ C54611xOu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshCoinsTask$refresh$2(C54611xOu c54611xOu, xNQ xnq, Continuation<? super RefreshCoinsTask$refresh$2> continuation) {
        super(2, continuation);
        this.this$0 = c54611xOu;
        this.$coinInfoProvider = xnq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RefreshCoinsTask$refresh$2(this.this$0, this.$coinInfoProvider, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((RefreshCoinsTask$refresh$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C54611xOu c54611xOu = this.this$0;
            xNQ xnq = this.$coinInfoProvider;
            this.label = 1;
            obj = c54611xOu.KWHzl(xnq, this);
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
