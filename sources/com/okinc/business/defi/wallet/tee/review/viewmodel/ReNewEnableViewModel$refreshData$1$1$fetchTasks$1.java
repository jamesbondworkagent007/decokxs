package com.okinc.business.defi.wallet.tee.review.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC12782ctV;
import o.C56391yDq;
import o.C56442yFn;
import o.fWU;

/* JADX INFO: loaded from: classes18.dex */
public final class ReNewEnableViewModel$refreshData$1$1$fetchTasks$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ReNewEnableViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReNewEnableViewModel$refreshData$1$1$fetchTasks$1(ReNewEnableViewModel reNewEnableViewModel, Continuation<? super ReNewEnableViewModel$refreshData$1$1$fetchTasks$1> continuation) {
        super(2, continuation);
        this.this$0 = reNewEnableViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReNewEnableViewModel$refreshData$1$1$fetchTasks$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReNewEnableViewModel$refreshData$1$1$fetchTasks$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ReNewEnableViewModel reNewEnableViewModel;
        String strAkhnZx;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ReNewEnableViewModel reNewEnableViewModel2 = this.this$0;
            fWU fwu = reNewEnableViewModel2.iwGUEr;
            this.L$0 = reNewEnableViewModel2;
            this.label = 1;
            Object objCopydefault2 = fwu.copydefault(this);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            reNewEnableViewModel = reNewEnableViewModel2;
            obj = objCopydefault2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            reNewEnableViewModel = (ReNewEnableViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        reNewEnableViewModel.QbewEr = (AbstractC12782ctV) obj;
        MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
        AbstractC12782ctV abstractC12782ctV = this.this$0.QbewEr;
        if (abstractC12782ctV == null || (strAkhnZx = abstractC12782ctV.AkhnZx()) == null) {
            strAkhnZx = "";
        }
        mutableStateFlow.setValue(strAkhnZx);
        return Unit.INSTANCE;
    }
}
