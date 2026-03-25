package com.okinc.business.invest_biz.app.serviceimpl;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractActivityC33041mov;
import o.C25476ixT;
import o.C26638jgB;
import o.C26672jgj;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25422iwS;
import o.yHT;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestServiceApiImpl$stake$1 extends SuspendLambda implements yHT<AbstractActivityC33041mov, C25476ixT, InterfaceC25422iwS, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestServiceApiImpl$stake$1(Context context, Continuation<? super InvestServiceApiImpl$stake$1> continuation) {
        super(4, continuation);
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHT
    public final Object invoke(AbstractActivityC33041mov abstractActivityC33041mov, C25476ixT c25476ixT, InterfaceC25422iwS interfaceC25422iwS, Continuation<? super Unit> continuation) {
        InvestServiceApiImpl$stake$1 investServiceApiImpl$stake$1 = new InvestServiceApiImpl$stake$1(this.$context, continuation);
        investServiceApiImpl$stake$1.L$0 = abstractActivityC33041mov;
        investServiceApiImpl$stake$1.L$1 = c25476ixT;
        investServiceApiImpl$stake$1.L$2 = interfaceC25422iwS;
        return investServiceApiImpl$stake$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) this.L$0;
            C25476ixT c25476ixT = (C25476ixT) this.L$1;
            InterfaceC25422iwS interfaceC25422iwS = (InterfaceC25422iwS) this.L$2;
            C26638jgB c26638jgBOLrzqt = C26672jgj.AEQbTJ.OLrzqt(this.$context);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (c26638jgBOLrzqt.AEQbTJ(abstractActivityC33041mov, c25476ixT, interfaceC25422iwS, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
