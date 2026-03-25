package com.okinc.im.imui.group.paidgroup.transactionsummary;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.nZM;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class PaidGroupTransactionListViewModel$loadMoreHistory$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PaidGroupTransactionListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidGroupTransactionListViewModel$loadMoreHistory$1(PaidGroupTransactionListViewModel paidGroupTransactionListViewModel, Continuation<? super PaidGroupTransactionListViewModel$loadMoreHistory$1> continuation) {
        super(2, continuation);
        this.this$0 = paidGroupTransactionListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaidGroupTransactionListViewModel$loadMoreHistory$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaidGroupTransactionListViewModel$loadMoreHistory$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        PaidGroupTransactionListViewModel paidGroupTransactionListViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            list = this.this$0.valueOf;
            PaidGroupTransactionListViewModel paidGroupTransactionListViewModel2 = this.this$0;
            MutableSharedFlow mutableSharedFlow = paidGroupTransactionListViewModel2.OLrzqt;
            Boolean boolKWHzl = C56443yFo.KWHzl(true);
            this.L$0 = paidGroupTransactionListViewModel2;
            this.L$1 = list;
            this.label = 1;
            if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
            paidGroupTransactionListViewModel = paidGroupTransactionListViewModel2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            list = (List) this.L$1;
            paidGroupTransactionListViewModel = (PaidGroupTransactionListViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        pUU.KWHzl("PaidGroupTransactionListViewModel", "loadMoreTransactionItem...");
        Result.Application application2 = Result.Companion;
        paidGroupTransactionListViewModel.AEQbTJ(((nZM) paidGroupTransactionListViewModel.valueOf.get(yDY.AuCTel(list))).AhwBna(), C56443yFo.AEQbTJ(20));
        MutableSharedFlow mutableSharedFlow2 = paidGroupTransactionListViewModel.OLrzqt;
        Boolean boolKWHzl2 = C56443yFo.KWHzl(false);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
            return objCopydefault;
        }
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }
}
