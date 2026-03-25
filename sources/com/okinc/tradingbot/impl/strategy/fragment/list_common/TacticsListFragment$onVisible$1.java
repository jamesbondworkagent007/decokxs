package com.okinc.tradingbot.impl.strategy.fragment.list_common;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C52324wHe;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;

/* JADX INFO: loaded from: classes11.dex */
public final class TacticsListFragment$onVisible$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C52324wHe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TacticsListFragment$onVisible$1(C52324wHe c52324wHe, Continuation<? super TacticsListFragment$onVisible$1> continuation) {
        super(2, continuation);
        this.this$0 = c52324wHe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TacticsListFragment$onVisible$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TacticsListFragment$onVisible$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8790ensureInitialize0E7RQCE$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            this.label = 1;
            objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(c54589xNz, false, null, this, 3, null);
            if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objM8790ensureInitialize0E7RQCE$default)) {
            C52324wHe.values(this.this$0).QKVWgx();
        } else {
            C52324wHe c52324wHe = this.this$0;
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8790ensureInitialize0E7RQCE$default);
            c52324wHe.KWHzl(thM7380exceptionOrNullimpl != null ? thM7380exceptionOrNullimpl.getMessage() : null);
        }
        return Unit.INSTANCE;
    }
}
