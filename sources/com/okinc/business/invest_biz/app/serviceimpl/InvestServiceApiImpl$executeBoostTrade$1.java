package com.okinc.business.invest_biz.app.serviceimpl;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C25476ixT;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25422iwS;
import o.yHT;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestServiceApiImpl$executeBoostTrade$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ yHT<AbstractActivityC33041mov, C25476ixT, InterfaceC25422iwS, Continuation<? super Unit>, Object> $action;
    final /* synthetic */ AbstractActivityC33041mov $activity;
    final /* synthetic */ InterfaceC25422iwS $callback;
    final /* synthetic */ C25476ixT $params;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHT<? super o.mov, ? super o.ixT, ? super o.iwS, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InvestServiceApiImpl$executeBoostTrade$1(yHT<? super AbstractActivityC33041mov, ? super C25476ixT, ? super InterfaceC25422iwS, ? super Continuation<? super Unit>, ? extends Object> yht, AbstractActivityC33041mov abstractActivityC33041mov, C25476ixT c25476ixT, InterfaceC25422iwS interfaceC25422iwS, Continuation<? super InvestServiceApiImpl$executeBoostTrade$1> continuation) {
        super(2, continuation);
        this.$action = yht;
        this.$activity = abstractActivityC33041mov;
        this.$params = c25476ixT;
        this.$callback = interfaceC25422iwS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InvestServiceApiImpl$executeBoostTrade$1 investServiceApiImpl$executeBoostTrade$1 = new InvestServiceApiImpl$executeBoostTrade$1(this.$action, this.$activity, this.$params, this.$callback, continuation);
        investServiceApiImpl$executeBoostTrade$1.L$0 = obj;
        return investServiceApiImpl$executeBoostTrade$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestServiceApiImpl$executeBoostTrade$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                yHT<AbstractActivityC33041mov, C25476ixT, InterfaceC25422iwS, Continuation<? super Unit>, Object> yht = this.$action;
                AbstractActivityC33041mov abstractActivityC33041mov = this.$activity;
                C25476ixT c25476ixT = this.$params;
                InterfaceC25422iwS interfaceC25422iwS = this.$callback;
                Result.Application application = Result.Companion;
                this.label = 1;
                if (yht.invoke(abstractActivityC33041mov, c25476ixT, interfaceC25422iwS, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        InterfaceC25422iwS interfaceC25422iwS2 = this.$callback;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null && interfaceC25422iwS2 != null) {
            interfaceC25422iwS2.KWHzl(thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
