package com.okinc.business.invest_biz.ui.screens.base_transaction;

import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC24170iXm;
import o.C24177iXt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC24182iXy;
import o.iXC;

/* JADX INFO: loaded from: classes6.dex */
public final class BaseTransactionViewModel$changeCurrentContentStage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ iXC $newContent;
    final /* synthetic */ TransactionStage $newStage;
    int label;
    final /* synthetic */ AbstractC24170iXm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTransactionViewModel$changeCurrentContentStage$1(AbstractC24170iXm abstractC24170iXm, iXC ixc, TransactionStage transactionStage, Continuation<? super BaseTransactionViewModel$changeCurrentContentStage$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC24170iXm;
        this.$newContent = ixc;
        this.$newStage = transactionStage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseTransactionViewModel$changeCurrentContentStage$1(this.this$0, this.$newContent, this.$newStage, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseTransactionViewModel$changeCurrentContentStage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC24170iXm abstractC24170iXm = this.this$0;
            C24177iXt c24177iXtKWHzl = this.$newContent.KWHzl();
            List<TransactionStep> listFetchVPNInfo = this.$newContent.fetchVPNInfo();
            TransactionStage transactionStage = this.$newStage;
            this.label = 1;
            if (abstractC24170iXm.copydefault(c24177iXtKWHzl, listFetchVPNInfo, transactionStage, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        MutableStateFlow mutableStateFlow = this.this$0.copydefault;
        InterfaceC24182iXy.Activity activity = new InterfaceC24182iXy.Activity(this.$newContent);
        this.label = 2;
        if (mutableStateFlow.emit(activity, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
