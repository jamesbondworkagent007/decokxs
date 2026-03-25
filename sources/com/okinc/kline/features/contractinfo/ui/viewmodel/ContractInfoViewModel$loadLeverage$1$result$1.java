package com.okinc.kline.features.contractinfo.ui.viewmodel;

import com.okinc.kline.features.contractinfo.ui.model.ContractInfoItemType;
import com.okinc.unify_trade.biz.UserTierData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.pTB;

/* JADX INFO: loaded from: classes8.dex */
public final class ContractInfoViewModel$loadLeverage$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<UserTierData> $data;
    int label;
    final /* synthetic */ ContractInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractInfoViewModel$loadLeverage$1$result$1(List<UserTierData> list, ContractInfoViewModel contractInfoViewModel, Continuation<? super ContractInfoViewModel$loadLeverage$1$result$1> continuation) {
        super(2, continuation);
        this.$data = list;
        this.this$0 = contractInfoViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContractInfoViewModel$loadLeverage$1$result$1(this.$data, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContractInfoViewModel$loadLeverage$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = pTB.formatLocalized$default("0.01", null, 1, null) + " ~ " + pTB.formatLocalized$default(((UserTierData) CollectionsKt___CollectionsKt.AuCTelauCTel(this.$data)).getMaxLeverage(), null, 1, null);
            ContractInfoViewModel contractInfoViewModel = this.this$0;
            ContractInfoItemType contractInfoItemType = ContractInfoItemType.LEVERAGE;
            this.label = 1;
            if (contractInfoViewModel.AEQbTJ(contractInfoItemType, str, (Continuation<? super Unit>) this) == objCopydefault) {
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
