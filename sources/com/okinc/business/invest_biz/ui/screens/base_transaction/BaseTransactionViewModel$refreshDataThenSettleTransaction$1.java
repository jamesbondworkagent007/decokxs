package com.okinc.business.invest_biz.ui.screens.base_transaction;

import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$refreshDataThenSettleTransaction$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC24170iXm;
import o.C56391yDq;
import o.C56442yFn;
import o.iXB;

/* JADX INFO: loaded from: classes6.dex */
public final class BaseTransactionViewModel$refreshDataThenSettleTransaction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InitialInfoModel $initialInfo;
    final /* synthetic */ iXB $userInput;
    int label;
    final /* synthetic */ AbstractC24170iXm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTransactionViewModel$refreshDataThenSettleTransaction$1(InitialInfoModel initialInfoModel, AbstractC24170iXm abstractC24170iXm, iXB ixb, Continuation<? super BaseTransactionViewModel$refreshDataThenSettleTransaction$1> continuation) {
        super(2, continuation);
        this.$initialInfo = initialInfoModel;
        this.this$0 = abstractC24170iXm;
        this.$userInput = ixb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseTransactionViewModel$refreshDataThenSettleTransaction$1(this.$initialInfo, this.this$0, this.$userInput, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseTransactionViewModel$refreshDataThenSettleTransaction$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InitialInfoModel initialInfoModel = this.$initialInfo;
            if (initialInfoModel != null) {
                final AbstractC24170iXm abstractC24170iXm = this.this$0;
                iXB ixb = this.$userInput;
                Function0 function0 = new Function0() { // from class: o.iXk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return BaseTransactionViewModel$refreshDataThenSettleTransaction$1.invokeSuspend$lambda$0(abstractC24170iXm);
                    }
                };
                this.label = 1;
                if (AbstractC24170iXm.reloadContent$default(abstractC24170iXm, initialInfoModel, ixb, function0, null, this, 8, null) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(AbstractC24170iXm abstractC24170iXm) {
        AbstractC24170iXm.settleTransaction$default(abstractC24170iXm, false, 1, null);
        return Unit.INSTANCE;
    }
}
