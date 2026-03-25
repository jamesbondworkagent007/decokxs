package com.okinc.kline.features.contractinfo.ui.viewmodel;

import com.okinc.kline.features.contractinfo.ui.model.ContractInfoItemType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class ContractInfoViewModel$updateMarkPrice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $price;
    int label;
    final /* synthetic */ ContractInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractInfoViewModel$updateMarkPrice$1(ContractInfoViewModel contractInfoViewModel, String str, Continuation<? super ContractInfoViewModel$updateMarkPrice$1> continuation) {
        super(2, continuation);
        this.this$0 = contractInfoViewModel;
        this.$price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContractInfoViewModel$updateMarkPrice$1(this.this$0, this.$price, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContractInfoViewModel$updateMarkPrice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ContractInfoViewModel contractInfoViewModel = this.this$0;
            ContractInfoItemType contractInfoItemType = ContractInfoItemType.MARK_PRICE;
            String strFmtMarkPriceWithSign$default = ContractInfoViewModel.fmtMarkPriceWithSign$default(contractInfoViewModel, this.$price, contractInfoViewModel.valueOf, false, 4, null);
            this.label = 1;
            if (contractInfoViewModel.AEQbTJ(contractInfoItemType, strFmtMarkPriceWithSign$default, (Continuation<? super Unit>) this) == objCopydefault) {
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
