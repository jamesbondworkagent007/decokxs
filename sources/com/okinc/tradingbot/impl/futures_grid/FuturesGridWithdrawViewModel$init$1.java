package com.okinc.tradingbot.impl.futures_grid;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.C51045vfc;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class FuturesGridWithdrawViewModel$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Lifecycle $lifecycle;
    Object L$0;
    int label;
    final /* synthetic */ C51045vfc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesGridWithdrawViewModel$init$1(C51045vfc c51045vfc, Lifecycle lifecycle, Continuation<? super FuturesGridWithdrawViewModel$init$1> continuation) {
        super(2, continuation);
        this.this$0 = c51045vfc;
        this.$lifecycle = lifecycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesGridWithdrawViewModel$init$1(this.this$0, this.$lifecycle, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesGridWithdrawViewModel$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C51045vfc c51045vfc;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C51045vfc c51045vfc2 = this.this$0;
            Lifecycle lifecycle = this.$lifecycle;
            this.L$0 = c51045vfc2;
            this.label = 1;
            Object objEZpvd = c51045vfc2.EZpvd(lifecycle, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c51045vfc = c51045vfc2;
            obj = objEZpvd;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c51045vfc = (C51045vfc) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        c51045vfc.fARcdN = (Job) obj;
        return Unit.INSTANCE;
    }
}
