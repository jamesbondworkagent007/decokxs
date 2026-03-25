package com.okinc.business.dex.trade.order.data.repo;

import com.okinc.business.dexlogic.bean.HistoryOrdersBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C20051gZb;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC20052gZc;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderListRepositoryImpl$getBridgeHistoryOrderList$$inlined$getApiResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<HistoryOrdersBean>>, Object> {
    final /* synthetic */ String $accountId$inlined;
    final /* synthetic */ String $fromChainId$inlined;
    final /* synthetic */ String $fromTokenAddress$inlined;
    final /* synthetic */ String $inputContent$inlined;
    final /* synthetic */ String $lastCreateTime$inlined;
    final /* synthetic */ int $pageSize$inlined;
    final /* synthetic */ Integer $status$inlined;
    final /* synthetic */ String $toChainId$inlined;
    final /* synthetic */ String $toTokenAddress$inlined;
    int label;
    final /* synthetic */ C20051gZb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderListRepositoryImpl$getBridgeHistoryOrderList$$inlined$getApiResult$1(Continuation continuation, C20051gZb c20051gZb, String str, int i, String str2, String str3, String str4, String str5, String str6, Integer num, String str7) {
        super(2, continuation);
        this.this$0 = c20051gZb;
        this.$lastCreateTime$inlined = str;
        this.$pageSize$inlined = i;
        this.$accountId$inlined = str2;
        this.$fromChainId$inlined = str3;
        this.$toChainId$inlined = str4;
        this.$fromTokenAddress$inlined = str5;
        this.$toTokenAddress$inlined = str6;
        this.$status$inlined = num;
        this.$inputContent$inlined = str7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderListRepositoryImpl$getBridgeHistoryOrderList$$inlined$getApiResult$1(continuation, this.this$0, this.$lastCreateTime$inlined, this.$pageSize$inlined, this.$accountId$inlined, this.$fromChainId$inlined, this.$toChainId$inlined, this.$fromTokenAddress$inlined, this.$toTokenAddress$inlined, this.$status$inlined, this.$inputContent$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<HistoryOrdersBean>> continuation) {
        return ((OrderListRepositoryImpl$getBridgeHistoryOrderList$$inlined$getApiResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC20052gZc interfaceC20052gZc = this.this$0.copydefault;
            String str = this.$lastCreateTime$inlined;
            int i2 = this.$pageSize$inlined;
            String str2 = this.$accountId$inlined;
            String str3 = this.$fromChainId$inlined;
            String str4 = this.$toChainId$inlined;
            String str5 = this.$fromTokenAddress$inlined;
            String str6 = this.$toTokenAddress$inlined;
            Integer num = this.$status$inlined;
            String str7 = this.$inputContent$inlined;
            this.label = 1;
            obj = interfaceC20052gZc.KWHzl(str, i2, str2, str3, str4, str5, str6, num, str7, this);
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
