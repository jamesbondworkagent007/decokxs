package com.okinc.business.web3pay.lib.features.contacts;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC31317lrj;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yDY;
import o.yHO;

/* JADX INFO: loaded from: classes23.dex */
public final class RecentContactRepositoryImpl$getRecentContactList$2 extends SuspendLambda implements yHO<FlowCollector<? super List<? extends AbstractC31317lrj>>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ int $limit;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentContactRepositoryImpl$getRecentContactList$2(String str, int i, Continuation<? super RecentContactRepositoryImpl$getRecentContactList$2> continuation) {
        super(3, continuation);
        this.$key = str;
        this.$limit = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super List<? extends AbstractC31317lrj>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        RecentContactRepositoryImpl$getRecentContactList$2 recentContactRepositoryImpl$getRecentContactList$2 = new RecentContactRepositoryImpl$getRecentContactList$2(this.$key, this.$limit, continuation);
        recentContactRepositoryImpl$getRecentContactList$2.L$0 = flowCollector;
        recentContactRepositoryImpl$getRecentContactList$2.L$1 = th;
        return recentContactRepositoryImpl$getRecentContactList$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            pUU.AEQbTJ("RecentContactRepository", "getRecentContactList(" + this.$key + ", " + this.$limit + ")", (Throwable) this.L$1);
            List listAhwBna = yDY.AhwBna();
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(listAhwBna, this) == objCopydefault) {
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
