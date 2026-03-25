package com.okinc.business.dex.trade.order.data.repo;

import com.okinc.business.dexlogic.bean.DefiBridgeOrderInfo;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
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
public final class OrderListRepositoryImpl$getSwapOrderList$$inlined$getApiResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<List<? extends DefiBridgeOrderInfo>>>, Object> {
    final /* synthetic */ String $accountId$inlined;
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ Integer $direction$inlined;
    final /* synthetic */ int $execStatus$inlined;
    final /* synthetic */ String $lastCreateTime$inlined;
    final /* synthetic */ int $pageSize$inlined;
    final /* synthetic */ Integer $status$inlined;
    final /* synthetic */ String $tokenAddress$inlined;
    int label;
    final /* synthetic */ C20051gZb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderListRepositoryImpl$getSwapOrderList$$inlined$getApiResult$1(Continuation continuation, C20051gZb c20051gZb, int i, String str, int i2, String str2, Integer num, Integer num2, String str3, String str4) {
        super(2, continuation);
        this.this$0 = c20051gZb;
        this.$execStatus$inlined = i;
        this.$lastCreateTime$inlined = str;
        this.$pageSize$inlined = i2;
        this.$accountId$inlined = str2;
        this.$status$inlined = num;
        this.$direction$inlined = num2;
        this.$chainId$inlined = str3;
        this.$tokenAddress$inlined = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderListRepositoryImpl$getSwapOrderList$$inlined$getApiResult$1(continuation, this.this$0, this.$execStatus$inlined, this.$lastCreateTime$inlined, this.$pageSize$inlined, this.$accountId$inlined, this.$status$inlined, this.$direction$inlined, this.$chainId$inlined, this.$tokenAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<? extends DefiBridgeOrderInfo>>> continuation) {
        return ((OrderListRepositoryImpl$getSwapOrderList$$inlined$getApiResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC20052gZc interfaceC20052gZc = this.this$0.copydefault;
            int i2 = this.$execStatus$inlined;
            String str = this.$lastCreateTime$inlined;
            int i3 = this.$pageSize$inlined;
            String str2 = this.$accountId$inlined;
            Integer num = this.$status$inlined;
            Integer num2 = this.$direction$inlined;
            String str3 = this.$chainId$inlined;
            String str4 = this.$tokenAddress$inlined;
            this.label = 1;
            obj = interfaceC20052gZc.OLrzqt(i2, str, i3, str2, num, num2, str3, str4, this);
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
