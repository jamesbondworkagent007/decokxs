package com.okinc.business.invest_biz.data.repository.defi_dashboard;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58260yxt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;
import o.iDM;

/* JADX INFO: loaded from: classes6.dex */
public final class DashboardRepositoryImpl$getMainWallet$2 extends SuspendLambda implements Function1<Continuation<? super InterfaceC9738bbJ>, Object> {
    int label;
    final /* synthetic */ iDM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardRepositoryImpl$getMainWallet$2(iDM idm, Continuation<? super DashboardRepositoryImpl$getMainWallet$2> continuation) {
        super(1, continuation);
        this.this$0 = idm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DashboardRepositoryImpl$getMainWallet$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InterfaceC9738bbJ> continuation) {
        return ((DashboardRepositoryImpl$getMainWallet$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtEZpvd = this.this$0.valueOf.EZpvd();
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtEZpvd, this);
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
