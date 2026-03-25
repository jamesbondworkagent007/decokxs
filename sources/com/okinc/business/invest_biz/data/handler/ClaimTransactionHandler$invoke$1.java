package com.okinc.business.invest_biz.data.handler;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58260yxt;
import o.C25523iyN;
import o.C25528iyS;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25466ixJ;
import o.InterfaceC25530iyU;
import o.InterfaceC9738bbJ;

/* JADX INFO: loaded from: classes6.dex */
public final class ClaimTransactionHandler$invoke$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<InterfaceC25530iyU, Unit> $callback;
    final /* synthetic */ C25523iyN $claimRequestParams;
    final /* synthetic */ InterfaceC25466ixJ $host;
    int label;
    final /* synthetic */ C25528iyS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.iyU, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ClaimTransactionHandler$invoke$1(C25528iyS c25528iyS, C25523iyN c25523iyN, InterfaceC25466ixJ interfaceC25466ixJ, Function1<? super InterfaceC25530iyU, Unit> function1, Continuation<? super ClaimTransactionHandler$invoke$1> continuation) {
        super(2, continuation);
        this.this$0 = c25528iyS;
        this.$claimRequestParams = c25523iyN;
        this.$host = interfaceC25466ixJ;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClaimTransactionHandler$invoke$1(this.this$0, this.$claimRequestParams, this.$host, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClaimTransactionHandler$invoke$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = this.this$0.valueOf.gEmmrt().KWHzl();
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtKWHzl, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
        C25528iyS c25528iyS = this.this$0;
        C25523iyN c25523iyN = this.$claimRequestParams;
        Intrinsics.copydefault(interfaceC9738bbJ);
        super/*o.iyM*/.EZpvd(this.$host, this.$claimRequestParams, c25528iyS.OLrzqt(c25523iyN, interfaceC9738bbJ), this.$callback);
        return Unit.INSTANCE;
    }
}
