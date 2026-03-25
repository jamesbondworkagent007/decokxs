package com.okinc.business.invest_biz.ui.screens.base_transaction;

import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC24170iXm;
import o.C26695jhF;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class BaseTransactionViewModel$checkActionMenu$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InitialInfoModel $initialInfo;
    final /* synthetic */ TransactionConfig $transactionConfig;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC24170iXm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTransactionViewModel$checkActionMenu$1(AbstractC24170iXm abstractC24170iXm, InitialInfoModel initialInfoModel, TransactionConfig transactionConfig, Continuation<? super BaseTransactionViewModel$checkActionMenu$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC24170iXm;
        this.$initialInfo = initialInfoModel;
        this.$transactionConfig = transactionConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseTransactionViewModel$checkActionMenu$1(this.this$0, this.$initialInfo, this.$transactionConfig, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseTransactionViewModel$checkActionMenu$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableStateFlow mutableStateFlow;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow2 = this.this$0.AEQbTJ;
            C26695jhF c26695jhF = this.this$0.AuCTelauCTel;
            InitialInfoModel initialInfoModel = this.$initialInfo;
            TransactionConfig transactionConfig = this.$transactionConfig;
            this.L$0 = mutableStateFlow2;
            this.label = 1;
            Object objCopydefault2 = c26695jhF.copydefault(initialInfoModel, transactionConfig, this);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            mutableStateFlow = mutableStateFlow2;
            obj = objCopydefault2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow = (MutableStateFlow) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        mutableStateFlow.setValue(obj);
        return Unit.INSTANCE;
    }
}
