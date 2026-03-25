package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.net.responsebean.transactions.filter.TransactionFilterData;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31773mDj;
import o.mCU;

/* JADX INFO: loaded from: classes23.dex */
public final class CRTransactionsRepository$getTransactionFilterInfo$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<List<? extends TransactionFilterData>>>, Object> {
    final /* synthetic */ mCU $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRTransactionsRepository$getTransactionFilterInfo$2$1(mCU mcu, Continuation<? super CRTransactionsRepository$getTransactionFilterInfo$2$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = mcu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CRTransactionsRepository$getTransactionFilterInfo$2$1(this.$this_runOrErrorResponse, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<? extends TransactionFilterData>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super ResponseData<List<TransactionFilterData>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<TransactionFilterData>>> continuation) {
        return ((CRTransactionsRepository$getTransactionFilterInfo$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC31773mDj interfaceC31773mDj = this.$this_runOrErrorResponse.copydefault;
            this.label = 1;
            obj = interfaceC31773mDj.OLrzqt(this);
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
