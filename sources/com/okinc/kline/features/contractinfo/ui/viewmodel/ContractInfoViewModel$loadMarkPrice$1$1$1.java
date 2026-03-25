package com.okinc.kline.features.contractinfo.ui.viewmodel;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.MarkPriceData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.xMJ;

/* JADX INFO: loaded from: classes8.dex */
public final class ContractInfoViewModel$loadMarkPrice$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ResponseData<List<MarkPriceData>> $resp;
    int label;
    final /* synthetic */ ContractInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractInfoViewModel$loadMarkPrice$1$1$1(ResponseData<List<MarkPriceData>> responseData, ContractInfoViewModel contractInfoViewModel, Continuation<? super ContractInfoViewModel$loadMarkPrice$1$1$1> continuation) {
        super(2, continuation);
        this.$resp = responseData;
        this.this$0 = contractInfoViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContractInfoViewModel$loadMarkPrice$1$1$1(this.$resp, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContractInfoViewModel$loadMarkPrice$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$resp.getData() != null) {
                ResponseData<List<MarkPriceData>> responseData = this.$resp;
                ContractInfoViewModel contractInfoViewModel = this.this$0;
                xMJ xmj = xMJ.KWHzl;
                List<MarkPriceData> data = responseData.getData();
                Intrinsics.copydefault(data);
                contractInfoViewModel.EZpvd().postValue(xmj.AEQbTJ(data.get(0)));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
