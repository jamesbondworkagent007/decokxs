package com.okinc.dexkline.market.features.overview.ui;

import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.transactionhistory.FilterTimeDuration;
import com.okinc.dexkline.market.features.overview.domain.TransactionStatistic;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C34332naA;
import o.C34351naT;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class OverviewViewModel$getTransactionData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FilterTimeDuration $time;
    int label;
    final /* synthetic */ OverviewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewViewModel$getTransactionData$1(OverviewViewModel overviewViewModel, FilterTimeDuration filterTimeDuration, Continuation<? super OverviewViewModel$getTransactionData$1> continuation) {
        super(2, continuation);
        this.this$0 = overviewViewModel;
        this.$time = filterTimeDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OverviewViewModel$getTransactionData$1(this.this$0, this.$time, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OverviewViewModel$getTransactionData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AEQbTJ.setValue(new C34351naT(true, false, null, 6, null));
            C34332naA c34332naA = this.this$0.AYXKKw;
            String tokenContractAddress = this.this$0.DbNXlk.getTokenContractAddress();
            String chainId = this.this$0.DbNXlk.getChainId();
            FilterTimeDuration filterTimeDuration = this.$time;
            this.label = 1;
            objEZpvd = c34332naA.EZpvd(tokenContractAddress, chainId, filterTimeDuration, this);
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
        OverviewViewModel overviewViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            overviewViewModel.AEQbTJ.setValue(new C34351naT(false, false, (TransactionStatistic) objEZpvd, 3, null));
        }
        OverviewViewModel overviewViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
            overviewViewModel2.AEQbTJ.setValue(new C34351naT(false, true, null, 5, null));
        }
        return Unit.INSTANCE;
    }
}
