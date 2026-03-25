package com.okinc.business.invest_biz.ui.screens.transaction.invest;

import com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C25476ixT;
import o.C26549jeS;
import o.C26638jgB;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25422iwS;
import o.InterfaceC26561jee;
import o.pUU;

/* JADX INFO: loaded from: classes15.dex */
public final class InvestHandler$invest$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC25422iwS $callback;
    final /* synthetic */ AbstractActivityC33041mov $host;
    final /* synthetic */ C25476ixT $params;
    int label;
    final /* synthetic */ C26638jgB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestHandler$invest$2(C26638jgB c26638jgB, C25476ixT c25476ixT, AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC25422iwS interfaceC25422iwS, Continuation<? super InvestHandler$invest$2> continuation) {
        super(2, continuation);
        this.this$0 = c26638jgB;
        this.$params = c25476ixT;
        this.$host = abstractActivityC33041mov;
        this.$callback = interfaceC25422iwS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestHandler$invest$2(this.this$0, this.$params, this.$host, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestHandler$invest$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C26549jeS c26549jeS = this.this$0.OLrzqt;
            C25476ixT c25476ixT = this.$params;
            ProductDetailsUserTradeAction productDetailsUserTradeActionFJNWhG = c25476ixT.fJNWhG();
            this.label = 1;
            objEZpvd = c26549jeS.EZpvd(c25476ixT, productDetailsUserTradeActionFJNWhG, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        C26638jgB c26638jgB = this.this$0;
        AbstractActivityC33041mov abstractActivityC33041mov = this.$host;
        InterfaceC25422iwS interfaceC25422iwS = this.$callback;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            c26638jgB.AEQbTJ(abstractActivityC33041mov, (InterfaceC26561jee) objEZpvd, true);
            if (interfaceC25422iwS != null) {
                interfaceC25422iwS.OLrzqt();
            }
        }
        InterfaceC25422iwS interfaceC25422iwS2 = this.$callback;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl != null) {
            if (interfaceC25422iwS2 != null) {
                interfaceC25422iwS2.KWHzl(thM7380exceptionOrNullimpl);
            }
            pUU.KWHzl(thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
