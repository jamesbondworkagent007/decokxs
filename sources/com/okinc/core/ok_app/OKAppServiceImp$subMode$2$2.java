package com.okinc.core.ok_app;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC33240msi;
import o.AbstractC33244msm;
import o.AbstractC33249msr;
import o.C33155mrC;
import o.C33239msh;
import o.C33250mss;
import o.C33367mvC;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHT;

/* JADX INFO: loaded from: classes8.dex */
public final class OKAppServiceImp$subMode$2$2 extends SuspendLambda implements yHT<AbstractC33240msi, AbstractC33249msr, Unit, Continuation<? super AbstractC33244msm>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKAppServiceImp$subMode$2$2(Continuation<? super OKAppServiceImp$subMode$2$2> continuation) {
        super(4, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHT
    public final Object invoke(AbstractC33240msi abstractC33240msi, AbstractC33249msr abstractC33249msr, Unit unit, Continuation<? super AbstractC33244msm> continuation) {
        OKAppServiceImp$subMode$2$2 oKAppServiceImp$subMode$2$2 = new OKAppServiceImp$subMode$2$2(continuation);
        oKAppServiceImp$subMode$2$2.L$0 = abstractC33240msi;
        oKAppServiceImp$subMode$2$2.L$1 = abstractC33249msr;
        return oKAppServiceImp$subMode$2$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC33244msm abstractC33244msmKWHzl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC33240msi abstractC33240msi = (AbstractC33240msi) this.L$0;
            AbstractC33249msr abstractC33249msr = (AbstractC33249msr) this.L$1;
            if (C33367mvC.copydefault()) {
                abstractC33244msmKWHzl = C33239msh.OLrzqt(abstractC33240msi);
            } else {
                abstractC33244msmKWHzl = C33250mss.KWHzl(abstractC33249msr);
            }
            pUU.KWHzl(C33155mrC.copydefault, "subMode from legacy, (lite: " + abstractC33240msi + ", pro: " + abstractC33249msr + ") -> " + abstractC33244msmKWHzl);
            return abstractC33244msmKWHzl;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
